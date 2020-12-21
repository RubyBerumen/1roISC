
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12_HipotenusaPitagoras {

	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		double a = 0.0;
		double b = 0.0;
		double h = 0.0;
		
		System.out.println("Ingrese el valor de a: ");
		a = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de b: ");
		b = Double.parseDouble( entrada.readLine());
		
		h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		
		System.out.println("Hipotenusa: " + h);
		

	}

}
