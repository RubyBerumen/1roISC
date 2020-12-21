
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio13_MayorDeTresNúmeros {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double max = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de b: ");
		b = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de c: ");
		c = entrada.nextDouble();
		
		max = Math.max((Math.max(a,b)),c);
		
		System.out.println("El máximo es: " + max);
		
	}
}
