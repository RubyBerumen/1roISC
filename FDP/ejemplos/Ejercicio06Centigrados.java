import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio06Centigrados {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 6: Conversor de grados Centigrados a Fahreinheit");
		
		double cent = 0.0, fahr = 0.0;
		
		System.out.println("Ingrese los grados centigrados: ");
		cent = Double.parseDouble(entrada.readLine());
		
		fahr = cent * 1.8 + 32;
		
		System.out.println("Los grados Fahreinheit son: " + fahr);
		
	}

}
