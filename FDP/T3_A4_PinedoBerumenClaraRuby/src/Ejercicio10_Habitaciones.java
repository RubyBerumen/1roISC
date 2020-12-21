
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio10_Habitaciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		System.out.println("==Programa que da informaci�n sobre habitaciones==");
		System.out.println("");
		
		
		System.out.println("Elige una habitaci�n: ");
		System.out.println("1) Azul");
		System.out.println("2) Roja");
		System.out.println("3) Verde");
		System.out.println("4) Rosa");
		System.out.println("5) Gris");
		int opcion = entrada.nextInt();
		
		int habitacion = 0;
		int dias = 0;
		
		
		switch(opcion) {
			case 1 : System.out.println("==Habitaci�n Azul==");
					 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
					 habitacion = entrada.nextInt();
					 System.out.println("Ingresa los d�as que se ocupar�n: ");
					 dias = entrada.nextInt();
					 System.out.println("Esta habitaci�n est� en la primera planta y tiene 2 camas");
					 System.out.println("Cantidad a pagar por d�a: " + formato.format(habitacion*1925.38));
					 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1925.38));break;
					 
			case 2 : System.out.println("==Habitaci�n Roja==");
			 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
			 		 habitacion = entrada.nextInt();
			 		 System.out.println("Ingresa los d�as que se ocupar�n: ");
			 		 dias = entrada.nextInt();
			 		 System.out.println("Esta habitaci�n est� en la primera planta y tiene 1 cama");
			 		 System.out.println("Cantidad a pagar por d�a: " + formato.format(habitacion*1750.35));
			 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1750.35));break;
			 		 
			case 3 : System.out.println("==Habitaci�n Verde==");
			 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
			 		 habitacion = entrada.nextInt();
			 		 System.out.println("Ingresa los d�as que se ocupar�n: ");
			 		 dias = entrada.nextInt();
			 		 System.out.println("Esta habitaci�n est� en la segunda planta y tiene 3 camas");
			 		 System.out.println("Cantidad a pagar por d�a: " + formato.format(habitacion*1925.38));
			 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1925.38));break;
			 		 
			case 4 : System.out.println("==Habitaci�n Rosa==");
	 		 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
	 		 		 habitacion = entrada.nextInt();
	 		 		 System.out.println("Ingresa los d�as que se ocupar�n: ");
	 		 		 dias = entrada.nextInt();
	 		 		 System.out.println("Esta habitaci�n est� en la segunda planta y tiene 2 camas");
	 		 		 System.out.println("Cantidad a pagar por d�a: " + formato.format(habitacion*1750.35));
	 		 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1750.35));break;
	 		 		 
			case 5 : System.out.println("==Habitaci�n Gris==");
	 		 		 System.out.println("Ingresa la cantidad de habitaciones a rentar: ");
	 		 		 habitacion = entrada.nextInt();
	 		 		 System.out.println("Ingresa los d�as que se ocupar�n: ");
	 		 		 dias = entrada.nextInt();
	 		 		 System.out.println("Esta habitaci�n est� en la tercera planta y tiene 1 cama");
	 		 		 System.out.println("Cantidad a pagar por d�a: " + formato.format(habitacion*1925.38));
	 		 		 System.out.println("Cantidad a pagar en total: " + formato.format(dias*habitacion*1925.38));break;
	 		 		 
	 		 	default : System.out.println("Error "+opcion+ " no est� asociado a ninguna habitaci�n");
	 		 
	 		 
		}
		
		
		
		
		
		
		
	

	}

}
