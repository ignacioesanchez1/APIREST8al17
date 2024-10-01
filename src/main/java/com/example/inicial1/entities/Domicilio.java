package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@Table(name="domicilio")
@AllArgsConstructor
@NoArgsConstructor //constructor vacio
@Setter
@Getter
@Builder
@Audited
public class Domicilio  extends Base {

    private String calle;
    private int numero;

    @ManyToOne(optional=false) //INDICAMOS QUE ESTA RELACION NO ES OPCIONAL, NO PUEDE SER NULA,SIEMPRE QUE QUIERO CREAR UN DOMICILIO SIEMPRE TIENE QUE TENER UNA LOCALIDAD
    @JoinColumn(name="fk_localidad")
    private Localidad localidad;

}
