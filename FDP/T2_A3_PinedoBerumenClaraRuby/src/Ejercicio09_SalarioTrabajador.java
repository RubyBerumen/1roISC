
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Ejercicio09_SalarioTrabajador {
	
	public static void main (String[] args) throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat formato = new DecimalFormat("$#,##0.00");
		
		double diastrabajados = 0.0;
		double pagoporhora = 0.0;
		double diasextras = 0.0;
		double salariobruto = 0.0;
		double salarioneto = 0.0;
		double horastpordia = 0.0;
		
		
		
		System.out.println("Ingresa los días trabajados: ");
		diastrabajados = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingresa cuantas horas tabajas al dia: ");
		horastpordia = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingresa el pago por hora: ");
		pagoporhora = Double.parseDouble( entrada.readLine());
		
		System.out.println("Ingresa los dias extras: ");
		diasextras = Double.parseDouble( entrada.readLine());
		
		salariobruto = diastrabajados * horastpordia * pagoporhora + diasextras*horastpordia*pagoporhora*2;
		salarioneto = salariobruto*.86;
				
		System.out.println("Salario neto: " + formato.format(salarioneto));
		
		
	}

}
