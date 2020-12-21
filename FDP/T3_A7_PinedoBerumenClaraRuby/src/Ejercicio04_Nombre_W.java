import java.util.Scanner;

public class Ejercicio04_Nombre_W {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que lee un nombre e imprime la cantidad de veces que"
				+ "mide la longitud de este==");
		System.out.println();
		
		System.out.println("Ingresa el nombre: ");
			String nombre = entrada.nextLine();
			
			System.out.println();
			
			int i=0;
			while( i<nombre.length() ) {
				System.out.println(nombre);
				i++;
			}
		
		
	

	}

}
