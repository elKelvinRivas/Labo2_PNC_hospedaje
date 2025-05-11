package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Boton;

public interface iBotonRepository extends iGenericRepository<Boton, Integer>{

    //JPA

    public Boton findBotonByIdBoton(Integer idBoton);

    public Boton findBotonByNombreColor(String nombreColor);

    public Boton findBotonsByCodigoColor(String codigoColor);

    public Boton findBotonsByNumero(Integer numero);
}
