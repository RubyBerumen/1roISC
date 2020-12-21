
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14_MenorDeTresNúmeros {

	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double min = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de b: ");
		b = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de c: ");
		c = Double.parseDouble( entrada.readLine());
		
		min = Math.min((Math.min(a,b)),c);
		
		System.out.println("El mínimo es: " + min);
	

	}

}
