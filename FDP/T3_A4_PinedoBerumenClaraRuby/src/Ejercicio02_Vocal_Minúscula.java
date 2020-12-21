
import java.util.Scanner;

public class Ejercicio02_Vocal_Minúscula {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("== Programa que lee una vocal en minúscula y la imprime en mayúscula==");
		System.out.println();
		
		
		System.out.println("Ingresa una vocal en minúscula:");
		String vocal = entrada.nextLine().toLowerCase();
		
			switch(vocal) {
				case "a": System.out.println("A");break;
				case "e": System.out.println("E");break;
				case "i": System.out.println("I");break;
				case "o": System.out.println("O");break;
				case "u": System.out.println("U");break;
					default: System.out.println("Inválido");break;
			}
				
				
			
	}

}
