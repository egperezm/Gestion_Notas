/**Desarrollado por
    Edwin Geovani Pérez Martínez
    Fecha de modificacion 02 de octubre de 2024*/

    /*Bajo la instrucion del ing.Jhonathan Josué García Cuque*/ 

package com.notasapp.service;

import com.notasapp.model.Nota;
import com.notasapp.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;

    public Optional<Nota> obtenerNotaPorId(Long id) {
        return notaRepository.findById(id);
    }

    public List<Nota> listarTodasLasNotas() {
        return notaRepository.findAll();
    }

    public Nota guardarNota(Nota nota) throws Exception {
        validarNota(nota);
        return notaRepository.save(nota);
    }

    private void validarNota(Nota nota) throws Exception {
        if (nota.getActividades() > 35 || nota.getPrimerParcial() > 15 || 
            nota.getSegundoParcial() > 15 || nota.getExamenFinal() > 35) {
            throw new Exception("El puntaje supera el máximo permitido.");
        }
    
    }
    public Double calcularPuntajeTotal(Nota nota) {
        return nota.getPuntajeTotal();
    }

    public void eliminarNota(Long id) {
    notaRepository.deleteById(id); //Eliminar nota usando el respositorio

    }
}


    // Otros métodos como actualizarNota, eliminarNota...

