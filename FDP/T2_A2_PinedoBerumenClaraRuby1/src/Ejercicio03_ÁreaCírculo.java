
import java.util.Scanner;

public class Ejercicio03_�reaC�rculo {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		double radio = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor del Radio: ");
		radio = entrada.nextDouble();
		
		resultado = 3.1416*(radio*radio);
		System.out.println("El �rea del c�rculo es: " + resultado);
	
		
	}

}
