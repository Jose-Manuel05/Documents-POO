package org.example.Prueba;

public class Cliente {

    private static int contadorClientes = 0;

    private int id;
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        id = contadorClientes++;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //region Getters y Setters
    public String nombre() {
        return nombre;
    }

    public Cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int id() {
        return id;
    }

    public Cliente setId(int id) {
        this.id = id;
        return this;
    }

    public String apellido() {
        return apellido;
    }

    public Cliente setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
    //endregion

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

}
