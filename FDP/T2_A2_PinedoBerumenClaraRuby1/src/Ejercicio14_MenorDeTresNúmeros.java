
import java.util.Scanner;
import java.lang.Math;

import java.util.Scanner;

public class Ejercicio14_MenorDeTresNúmeros {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double min = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de b: ");
		b = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de c: ");
		c = entrada.nextDouble();
		
		min = Math.min((Math.min(a,b)),c);
		
		System.out.println("El mínimo es: " + min);
		
	}
}



