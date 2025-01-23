package org.example;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        setEmail(email); // Usar el setter para validar el email
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
    }

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

    @Override
    public String toString() {
        return "Estudiante: [nombre = " + nombre + ", curso = " + curso + ", nia = " + nia + ", email = " + email + "]";
    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static Boolean validarCorreo(String email) {
        return email.matches(FORMATO_CORREO);
    }
}