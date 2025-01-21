package com.tuempresa.easycar2.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    @Column(length = 20)
    @Required
    private String marca;

    @Column(length = 20)
    @Required
    private String modelo;

    @Required
    private int a�o;

    @Required
    private double precio;

    // Getters y setters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
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

    public int getA�o() {
        return a�o;
    }

    public void setA�o(int a�o) {
        this.a�o = a�o;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}