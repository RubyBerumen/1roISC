
import java.util.Scanner;

public class Ejercicio09_SalarioTrabajador {
	public static void main(String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		double diastrabajados = 0.0;
		double pagoporhora = 0.0;
		double diasextras = 0.0;
		double salariobruto = 0.0;
		double salarioneto = 0.0;
		double horastpordia = 0.0;
		
		System.out.println("Ingresa los días trabajados: ");
		diastrabajados = entrada.nextDouble();
		
		System.out.println("Ingresa cuantas horas tabajas al dia: ");
		horastpordia = entrada.nextDouble();
		
		System.out.println("Ingresa el pago por hora: ");
		pagoporhora = entrada.nextDouble();
		
		System.out.println("Ingresa los dias extras: ");
		diasextras = entrada.nextDouble();
		
		salariobruto = diastrabajados * horastpordia * pagoporhora + diasextras*horastpordia*pagoporhora*2;
		salarioneto = salariobruto*.86;
				
		System.out.println("Salario neto: " + salarioneto);	
		
		
	}

}
