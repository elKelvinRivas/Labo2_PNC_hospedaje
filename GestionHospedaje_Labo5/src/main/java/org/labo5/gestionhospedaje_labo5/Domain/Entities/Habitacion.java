package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHabitacion;

    @Column
    private String nombre;

    @Column
    private Integer numero;

    @Column
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "habitacion_id", nullable = false, foreignKey = @ForeignKey(name = "FK_habitacion_nivel"))
    private Nivel nivel;

}
