package org.example.Practica1;

import java.time.LocalDate;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, LocalDate fecha_visita, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_visita = fecha_visita;
    }

    // region Getters and Setters
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }


    // endregion Getters and Setters

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fechaVisita=" + fecha_visita +
                '}';
    }

}
