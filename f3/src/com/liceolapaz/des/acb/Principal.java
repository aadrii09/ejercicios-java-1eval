package com.liceolapaz.des.acb;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir numero a busacar al usuario
        pedirNumeriBuscar();
        //Leer numero a buscar y guardar
        int numeroBuscar = leerNumeroEntero();
        //Pedir Numero maximo de intentos
        pedirMaxIntentos();
        //Leer ese num max y guardarlo
        int maximoIntentos = leerNumeroEntero();
        // Generar numeros aleatorios
        int numeroIntentos = 0;
        while (numeroIntentos < maximoIntentos) {
            //Generar numero aleatorio
            int numerosAleatorios = generarNumerosAleatorios(1, 10);
            // Escribir num aletarior generado
            System.out.println("El número aleatorio generado es: " + numerosAleatorios);
            //Sumar un intento
            numeroIntentos++;
            //Comprobar si encontramos el num a buscar
            if (numerosAleatorios == numeroBuscar) {
                System.out.println("Numero encontrado en " + numeroIntentos + " intento(s)");
                break;
            }
            //Si no encontramos el num
            System.out.println(numeroIntentos);
            if (numeroIntentos >= maximoIntentos) {
                System.out.println("Numero no encontrado en " + numeroIntentos + " intento(s)");
            }
        }

    }

    private static int generarNumerosAleatorios(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }

    private static void pedirMaxIntentos() {
        System.out.print("Escribe el número máximo de intentos: ");
    }

    private static int leerNumeroEntero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeriBuscar() {

        System.out.println("Escribe un numero de 1 a 10: ");
    }
}
