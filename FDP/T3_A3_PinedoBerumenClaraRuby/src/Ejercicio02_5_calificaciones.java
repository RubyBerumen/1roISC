import java.util.Scanner;

public class Ejercicio02_5_calificaciones {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner (System.in);
		
	
		
		System.out.println("Ingrese el valor de la calificación 1: ");
		double calificacion1 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificación 2: ");
		double calificacion2 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificación 3: ");
		double calificacion3 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificación 4: ");
		double calificacion4 = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la calificación 5: ");
		double calificacion5 = entrada.nextDouble();
		
		double resultado = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5)/5;
		
		System.out.println("El promedio es: " + resultado);
		
		if(resultado<=100 && resultado>=90) {
			System.out.println("Excelente");	
		}else if(resultado<=89 && resultado>=80) {
			System.out.println("Bien");
		}else if(resultado<=79 && resultado>=70) {
			System.out.println("Regular");
		}else if(resultado<=69) {
			System.out.println("Terrible");
		}
		
		
		
		
		
		

	}

}
	
