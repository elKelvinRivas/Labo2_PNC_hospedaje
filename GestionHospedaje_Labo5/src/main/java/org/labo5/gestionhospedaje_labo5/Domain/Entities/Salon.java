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
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_salon;

    private String nombre;

    private String capacidad;

    //
    @ManyToOne
    @JoinColumn(name = "id_edificio", nullable = false, foreignKey = @ForeignKey(name = "FK_salon_edificio"))
    private Edificio edificio;


}
