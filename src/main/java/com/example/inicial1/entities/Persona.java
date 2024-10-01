package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="persona")
@AllArgsConstructor
@NoArgsConstructor //constructor vacio
@Setter
@Getter
@Builder
@Audited
public class Persona extends Base {
    private String nombre;
    private String apellido;
    private int dni;


    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="fk_domicilio")
    private Domicilio domicilio;



@OneToMany (cascade =CascadeType.ALL, orphanRemoval=true) //ACA NOS ASEGURAMOS QUE SI ELIMINAMOS UNA PERSONA ELIMINAMOS TAMBIEN TODOS LOS LIBROS QUE LE PERTENECEN
@JoinTable(
        name="persona_libro",
        joinColumns=@JoinColumn(name="persona_id"),
        inverseJoinColumns=@JoinColumn(name="libro_id")

)
@Builder.Default
    private List <Libro> libros=new ArrayList<Libro>();
}
