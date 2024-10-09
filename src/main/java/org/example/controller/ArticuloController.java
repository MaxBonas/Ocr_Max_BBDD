package org.example.controller;

import org.example.entity.Articulo;
import org.example.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/articulos")
@CrossOrigin(origins = "*")  // Permitir solicitudes desde https://localhost
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<Articulo> crearArticulo(@RequestBody Articulo articulo) {
        Articulo nuevoArticulo = articuloService.guardarArticulo(articulo);
        return new ResponseEntity<>(nuevoArticulo, HttpStatus.CREATED);
    }
}
