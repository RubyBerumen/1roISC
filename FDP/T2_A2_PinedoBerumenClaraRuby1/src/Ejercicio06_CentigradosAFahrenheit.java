
import java.util.Scanner;

public class Ejercicio06_CentigradosAFahrenheit {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		double gradosC = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingresa el número de grados Centigrados: ");
		gradosC = entrada.nextDouble();
		
		resultado = (gradosC*1.8)+32;
		System.out.println("Grados Faharenheit: " + resultado);
		
		
	}

}
