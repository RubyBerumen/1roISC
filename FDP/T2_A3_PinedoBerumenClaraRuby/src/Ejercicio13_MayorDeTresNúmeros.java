
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio13_MayorDeTresNúmeros {

	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double max = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de b: ");
		b = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de c: ");
		c = Double.parseDouble( entrada.readLine());
		
		max = Math.max((Math.max(a,b)),c);
		
		System.out.println("El máximo es: " + max);
		

	}

}
