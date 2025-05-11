package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Nivel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iNivelRepository extends iGenericRepository<Nivel, Integer>{

    //JPA

    public Nivel findNivelByIdNivel(Integer idNivel);

    public Nivel findNivelByNombre(String nombre);

    //Querys hibrida para las FK

    //Para boton
    @Query("SELECT u FROM Nivel u WHERE u.boton.nombreColor = :nombre")
    public Nivel findByBotonNombre(@Param("nombre") String nombre);

    //Para edificio
    @Query("SELECT u FROM Nivel u WHERE u.edificio.nombre = :nombre")
    public Nivel findByEdificioNombre(@Param("nombre") String nombre);
}
