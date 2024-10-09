package org.example.controller;

import org.example.entity.Articulo;
import org.example.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/articulos")
@CrossOrigin(origins = "*")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearArticulo(@RequestBody Articulo articulo) {
        try {
            Articulo nuevoArticulo = articuloService.guardarArticulo(articulo);
            return new ResponseEntity<>(nuevoArticulo, HttpStatus.CREATED);
        } catch (Exception e) {
            // En caso de error, captura la excepción y responde con un mensaje amigable
            return new ResponseEntity<>("Error al crear el artículo: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
