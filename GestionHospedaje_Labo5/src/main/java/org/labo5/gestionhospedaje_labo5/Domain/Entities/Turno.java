package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turno {

    @Id
    @GeneratedValue
    private UUID id_turno;

    private String horario;
}

