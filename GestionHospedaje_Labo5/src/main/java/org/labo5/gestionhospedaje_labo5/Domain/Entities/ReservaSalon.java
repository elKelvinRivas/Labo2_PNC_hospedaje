package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reserva_salon")
public class ReservaSalon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idReservaSalon;

    @ManyToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "id_salon", referencedColumnName = "id_salon")
    private Salon salon;

}