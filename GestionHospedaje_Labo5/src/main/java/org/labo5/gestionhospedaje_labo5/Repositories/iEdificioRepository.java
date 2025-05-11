package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Edificio;
import org.springframework.data.jpa.repository.Query;

public interface iEdificioRepository extends iGenericRepository<Edificio, Integer>{

    //JPA
    public Edificio findEdificioByIdEdificio(Integer idEdificio);

    public Edificio findEdificioByNombre(String nombre);

    public Edificio findEdificioByDireccion(String direccion);

}
