package org.example.Casa;

import java.util.ArrayList;

public class Casa {

    private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones

    public Casa(String direccion) {

        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();

    }

    public void agregarHabitacion(String nombre, double metros) {

        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);

    }

    public void mostrarHabitaciones() {

        System.out.println("Casa en " + direccion + " tiene las siguientes habitaciones: " + habitaciones);

    }

}
