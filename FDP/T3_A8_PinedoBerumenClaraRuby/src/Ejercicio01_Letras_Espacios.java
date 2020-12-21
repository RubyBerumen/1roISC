import java.util.Scanner;

public class Ejercicio01_Letras_Espacios {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que lee una frase e indica cuántas letras contiene "
				+ "y cuantos espacios en blanco");
		System.out.println();
		
		System.out.println("Ingresa una frase:");
		String palabra = entrada.nextLine().toLowerCase();
		
		
		int sumletras = 0;
		int sumespacios = 0;
		for (int i=0; i<palabra.length(); i++) {
			
			String caracter = palabra.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii==32) {
				sumespacios++;
			}else if (ascii>=97 && ascii<=122) {
				sumletras++;
			}
	

		}//for
		
		
		System.out.println("Número de letras: " + sumletras);
		System.out.println("Número de espacios: " + sumespacios);
		
		
		

	}

}
