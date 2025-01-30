package org.example.Casa;

public class Habitacion {

    private String nombre;
    private double metrosCuadrados;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    //region Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    //endregion

    @Override
    public String toString() {
        return "Habitacion: " + nombre + ", metrosCuadrados = " + metrosCuadrados;
    }

}
