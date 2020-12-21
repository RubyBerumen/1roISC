import java.util.Scanner;

public class Ejercicio01_Calificaciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que pide calificaciones==");
		System.out.println();
		
		
		System.out.println("Cuantas calificaciones desea ingresar?");
		byte numcal = entrada.nextByte();
		
		int aprobatorias = 0;
		int reprobatorias = 0;
		int sumacal = 0;
		int numaprobatorias = 0;
		int prom = 0;
		int nummayorprom = 0;
		int summayorprom = 0;
		
		int calificaciones[];
		calificaciones = new int [numcal];
		
		for(int i=0; i<calificaciones.length; i++ ) {
			System.out.println("Ingresa calificación "+(i+1)+":");
			calificaciones[i] = entrada.nextInt();
		
			sumacal = sumacal + calificaciones[i];
			
			if(calificaciones[i]>=70) {
				numaprobatorias++;
				aprobatorias = aprobatorias+calificaciones[i];
				
			}else reprobatorias++;
			
               
		}//for
		prom = sumacal/numcal;
		

		for(int i=0; i<calificaciones.length; i++ ) {
			
		if(calificaciones[i]>=prom) {
			nummayorprom++;
			summayorprom=summayorprom + calificaciones[i];
		}
		 
		}
		
		
		
		System.out.println("Promedio general: " + prom);
		System.out.println("Promedio de calificaciones aprobatorias: "+ aprobatorias/numaprobatorias);
		System.out.println("Promedio de calificaciones mayores al promedio general: "
				+ summayorprom/nummayorprom);
		
		
		
		
	
		

	}

}
