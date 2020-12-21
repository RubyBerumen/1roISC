
import java.util.Scanner;

public class Ejercicio09_dos_números {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double max = 0.0;
		double min = 0.0;
		double num1 = 0.0;
		double num2 = 0.0;
		
		System.out.println("Ingresa el número 1: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Ingresa el número 2: ");
		num2 = entrada.nextDouble();
		
		max = Math.max(num1,num2);
		min = Math.min(num1,num2);
		
		if(max%min==0) {
			System.out.println("Son divisibles, resultado: " + max/min);
		}else if(max%min!=0) {
			System.out.println("No es divisible");
		}
		
		

	}

}
