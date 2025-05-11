package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Reserva;
import org.labo5.gestionhospedaje_labo5.Domain.Entities.ReservaHabitacion;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iReservaHabitacionRespository extends iGenericRepository<ReservaHabitacion, UUID> {
    List<ReservaHabitacion> findByReserva(Reserva reserva);
    Long countByReserva(Reserva reserva);
}
