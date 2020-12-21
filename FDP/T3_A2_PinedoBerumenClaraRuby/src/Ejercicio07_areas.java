
import java.util.Scanner;

public class Ejercicio07_areas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	
		
		System.out.println("1) Área de un triangulo");
		System.out.println("2) Área de un circulo");
		System.out.println("Elige una opción:");
		byte opcion = entrada.nextByte();
		
		if(opcion==1) {
			System.out.println("==Área del triangulo==");
			System.out.println("Ingresa la base:");
			double base = entrada.nextDouble();
			System.out.println("Ingresa la altura:");
			double altura = entrada.nextDouble();
			System.out.println("Área: " + (base*altura)/2);
		}
		
			
		if(opcion==2) {
			System.out.println("==Área de un círculo==");
			System.out.println("Ingresa el radio:");
			double radio = entrada.nextDouble();
			System.out.println("Área:" + (Math.PI*Math.pow(radio,2)) );
		}
		

	}

}
