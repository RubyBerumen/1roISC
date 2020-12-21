
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio05_ConversiónDeMillas  {

	public static void main(String[] args)throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		double millas = 0.0;
		double kilometros = 0.0;
		double metros = 0.0;
		double centimetros = 0.0;
		
		System.out.println("Ingrese el valor de las Millas: ");
		millas = Double.parseDouble( entrada.readLine());
		
		kilometros = millas*1.609;
		System.out.println("Kilometros: " + kilometros);
		
		metros = kilometros*1000;
		System.out.println("Metros: " + metros);
		
		centimetros = metros*100;
		System.out.println("Centimetros: " + centimetros);


		

	}

}
