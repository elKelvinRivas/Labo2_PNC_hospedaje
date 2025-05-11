package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.labo5.gestionhospedaje_labo5.Domain.Entities.Empleado;
import org.labo5.gestionhospedaje_labo5.Domain.Entities.Habitacion;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_reporte;

    private LocalDateTime fecha_hora;

    private String relato_ocurrido;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_habitacion", nullable = false)
    private Habitacion habitacion;
}
