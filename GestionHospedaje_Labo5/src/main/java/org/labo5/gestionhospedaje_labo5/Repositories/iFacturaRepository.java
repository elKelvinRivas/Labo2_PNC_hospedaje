package org.labo5.gestionhospedaje_labo5.Repositories;

import org.labo5.gestionhospedaje_labo5.Domain.Entities.Factura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface iFacturaRepository extends iGenericRepository<Factura, UUID> {
    @Query("SELECT f FROM Factura f WHERE f.reserva.id_reserva = :idReserva")
    Factura buscarPorIdReserva(@Param("idReserva") UUID idReserva);
}
