
import java.util.Scanner;

public class Ejercicio07_VolumenCilindro {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		double radio = 0.0;
		double altura = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor del Radio en metros: " );
		radio = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la altura en metros: ");
		altura = entrada.nextDouble();
		
		resultado = 3.1416*(radio*radio)*altura;
		System.out.println("El volumen del Circulo es: " + resultado + "  metros3");
		
		
	}	
}
