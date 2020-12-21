import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Ejercicio14Menor3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 14: Muestra el numero menor de los 3 que ingresaste.");
		
		int num1 = 0, num2 = 0, num3 = 0, numm = 0;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = Integer.parseInt( entrada.readLine() );
		System.out.println("Ingrese el segundo numero: ");
		num2 = Integer.parseInt( entrada.readLine() );
		System.out.println("Ingrese el tercer numero: ");
		num3 = Integer.parseInt( entrada.readLine() );
		
		numm = (Math.min(num1, (Math.min(num2, num3))));
		
		System.out.println("El numero con menos valor es: " + numm);
		
	}
}
 