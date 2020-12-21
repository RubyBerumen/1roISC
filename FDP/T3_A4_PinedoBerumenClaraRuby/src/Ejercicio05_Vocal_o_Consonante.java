
import java.util.Scanner;

public class Ejercicio05_Vocal_o_Consonante {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que lee una letra y muestra si es vocal o consonante==");
		System.out.println();
		
		System.out.println("Ingresa la letra: ");
		String letra = entrada.next().toLowerCase();
		
		switch(letra) {
			case "a": System.out.println("Vocal");break;
			case "e": System.out.println("Vocal");break;
			case "i": System.out.println("Vocal");break;
			case "o": System.out.println("Vocal");break;
			case "u": System.out.println("Vocal");break;
				default: System.out.println("Consonante");break;
		}
		
		
	}

}
