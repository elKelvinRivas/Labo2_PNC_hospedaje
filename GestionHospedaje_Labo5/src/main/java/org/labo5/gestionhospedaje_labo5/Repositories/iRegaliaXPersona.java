package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.RegaliaXPersona;

import java.util.List;
import java.util.UUID;

public interface iRegaliaXPersona extends iGenericRepository<RegaliaXPersona, UUID> {
    List<RegaliaXPersona> findByPersonaIdPersona(Integer idPersona);
}
