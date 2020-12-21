import java.util.Scanner;

public class Ejercicio02_Voc_Cons_Par_Impar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que lee un nombre completo e indica cuantas letras "
				+ "son vocales y cuantas consonantes, ademas si la cantidad de  vocales y "
				+ "consonantes es par o impar==");
		System.out.println();
		
		System.out.println("Ingresa un nombre completo:");
		String palabra = entrada.nextLine().toLowerCase();
		
		int sumavocales = 0;
		int sumacons = 0;
		
	
		
		for (int i=0; i<palabra.length(); i++) {
			
			String caracter = palabra.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii==97 || ascii==101 || ascii==105 || ascii==111 || ascii==117) {
				sumavocales++;
				
			}else if(ascii>=97 && ascii<=122 && ascii!=97 && ascii!=101 && ascii!=105
					&& ascii!=111 && ascii!=117){
				sumacons++;
				
			}
			
				
		}
		
		System.out.println("Número de vocales: " + sumavocales);
		System.out.println("Número de consonantes: " + sumacons);
		
		if(sumavocales%2==0) {
			System.out.println("El numero de vocales es par");
		}else System.out.println("El numero de vocales es impar");
		
		if(sumacons%2==0) {
			System.out.println("El numero de consonantes es par");
		}else System.out.println("El numero de consonantes es impar");





	}

}
