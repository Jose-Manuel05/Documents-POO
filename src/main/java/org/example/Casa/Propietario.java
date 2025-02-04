package org.example.Casa;

public class Propietario {

    private String nombre;
    private int edad;

    public Propietario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //region Geters y Seters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //endregion

    @Override
    public String toString() {
        return " Propietario: " + getNombre() + ", edad = " + getEdad();
    }

}

