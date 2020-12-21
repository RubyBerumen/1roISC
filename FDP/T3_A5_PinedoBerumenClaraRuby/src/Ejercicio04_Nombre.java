
import java.util.Scanner;

public class Ejercicio04_Nombre {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que lee un nombre e imprime la cantidad de veces que"
				+ "mide la longitud de este==");
		System.out.println();
		
		System.out.println("Ingresa el nombre: ");
			String nombre = entrada.nextLine();
			
			System.out.println();
			
			for(int i=0; i<nombre.length(); i++ ) {
				System.out.println(nombre);
			}
				
			
				
			


	}

}
