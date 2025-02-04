package org.example.Casa;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.electrodomesticos = new ArrayList<>();
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

    public ArrayList<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }
    //endregion

    public void agregarElectrodomestico(Electrodomestico electrodomestico) {
        for (Electrodomestico e : electrodomesticos) {
            if (e.getNombre().equals(electrodomestico.getNombre())) {
                System.out.println("El electrodoméstico " + electrodomestico.getNombre() + " ya existe en la habitación " + nombre);
                return;
            }
        }
        electrodomesticos.add(electrodomestico);
        System.out.println("Electrodoméstico " + electrodomestico.getNombre() + " agregado a la habitación " + nombre);
    }

    public void mostrarElectrodomesticos() {
        System.out.println("Electrodomésticos en la habitación " + nombre + ":");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println("- " + electrodomestico);
        }
    }

    public double calularConsumo() {
        double consumo = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            consumo += electrodomestico.getConsumo();
        }
        return consumo;
    }

    @Override
    public String toString() {
        return "Habitacion: " + getNombre() + ", metrosCuadrados = " + getMetrosCuadrados();
    }


}