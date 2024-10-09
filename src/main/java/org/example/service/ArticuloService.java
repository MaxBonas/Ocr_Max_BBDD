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
        // Aquí puedes hacer cualquier validación o ajuste necesario antes de guardar
        if (articulo.getGrade() == null) {
            articulo.setGrade("Default Grade"); // Puedes establecer un valor por defecto si es necesario
        }
        return articuloRepository.save(articulo);
    }
}
