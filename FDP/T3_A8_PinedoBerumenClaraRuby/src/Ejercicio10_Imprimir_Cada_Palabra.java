import java.util.Scanner;

public class Ejercicio10_Imprimir_Cada_Palabra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("==Programa que lee una frase e imprime cada palabra y su \r\n"
				+ "tamaño en líneas diferentes==");
		System.out.println();
		
		System.out.println("Ingresa una frase: ");
		String frase = entrada.nextLine() + " ";
		
		int inicio = 0;
		
		for(int i=0; i<frase.length(); i++ ) {
			char ascii = frase.charAt(i);
			if ( ascii == ' ') {
				
				String palabra = frase.substring(inicio, i);
				
				System.out.println("La palbra "+palabra+" tiene "+ palabra.length()+" caracteres");
				
				inicio = i+1;
				
				
			}//if
			
			
			
		}//for
		
		
	

	
	}

}
