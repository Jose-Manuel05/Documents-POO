package org.example.Casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private Propietario propietario;

    public Casa(String direccion) {

        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();

    }

    //region Geters y Seters
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {

        System.out.println("Introduce el nombre del propietari@:");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la edad del propietari@:");
        int edad = teclado.nextInt();

        propietario = new Propietario(nombre, edad);
    }
    //endregion

    public void agregarHabitacion(String nombre, double metros) {

        for (Habitacion hab : habitaciones) {
            if (hab.getNombre().equals(nombre)) {
                System.out.println("La habitación " + nombre + " ya existe en la casa.");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);

    }

    public Habitacion mostrarHabitaciones() {

        System.out.println("Casa en " + direccion + " tiene " + habitaciones.size() + " habitaciones:");
        for (Habitacion hab : habitaciones) {
            System.out.println("- " + hab.getNombre() + " (" + hab.getMetrosCuadrados() + " m2)");
        }
        return habitaciones.getFirst();
    }

    public Habitacion getHabitacionMasGrande() {

        Habitacion max = habitaciones.getFirst();

        for (Habitacion hab: habitaciones) {
            if (hab.getMetrosCuadrados() > max.getMetrosCuadrados()) {
                max = hab;
            }
        }

        return max;
    }

    public void eliminarHabitacion(String nombre) {

        for (Habitacion hab : habitaciones) {
            if (hab.getNombre().equals(nombre)) {
                habitaciones.remove(hab);
                return;
            }
        }

    }

    public double habitacionMasConsumo() {

        double max = habitaciones.getFirst().calularConsumo();

        for (Habitacion hab : habitaciones) {
            if (hab.calularConsumo() > max) {
                max = hab.calularConsumo();
            }
        }

        return max;
    }

    @Override
    public String toString() {
        return "Casa: " + "Dirección = " + direccion + propietario;
    }

}
