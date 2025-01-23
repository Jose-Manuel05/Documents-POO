package org.example;

import java.util.Random;

public class Paciente {

    private final static char GENERO_DEFAULT = 'X';
    public final static int SOBREPESO = 1;
    public final static int PESO_BBAJO = -1;
    public final static int PESO_IDEAL = 0;
    public final static int MAYORIA_EDAD = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private float peso;
    private float altura;

    public Paciente(String nombre, int edad, char genero, float peso, float altura) {

        this.nombre = nombre;
        this.edad = edad;
        comprobarGenero(genero);
        this.peso = peso;
        this.altura = altura;
        generarDni();

    }

    public Paciente() {

        this("", 0, GENERO_DEFAULT, 0, 0);

    }

    public Paciente(String nombre, int edad, char genero) {

        this(nombre, edad, genero, 0, 0);
    }

    private void generarDni() {

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(99999999)+10000000;

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = numero%23;

        this.dni = Integer.toString(numero) + letras[resto];
    }

    public int calcularIMC() {

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return PESO_BBAJO;
        } else if (imc > 25 ) {
            return SOBREPESO;
        } else {
            return PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad() {

        if (edad >= MAYORIA_EDAD) {
            return true;
        } else {
            return false;
        }

    }

    private void comprobarGenero(char genero) {

        if (genero != 'H' && genero != 'M') {
            this.genero = GENERO_DEFAULT;
        }else {
            this.genero = genero;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        comprobarGenero(genero);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Deprecated
    public String toString() {

        return "Paciente con el nombre " + this.nombre + " y edad " + this.edad + ".Genero: " + this.genero + "y DNI: " + this.dni + "con altura de: " + this.altura + "y peso de: " + this.peso;

    }

    public static void comprobarPeso(Paciente paciente) {

        int imc = paciente.calcularIMC();

        switch (imc) {
            case Paciente.PESO_BBAJO:
                System.out.println("El paciente " + paciente.getNombre() + "tiene bajo peso");
                break;
            case Paciente.PESO_IDEAL:
                System.out.println("El paciente " + paciente.getNombre() + " tiene un peso ideal");
                break;
            case Paciente.SOBREPESO:
                System.out.println("El paciente " + paciente.getNombre() + " tiene sobrepeso");
                break;
        }
    }

    public static void mayorEdad(Paciente paciente) {

        if (paciente.esMayorDeEdad()) {
            System.out.println("El paciente " + paciente.getNombre() + " es mayor de edad");
        } else {
            System.out.println("El paciente " + paciente.getNombre() + " es menor de edad");
        }

    }



}
