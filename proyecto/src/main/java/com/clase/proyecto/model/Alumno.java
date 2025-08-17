package com.clase.proyecto.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "alumnos")
@Data
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_alumno;

    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private String email;
}