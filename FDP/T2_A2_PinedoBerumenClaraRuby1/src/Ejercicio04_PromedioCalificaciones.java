
import java.util.Scanner;

public class Ejercicio04_PromedioCalificaciones {
	public static void main(String args []) {
		
		Scanner entrada  = new Scanner (System.in);
		
		double calificacion1 = 0.0;
		double calificacion2 = 0.0;
		double calificacion3 = 0.0;
		double calificacion4 = 0.0;
		double calificacion5 = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor de la calificaci�n 1: ");
		calificacion1 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificaci�n 2: ");
		calificacion2 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificaci�n 3: ");
		calificacion3 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificaci�n 4: ");
		calificacion4 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificaci�n 5: ");
		calificacion5 = entrada.nextDouble();
		
		
		resultado = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5)/5;
		
		System.out.println("El promedio es: " + resultado);
	
		
	}

}
