package org.example;



public class Main {

    public static void main(String[] args) {

//     Estudiante estudiante1 = new Estudiante("Pepe");
//     Estudiante estudiante2 = new Estudiante("Juan", "1º DAM", "prueba@alu.eu.gva.es");
//
//        System.out.println(estudiante1);
//        System.out.println(estudiante2);
//        System.out.println(Estudiante.contadorEstudiantes);
//        System.out.println(Estudiante.obtenerTotalEstudiantes());

        Libro libro1 = new Libro("El Quijote", "Cervantes");
        Libro libro2 = new Libro("El Señor de los Anillos", "Tolkien");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(Libro.CANTIDAD_LIBROS);
        System.out.println(Libro.LIBROS_DISPONIBLES);

        libro1.prestar();
        libro2.prestar();

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(Libro.CANTIDAD_LIBROS);
        System.out.println(Libro.LIBROS_DISPONIBLES);

        libro1.devolver();

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(Libro.CANTIDAD_LIBROS);
        System.out.println(Libro.LIBROS_DISPONIBLES);

        libro2.devolver();

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(Libro.CANTIDAD_LIBROS);
        System.out.println(Libro.LIBROS_DISPONIBLES);

    }

}
