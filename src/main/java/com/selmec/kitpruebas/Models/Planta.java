package com.selmec.kitpruebas.Models;
// Generated Oct 26, 2014 8:36:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Planta generated by hbm2java
 */
@Entity
@Table(name="planta"
    ,catalog="kitpruebas"
)
public class Planta  implements java.io.Serializable {


     private String noSerie;
     private Motores motores;
     private String noOp;
     private String motorSerie;
     private String controlId;
     private int tipoOperacion;
     private String generadorSerie;
     private Integer voltaje;
     private Integer capInt;
     private Set ensambles = new HashSet(0);

    public Planta() {
    }

	
    public Planta(String noSerie, Motores motores, String noOp, String motorSerie, String controlId, int tipoOperacion, String generadorSerie) {
        this.noSerie = noSerie;
        this.motores = motores;
        this.noOp = noOp;
        this.motorSerie = motorSerie;
        this.controlId = controlId;
        this.tipoOperacion = tipoOperacion;
        this.generadorSerie = generadorSerie;
    }
    public Planta(String noSerie, Motores motores, String noOp, String motorSerie, String controlId, int tipoOperacion, String generadorSerie, Integer voltaje, Integer capInt, Set ensambles) {
       this.noSerie = noSerie;
       this.motores = motores;
       this.noOp = noOp;
       this.motorSerie = motorSerie;
       this.controlId = controlId;
       this.tipoOperacion = tipoOperacion;
       this.generadorSerie = generadorSerie;
       this.voltaje = voltaje;
       this.capInt = capInt;
       this.ensambles = ensambles;
    }
   
     @Id 

    
    @Column(name="NoSerie", unique=true, nullable=false, length=50)
    public String getNoSerie() {
        return this.noSerie;
    }
    
    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MotorID", nullable=false)
    public Motores getMotores() {
        return this.motores;
    }
    
    public void setMotores(Motores motores) {
        this.motores = motores;
    }

    
    @Column(name="NoOp", nullable=false, length=50)
    public String getNoOp() {
        return this.noOp;
    }
    
    public void setNoOp(String noOp) {
        this.noOp = noOp;
    }

    
    @Column(name="MotorSerie", nullable=false, length=50)
    public String getMotorSerie() {
        return this.motorSerie;
    }
    
    public void setMotorSerie(String motorSerie) {
        this.motorSerie = motorSerie;
    }

    
    @Column(name="ControlID", nullable=false, length=50)
    public String getControlId() {
        return this.controlId;
    }
    
    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    
    @Column(name="TipoOperacion", nullable=false)
    public int getTipoOperacion() {
        return this.tipoOperacion;
    }
    
    public void setTipoOperacion(int tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    
    @Column(name="GeneradorSerie", nullable=false, length=45)
    public String getGeneradorSerie() {
        return this.generadorSerie;
    }
    
    public void setGeneradorSerie(String generadorSerie) {
        this.generadorSerie = generadorSerie;
    }

    
    @Column(name="Voltaje")
    public Integer getVoltaje() {
        return this.voltaje;
    }
    
    public void setVoltaje(Integer voltaje) {
        this.voltaje = voltaje;
    }

    
    @Column(name="CapInt")
    public Integer getCapInt() {
        return this.capInt;
    }
    
    public void setCapInt(Integer capInt) {
        this.capInt = capInt;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="planta")
    public Set getEnsambles() {
        return this.ensambles;
    }
    
    public void setEnsambles(Set ensambles) {
        this.ensambles = ensambles;
    }




}


