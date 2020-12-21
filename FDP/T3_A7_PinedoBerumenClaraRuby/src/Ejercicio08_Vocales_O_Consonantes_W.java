import java.util.Scanner;

public class Ejercicio08_Vocales_O_Consonantes_W {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que indica cuantas vocales y cuantas consonantes"
				+ " tiene una palabra leida==");
		System.out.println();
		
		System.out.println("Ingresa una palabra:");
		String palabra = entrada.nextLine().toLowerCase();
		
		int sumavocales = 0;
		
		
		int i=0;
		while ( i<palabra.length() ) {
			
			String caracter = palabra.substring(i,i+1);
			
			if(caracter.equals("a") || caracter.equals("e") || caracter.equals("i")
					|| caracter.equals("o") || caracter.equals("u")) {
				
				sumavocales++;
				
			}
			i++;
		}
		
		System.out.println("Vocales: " + sumavocales);
		System.out.println("Consonantes: " + (palabra.length() - sumavocales));
		
		
		
		
		
		
	

	}

}
