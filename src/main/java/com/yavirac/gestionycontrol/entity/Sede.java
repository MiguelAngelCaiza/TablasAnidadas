package com.yavirac.gestionycontrol.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sede")

public class Sede {
    //autogenerable la id indicamos aqui
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

    //La anotación mappedBy=”sede”  significa que en la clase Piso habrá un atributo
    // llamado sede que representará la clave foránea, en nuestro caso, la sede de cada piso.
    @OneToMany(mappedBy="sede", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
    private List<Piso> pisos = new ArrayList<>();

    public Sede() {
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

    //ESTE ES HACIA DONDE MANDA LOS DATOS- A QUE CLASE
    public List<Piso> getPisos() {
        return pisos;
    }
    public void setPisos(List<Piso> pisos) {
        this.pisos = pisos;
    }

}
