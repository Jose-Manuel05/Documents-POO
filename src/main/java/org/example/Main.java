package org.example;

public class Main {

    public static void main(String[] args) {

//        Estudiante estudiante1 = new Estudiante("Pepe", "1º ESO", "noseque@alu.edu.gva.es");
//        Editorial editorial1 = new Editorial("Anaya");
//        Libro libro1 = new Libro("El Quijote", "Cervantes", editorial1);
//
//        libro1.prestar(estudiante1);
//
//        System.out.println(libro1);
//        System.out.println(estudiante1);
//
//        libro1.devolver(estudiante1);
//
//        System.out.println(Libro.getDisponibles());

        Persona persona1 = new Persona("Pepe", "Perez", "12345678A", 25, 70, "Programador", "Valencia");

        Equipo equipo1 = new Equipo("Real Madrid");
        System.out.println(equipo1);

        equipo1.anyadirComponente(persona1);
        System.out.println(equipo1);

        equipo1.eliminarComponente(persona1);
        System.out.println(equipo1);

    }
}