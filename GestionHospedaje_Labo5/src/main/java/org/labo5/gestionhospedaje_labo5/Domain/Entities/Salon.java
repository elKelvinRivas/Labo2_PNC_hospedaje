package org.labo5.gestionhospedaje_labo5.Domain.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salon")
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idSalon;

    @Column
    private String nombre;

    @Column
    private Integer capacidad;

    //Muchos salones pueden pertenecer a un edificio
    @ManyToOne
    @JoinColumn(name = "id_edificio", nullable = false, foreignKey = @ForeignKey(name = "FK_salon_edificio"))
    private Edificio edificio;


}
