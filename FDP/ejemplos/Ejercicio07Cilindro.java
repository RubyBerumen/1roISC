import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Ejercicio07Cilindro {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 7: Area de un cilindro.");
		
		double altura = 0.0, radio = 0.0, resultado = 0.0;
		
		System.out.println("ingrese el radio del cilindro: ");
		radio = Double.parseDouble(entrada.readLine());
		
		System.out.println("ingrese la altura del cilindro: ");
		altura = Double.parseDouble(entrada.readLine());
		
		resultado = (Math.PI) * (Math.pow(radio, 2)) * altura;
		
		System.out.println("El area del cilindro es: " + resultado);
	}

}
