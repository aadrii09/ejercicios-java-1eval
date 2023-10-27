package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true) {

            // Crear un menu
            escribirMenu();
            // Pedir opcion
            pedirOpcion();
            // Leer Opcion
            int opcion = leerOpcion();
            // En funcion de la opcion elegida escoger entre area o perimetro
            switch (opcion) {
                case 1:
                    System.out.println("Escriba la base: ");
                    double base = leerDouble();
                    System.out.println("Escriba el exponente: ");
                    double exponente = leerDouble();
                    double potencia = (base*)



            }
        }
    }

    private static double leerDouble() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
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
                "1.Potencia \n" +
                "2.Raiz Cuadrada \n" +
                "0.Salir");
    }
}
