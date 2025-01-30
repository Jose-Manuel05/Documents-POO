package org.example.Ejercicios;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        librosPrestados = new ArrayList<>();
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        setEmail(email);
        librosPrestados = new ArrayList<>();
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }

    //region Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validarCorreo(email)) {
            this.email = email;
        } else {
            System.out.println("El email no es válido");
        }
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    //endregion

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static Boolean validarCorreo(String email) {
        return email.matches(FORMATO_CORREO);
    }

    public void anyadirLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void borrarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    @Override
    public String toString() {

        if (!librosPrestados.isEmpty()){
            return "Estudiante: nombre = " + nombre + ", curso = " + curso + ", nia = " + nia + ", email = " + email + ", librosPrestados = " + librosPrestados;
        }else {
            return "Estudiante: nombre = " + nombre + ", curso = " + curso + ", nia = " + nia + ", email = " + email;
        }

    }


}