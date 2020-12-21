import java.util.Scanner;
/*
 * 	Sintaxis
 * 
 * 
 * 
 * 
 */

public class Ejemplo_DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i =1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n---------------------------------------");
		
		
		i=1;
		do {
			System.out.print(i + " ");
			
			i++;
		}while(i<=10);
		
		System.out.println("\n---------------------------------------");
		
		int num = 7;
		i=1;
		do {
			System.out.println(num + " * " + i + " = " + (num*i));
			i+=2;
			
		}while(i<=10);
		
		System.out.println("\n------------------------------------------");
		
		byte opcion = 0;
		do {
			
			System.out.println("Convertir °C a: ");
			System.out.println("1) °F ");
			System.out.println("2) °K ");
			System.out.println("3) °R ");
			System.out.println("------------------");
			System.out.println("4) Salir ");
			System.out.println("Elige una opcion:");
			opcion= entrada.nextByte();
			
			switch(opcion) {
			 	case 1: System.out.println("Elegiste 1"); break;
			 	case 2: System.out.println("Elegiste 2"); break;
			 	case 3: System.out.println("Elegiste 3"); break;
			 	case 4: break;
			 	default: System.out.println("Opcion incorrecta");break;
			 	
			}
		}while(opcion!=4);
		
		
		
		
		

	}//main

}
