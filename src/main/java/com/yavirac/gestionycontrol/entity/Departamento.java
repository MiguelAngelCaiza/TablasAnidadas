package com.yavirac.gestionycontrol.entity;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departamentos")


public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "nombre")
    private String nombre;

    //La anotación mappedBy=”departamento”  significa que en la clase Insumo habrá un atributo
    // llamado departamento que representará la clave foránea.
    @OneToMany(mappedBy="departamento", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)//
    private List<Insumo> insumos = new ArrayList<>();


    //TENEMOS LA RELACION
    @ManyToOne
    @JoinColumn(name="seccion_id")//ESTE CAMPO ES EL ID DE LA TABLA QUE QUIERO VER SUS DATOS
    @JsonIgnore
    private Seccion seccion;


    public Departamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    //ESTO ES LO QUE VIENE DE LA TABLA SECCION
    public Seccion getSeccion() {
        return seccion;
    }
    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }


    //HACIA QUE TABLA ENVIA DATOS
    public List<Insumo> getInsumos() { return insumos; }
    public void setPisos(List<Insumo> insumos) { this.insumos = insumos; }



}
