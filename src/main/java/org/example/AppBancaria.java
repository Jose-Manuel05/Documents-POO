package org.example.Prueba;

import org.example.Cliente;
import org.example.Cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBancaria {

    private static final ArrayList<Cliente> clientes = new ArrayList<>();
    private static final ArrayList<Cuenta> cuentas = new ArrayList<>();
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;
        do {
            mostrarMenu();
            System.out.println("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, introduzca un número.");
                continue;
            }
            switch (opcion) {
                case 1:
                    mantenimientoCuentaClientes();
                    break;
                case 2:
                    mantenimientoDeCuentas();
                    break;
                case 3:
                    System.out.println("[X] Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);

    }

    private static void mostrarMenu() {
        System.out.println("Menú principal: ");
        System.out.println("1. Mantenimiento de clientes");
        System.out.println("2. Mantenimiento de cuentas");
        System.out.println("3. Salir");
    }

    private static void mostrarMenuClientes() {
        System.out.println("Clientes: ");
        System.out.println("[1] Altas");
        System.out.println("[2] Bajas");
        System.out.println("[3] Modificaciones");
        System.out.println("[4] Listado de clientes");
        System.out.println("[X] Volver al menú principal");
    }

    private static void mantenimientoCuentaClientes() {
        int opcion = 0;
        do {
            mostrarMenuClientes();
            System.out.println("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, introduzca un número.");
                continue;
            }
            switch (opcion) {
                case 1:
                    altaCliente();
                    break;
                case 2:
                    bajaCliente();
                    break;
                case 3:
                    modificarCliente();
                    break;
                case 4:
                    mostrarClientes();
                    break;
                case 5:
                    System.out.println("[X] Volver al menú principal");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    private static void altaCliente() {
        System.out.println("Introduzca el nombre del cliente: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca el apellido del cliente: ");
        String apellido = teclado.nextLine();
        Cliente cliente = new Cliente(nombre, apellido);
        clientes.add(cliente);
    }

    private static void bajaCliente() {
        System.out.println("Introduzca el nombre del cliente: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca el apellido del cliente: ");
        String apellido = teclado.nextLine();

        Cliente clienteEliminar = null;
        for (Cliente cliente : clientes) {
            if (cliente.nombre().equals(nombre) && cliente.apellido().equals(apellido)) {
                clienteEliminar = cliente;
                break;
            }
        }
        if (clienteEliminar != null) {
            clientes.remove(clienteEliminar);
            for (Cuenta cuenta : cuentas) {
                if (cuenta.titular().equals(clienteEliminar)) {
                    cuenta.setTitular(null);
                }
            }
            System.out.println("Cliente eliminado");
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    private static void modificarCliente() {
        mostrarClientes();
        System.out.println("Introduzca el ID del cliente a modificar: ");
        int id;
        try {
            id = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID no válido. Por favor, introduzca un número.");
            return;
        }
        Cliente clienteModificar = null;

        for (Cliente cliente : clientes) {
            if (cliente.id() == id) {
                clienteModificar = cliente;
                break;
            }
        }

        if (clienteModificar != null) {
            System.out.println("Introduzca el nuevo nombre del cliente: ");
            String nombre = teclado.nextLine();
            System.out.println("Introduzca el nuevo apellido del cliente: ");
            String apellido = teclado.nextLine();
            clienteModificar.setNombre(nombre).setApellido(apellido);
            System.out.println("Cliente modificado");
        } else {
            System.out.println("Cliente no encontrado");
        }

    }

    private static void mostrarClientes() {
        System.out.println("Listado de clientes " + clientes.size() + ":");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void mostrarMenuCuentas() {
        System.out.println("Cuentas: ");
        System.out.println("[1] Consultar cuentas cliente");
        System.out.println("[2] Ver todas las cuentas");
        System.out.println("[X] Salir");
    }

    private static void mantenimientoDeCuentas() {
        int opcion = 0;
        do {
            mostrarMenuCuentas();
            System.out.println("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, introduzca un número.");
                continue;
            }
            switch (opcion) {
                case 1:
                    consultarCuentasCliente();
                    break;
                case 2:
                    verTodasLasCuentas();
                    break;
                case 3:
                    System.out.println("[X] Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }

    private static void consultarCuentasCliente() {
        System.out.println("Introduzca el nombre del cliente: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca el apellido del cliente: ");
        String apellido = teclado.nextLine();

        boolean found = false;
        for (Cuenta cuenta : cuentas) {
            Cliente titular = cuenta.titular();
            if (titular != null && titular.nombre().equals(nombre) && titular.apellido().equals(apellido)) {
                System.out.println(cuenta);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No se encontraron cuentas para el cliente especificado.");
        }
    }

    private static void verTodasLasCuentas() {
        System.out.println("Listado de todas las cuentas:");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }

}
