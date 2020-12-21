
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio08_ValorDeY {
	
	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		double x = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double y = 0;
		
		System.out.println("Ingresa el valor de x: ");
		x = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingresa el valor de a: ");
		a = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingresa el valor de b: ");
		b = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingresa el valor de c: ");
		c = Double.parseDouble( entrada.readLine());
		
		
		y = (2*a*(x*x) + (b*x)) / ((c*c*c) + c);
		System.out.println(" y= " + y);
		
	}

}
