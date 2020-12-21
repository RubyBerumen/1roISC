import java.util.Scanner;

class Calificaciones {
	
	public double obtenerPromedio(double calificaciones[]) {	
		double sumaCal =0;
		for (int i = 0; i<calificaciones.length; i++) {
			sumaCal = sumaCal + calificaciones[i];
		}
		double promedio = sumaCal/calificaciones.length;
		
		return promedio;
	}
	
	public String calificacionLetra(double promedio) {
		String letra = "";
		
		if (promedio==100) {
			letra = "A";
		}else if (promedio<=95 || promedio >=91) {
			letra = "B+";
		}else if (promedio==90) {
			letra = "B";
		}else if (promedio==80) {
			letra = "C";
		}else if (promedio==70) {
			letra = "D";
		}else if (promedio==60) {
			letra = "E";
		}
		
		
		return letra;
	}
	
	
	
}//class Calificaciones

public class Ej_04_Calificaciones {

	public static void main(String[] args) {
		
		Calificaciones cal1 = new Calificaciones ();
		
		System.out.println("Obtener promedio");
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantas calificaciones desea ingresar?");
		byte numCal = entrada.nextByte();
		
		double calificaciones[] = new double [numCal];
		for (int i = 0; i<calificaciones.length; i++) {
			System.out.println("Ingresa la calificación "+ (i+1) +":");
			calificaciones [i]=entrada.nextDouble();
		}
		
		System.out.println("El promedio es: "+ cal1.obtenerPromedio(calificaciones));
		System.out.println("Obtuviste: "+ cal1.calificacionLetra(cal1.obtenerPromedio(calificaciones)));
	

	}

}
