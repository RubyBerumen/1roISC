

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio09_Vehiculos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		System.out.println("==Programa que calcula el importe a pagar por un vehículo al circular por una autopista==");
		System.out.println("");
		
		
		System.out.println("Elige una opcion: ");
		System.out.println("1) Bicicleta");
		System.out.println("2) Motocicleta");
		System.out.println("3) Carro");
		System.out.println("4) Camión");
		int opcion = entrada.nextInt();
		
		switch(opcion) {
			case 1 : System.out.println("==Bicicleta==");
					 System.out.println("El importe a pagar es: " + formato.format(100));break;
			
					 
			case 2 : System.out.println("==Motocicleta==");
					 System.out.println("Ingresa el número de km. recorridos: ");
					 double km = entrada.nextDouble();
					 System.out.println("El importe a pagar es: " + formato.format(km*30));break;
					 
			case 3 : System.out.println("==Carro==");
			 		 System.out.println("Ingresa el número de km. recorridos:");
			 		 km = entrada.nextDouble();
			 		 System.out.println("El importe a pagar es: " + formato.format(km*30));break;
			 		 
			case 4 : System.out.println("==Camión==");
			 		 System.out.println("Ingresa el número de km. recorridos: ");
			 		 km = entrada.nextDouble();
			 		 System.out.println("Ingresa el número de toneladas: ");
			 		 double toneladas = entrada.nextDouble();
			 		 double total = (km*30)+(toneladas*25);
			 		 System.out.println("El importe a pagar es: " + formato.format(total));break;
			 		 
			 	default : System.out.println("Inválido");break;
			 
					 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
