package org.example.Practica1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporada;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director ;

    public Programa(String nombre, Cadena cadena, String  nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        temporada = 0;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        this.director = new Empleado("", "director");
        listaEmpleados.add(director);
        cadena.agregarPrograma(this);
    }

    // region Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }
    // endregion Getters and Setters


    // region metodos
    public void insertarEmpleado(String nombre, String cargo, String nombreDirector) {
        Empleado empleado = new Empleado(nombre, cargo);
        listaEmpleados.add(empleado);
    }

    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
    }
    // endregion metodos

    // region toString
    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director+ '\'' +
                ", cadena='" + cadena + '\'' +
                ", temporada=" + temporada +
                '}';
    }
    // endregion toString
}
