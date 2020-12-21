
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio10_Habitaciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		System.out.println("==Programa que da información sobre habitaciones==");
		System.out.println("");
		
		
		System.out.println("Elige una habitación: ");
		System.out.println("1) Azul");
		System.out.println("2) Roja");
		System.out.println("3) Verde");
		System.out.println("4) Rosa");
		System.out.println("5) Gris");
		int opcion = entrada.nextInt();
		
		int habitacion = 0;
		int dias = 0;
		
		
		switch(opcion) {
			case 1 : System.out.println("==Habitación Azul==");
					 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
					 habitacion = entrada.nextInt();
					 System.out.println("Ingresa los días que se ocuparán: ");
					 dias = entrada.nextInt();
					 System.out.println("Esta habitación está en la primera planta y tiene 2 camas");
					 System.out.println("Cantidad a pagar por día: " + formato.format(habitacion*1925.38));
					 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1925.38));break;
					 
			case 2 : System.out.println("==Habitación Roja==");
			 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
			 		 habitacion = entrada.nextInt();
			 		 System.out.println("Ingresa los días que se ocuparán: ");
			 		 dias = entrada.nextInt();
			 		 System.out.println("Esta habitación está en la primera planta y tiene 1 cama");
			 		 System.out.println("Cantidad a pagar por día: " + formato.format(habitacion*1750.35));
			 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1750.35));break;
			 		 
			case 3 : System.out.println("==Habitación Verde==");
			 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
			 		 habitacion = entrada.nextInt();
			 		 System.out.println("Ingresa los días que se ocuparán: ");
			 		 dias = entrada.nextInt();
			 		 System.out.println("Esta habitación está en la segunda planta y tiene 3 camas");
			 		 System.out.println("Cantidad a pagar por día: " + formato.format(habitacion*1925.38));
			 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1925.38));break;
			 		 
			case 4 : System.out.println("==Habitación Rosa==");
	 		 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
	 		 		 habitacion = entrada.nextInt();
	 		 		 System.out.println("Ingresa los días que se ocuparán: ");
	 		 		 dias = entrada.nextInt();
	 		 		 System.out.println("Esta habitación está en la segunda planta y tiene 2 camas");
	 		 		 System.out.println("Cantidad a pagar por día: " + formato.format(habitacion*1750.35));
	 		 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1750.35));break;
	 		 		 
			case 5 : System.out.println("==Habitación Gris==");
	 		 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
	 		 		 habitacion = entrada.nextInt();
	 		 		 System.out.println("Ingresa los días que se ocuparán: ");
	 		 		 dias = entrada.nextInt();
	 		 		 System.out.println("Esta habitación está en la tercera planta y tiene 1 cama");
	 		 		 System.out.println("Cantidad a pagar por día: " + formato.format(habitacion*1925.38));
	 		 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1925.38));break;
	 		 		 
	 		 	default : System.out.println("Error "+opcion+ " no está asociado a ninguna habitación");
	 		 
	 		 
		}
		
		
		
		
		
		
		
	

	}

}
