
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio11_ÁreaTriánguloHerón {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double s = 0.0;
		double area = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de b: ");
		b = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de c: ");
		c = entrada.nextDouble();
				
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area: " + area);
				

	}

}
