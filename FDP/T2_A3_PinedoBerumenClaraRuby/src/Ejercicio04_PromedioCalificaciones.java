
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio04_PromedioCalificaciones  {
	
	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		double calificacion1 = 0.0;
		double calificacion2 = 0.0;
		double calificacion3 = 0.0;
		double calificacion4 = 0.0;
		double calificacion5 = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor de la calificación 1: ");
		calificacion1 = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de la calificación 2: ");
		calificacion2 = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de la calificación 3: ");
		calificacion3 = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de la calificación 4: ");
		calificacion4 = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de la calificación 5: ");
		calificacion5 = Double.parseDouble( entrada.readLine());
		
		
		resultado = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5)/5;
		
		System.out.println("El promedio es: " + resultado);
		
		
	}
	
}
