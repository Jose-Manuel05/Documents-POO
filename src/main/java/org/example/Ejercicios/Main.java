package org.example.Ejercicios;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Pepe", "1º ESO", "noseque@alu.edu.gva.es");
        Editorial editorial1 = new Editorial("Anaya");
        Libro libro1 = new Libro("El Quijote", "Cervantes", editorial1);

        libro1.prestar(estudiante1);

        System.out.println(libro1);
        System.out.println(estudiante1);

        libro1.devolver(estudiante1);

        System.out.println(Libro.getDisponibles());


    }
}