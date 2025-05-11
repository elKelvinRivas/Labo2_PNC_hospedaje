package org.labo5.gestionhospedaje_labo5.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEmpleado;

    //Muchos Empleados pueden ser Persona
    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_persona"))
    private Persona persona;

    //Muchos empleados pueden estar en un edificio
    @ManyToOne
    @JoinColumn(name = "id_edificio", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_edificio"))
    private Edificio edificio;

    //Muchos empleado pueden pertenecer a un departamento
    @ManyToOne
    @JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_departamento"))
    private Departamento departamento;

    //Un empleado puede coordinar a un solo empleado
    @OneToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_empleado"))
    private Empleado empleado;
}
