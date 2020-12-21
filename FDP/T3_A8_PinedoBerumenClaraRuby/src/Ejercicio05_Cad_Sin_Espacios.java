import java.util.Scanner;

public class Ejercicio05_Cad_Sin_Espacios {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que recibe una cadena de caracteres y la muestra "
				+ "sin ningún espacio en blanco==");
		System.out.println();
		
		
		System.out.println("Ingrese una cadena de caracteres: ");
		String cadena = entrada.nextLine();
		
		System.out.println(cadena.replace(" ", ""));
		
		
		
		


	}

}
