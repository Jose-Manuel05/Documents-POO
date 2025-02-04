package org.example.Practica1;

import java.time.LocalDate;

public class AppProgramas {

    public static void main(String[] args) {

        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3, 15, "Pablo Motos");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        //insertamos empleados en el programa
        el_hormiguero.insertarEmpleado("Pablo Motos","presentador");
        System.out.println(el_hormiguero);
        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());


        //insertamos invitados en el programa
        el_hormiguero.insertarInvitado("Aitana","cantante", LocalDate.of(2021,5,10), 5);
        //ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());


    }

}
