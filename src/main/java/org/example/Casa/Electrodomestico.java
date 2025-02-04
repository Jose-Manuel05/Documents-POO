package org.example.Casa;

public class Electrodomestico    {

    private String nombre;
    private double consumo;

    public Electrodomestico(String nombre, double consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }

    //region Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    //endregion

    @Override
    public String toString() {
        return "Electrodomestico: " + getNombre() + ", consumo = " + getConsumo();
    }

}
