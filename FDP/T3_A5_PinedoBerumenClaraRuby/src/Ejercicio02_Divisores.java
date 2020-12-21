
import java.util.Scanner;

public class Ejercicio02_Divisores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que muestra los divisores de un número==");
		System.out.println();
		
		
		System.out.println("Ingresa el número: ");
		int num = entrada.nextInt();
		
		System.out.println("Los divisores de " + num + " son: ");
		
		for(int i=1; i<=num/2; i++ ) {
			if(num % i== 0) 
				System.out.println(i);
			
		}
		
		System.out.println(num);
	
		


	}

}
