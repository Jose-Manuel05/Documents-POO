package org.example.Practica1;

public class AppProgramas {

    public static void main(String[] args) {

        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        //insertamos empleados en el programa
        el_hormiguero.insertarEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);

    }

}
