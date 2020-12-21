
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio02_ÁreaTriangulo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		double base = 0.0;
		double altura = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor de la base: ");
		base = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de la altura: ");
		altura = Double.parseDouble( entrada.readLine());
		
		resultado = (base*altura)/2;
		System.out.println("El áres del triángulo es: " + resultado);
	}

}
