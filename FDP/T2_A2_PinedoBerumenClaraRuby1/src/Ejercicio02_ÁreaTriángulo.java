
import java.util.Scanner;

public class Ejercicio02_ÁreaTriángulo {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		double base = 0.0;
		double altura = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor de la base: ");
		base = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la altura: ");
		altura = entrada.nextDouble();
		
		resultado = (base*altura)/2;
		System.out.println("El áres del triángulo es: " + resultado);
				
		
	}

}
