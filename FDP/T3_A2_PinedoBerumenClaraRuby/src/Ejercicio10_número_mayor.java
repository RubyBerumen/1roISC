
import java.util.Scanner;

public class Ejercicio10_n�mero_mayor {

	public static void main(String[] args) {
	
Scanner entrada = new Scanner (System.in);
		
		double num1 = 0.0;
		double num2 = 0.0;
		double num3 = 0.0;
		double max = 0.0;
		
		System.out.println("Ingrese el valor del n�mero 1: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor del n�mero 2: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor del n�mero 3: ");
		num3 = entrada.nextDouble();
		
		max = Math.max((Math.max(num1,num2)),num3);
		
		
		if(num1==max) {
			System.out.println("El mayor es el n�mero 1  ");
		}
		
		if(num2==max) {
			System.out.println("El mayor es el n�mero 2  ");
		}
		
		if(num3==max) {
			System.out.println("El mayor es el n�mero 3  ");
		}
		
		

	}

}
