
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio06_salario_trabajador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		double diastrabajados = 0.0;
		double pagoporhora = 0.0;
		double diasextras = 0.0;
		double salariobruto = 0.0;
		double salarioneto = 0.0;
		double horastpordia = 0.0;
		double ispt = 0.0;
		
		System.out.println("Ingresa los días trabajados: ");
		diastrabajados = entrada.nextDouble();
		
		System.out.println("Ingresa cuantas horas tabajas al dia: ");
		horastpordia = entrada.nextDouble();
		
		System.out.println("Ingresa el pago por hora: ");
		pagoporhora = entrada.nextDouble();
		
		System.out.println("Ingresa los dias extras: ");
		diasextras = entrada.nextDouble();
		
		
		
		if(diasextras>5) {
			diasextras=diasextras*horastpordia*pagoporhora*3;
			} else { 
				diasextras = diasextras*horastpordia*pagoporhora*2;
			}
		
		salariobruto = (diastrabajados * horastpordia * pagoporhora) + diasextras;
		
		if(salariobruto>20000) {
			salarioneto = salariobruto*.86;
		}else if(salariobruto<=20000 && salariobruto>=0){
		salarioneto = salariobruto*.84;
		}
				
		System.out.println("Salario neto: " + formato.format(salarioneto));	
		

	}

}
