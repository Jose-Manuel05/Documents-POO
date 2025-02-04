package org.example.Casa;

public class AppCasa {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");
        System.out.println(casa);

        casa.agregarHabitacion("Dormitorio", 40);
        casa.agregarHabitacion("Cocina", 65);
        casa.agregarHabitacion("Baño", 10);

        casa.mostrarHabitaciones();

        Habitacion cocina = casa.mostrarHabitaciones();
        cocina.agregarElectrodomestico(new Electrodomestico("Refrigerador", 150));
        cocina.agregarElectrodomestico(new Electrodomestico("Microondas", 1200));
        cocina.mostrarElectrodomesticos();

        System.out.println("Habitación con mayor consumo: " + casa.habitacionMasConsumo() + " watts");
    }
}