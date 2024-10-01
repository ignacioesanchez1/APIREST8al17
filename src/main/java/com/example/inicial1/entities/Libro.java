package com.example.inicial1.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="libro")
@AllArgsConstructor
@NoArgsConstructor //constructor vacio
@Setter
@Getter
@Builder
@Audited
public class Libro extends Base {

    private Long id;
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;


    @ManyToMany(cascade =CascadeType.REFRESH) //CON ESTO INDICAMOS QUE AL MOMENTO DE PERSISTIR UN LIBRO SIMEPRE SE MANTENGA ACTUALIZADO LOS AUTORES
    private List<Autor> autores;

}
