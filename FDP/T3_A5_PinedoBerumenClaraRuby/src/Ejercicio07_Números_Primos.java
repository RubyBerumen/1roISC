import java.util.Scanner;

public class Ejercicio07_N�meros_Primos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que indica si un n�mero leido es primo o no==");
		System.out.println();
		
		System.out.println("Ingresa el n�mero: ");
		int num = entrada.nextInt();
		
		boolean primo = true;
		
		for(int i=2; i <=num/2; i++ ) {
			if(num % i==0) {
				System.out.println("El n�mero no es primo");
				primo = false; break;
			}
				
		}
		
		if(primo) {
			System.out.println("El n�mero es primo");
		}
		


	}

}
