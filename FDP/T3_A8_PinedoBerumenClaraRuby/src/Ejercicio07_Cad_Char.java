import java.util.Scanner;

public class Ejercicio07_Cad_Char {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa  que recibe una cadena y un char==");
		System.out.println();
		
		System.out.println("Ingresa una frase: ");
		String cadena = entrada.nextLine();
		
		System.out.println("Ingresa una letra: ");
		char letra = entrada.next().charAt(0);
		
		System.out.println("Se encuentra en el lugar no. " + (cadena.indexOf(letra)+1));
		
		

	}

}
