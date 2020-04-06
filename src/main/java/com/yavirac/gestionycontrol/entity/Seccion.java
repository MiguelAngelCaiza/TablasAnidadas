package com.yavirac.gestionycontrol.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "secciones")


public class Seccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;


    //La anotación mappedBy=”seccion”  significa que en la clase departamento habrá un atributo
    // llamado seccion que representará la clave foránea.
    @OneToMany(mappedBy="seccion", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
    private List<Departamento> departamentos = new ArrayList<>();


    //En el atributo sede la anotación @ManyToOne señala la clave foránea,
    // que en la tabla “pisos” tendrá el nombre de “departamento_id” @JoinColumn(name=”departamento_id”)
    //TENEMOS LA RELACION
    @ManyToOne
    @JoinColumn(name="piso_id")//ESTO ES LO QUE VIENE DE LA TABLA PISO
    @JsonIgnore
    private Piso piso;

    public Seccion() {
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

    //ESTO ES LO QUE VIENE DE LA TABLA PISO
    public Piso getPiso() {
        return piso;
    }
    public void setPiso(Piso piso) {
        this.piso = piso;
    }


    //ESTO ES LO QUE MANDA A LA TABLA DEPARTAMENTO
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }




}
