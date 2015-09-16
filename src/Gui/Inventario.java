/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.Serializable;

/**
 *
 * @author Daniel Portillo
 */
public class Inventario implements Serializable{

    private int serie;
    private String marca;
    private double precio;
    private String ubicacion;

    public Inventario(int serie, String marca, double precio, String ubicacion) {
        this.serie = serie;
        this.marca = marca;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
