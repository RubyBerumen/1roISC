import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio01Operaciones {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 1: Operaciones basicas");
		
		int num1 = 0;
		int num2 = 0;
		double res = 0.0;
		
		System.out.println("Ingrese el primer numero entero: ");
		num1 = Integer.parseInt( entrada.readLine() );
		
		System.out.println("Ingrese el segundo numero entero: ");
		num2 = Integer.parseInt( entrada.readLine() );
		
		res = num1 + num2;
		System.out.println("La suma de los numeros es: " + res);
		
		res = num1 - num2;
		System.out.println("La resta de los numeros es: " + res);
		
		res = num1 * num2;
		System.out.println("La multiplicacion de los numeros es: " + res);
		
		res = (double) num1 / num2;
		System.out.println("El resultado de la division es: " + res);
	}

}
