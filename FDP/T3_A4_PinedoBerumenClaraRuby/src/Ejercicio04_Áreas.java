
import java.util.Scanner;

public class Ejercicio04_�reas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("== Programa que muestra el �rea dependiendo de la elecci�n del usuario ==");
		System.out.println();
		
		
		System.out.println("a) �rea del tri�ngulo");
		System.out.println("b) �rea del rect�ngulo");
		System.out.println("c) �rea del c�rculo");
		System.out.println("d) �rea del cuadrado");
		System.out.println("----------------------");
		System.out.println("elige una opcion: ");
		String opcion = entrada.next();
		switch(opcion.toLowerCase()) {
		
			case "a": System.out.println("==�rea del tri�ngulo==");
					  System.out.println("Ingresa la base:");
					  double base = entrada.nextDouble();
					  System.out.println("Ingresa la altura:");
					  double altura = entrada.nextDouble();
					  System.out.println("�rea: " + (base*altura)/2);break;
			
		
			case "b": System.out.println("==�rea del rect�ngulo==");
					  System.out.println("Ingresa la base:");
					  double base1 = entrada.nextDouble();
					  System.out.println("Ingresa la altura:");
					  double altura1 = entrada.nextDouble();
					  System.out.println("�rea: " + base1*altura1);break;
					  
			case "c": System.out.println("==�rea de un c�rculo==");
					  System.out.println("Ingresa el radio:");
					  double radio = entrada.nextDouble();
					  System.out.println("�rea:" + (Math.PI*Math.pow(radio,2)) );break;	
					  
					  
			case "d": System.out.println("==�rea del cuadrado==");
			  		  System.out.println("Ingresa el lado:");
			  		  double lado = entrada.nextDouble();
			  		  System.out.println("�rea: " + Math.pow(lado,2) );break;
		
				default: System.out.println("Inv�lido");break;
		
		}
		

	}

}
