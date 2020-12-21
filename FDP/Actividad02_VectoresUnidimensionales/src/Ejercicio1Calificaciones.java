import java.util.Scanner;

public class Ejercicio1Calificaciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Programa que pide un numero de calificaciones o ingresar, y muestra promedios");
		System.out.println("===================================================================================");
		System.out.println("Ingresa el numero de calificaciones a capturar:");
		int ncal = entrada.nextInt();
		
		
		double contadorG = 0;
		double contadorAp = 0;
		int contador = 0;
		double contadorApp = 0;
		int contadorx = 0;
		
		double cali [];
		cali = new double [ncal];
		
		for(int i = 0;i<cali.length;i = i+1) {
			System.out.println("Ingresa la calificacion " + (i+1));
			cali [i]=entrada.nextDouble();
			contadorG = contadorG +cali[i];
			if (cali[i]>=70) {
				
				
			}
		}
		
		for (int i = 0;i<cali.length;i=i+1) {
			if (cali[i]>=70) {
				contadorAp = contadorAp + cali[i];
				contador = contador + 1;
				
			}
		}
		for (int i = 0;i<cali.length;i=i+1) {
			if (cali[i]>=(contadorG/cali.length)) {
				contadorApp = contadorApp + cali[i];
				contadorx = contadorx +1;
			}
		}
		
		
		
		System.out.println("===============================================");
		System.out.println("promedio del general grupo: " + (contadorG/cali.length));
		System.out.println("Promedio de calificaciones aprobatorias del Grupo: " + contadorAp/contador);
		System.out.println("Promedio de calificaciones Arriba del promedio general del Grupo: " + (contadorApp/contadorx));
		
		
	}

}
