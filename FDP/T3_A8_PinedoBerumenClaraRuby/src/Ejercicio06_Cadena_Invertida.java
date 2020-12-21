import java.util.Scanner;

public class Ejercicio06_Cadena_Invertida {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que recibe una cadena de caracteres y la retorne invertida.==");
		System.out.println();
		
				
		System.out.println("Ingresa una palabra");
		String palabra = entrada.nextLine();
		
		int palabra1 = palabra.length();
		
		
			for(int i=palabra1-1; i>=0; i--) {
			
				char caracter = palabra.charAt(i);
				
				System.out.print(caracter);
				
			}
		
		
	

	}

}
