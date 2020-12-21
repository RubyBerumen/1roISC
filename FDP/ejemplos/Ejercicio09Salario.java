import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ejercicio09Salario {

	public static void main(String[] args) throws IOException {
		
	
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		double salariob = 0.0, diast = 0.0, pagoh = 0.0, diasx = 0.0, salarion = 0.0;
		
		System.out.println("Ingrese los dias trabajados: ");
		diast = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese el pago por hora: ");
		pagoh = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese los dias extra trabajados: ");
		diasx = Double.parseDouble(entrada.readLine());
		
		salariob = (((diast * (pagoh * 8)) + (diasx*2))); 
		
		salarion = salariob - (salariob * .14);
		
		DecimalFormat formato = new DecimalFormat("$#,##0.00");
		System.out.println("El salario bruto es: " + formato.format(salariob));
		System.out.println("El salario neto: " +formato.format(salarion));
	}

}
