package com.yavirac.gestionycontrol.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pisos")

public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

    //La anotación mappedBy=”piso”  significa que en la clase seccion habrá un atributo
    // llamado piso que representará la clave foránea.
    @OneToMany(mappedBy="piso", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
    private List<Seccion> secciones = new ArrayList<>();


    //En el atributo sede la anotación @ManyToOne señala la clave foránea,
    // que en la tabla “pisos” tendrá el nombre de “sede_id” @JoinColumn(name=”sede_id”)
    @ManyToOne//RELACION
    @JoinColumn(name="sede_id")////ESTE CAMPO ES EL ID DE LA TABLA QUE QUIERO VER SUS DATOS
    @JsonIgnore
    private Sede sede;

    public Piso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ESTO ES LO QUE ENVIA A LA TABLA SECCION
    public List<Seccion> getSecciones() {
        return secciones;
    }
    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }


    //ESTO ES LO QUE VIENE DE LA TABLA SEDE
    public Sede getSede() {
        return sede;
    }
    public void setSede(Sede sede) {
        this.sede = sede;
    }

}
