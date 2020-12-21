import java.util.Scanner;

public class Ejercicio11_Caracter_mas_Repetido {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que recibe una cadena de caracteres y devuelve el \r\n" + 
				"carácter que se repite con mayor frecuencia==");
		System.out.println();
		
		System.out.println("Ingresa una frase o palabra");
		String cadena = entrada.nextLine();
		
		int repetido = 0;
		char caractermax = 0;
		int repetidomax = 0;
		
		for(int i=0; i<cadena.length(); i++ ) {
			char caracter = cadena.charAt(i);
			for(int j=0; j<cadena.length(); j++ ) {
				char caracter2 =cadena.charAt(j);
				if(caracter == caracter2) {
					
					repetido++;
					
					
				}//if
				 
				
			}//for2
			
			if (repetido > repetidomax) {
				caractermax = caracter;
				repetidomax = repetido;
			}
			
			repetido=0;

			
			}//for1
		
		System.out.println("El caracter que màs se repite es: " + caractermax +" " + repetidomax+ " veces");
		
		
		

	}

}
