package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Puntos;

import java.util.List;
import java.util.UUID;

public interface iPuntosRepository extends iGenericRepository<Puntos, UUID> {
    List<Puntos> findByEmpleadoIdEmpleado(UUID idEmpleado);
    List<Puntos> findByPersonaIdPersona(Integer idPersona);
}
