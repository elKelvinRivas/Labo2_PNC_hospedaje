package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iPersonaRepository extends iGenericRepository<Persona, Integer>{

    //JPA
    public Persona findPersonaByIdPersona(Integer idPersona);

    public Persona findPersonaByNombre(String nombre);

    public Persona findPersonaByApellido(String apellido);

    public Persona findPersonaByUsuario(String usuario);

    //Querys hibridas
    @Query("SELECT u FROM Persona u WHERE u.rol.nombre= :nombre")
    public Persona findByRolNombre(@Param("nombre") String nombre);

}
