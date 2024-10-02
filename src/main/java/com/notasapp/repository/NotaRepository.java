/**Desarrollado por
    Edwin Geovani Pérez Martínez
    Fecha de modificacion 02 de octubre de 2024*/

    /*Bajo la instrucion del ing.Jhonathan Josué García Cuque*/

package com.notasapp.repository;

import com.notasapp.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {
}

