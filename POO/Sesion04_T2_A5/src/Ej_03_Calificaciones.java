import java.util.Scanner;

class Calificaciones {
	double calificaciones [];
	double promedio;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantas calificaciones desea ingresar?");
		byte numCal = entrada.nextByte();
		calificaciones = new double [numCal];
		
		for (int i = 0; i<calificaciones.length; i++) {
			System.out.println("Ingresa la calificación "+ (i+1) +":");
			calificaciones [i]=entrada.nextDouble();
			
		}	
	}
	
	public double obtenerPromedio() {
		double sumaCal =0;
		for (int i = 0; i<calificaciones.length; i++) {
			sumaCal = sumaCal + calificaciones[i];
		}
		promedio = sumaCal/calificaciones.length;
		
		return promedio;
	}
	
	public int obtnerCalificacionesAprobatorias() {
		int numCal = 0;
		for (int i = 0; i<calificaciones.length; i++) {
			if(calificaciones[i]>=70)
			numCal++;
		}
		return numCal;
	}
	
	public int obtnerCalificacionesReprobatorias() {
		int numCal = 0;
		for (int i = 0; i<calificaciones.length; i++) {
			if(calificaciones[i]<70)
				numCal++;
		}
		return numCal;
	}
	
	public int obtenerCalificacionesArribaPromedio () {
		int numCal = 0;
		for (int i = 0; i<calificaciones.length; i++) {
			if(calificaciones[i]>promedio)
			numCal++;
		}
		return numCal;
	}
	
	public int obtenerCalificacionesAbajoPromedio () {
		int numCal = 0;
		for (int i = 0; i<calificaciones.length; i++) {
			if(calificaciones[i]<promedio)
			numCal++;
		}
		return numCal;
	}
	
	
}//class Calificaciones

public class Ej_03_Calificaciones {

	public static void main(String[] args) {
		
		Calificaciones cal1 = new Calificaciones();
		cal1.lecturaAtributos();
		System.out.println("Promedio: "+ cal1.obtenerPromedio());
		System.out.println("Calificaciones aprobatorias: "+cal1.obtnerCalificacionesAprobatorias());
		System.out.println("Calificacines reprobatorias: "+cal1.obtnerCalificacionesReprobatorias());
		System.out.println("Calificaciones por encima del promedio: "+cal1.obtenerCalificacionesArribaPromedio());
		System.out.println("Calificaciones por debajo del promedio: "+cal1.obtenerCalificacionesAbajoPromedio());



	}

}
