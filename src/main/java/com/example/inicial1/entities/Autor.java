package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="autor")
@AllArgsConstructor
@NoArgsConstructor //constructor vacio
@Setter
@Getter
@Builder
@Audited
public class Autor extends Base {
    private String nombre;
    private String apellido;
    @Column(name="biografia", length = 1500) //indica que esta columna va a recibir string de hasya 1500 caracteres
    private String biografia;

}
