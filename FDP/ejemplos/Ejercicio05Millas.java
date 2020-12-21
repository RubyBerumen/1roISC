import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio05Millas {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercio 5: Conversor de millas a Km, m y cm.");
		
		double millas = 0.0, km = 0.0, m = 0.0, cm = 0.0;
		
		
		System.out.println("Ingrese las millas que desea convertir: ");
		millas = Double.parseDouble(entrada.readLine());
		
		km = millas * 1.609;
		m = km * 1000;
		cm = m * 100;
		
		System.out.println("La distancia en Kilometros es: " + km);
		System.out.println("La distancia en metros es: " + m);
		System.out.println("La distancia en centimetros es: " + cm);
		
	}

}
