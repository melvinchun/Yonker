package Gui;

import java.io.Serializable;

public class Llantas extends Inventario implements Serializable{

    private int num_llanta;
    private int num_malla;

    public Llantas(int num_llanta, int num_malla, int serie, String marca, double precio, String ubicacion) {
        super(serie, marca, precio, ubicacion);
        this.num_llanta = num_llanta;
        this.num_malla = num_malla;
    }

    public int getNum_llanta() {
        return num_llanta;
    }

    public void setNum_llanta(int num_llanta) {
        this.num_llanta = num_llanta;
    }

    public int getNum_malla() {
        return num_malla;
    }

    public void setNum_malla(int num_malla) {
        this.num_malla = num_malla;
    }
}
