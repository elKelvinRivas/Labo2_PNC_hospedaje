package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Reporte;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface iReporteRepository extends iGenericRepository<Reporte, UUID> {

    List<Reporte> findByEmpleadoIdEmpleado(UUID idEmpleado);
    List<Reporte> findByHabitacionIdHabitacion(Integer idHabitacion);
}
