package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Regalia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_regalia;

    private String nombre;

    private String descripcion;

    private int precio_puntos;
}
