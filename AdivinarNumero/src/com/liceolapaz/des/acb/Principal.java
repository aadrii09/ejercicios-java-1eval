package com.liceolapaz.des.acb;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Menu opciones
        menuOpciones();
        // Pedir opcion
        int opcion = pedirOpcion();
        int intentos = 0;
        boolean acertado = false;
        // Escoje el modo de juego
        switch (opcion) {
            case 1:
                // Generar comentario del 1-10
                int numeroAleatorio = generarNumero(10);
                System.out.println(numeroAleatorio);
                // Empiezas en el intento 0 de 3
                while (intentos < 3){
                    int numeroUsuario = pedirOpcion();
                    intentos ++;
                    if (numeroUsuario < numeroAleatorio){
                        System.out.println("El numero es mayor");
                    } else if (numeroUsuario > numeroAleatorio){
                        System.out.println("El numero es menor");
                    } else {
                        System.out.println("Has acertado el numero " + numeroAleatorio + " En " + intentos + " Intentos");
                        acertado = true;
                        break;

                    }
                }
                if(acertado == false){
                    System.out.println("Te has quedado sin intentos xd");
                }
                break;
            case 2:
                // Generar comentario
                int numeroAleatorio2 = generarNumero(50);
                System.out.println(numeroAleatorio2);
                // Empiezas en el intento 0 de 5
                while (intentos < 5){
                    int numeroUsuario = pedirOpcion();
                    intentos ++;
                    if (numeroUsuario < numeroAleatorio2){
                        System.out.println("El numero es mayor");
                    } else if (numeroUsuario > numeroAleatorio2){
                        System.out.println("El numero es menor");
                    } else{
                        System.out.println("Has acertado el numero" + numeroAleatorio2 + " En " + intentos + " Intentos ");
                        acertado = true ;
                        break;
                    }
                }
                if(acertado == false){
                    System.out.println("Te has quedado sin intentos xd");
                }
                break;
            case 3:
                System.exit(0);
                break;


        }


    }

    private static int generarNumero(int maximo) {
        Random random = new Random();
        return random.nextInt(maximo) + 1;
    }

    private static int pedirOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();

    }

    private static void menuOpciones() {
        System.out.print("ADIVINA EL NUMERO"
                + "\n1. Del 1 al 10 (3 intentos)"
                + "\n2. Del 1 al 50 (5 intentos)"
                + "\n0. Salir"
                + "\n Escoja opcion: ");

    }
}
       
    
