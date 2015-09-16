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
public class Repuesto extends Inventario implements Serializable{

    private String nombre;
    private String Modelo;
    private String year;
    private boolean usado;

    public Repuesto(String nombre, String Modelo, String year, boolean usado, int serie, String marca, double precio, String ubicacion) {
        super(serie, marca, precio, ubicacion);
        this.nombre = nombre;
        this.Modelo = Modelo;
        this.year = year;
        this.usado = usado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

}
