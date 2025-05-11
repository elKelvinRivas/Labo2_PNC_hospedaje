package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Reserva;

import java.util.List;
import java.util.UUID;

public interface iReservaRepository extends iGenericRepository<Reserva, UUID> {
    List<Reserva> findByPersonaIdPersona(Integer idPersona);
    List<Reserva> findByEstado(String estado);
}
