
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio06_CentigradosAFahrenheit {

	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		double gradosC = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingresa el número de grados Centigrados: ");
		gradosC = Double.parseDouble( entrada.readLine());
		
		resultado = (gradosC*1.8)+32;
		System.out.println("Grados Faharenheit: " + resultado);

	}

}
