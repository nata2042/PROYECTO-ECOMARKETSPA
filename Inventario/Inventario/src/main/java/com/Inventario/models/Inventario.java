package com.Inventario.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productoId;

    private int cantidad;

    private String ubicacion;

    private LocalDateTime fechaActualizacion;

    // Getters y Setters
}
