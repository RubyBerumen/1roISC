import java.util.Scanner;

class Empleado {
	String nombre;
	String apellidoP;
	int edad;
	String antiguedad;
	double salarioNeto;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre:");
		nombre = entrada.nextLine();
		System.out.println("Ingresa tu apellido paterno:");
		apellidoP = entrada.nextLine();
		System.out.println("Ingresa tu edad: ");
		edad = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingresa tu antiguedad en la empresa: ");
		antiguedad = entrada.nextLine();
		
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido paterno: "+apellidoP);
		System.out.println("Edad: "+ edad);
		System.out.println("Antiguedad en la empresa: "+ antiguedad);
	}
	
	public void calcularSalario() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("===Calcular salario===");
		System.out.println("Ingresa las horas trabajadas: ");
		double horasT = entrada.nextDouble();
		System.out.println("Ingresa el precio por hora: ");
		double precioHora = entrada.nextDouble();
		System.out.println("Ingresa las horas extras: ");
		double horasExtra = entrada.nextDouble();
		
		double horasExtraT = horasExtra*precioHora*2;
		double salarioBruto = horasT*precioHora+horasExtraT;
		salarioNeto = salarioBruto*.84;
		
		System.out.println(nombre + " tu salario neto es: $" + salarioNeto);
	}
	
}//class Empleado



public class Ej_04_Empleados {

	public static void main(String[] args) {
		
		Empleado em1 = new Empleado();
		em1.lecturaAtributos();
		em1.mostrarAtributos();
		em1.calcularSalario();

		
		

	}

}
