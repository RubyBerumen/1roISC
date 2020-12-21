
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;


public class Ejercicio03_ÁreaCirculo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		double radio = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor del Radio: ");
		radio = Double.parseDouble( entrada.readLine());
		
		resultado = (Math.PI) * (Math.pow(radio, 2));
		System.out.println("El área del círculo es: " + resultado);

	}

}
