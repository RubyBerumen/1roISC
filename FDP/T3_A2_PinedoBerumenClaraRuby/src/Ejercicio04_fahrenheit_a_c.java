
import java.util.Scanner;

public class Ejercicio04_fahrenheit_a_c {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		double numero = 0.0;
		double resultado = 0.0;
		
		System.out.println(" Ingresa los grados fahrenheit: ");
		numero = entrada.nextInt();
		
		resultado = (numero-32)/1.8;
		
		System.out.println("Grados Centigrados:" + resultado);
		
		if(resultado<0) {
			System.out.println("Congelante");
		}else if(resultado>0) {
			System.out.println("Normal");
		}
		
	}

}
