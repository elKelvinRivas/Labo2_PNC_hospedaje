package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Reserva;
import org.labo5.gestionhospedaje_labo5.Domain.Entities.ReservaSalon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iReservaSalon extends iGenericRepository<ReservaSalon, UUID> {

    @Query("SELECT rs FROM ReservaSalon rs WHERE rs.reserva.estado = :estado")
    List<ReservaSalon> findByEstadoReserva(@Param("estado") String estado);

    @Query("SELECT rs FROM ReservaSalon rs WHERE rs.reserva.persona.idPersona = :personaId")
    List<ReservaSalon> findByPersonaId(@Param("personaId") Integer personaId);

}
