import java.util.Scanner;

public class Ejercicio09_Capicua {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que determine si un numero es capicua==");
		System.out.println();
		
		
		System.out.println("Ingresa el número: ");
		String numero = entrada.nextLine();
		
		boolean capicua = false;
		
		for(int i= 0; i<numero.length()/2; i++) {
			
			if(numero.charAt(i)==numero.charAt(numero.length()-1-i)) {
				capicua = true;
				
			}
				
		}
		if(capicua) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}

	}

}
