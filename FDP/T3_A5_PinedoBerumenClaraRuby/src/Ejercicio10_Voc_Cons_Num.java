
import java.util.Scanner;

public class Ejercicio10_Voc_Cons_Num {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que indica cuantas letras son vocales, cuantas son consonantes, "
				+ "cuantas son números y cuantas son caracteres especiales==");
		System.out.println();
		
		System.out.println("Ingresa una palabra:");
		String palabra = entrada.nextLine().toLowerCase();
		
		int sumavocales = 0;
		int sumacons = 0;
		int sumanum = 0;
		int sumacarespecial = 0;
	
		
		for (int i=0; i<palabra.length(); i++) {
			
			String caracter = palabra.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii==97 || ascii==101 || ascii==105 || ascii==111 || ascii==117) {
				sumavocales++;
				
			}else if(ascii>=97 && ascii<=122 && ascii!=97 && ascii!=101 && ascii!=105
					&& ascii!=111 && ascii!=117){
				sumacons++;
				
			}else if(ascii>=48 && ascii<=57){
				sumanum++;
				
			}else sumacarespecial++;
			
				
		}
		
		System.out.println("Número de vocales: " + sumavocales);
		System.out.println("Número de consonantes: " + sumacons);
		System.out.println("Cantidad de numeros: " + sumanum);
		System.out.println("Número de caracteres especiales: " + sumacarespecial);
	

	}

}
