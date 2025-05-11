package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Regalia;

import java.util.List;
import java.util.UUID;

public interface iRegaliaRespository extends iGenericRepository<Regalia, UUID> {
    List<Regalia> findByNombreContainingIgnoreCase(String nombre);
}
