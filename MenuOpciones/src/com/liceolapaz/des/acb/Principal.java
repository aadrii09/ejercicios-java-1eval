package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Escribir menu
        escribirMenu();
        //Pedir opcion
        pedirOpcion();
        //Leer que opcion y guardarla
        int opcion = leerOpcion();
        //Escribir mensaje dependiendo de la opcion
        escribirMensaje(opcion);
    }

    private static void escribirMensaje(int opcion) {
        switch (opcion) {
            case 0:
                System.out.println("Hasta la proxima!");
                System.exit(03);
                break;
            case 1:
                System.out.println("Opcion 1 escogida");
                break;
            case 2:
                System.out.println("Opcion 2 escogida");
                break;2
            case 3:
                System.out.println("Opcion 3 escogida");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
                return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opcion: ");
    }

    private static void escribirMenu() {
        System.out.println("MENU OPCIONES\n" +
                "1. Opcion 1\n" +
                "2. Opcion 2\n" +
                "3. Opcion 3\n" +
                "0. Salir");
    }
}
