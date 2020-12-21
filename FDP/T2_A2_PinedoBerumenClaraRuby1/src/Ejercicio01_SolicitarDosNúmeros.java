
import java.util.Scanner;

public class Ejercicio01_SolicitarDosNúmeros {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		int primerNumero = 0;
		int segundoNumero = 0;
		int resultado = 0;
		
		System.out.println("Ingrese el primer número: ");
		primerNumero = entrada.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
		segundoNumero = entrada.nextInt();
		
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
