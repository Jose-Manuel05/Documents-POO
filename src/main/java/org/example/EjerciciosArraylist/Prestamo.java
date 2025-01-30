package org.example.EjerciciosArraylist;

import java.time.LocalDate;

public class Prestamo {

    private Estudiante estudiante;
    private Libro libro;
    private LocalDate fechaPrestamo;

    public Prestamo(Estudiante estudiante, Libro libro) {

        this.estudiante = estudiante;
        this.libro = libro;
        fechaPrestamo = LocalDate.now();

    }

    //region Geters y Seters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    //endregion

    @Override
    public String toString() {
        return "Prestamo: " + libro.getTitulo() + " a " + estudiante.getNombre() + " el " + fechaPrestamo;
    }

}
