package com.liceolapaz.des.acb;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Pedir el año de nacimiento
        pedirAnho();
        //Leer año y guardarlo
        int anhoNacimiento = LeerAnhoNacimiento();
        //Comprobar el año y guardar mensaje
        String mensaje = comprobarAnhoNacimiento(anhoNacimiento);
        
        //Escribir mensaje
        escribirMensaje(mensaje);
    }

    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private static String comprobarAnhoNacimiento(int anhoNacimiento) {
        String mensaje;
        int edad = 2023 - anhoNacimiento;
        if(anhoNacimiento >2023) {
            mensaje = "No puedes haber nacido en el futuro";
        } else if (edad >150) {
            mensaje = "Nopuedes tener tantos años";
        }  else if (edad >=18) {
        mensaje = "Tienes permiso para entrar";
        }  else {
             mensaje = "No puedes pasar";
        }
        return mensaje;
    }

    private static int LeerAnhoNacimiento() {
        Scanner teclado = new  Scanner(System.in);
        return teclado.nextInt();
    }
    private static void pedirAnho() {
        System.out.print("Escriba su año de nacimiento");
    }
}
