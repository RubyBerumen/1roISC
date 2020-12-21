
import java.util.Scanner;

public class Ejercicio12_HipotenusaPitagoras {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		double a = 0.0;
		double b = 0.0;
		double h = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de b: ");
		b = entrada.nextDouble();
		
		h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		
		System.out.println("Hipotenusa: " + h);
		
	}

}
