
import java.util.Scanner;

public class Ejercicio05_ConversiónDeMillas {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		double millas = 0.0;
		double kilometros = 0.0;
		double metros = 0.0;
		double centimetros = 0.0;
		
		System.out.println("Ingrese el valor de las Millas: ");
		millas = entrada.nextDouble();
		
		kilometros = millas*1.609;
		System.out.println("Kilometros: " + kilometros);
		
		metros = kilometros*1000;
		System.out.println("Metros: " + metros);
		
		centimetros = metros*100;
		System.out.println("Centimetros: " + centimetros);
	
		
		
	}
	
}
