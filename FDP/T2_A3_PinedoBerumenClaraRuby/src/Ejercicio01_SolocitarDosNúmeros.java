
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio01_SolocitarDosNúmeros {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
		
		int primerNumero = 0;
		int segundoNumero = 0;
		int resultado = 0;
		
		System.out.println("Ingrese el primer número: ");
		primerNumero = Integer.parseInt( entrada.readLine());
		
		System.out.println("Ingrese el segundo número: ");
		segundoNumero = Integer.parseInt( entrada.readLine());
		
		resultado = primerNumero + segundoNumero;
		System.out.println("El resultado de la suma es: " + resultado);
		
		resultado = primerNumero - segundoNumero;
		System.out.println("El resultado de la resta es: " + resultado);
		
		resultado = primerNumero * segundoNumero;
		System.out.println("El resultado de la multiplicación es: " + resultado);
		
		resultado = primerNumero / segundoNumero;
		System.out.println("El resultado de la división es: " + resultado);

		
	}

}
