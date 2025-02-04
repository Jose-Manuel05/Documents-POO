package org.example.Practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporada;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director ;

    public Programa(String nombre, Cadena cadena, int temporada, String  nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporada = temporada;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        this.director = new Empleado("", "director", null);
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

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena.removerPrograma(this);
        this.cadena = cadena;
        cadena.agregarPrograma(this);
    }

    public int getTemporadas() {
        return temporada;
    }

    public void setTemporadas(int temporadas) {
        this.temporada = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }
    // endregion Getters and Setters


    // region metodos

    public void agregarDirector(String nombre) {
        director.setNombre(nombre);
    }

    public void removerDirector() {
        listaEmpleados.remove(director);
        director = null;
    }

    public void insertarEmpleado(String nombre, String cargo) {
        Empleado empleado = new Empleado(nombre, cargo, this.director);
        listaEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    public void insertarInvitado(String nombre, String profesion, LocalDate fecha_visita, int temporada) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, fecha_visita, temporada);
        listaInvitados.add(nuevoInvitado);
    }

    public void eliminarInvitado(Invitado invitado) {
        listaInvitados.remove(invitado);
    }

    // endregion metodos

    // region toString
    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporada +
                ", listaEmpleados=" + getListaEmpleados() +
                ", listaInvitados=" + getListaInvitados() +
                ", director=" + director.getNombre() +
                '}';
    }
    // endregion toString
}
