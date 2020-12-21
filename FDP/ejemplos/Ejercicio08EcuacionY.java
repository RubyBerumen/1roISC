import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Ejercicio08EcuacionY {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 8");
		
		double a = 0.0, x = 0.0, b = 0.0, c = 0.0, y = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese el valor de x: ");
		x = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese el valor de b: ");
		b = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese el valor de c: ");
		c = Double.parseDouble(entrada.readLine());
		
		y = (2 * (a) * (Math.pow(x, 2))) + (b * x) / (Math.pow(c, 3)) + (c); 
		
		System.out.println("El resultado de la ecuacion es: " + y);
	}

}
