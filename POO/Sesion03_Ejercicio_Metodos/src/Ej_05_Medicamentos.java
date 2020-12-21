import java.util.Scanner;

class Medicamento{
	String nombreMed;
	String sustanciaActiva;
	double precio;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el nombre del medicamento: ");
		nombreMed = entrada.nextLine(); 
		System.out.println("Ingresa la sustancia activa: ");
		sustanciaActiva = entrada.nextLine();
		System.out.println("Ingresa el precio: ");
		precio = entrada.nextDouble();
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre dek medicamento: "+nombreMed);
		System.out.println("Sustancia activa: "+ sustanciaActiva);
		System.out.println("Precio: $"+precio);
	}
	
	public void calcularDescuento() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calcular Descuento");
		System.out.println("Ingresa tu edad: ");
		int edad = entrada.nextInt();
		System.out.println("¿Tienes credencial del IMMS?  1)Si / 2)No");
		byte credencial = entrada.nextByte();
		
		if(edad>60) {
			precio = precio*.90;
			System.out.println("Has obtenido un descuento de 10%");
		}else if(credencial==1) {
			precio = precio*.95;
			System.out.println("Has obtenido un descuento adicional de 5%");
		}else {
			System.out.println("Sin descuento! :(");
		}
		System.out.println("El precio del medicamento es: $"+precio);
	}
	
}//class Medicamento


public class Ej_05_Medicamentos {

	public static void main(String[] args) {
	
		Medicamento med1 = new Medicamento();
		med1.lecturaAtributos();
		med1.mostrarAtributos();
		med1.calcularDescuento();
		

	}

}
