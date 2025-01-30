package org.example.Ejercicios;

import java.util.ArrayList;

public class Equipo {



    private String nombre;
    private ArrayList<Persona> componentes;

    public Equipo(String nombre) {

        this.nombre = nombre;
        componentes = new ArrayList<>();

    }

    public void anyadirComponente(Persona persona) {

        componentes.add(persona);

    }

    public void eliminarComponente(Persona persona) {

        componentes.remove(persona);

    }

    //region Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getcomponentes() {
        return componentes;
    }

    public void setComonentes(ArrayList<Persona> componentes) {
        this.componentes = componentes;
    }
    //endregion

    @Override
    public String toString() {
        return "Equipo: nombre = " + getNombre() + ", componentes = " + componentes;
    }

}
