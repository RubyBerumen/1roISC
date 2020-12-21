import java.util.Scanner;

public class Ejercicio01_Calificaciones_W {

	public static void main(String[] args) {
		
			
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("==Programa que le pide al usuario que ingrese calificaciones==");
			System.out.println();
			
			System.out.println("Cual es el número de calificaciones a ingresar? ");
			int numcal= entrada.nextInt();		
			
			int calificacion = 0;
			int sumacal = 0;
			int aprobatorias = 0;
			int reprobatorias = 0;
			
			int i = 1;
			while( i<=numcal ) {
				System.out.println(i + ") Ingresa calificacion");
				calificacion = entrada.nextInt(); 
				
				sumacal += calificacion;
				
				if(calificacion>=70) {
					aprobatorias++;
				}else reprobatorias++;
				i++;
				
			}//while
			
			System.out.println("Promedio: " + sumacal/numcal);
			System.out.println("Numero de calificaciones aprobatorias: " + aprobatorias);
			System.out.println("Numero de calificaciones reprobatorias: " + reprobatorias);
		


	}

}
