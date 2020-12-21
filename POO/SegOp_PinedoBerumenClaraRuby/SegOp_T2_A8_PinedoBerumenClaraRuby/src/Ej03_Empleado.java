import java.util.Scanner;

class Empleado {
	
	public double calcularSalario(int horasTrabajadas, double precioHora) {
		double salario = horasTrabajadas*precioHora;
		return salario;
	}
	
	
	public double calcularSalario(double precioHora) {
		double salario = 40*precioHora;
		return salario;
	}
	
	
	public void iniciarProceso () {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingresa los siguintes datos:");
		System.out.println("Nombre del empleado: ");
		String nombre = ent.nextLine();
		
		char tipo = '0';
		
		do {
			System.out.println("Tipo de trabajador:   1)Temporal   2)Tiempo Completo");
			tipo = ent.next().charAt(0);
			
			if (tipo == '1') {
				System.out.println("Horas trabajadas: ");
				int horasTrabajadas = ent.nextInt();
				System.out.println("Precio por hora: ");
				double precioHora = ent.nextDouble();
				
				System.out.println("Salario: "+calcularSalario(horasTrabajadas,precioHora));
				
			}else if (tipo == '2') {
				System.out.println("Precio por hora: ");
				double precioHora = ent.nextDouble();
				
				System.out.println("Salario: "+calcularSalario(precioHora));
				
			}else
				System.out.println("Opción inválida!\n");
			
		}while (tipo != '1' && tipo != '2');
		
		
		
	}
	
	
	
}//class Empleado


public class Ej03_Empleado {

	public static void main(String[] args) {
		
		Empleado e = new Empleado();
		e.iniciarProceso();
		
		
		

	}

}
