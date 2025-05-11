package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Departamento;

public interface iDepartamentoRepository extends iGenericRepository<Departamento, Integer>{

    //JPA
    public Departamento findDepartamentoByIdDepartamento(Integer idDepartamento);

    public Departamento findDepartamentoByNombre(String nombre);


}
