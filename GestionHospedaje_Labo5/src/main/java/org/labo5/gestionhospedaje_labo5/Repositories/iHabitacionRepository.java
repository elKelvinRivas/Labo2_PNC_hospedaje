package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Habitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iHabitacionRepository extends iGenericRepository<Habitacion, Integer>{

    //JPA

    public Habitacion findHabitacionByIdHabitacion(Integer idHabitacion);

    public Habitacion findHabitacionByNombre(String nombre);

    public Habitacion findHabitacionByNumero(Integer numero);

    public Habitacion findHabitacionByDescripcion(String descripcion);

    //Query para FK

    @Query("SELECT u FROM Habitacion u WHERE u.nivel.nombre = :nombre")
    public Habitacion findByNivelNombre(@Param("nombre") String nombre);


}
