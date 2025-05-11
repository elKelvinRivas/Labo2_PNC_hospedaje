package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Rol;

public interface iRolRepository extends iGenericRepository<Rol, Integer> {

    //JPA

    public Rol findRolByIdRol(Integer idRol);

    public Rol findRolByNombre(String nombre);
}
