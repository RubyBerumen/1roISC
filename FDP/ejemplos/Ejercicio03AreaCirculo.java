import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ejercicio03AreaCirculo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat formato = new DecimalFormat("0.0000");
		
		System.out.println("Ejercicio 3: Areá de un triangulo.");
		
		double radio = 0.0;
		double area = 0.0;
		
		System.out.println("Ingrese el radio del circulo: ");
		radio = Double.parseDouble(entrada.readLine());
		
		area = (Math.PI) * (Math.pow(radio, 2));
		
		System.out.println("El area del circulo es: " + formato.format(area));
	}

}
