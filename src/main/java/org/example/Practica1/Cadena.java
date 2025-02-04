package org.example.Practica1;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa>listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    // region Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }
    // endregion Getters and Setters

    // region metodos
    public void agregarPrograma(Programa programa){
        listaProgramas.add(programa);
    }

    public void removerPrograma(Programa programa){
        listaProgramas.remove(programa);
    }
    // endregion metodos

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }

}
