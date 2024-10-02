/**Desarrollado por
    Edwin Geovani Pérez Martínez
    Fecha de modificacion 02 de octubre de 2024*/

    /*Bajo la instrucion del ing.Jhonathan Josué García Cuque*/

package com.notasapp.controller;

import com.notasapp.model.Nota;
import com.notasapp.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/notas")
public class NotaController {

    @Autowired
    private NotaService notaService;
    // Método para actualizar una nota
    @PostMapping //PutMapping

    public ResponseEntity<Nota> crearNota(@RequestBody Nota nota) {
        try {
            Nota nuevaNota = notaService.guardarNota(nota);
            return new ResponseEntity<>(nuevaNota, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
   

    @GetMapping("/{id}")
    public ResponseEntity<Nota> obtenerNota(@PathVariable Long id) {
        return notaService.obtenerNotaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Nota> listarNotas() {
        return notaService.listarTodasLasNotas();
    }
    // Método para eliminar una nota por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarNota(@PathVariable Long id) {
        try {
            // Eliminar la nota utilizando el servicio
            notaService.eliminarNota(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);  // Responde con código 204 (sin contenido)
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
