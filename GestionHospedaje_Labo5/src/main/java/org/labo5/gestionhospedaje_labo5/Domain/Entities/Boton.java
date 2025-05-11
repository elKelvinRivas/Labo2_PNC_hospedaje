package org.labo5.gestionhospedaje_labo5.Domain.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "boton")

public class Boton {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBoton;

    @Column
    private String nombreColor;

    @Column
    private String codigoColor;

    @Column
    private Integer numero;

}
