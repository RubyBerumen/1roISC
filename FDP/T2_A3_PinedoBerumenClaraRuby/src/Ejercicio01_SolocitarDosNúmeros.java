
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio01_SolocitarDosN�meros {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
		
		int primerNumero = 0;
		int segundoNumero = 0;
		int resultado = 0;
		
		System.out.println("Ingrese el primer n�mero: ");
		primerNumero = Integer.parseInt( entrada.readLine());
		
		System.out.println("Ingrese el segundo n�mero: ");
		segundoNumero = Integer.parseInt( entrada.readLine());
		
		resultado = primerNumero + segundoNumero;
		System.out.println("El resultado de la suma es: " + resultado);
		
		resultado = primerNumero - segundoNumero;
		System.out.println("El resultado de la resta es: " + resultado);
		
		resultado = primerNumero * segundoNumero;
		System.out.println("El resultado de la multiplicaci�n es: " + resultado);
		
		resultado = primerNumero / segundoNumero;
		System.out.println("El resultado de la divisi�n es: " + resultado);

		
	}

}
