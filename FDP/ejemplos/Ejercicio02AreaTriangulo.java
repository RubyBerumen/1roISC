import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio02AreaTriangulo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 2: Area de un Triangulo");
		
		double base = 0.0;
		double altura = 0.0;
		double area = 0.0;
		
		System.out.println("Ingrese la base del triangulo: ");
		base = Double.parseDouble(entrada.readLine());
		
		System.out.println("Ingrese la altura del triangulo: ");
		altura = Double.parseDouble(entrada.readLine());
		
		area = base * altura / 2;
		
		System.out.println("El area del triangulo es: " + area);
	}

}
