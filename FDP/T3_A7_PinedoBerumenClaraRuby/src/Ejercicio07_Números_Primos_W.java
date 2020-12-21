import java.util.Scanner;

public class Ejercicio07_Números_Primos_W {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que indica si un número leido es primo o no==");
		System.out.println();
		
		System.out.println("Ingresa el número: ");
		int num = entrada.nextInt();
		
		boolean primo = true;
		
		int i=2;
		while( i <=num/2 ) {
			if(num % i==0) {
				System.out.println("El número no es primo");
				primo = false; break;
			}
			i++	;
		}
		
		if(primo) {
			System.out.println("El número es primo");
		}
		
		
	

	}

}
