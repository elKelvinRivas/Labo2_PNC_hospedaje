package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Turno;

import java.util.List;
import java.util.UUID;

public interface iTurnoRepository extends iGenericRepository<Turno, UUID> {
    List<Turno> findByHorario(String horario);
}
