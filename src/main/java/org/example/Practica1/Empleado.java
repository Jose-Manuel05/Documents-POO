package org.example.Practica1;

public class Empleado {

    private static int contador = 1;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.director = null;
        id = calcularID();
        this.cargo = comprobarCargo();
    }

    // region Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // endregion Getters and Setters

    // region Metodos

    private String comprobarCargo() {

        if (cargo.equals("director")) {
            return "director";

        }else if (cargo.equals("técnico")) {
            return "técnico";

        }else if (cargo.equals("presentador")) {
            return "presentador";

        }else if (cargo.equals("colaborador")) {
            return "colaborador";

        } else {
            return "pte";
        }

    }

    // endregion metodos
        private String calcularID() {
            return String.format("EP%03d", contador + 1);
        }
    // region toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    // endregion toString

}
