
import java.util.Scanner;

public class Ejercicio01_SolicitarDosN�meros {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		int primerNumero = 0;
		int segundoNumero = 0;
		int resultado = 0;
		
		System.out.println("Ingrese el primer n�mero: ");
		primerNumero = entrada.nextInt();
		
		System.out.println("Ingrese el segundo n�mero: ");
		segundoNumero = entrada.nextInt();
		
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
