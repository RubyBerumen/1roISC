import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11_ÁreaTrianguloHerón {
	
	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double s = 0.0;
		double area = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de b: ");
		b = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de c: ");
		c = Double.parseDouble( entrada.readLine());
				
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area: " + area);
		
	}
		
}
