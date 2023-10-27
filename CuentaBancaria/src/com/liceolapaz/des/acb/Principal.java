package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
 // Escribir menu
        escribirMenu();
        // Pedir Opcion
        pedirOpcion();
        // Escoger opcion y guardarla
       int opcion = leerOpcion();
// En funcion de la opcion elegida tiene q pasar algo
switch (opcion){
    case 1:
        // Volver a escribir menu
        escribirMenu1();
        // Pedir Opcion
        pedirOpcion1();
        // Escoger opcion y guardarla
        int opcion1 = leerOpcion1();
        if (opcion1 == opcion1){
            System.out.println("pedir saldo:");

        }


        // En funcion de las dos opciones hay q preguntar x el saldo de la cuenta
weffffffffff
        ew
        few
                fefe
                few
                        fe
                        few
                                f
                                eqf
                                        ewq
                                        fw






        }


        }


    private static int leerOpcion1(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion1() {
        System.out.println("Escoja una opcion: ");
    }

    private static void escribirMenu1() {
        System.out.println("TIPO DE CUENTA\n" +
                "1.Cuenta normal \n" +
                        "2.Cuenta Premium \n" +
                        "0.Salir");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Escoja una opcion: ");
    }

    private static void escribirMenu() {
        System.out.println("BANCO\n" +
                "1.Crear cuenta \n" +
                "2.Ingresar dinero \n" +
                "3.Retirar dinero \n" +
                "4.Consultar saldo \n" +
                "0.Salir");
    }
}