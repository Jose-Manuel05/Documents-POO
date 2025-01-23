package org.example;

public class Libro {

    public static int CANTIDAD_LIBROS = 0;
    public static int LIBROS_DISPONIBLES = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
        this.id = calcularId();
        this.disponible = true;
        CANTIDAD_LIBROS++;
        LIBROS_DISPONIBLES++;

    }

    private String calcularId() {
        return String.format("LIB001", CANTIDAD_LIBROS + 1);
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            LIBROS_DISPONIBLES--;
        } else {
            System.out.println("El libro no está disponible");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            LIBROS_DISPONIBLES++;
        } else {
            System.out.println("El libro ya está disponible");
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public int getTotales() {
        return CANTIDAD_LIBROS;
    }

    public int getDisponibles() {
        return LIBROS_DISPONIBLES;
    }

    @Override
    public String toString() {
        return "Libro: [titulo = " + titulo + ", autor = " + autor + ", id = " + id + ", disponible = " + disponible + "]";

    }

}
