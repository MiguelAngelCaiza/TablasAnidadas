package com.yavirac.gestionycontrol.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "insumos")


public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "numsillas")
    private Integer numsillas;

    @Column(name = "nummesas")
    private Integer nummesas;

    @Column(name = "numpizarras")
    private Integer numpizarras;

    @Column(name = "numcomputadoras")
    private Integer numcomputadoras;

    @Column(name = "numproyectores")
    private Integer numproyectores;

    @Column(name = "estado")
    private String estado;

    @Column(name = "detalle")
    private String detalle;


    //En el atributo departamento la anotación @ManyToOne señala la clave foránea,
    // que en la tabla “departamentos” tendrá el nombre de “departamento_id” @JoinColumn(name=”departamento_id”)
    @ManyToOne//LA RELACION
    @JoinColumn(name="departamento_id")//ESTE CAMPO ES EL ID DE LA TABLA QUE QUIERO VER SUS DATOS
    @JsonIgnore
    private Departamento departamento;


    public Insumo() {
    }

    public Integer getId() {return id; }

    public void setId(Integer id) { this.id = id; }

    public Integer getNumsillas() {
        return numsillas;
    }

    public void setNumsillas(Integer numsillas) {
        this.numsillas = numsillas;
    }

    public Integer getNummesas() {
        return nummesas;
    }

    public void setNummesas(Integer nummesas) {
        this.nummesas = nummesas;
    }

    public Integer getNumpizarras() {
        return numpizarras;
    }

    public void setNumpizarras(Integer numpizarras) {
        this.numpizarras = numpizarras;
    }

    public Integer getNumcomputadoras() {
        return numcomputadoras;
    }

    public void setNumcomputadoras(Integer numcomputadoras) {
        this.numcomputadoras = numcomputadoras;
    }

    public Integer getNumproyectores() {
        return numproyectores;
    }

    public void setNumproyectores(Integer numproyectores) {
        this.numproyectores = numproyectores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    //ESTO ES LO QUE VIENE DE LA TABLA DEPARTAMENTO
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
