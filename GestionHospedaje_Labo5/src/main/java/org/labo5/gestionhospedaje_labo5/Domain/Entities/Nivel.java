package org.labo5.gestionhospedaje_labo5.Domain.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nivel")
public class Nivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNivel;

    @Column
    private String nombre;

    //Un nivel, debe tener un boton
    @OneToOne
    @JoinColumn(name = "id_boton", nullable = false, foreignKey = @ForeignKey(name = "FK_nivel_boton"))
    private Boton boton;

    //Muchos niveles, pueden estar en un edificio
    @ManyToOne
    @JoinColumn(name = "id_edificio", nullable = false, foreignKey = @ForeignKey(name = "FK_nivel_edificio"))
    private Edificio edificio;
}
