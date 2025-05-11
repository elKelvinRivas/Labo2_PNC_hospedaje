package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Salon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iSalonRepository extends iGenericRepository<Salon, UUID>{

    //JPA
    public Salon findSalonByIdSalon(UUID id);

    public Salon findSalonByNombre(String nombre);

    public Salon findSalonByCapacidad(Integer capacidad);

    //Query hibrida para las FK
    @Query("SELECT u FROM Salon u WHERE u.edificio.nombre = :nombre")
    public Salon findByEdificioNombre(@Param("nombre") String nombre);
}
