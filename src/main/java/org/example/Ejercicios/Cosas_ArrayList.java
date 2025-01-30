package org.example.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Cosas_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(3);
        listaNumeros.add(14);
        listaNumeros.add(45);
        listaNumeros.add(1,9);

        System.out.println(listaNumeros.get(0));
        listaNumeros.remove(0);
        System.out.println(listaNumeros.get(0));
        listaNumeros.remove((Integer)45);
        System.out.println(listaNumeros);
        System.out.println("Posicion del numero 14: " + listaNumeros.indexOf(14));
        System.out.println("Posicion del numero 45: " + listaNumeros.indexOf(45));

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }

        for (int lista: listaNumeros) {
            System.out.println(lista);
        }

        listaNumeros.set(0, 56);
        System.out.println(listaNumeros.get(0));

        Object lista_copia = listaNumeros.clone();
        System.out.println(lista_copia);

        listaNumeros.clear();
        System.out.println(listaNumeros);

        if (listaNumeros.contains(56)) {
            System.out.println("El numero 56 está en la lista");
        } else {
            System.out.println("El numero 56 no está en la lista");
        }

        if (listaNumeros.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }

        listaNumeros.addAll(Arrays.asList(2,5,9,12,33));

        System.out.println(listaNumeros);

        insertarVarias(listaNumeros,4,19,90);
        System.out.println(listaNumeros);

    }

    public static void insertarVarias(ArrayList<Integer> lista, Integer... numeros) {
        lista.addAll(Arrays.asList(numeros));

    }

}
