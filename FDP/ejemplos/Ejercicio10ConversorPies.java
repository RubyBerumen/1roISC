import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio10ConversorPies {

	public static void main(String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 10: Conversor de pies a yardas, pulgadas, metros y centimetros");
		
		double pie = 0.0, pulgada = 0.0, yardas = 0.0, metros = 0.0, cm = 0.0;
		
		System.out.println("Ingrese la medida en pies que desea convertir: ");
		pie = Double.parseDouble(entrada.readLine());
		
		yardas = pie / 3;
		pulgada = yardas * 36;
		cm = pulgada * 2.54;
		metros = cm / 100;
		
		System.out.println("Las yardas son: " + yardas);
		System.out.println("Las pulgadas son: " + pulgada);
		System.out.println("Los centimetros son: " + cm);
		System.out.println("Los metros son: " + metros);

	}

}
