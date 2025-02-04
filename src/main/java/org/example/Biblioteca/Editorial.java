package org.example.Biblioteca;

import java.util.ArrayList;

public class Editorial {

    private String nombre;
    private ArrayList<Libro> librosPublicados;

    public Editorial(String nombre) {
        this.nombre = nombre;
        this.librosPublicados = new ArrayList<>();
    }

    //region Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    public void setLibrosPublicados(ArrayList<Libro> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }
    //endregion

    public void anyadirLibro(Libro libro) {
        librosPublicados.add(libro);
    }

    public void borrarLibro(Libro libro) {
        librosPublicados.remove(libro);
    }

    @Override
    public String toString() {
        return "Editorial: nombre = " + nombre + ", librosPublicados = " + librosPublicados;
    }
}