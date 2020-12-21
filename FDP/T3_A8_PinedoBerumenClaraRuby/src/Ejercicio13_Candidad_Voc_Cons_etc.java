import java.util.Scanner;

public class Ejercicio13_Candidad_Voc_Cons_etc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que pide una cadena, la analiza y muestra la cantidad"
				+ "de letras, espacios, comas, caracteres espaciales, números, mayusculas"
				+ " y minusculas==");
		System.out.println();
		
		
		System.out.println("Ingrese un acadena de caracteres: ");
		String cadena = entrada.nextLine();
		
		
		int sumavocales = 0;
		int sumacons = 0;
		int sumaespacios = 0;
		int sumapuntos = 0;
		int sumacomas = 0;
		int sumacaracteres = 0;
		int sumanumeros = 0;
		int sumamayusculas = 0;
		int sumaminusculas = 0;
		
		for (int i=0; i<cadena.length(); i++) {
			
			String caracter = cadena.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii==97 || ascii==101 || ascii==105 || ascii==111 || ascii==117) {
				sumavocales++;
				
			}else if(ascii>=97 && ascii<=122 && ascii!=97 && ascii!=101 && ascii!=105
					&& ascii!=111 && ascii!=117){
				sumacons++;
				
			}else if(ascii>=48 && ascii<=57){
				sumanumeros++;
				
			}else if(ascii==32) {
				sumaespacios++;
				
			}else if(ascii==46) {
				sumapuntos++;
			
			}else if(ascii==44) {
				sumacomas++;
			
			}else if(ascii>=48 && ascii<=57) {
				sumanumeros++;
			
			}
			if(ascii>=65 && ascii<=90) {
				sumamayusculas++;
			
			}else if(ascii>=97 && ascii<=122) {
				sumaminusculas++;
			
			}else sumacaracteres++;
			
			
		}//for
		
		System.out.println("Cantidad de vocales: " + sumavocales);
		System.out.println("Cantidad de consonantes: " + sumacons);
		System.out.println("Cantidad de espacios: " + sumaespacios); 
		System.out.println("Cantidad de puntos: " + sumapuntos);
		System.out.println("Cantidad de comas:" + sumacomas);
		System.out.println("Cantidad de caracteres espaciales: " + sumacaracteres);
		System.out.println("Cantidad de números: " + sumanumeros); 
		System.out.println("Cantidad de mayusculas: " + sumamayusculas);
		System.out.println("Cantidad de minusculas: " + sumaminusculas);
		
		
		
		
		
		
		

	}

}
