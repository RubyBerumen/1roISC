
import java.util.Scanner;

public class Ejercicio10_ConversorDePies {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		double pies = 0.0;
		double yardas = 0.0;
		double pulgadas = 0.0;
		double centimetros = 0.0;
		double metros = 0.0;
		
		System.out.println("Ingrese el número de pies: ");
		pies = entrada.nextDouble();
		
		yardas = pies/3;
		pulgadas = pies*12;
		centimetros = pulgadas*2.54;
		metros = centimetros/100;
		
		
		
		System.out.println("Yardas: " + yardas);
		System.out.println("Pulgadas: " + pulgadas);
		System.out.println("Centimetros: " + centimetros);
		System.out.println("Metros: " + metros);
	
		
	}

}
