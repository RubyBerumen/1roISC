import java.util.Scanner;

public class Ejercicio03_Apariciones_Letra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que dice cuantas apariciones de la una letra \r\n"
				+ "hay en una frase==");
		System.out.println();
		

		System.out.println("Ingresa una frase: ");
		String frase = entrada.nextLine();
		
		System.out.println("Ingresa una letra para saber la cantidad de veces que aparece:");
		String letra = entrada.next();	
		
		int numletra = 0;
		
		
		for (int i=0; i<frase.length(); i++) {
			
			if(frase.charAt(i) == letra.charAt(0)) {
				
				numletra++;
				
			}
			
		}//for
		
		System.out.println("La letra aparece "+ numletra + " veces");
		
		
		
		


	}

}
