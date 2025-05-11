package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.RotacionMensual;

import java.util.List;
import java.util.UUID;

public interface iRotacionMensual extends iGenericRepository<RotacionMensual, UUID> {
    List<RotacionMensual> findByMes(int mes);
    List<RotacionMensual> findByAño(int año);
    List<RotacionMensual> findByEmpleadoIdEmpleado(UUID idEmpleado);
}
