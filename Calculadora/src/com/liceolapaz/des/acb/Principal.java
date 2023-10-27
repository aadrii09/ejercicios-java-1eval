package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true){
            // Escribir menu
            escribirMenu();
            // Pedir opcion
            pedirOpcion();
            // Escoger opcion y guardarlo
            int opcion = leerOpcion();
            // En funcion de la opcion seleccionada:
            switch (opcion){
                case 1:
                    System.out.println("Suma");
                    System.out.println("Introduce el numero que quieras entero");
                    int numero1 = leerOpcion();
                    System.out.println("Introduce el numero que quieras entero");
                    int numero2 = leerOpcion();
                    int suma = numero1 + numero2;
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                case 2:
                    System.out.println("Resta 2");
                    System.out.println("Introduce el numero que quieras entero");
                    int numero3 = leerOpcion();
                    System.out.println("Introduce el numero que quieras entero");
                    int numero4 = leerOpcion();
                    int resta = numero3 - numero4;
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                case 3:
                    System.out.println("Producto");
                    System.out.println("Introduce el numero que quieras entero");
                    int numero5 = leerOpcion();
                    System.out.println("Introduce el numero que quieras entero");
                    int numero6 = leerOpcion();
                    int producto = numero5 * numero6;
                    System.out.println("El resultado del producto es: " + producto);
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println("Introduce el numero que quieras entero");
                    int numero7 = leerOpcion();
                    System.out.println("Introduce el numero que quieras entero");
                    int numero8 = leerOpcion();
                    int division = numero7 / numero8;
                    System.out.println("El resultado de la division es: " + division);
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicacion");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }



        }

    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opcion para realizar la operacion: ");
    }

    private static void escribirMenu() {
        System.out.println("MENU OPCIONES\n" +
                "1.Suma \n" +
                "2.Resta \n" +
                "3.Producto \n" +
                "4.Division \n" +
                "0.Salir");

    }
}
