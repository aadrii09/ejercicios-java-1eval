package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir numeros al usuario
        pedirNumeros();
        // Leer numeros y guardarlos
        int[] numeros = new int[10];
        int contador = 0;
        do {
          //Leer numero y guardarlo
            numeros[contador] = leerNumero();
          // Sumar uno al contador
          contador++;
        } while (contador < 10);
        // Sumar numeros y guardar resultado
        int resultado = sumarNumeros(numeros);
        //Escribir el resultado
        escribirResultado(resultado);
    }

    private static void escribirResultado(int resultado) {
        System.out.println("La suma de los numeros es: " + resultado);
    }

    private static int sumarNumeros(int[] numeros) {
        int resultado = 0;
        for (int posicion = 0; posicion < numeros.length; posicion++) {
            resultado = resultado + numeros[posicion];
        }
        return resultado;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeros() {
        System.out.print("Escriba 10 numeros enteros : ");
    }
}
