package castro.com;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Bucle infinito para tener el menu siempre
		while(true) {
			System.out.print("ADIVINA EL NUMERO"
					+ "\n1. Del 1 al 10 (3 intentos)"
					+ "\n2. Del 1 al 50 (5 intentos)"
					+ "\n0. Salir"
					+ "\nEscoja opcion: ");
			//	Recogemos la opcion
			int opcion = scanner.nextInt();
			switch (opcion) {
			case 1: {
				
		        // Generar un número aleatorio entre 1 y 10
				Random random = new Random();
		        int numero_aleatorio = random.nextInt(10) + 1;

		        // Booleano para saber si se acierta o no (predeterminado falso pq aun no se acerto)
		        boolean adivinado = false;
				
				// Contamos intentos (opcion 1: 3 intentos)
				for(int i = 0; i<3; i++) {

					System.out.print("Escriba el numero: ");
					int numero_usuario = scanner.nextInt();

					//	Comprobamos si el numero que introduce el usuario es mayor o menor que el aleatorio
					if(numero_usuario > numero_aleatorio) {
						System.out.println("El numero a adivinar es menor \n");

					}else if (numero_usuario < numero_aleatorio){
						System.out.println("El numero a adivinar es mayor \n");
						
					
					}else {
						System.out.println("Has acertado el numero en " + i + " intento(s) \n");
						//Se cambia el booleano a true pq se aceerto
						adivinado = true;
						break;
					}
				}
				
				// Si no adivina
				if(adivinado == false) {
				System.out.println("No has acertado en el numero maximo de intentos. El numero era " + numero_aleatorio + "\n");
				}
				//	Fin bucle
				break;
			}
			
			case 2: {
				// Generar un número aleatorio entre 1 y 10
				Random random = new Random();
		        int numero_aleatorio = random.nextInt(50) + 1;

		        boolean adivinado = false;
				
		        
				// Contamos intentos (opcion 2: 5 intentos)
				for(int i = 0; i<5; i++) {

					System.out.print("Escriba el numero: ");
					int numero_usuario = scanner.nextInt();
					//	Comprobamos si el numero que introduce el usuario es mayor o menor que el aleatorio
					if(numero_usuario > numero_aleatorio) {
						System.out.println("El numero a adivinar es menor \n");

					}else if (numero_usuario < numero_aleatorio){
						System.out.println("El numero a adivinar es mayor \n");

					}else {
						System.out.println("Has acertado el numero en " + i + " intento(s) \n");
						//Se cambia el booleano a true pq se aceerto
						adivinado = true;		
						break;
					}
				}
				
				// Si no adivina
				if(adivinado == false) {
				System.out.println("No has acertado en el numero maximo de intentos. El numero era " + numero_aleatorio + "\n");
				}
				//	Fin bucle
				break;
			}
			
			// Salir
			case 0: {
				System.exit(0);
			}
			// Cualquier otro numero
			default:
				System.out.println("Opcion no valida");
			}
			
		}
	}

}
