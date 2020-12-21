
import java.util.Scanner;

public class Ejercicio04_Áreas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("== Programa que muestra el área dependiendo de la elección del usuario ==");
		System.out.println();
		
		
		System.out.println("a) Área del triángulo");
		System.out.println("b) Área del rectángulo");
		System.out.println("c) Área del círculo");
		System.out.println("d) Área del cuadrado");
		System.out.println("----------------------");
		System.out.println("elige una opcion: ");
		String opcion = entrada.next();
		switch(opcion.toLowerCase()) {
		
			case "a": System.out.println("==Área del triángulo==");
					  System.out.println("Ingresa la base:");
					  double base = entrada.nextDouble();
					  System.out.println("Ingresa la altura:");
					  double altura = entrada.nextDouble();
					  System.out.println("Área: " + (base*altura)/2);break;
			
		
			case "b": System.out.println("==Área del rectángulo==");
					  System.out.println("Ingresa la base:");
					  double base1 = entrada.nextDouble();
					  System.out.println("Ingresa la altura:");
					  double altura1 = entrada.nextDouble();
					  System.out.println("Área: " + base1*altura1);break;
					  
			case "c": System.out.println("==Área de un círculo==");
					  System.out.println("Ingresa el radio:");
					  double radio = entrada.nextDouble();
					  System.out.println("Área:" + (Math.PI*Math.pow(radio,2)) );break;	
					  
					  
			case "d": System.out.println("==Área del cuadrado==");
			  		  System.out.println("Ingresa el lado:");
			  		  double lado = entrada.nextDouble();
			  		  System.out.println("Área: " + Math.pow(lado,2) );break;
		
				default: System.out.println("Inválido");break;
		
		}
		

	}

}
