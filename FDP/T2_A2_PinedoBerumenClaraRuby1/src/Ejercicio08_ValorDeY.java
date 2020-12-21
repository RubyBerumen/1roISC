
import java.util.Scanner;

public class Ejercicio08_ValorDeY {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		double x = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double y = 0;
		
		System.out.println("Ingresa el valor de x: ");
		x = entrada.nextDouble();
		
		System.out.println("Ingresa el valor de a: ");
		a = entrada.nextDouble();
		
		System.out.println("Ingresa el valor de b: ");
		b = entrada.nextDouble();
		
		System.out.println("Ingresa el valor de c: ");
		c = entrada.nextDouble();
		
		
		y = (2*a*(x*x) + (b*x)) / ((c*c*c) + c);
		System.out.println(" y= " + y);
		
		
	}

}
