package org.example.Practica1;

public class Empleado {

    private static int contador = 1;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {

        this.nombre = nombre;
        id = calcularID();
        this.cargo = comprobarCargo(cargo);
        if (this.cargo.equals("director")) {
            this.director = null;
        }else {
            this.director = director;
        }

    }

    // region Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    // endregion Getters and Setters

    // region Metodos

    private String comprobarCargo(String cargo) {

        cargo = cargo.toLowerCase();
        if (cargo.equals("director")) {
            return "director";
        } else if (cargo.equals("presentador")) {
            return "presentador";
        } else if (cargo.equals("técnico")) {
            return "técnico";
        } else if (cargo.equals("colaborador")) {
            return "colaborador";
        } else {
            return "pte";
        }

    }

    private String calcularID() {
        return String.format("EP%03d", contador + 1);
    }

    // endregion metodos

    // region toString
    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + (director != null ? director.getNombre() : "N/A") +
                '}';
    }
    // endregion toString

}
