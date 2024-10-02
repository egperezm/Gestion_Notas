/**Desarrollado por
    Edwin Geovani Pérez Martínez
    Fecha de modificacion 02 de octubre de 2024*/

    /*Bajo la instrucion del ing.Jhonathan Josué García Cuque*/

package com.notasapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String estudiante;
    
    @Max(35)
    @Min(0)
    @Column(nullable = false)
    private Double actividades;
    
    @Max(15)
    @Min(0)
    @Column(nullable = false)
    private Double primerParcial;
    
    @Max(15)
    @Min(0)
    @Column(nullable = false)
    private Double segundoParcial;
    
    @Max(35)
    @Min(0)
    @Column(nullable = false)
    private Double examenFinal;
    
    @Transient
    private Double puntajeTotal;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEstudiante() { return estudiante; }
    public void setEstudiante(String estudiante) { this.estudiante = estudiante; }

    public Double getActividades() { return actividades; }
    public void setActividades(Double actividades) { this.actividades = actividades; }

    public Double getPrimerParcial() { return primerParcial; }
    public void setPrimerParcial(Double primerParcial) { this.primerParcial = primerParcial; }

    public Double getSegundoParcial() { return segundoParcial; }
    public void setSegundoParcial(Double segundoParcial) { this.segundoParcial = segundoParcial; }

    public Double getExamenFinal() { return examenFinal; }
    public void setExamenFinal(Double examenFinal) { this.examenFinal = examenFinal; }

    public Double getPuntajeTotal() {
        return actividades + primerParcial + segundoParcial + examenFinal;
    }
}
