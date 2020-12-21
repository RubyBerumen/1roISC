
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Ejercicio07_VolumenCilindro {

	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		double radio = 0.0;
		double altura = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingrese el valor del Radio en metros: " );
		radio = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingrese el valor de la altura en metros: ");
		altura = Double.parseDouble( entrada.readLine());
		
		resultado = (Math.PI)*(Math.pow(radio, 2))*altura;
		System.out.println("El volumen del Circulo es: " + resultado + "  metros3");

	}

}
