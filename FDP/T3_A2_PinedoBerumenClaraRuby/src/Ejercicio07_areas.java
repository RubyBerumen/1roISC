
import java.util.Scanner;

public class Ejercicio07_areas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	
		
		System.out.println("1) �rea de un triangulo");
		System.out.println("2) �rea de un circulo");
		System.out.println("Elige una opci�n:");
		byte opcion = entrada.nextByte();
		
		if(opcion==1) {
			System.out.println("==�rea del triangulo==");
			System.out.println("Ingresa la base:");
			double base = entrada.nextDouble();
			System.out.println("Ingresa la altura:");
			double altura = entrada.nextDouble();
			System.out.println("�rea: " + (base*altura)/2);
		}
		
			
		if(opcion==2) {
			System.out.println("==�rea de un c�rculo==");
			System.out.println("Ingresa el radio:");
			double radio = entrada.nextDouble();
			System.out.println("�rea:" + (Math.PI*Math.pow(radio,2)) );
		}
		

	}

}
