package org.example.service;

import org.example.ArticuloRepository;
import org.example.entity.Articulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    public Articulo guardarArticulo(Articulo articulo) {
        System.out.println("Datos recibidos: " + articulo);
        return articuloRepository.save(articulo);
    }
}
