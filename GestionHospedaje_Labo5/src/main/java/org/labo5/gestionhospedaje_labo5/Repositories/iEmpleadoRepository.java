package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iEmpleadoRepository extends iGenericRepository<Empleado, UUID> {

    //JPA
    public Empleado findEmpleadoByIdEmpleado(UUID idEmpleado);

    // Querys para FK

    //Para persona
    @Query("SELECT u FROM Empleado u WHERE u.persona.nombre = :nombre")
    public Empleado findByPersonaNombre(@Param("nombre") String nombre);

    //Para edificio
    @Query("SELECT u FROM Empleado u WHERE u.edificio.nombre = :nombre")
    public Empleado findByEdificioNombre(@Param("nombre") String nombre);

    //Para departamento
    @Query("SELECT u FROM Empleado u WHERE u.departamento.nombre = :nombre")
    public Empleado findByDepartamentoNombre(@Param("nombre") String nombre);

    //Para empleado *REVISAR*
    @Query("SELECT u FROM Empleado u WHERE u.empleado.idEmpleado = :id")
    public Empleado findByEmpleadosId(@Param("id") UUID id);
}
