package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true){
        // Escribir menu
        menuOpciones();
        // Pedir una opcion
        pedirOpcion();
        // Escoger una opcion y guardarla
        int opcion = leerOpcion();
        // En funcion de la opcion elegida escoger entre area o perimetro
        switch (opcion){
            case 1:
                // Escribir nuevo menu
                menu1Opciones();
                // Pedir una opcion
                pedirOpcion1();
                // Escoger una opcion y guardarla
                int opcion1 = leerOpcion1();
                if (opcion1== 1){
                    System.out.println("Escribe el valor del lado: ");
                    double lado = leerDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("El area es: " + areaCuadrado);
                }
                else if (opcion1 == 2){
                    System.out.println("Escribe el valor del lado: ");
                    double lado = leerDouble();
                    double perimetroCuadrado = lado * 4;
                    System.out.println("El perimetro es: " + perimetroCuadrado);
                }
                else if (opcion1 == 0){
                    System.exit(0);
                }
                break;
            case 2:
                // Escribir nuevo menu
                menu1Opciones();
                // Pedir una opcion
                pedirOpcion2();
                // Escoger una opcion y guardarla
                int opcion2 = leerOpcion2();
                if (opcion2== 1){
                    System.out.println("Escribe el valor de la base: ");
                    double base = leerDouble();
                    System.out.println("Escribe el valor de la altura: ");
                    double altura = leerDouble();
                    double areaRectángulo = base * altura;
                    System.out.println("El area es: " + areaRectángulo);
                }
                else if (opcion2 ==2){
                    System.out.println("Escribe el valor de la base: ");
                double base = leerDouble();
                System.out.println("Escribe el valor de la altura: ");
                double altura = leerDouble();
                double perimetroCuadrado = base * 2 + altura * 2;
                System.out.println("El perimetro es: " + perimetroCuadrado);
                } else if (opcion2 == 0) {
                    System.exit(0);
                }
                break;
            case 3:
                // Escribir nuevo menu
                menu1Opciones();
                // Pedir una opcion
                pedirOpcion3();
                // Escoger una opcion y guardarla
                int opcion3 = leerOpcion3();
                if (opcion3 == 1){
                    System.out.println("Escribe el valor de la base: ");
                    double base = leerDouble();
                    System.out.println("Escribe el valor de la altura: ");
                    double altura = leerDouble();
                    double areaTriángulo = (base * altura) /2;
                    System.out.println("El area es: " + areaTriángulo);
                } else if (opcion3 == 2) {
                    System.out.println("Escribe el valor de los lados: ");
                    double lado = leerDouble();
                    System.out.println("Escribe el valor de los lados: ");
                    double lado1 = leerDouble();
                    System.out.println("Escribe el valor de los lados: ");
                    double lado2 = leerDouble();
                    double perimetroTriángulo = lado + lado1 + lado2;
                    System.out.println("El perimetro es: " + perimetroTriángulo);
                }
                // Preguntar numero1 y numero2
                // Hacer la operacion
                break;
            case 4:
                // Escribir nuevo menu
                menu1Opciones();
                // Pedir una opcion
                pedirOpcion4();
                // Escoger una opcion y guardarla
                int opcion4 = leerOpcion4();
                // Preguntar numero1 y numero2

                // Hacer la operacion
                break;
            case 0:
                System.out.println("Abandonado proceso");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no válida");
        }
    }
    }

    private static int leerOpcion4() {
        Scanner teclado = new Scanner(System.in);
                return teclado.nextInt();
    }

    private static void pedirOpcion4() {
        System.out.println("¿Qué desea calcular?: ");
    }



    private static int leerOpcion3() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion3() {
        System.out.println("¿Qué desea calcular?: ");
    }




    private static int leerOpcion2() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion2(){
        System.out.println("¿Qué desea calcular?: ");

    }


    private static double leerDouble() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static int leerOpcion1() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion1() {
        System.out.println("¿Qué desea calcular?: ");
    }

    private static void menu1Opciones() {
        System.out.println("MENU OPCIONES\n" +
                "1.Área \n" +
                "2.Perímetro \n" +
                "0.Salir  \n");
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opcion para realizar la operacion: ");
    }

    private static void menuOpciones() {
        System.out.println("MENU OPCIONES\n" +
                "1.Cuadrado \n" +
                "2.Rectángulo \n" +
                "3.Triángulo  \n" +
                "4.Pentágono \n" +
                "0.Salir");
    }
}
