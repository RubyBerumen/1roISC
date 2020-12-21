import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Ejercicio12Hipotenusa {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 12: Calculo de la hipotenusa mediante el teorema de Pitágoras");
		
		double a = 0.0, b = 0.0, c = 0.0, hipo = 0.0;
		
		System.out.println("Ingrese medida del cateto a: ");
		a = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese medida del cateto b: ");
		b = Double.parseDouble(entrada.readLine());
		
		c = (Math.pow(a, 2)) + (Math.pow(b, 2));
		hipo = (Math.sqrt(c));
		
		System.out.println("El valor de la hipotenusa es: " + hipo);
	}

}
