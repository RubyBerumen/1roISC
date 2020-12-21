
import java.util.Scanner;

public class Ejercicio03_ÁreaCírculo {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		double radio = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor del Radio: ");
		radio = entrada.nextDouble();
		
		resultado = 3.1416*(radio*radio);
		System.out.println("El área del círculo es: " + resultado);
	
		
	}

}
