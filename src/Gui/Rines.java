package Gui;

import java.io.Serializable;

public class Rines extends Inventario implements Serializable{

    private int num_rin;
    private String material;
    private String diseño;
    private String color;

    public Rines(int num_rin, String material, String diseño, int serie, String marca, double precio, String ubicacion) {
        super(serie, marca, precio, ubicacion);
        this.num_rin = num_rin;
        this.material = material;
        this.diseño = diseño;
    }

    public int getNum_rin() {
        return num_rin;
    }

    public void setNum_rin(int num_rin) {
        this.num_rin = num_rin;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
