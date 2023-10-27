package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Pedir numero al usuario
        pedirNumero();
        //Leer numero y guardarlo
        int numeroUsuario = leerNumero();
        //Comprobar si es par o impar y guardar mensaje
        String mensaje = comprobarNumero(numeroUsuario);
        //Escribir mensaje
        escribirMensaje(mensaje);
    }



    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumero() {
        System.out.print("Escriba un numero entero: ");
    }
    private static String comprobarNumero(int numeroUsuario) {
        String mensaje = (numeroUsuario == 0) ?
                "El numero 0 no es par ni impar" :
                (numeroUsuario % 2 == 0) ?
                "El numero es par" : "El numero es impar";
        return mensaje;
    }
    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
