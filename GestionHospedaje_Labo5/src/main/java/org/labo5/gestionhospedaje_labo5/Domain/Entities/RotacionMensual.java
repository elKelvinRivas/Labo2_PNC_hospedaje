package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RotacionMensual {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_rotacion;

    private int mes;

    private int año;

    private String estado_rotacion;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_nivel", nullable = false)
    private Nivel nivel;

    @ManyToOne
    @JoinColumn(name = "id_turno", nullable = false)
    private Turno turno;
}
