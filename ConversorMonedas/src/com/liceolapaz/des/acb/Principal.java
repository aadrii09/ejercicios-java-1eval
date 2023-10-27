package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while(true){
        // Escribir menu
        escribirMenu();
        // Pedir opcion
        pedirOpcion();
        // Escoger opcion y guardarla
        int opcion = leerOpcion();
        double factorConversion;
        double factorConversion1;
        double factorConversion2;
        // En funcion de la opcion seleccionada hacer el cambio
        switch (opcion){
            case 1:
                factorConversion = 0.86;
                System.out.println("Dólares");
                System.out.println("Escoja una cantidad para conversarlo");
                double numero1 = leerOpcion();
                double resultado = numero1 * factorConversion;
                System.out.println("El resultado de la conversion es: " + resultado);
                break;
            case 2:
                factorConversion1 =  1.19;
                System.out.println("Libras");
                System.out.println("Escoja una cantidad para conversarlo");
                double numero2 = leerOpcion();
                double resultado2 = numero2 * factorConversion1;
                System.out.println("El resultado de la conversion es: " + resultado2);
                break;
            case 3:
                factorConversion2 =  0.0075;
                System.out.println("Yenes");
                System.out.println("Escoja una cantidad para conversarlo");
                double numero3 = leerOpcion();
                double resultado3 = numero3 * factorConversion2;
                System.out.println("El resultado de la conversion es: " + resultado3);
                break;
            case 0:
                System.out.println("Saliendo del conversor");
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
           "1.Dólares \n" +
           "2.Libras \n" +
            "3.Yenes \n" +
            "0.Salir");
    }
}
