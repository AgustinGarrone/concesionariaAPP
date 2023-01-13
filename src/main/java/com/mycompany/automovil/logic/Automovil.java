
package com.mycompany.automovil.logic;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Automovil implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String modelo;
    private String marca;
    private String motor;
    private String patente;
    private String color;
    private int puertas;

    public Automovil() {
    }

    public Automovil(Long id, String marca, String modelo, String motor,String patente, String color, int puertas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.patente = patente;
        this.color = color;
        this.puertas = puertas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
    
}
