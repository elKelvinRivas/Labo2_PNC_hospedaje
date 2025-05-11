package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegaliaXPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_regalia_visitante;

    private LocalDateTime fecha_entrega;

    @ManyToOne
    @JoinColumn(name = "id_regalia", nullable = false)
    private Regalia regalia;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;
}
