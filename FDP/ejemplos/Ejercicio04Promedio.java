import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio04Promedio {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 4: Promedio de 5 calificaciones.");
		
		int cal1 = 0;
		int cal2 = 0;
		int cal3 = 0;
		int cal4 = 0;
		int cal5 = 0;
		double prom = 0.0;
		
		System.out.println("Ingrese la primera calificacion: ");
		cal1 = Integer.parseInt( entrada.readLine() );
		System.out.println("Ingrese la segunda calificacion: ");
		cal2 =  Integer.parseInt( entrada.readLine() );
		System.out.println("Ingrese la tercera calificacion: ");
		cal3 =  Integer.parseInt( entrada.readLine() );
		System.out.println("Ingrese la cuarta calificacion: ");
		cal4 =  Integer.parseInt( entrada.readLine() );
		System.out.println("Ingrese la quinta calificacion: ");
		cal5 =  Integer.parseInt( entrada.readLine() );
		
		prom = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;
		System.out.println("El promedio de la calificacion es: " + prom);

	}

}
