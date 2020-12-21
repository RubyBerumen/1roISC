 
import java.util.Scanner;

public class Ejercicio09_Cadena_al_Reves {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que lee una cadena y la muestra al revés==");
		System.out.println();
		
		String palabra = "";
				
		System.out.println("Ingresa una palabra");
		palabra = entrada.nextLine();
		
		int palabra1 = palabra.length();
		
			for (int i=palabra1-1; i>=0; i--) {
			
				char caracter = palabra.charAt(i);
				
				System.out.print(caracter);
			}


	}

}
