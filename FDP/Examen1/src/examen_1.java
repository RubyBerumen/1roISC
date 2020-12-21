
import java.util.Scanner;
import java.text.DecimalFormat;


public class examen_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		String nombre = "";
		double salariomensual = 0.0;
		String marca = "";
		String modelo = "";
		String linea = "";
		double valorautomovil = 0.0;
		double docemeses = 0.0;
		double veintemeses = 0.0;
		double cuarentameses = 0.0;
		double sesentameses = 0.0;
		
		
		System.out.println("Nombre completo: ");
		nombre = entrada.nextLine();
		System.out.println("Salario mensual $: ");
		salariomensual = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Marca del automovil: ");
		marca = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Modelo: ");
		modelo = entrada.nextLine();
		System.out.println("Linea: ");
		linea = entrada.nextLine();
		System.out.println("Valor del automovil $: ");
		valorautomovil = entrada.nextDouble();
		
		docemeses = (valorautomovil + ((valorautomovil*4.49)/100))/24;
		veintemeses = (valorautomovil + ((valorautomovil*8.07)/100))/48;
		cuarentameses = (valorautomovil + ((valorautomovil*14)/100))/96;
		sesentameses = (valorautomovil + ((valorautomovil*18.98)/100))/120;
		
		System.out.println("A pagar en 12 meses quincenalmente: " + formato.format(docemeses));
		System.out.println("A pagar en 24 meses quincenalmente: " + formato.format(veintemeses));
		System.out.println("A pagar en 48 meses quincenalmente: " + formato.format(cuarentameses));
		System.out.println("A pagar en 60 meses quincenalmente: " + formato.format(sesentameses));
		
		
		System.out.println("En caso de ser Trabajador del Sistema Educativo Nacional se le aplicarà");
		System.out.println( "un descuento de del 5.27% del total del vehiculo y pagarìa lo siguiente: ");
		
		docemeses = ((valorautomovil - (valorautomovil*5.27)/100) + ((valorautomovil*4.49)/100))/24;
		veintemeses = ((valorautomovil - (valorautomovil*5.27)/100) + ((valorautomovil*8.07)/100))/48;
		cuarentameses = ((valorautomovil - (valorautomovil*5.27)/100) + ((valorautomovil*14)/100))/96;
		sesentameses = ((valorautomovil - (valorautomovil*5.27)/100) + ((valorautomovil*18.98)/100))/120;
		
		System.out.println("A pagar en 12 meses quincenalmente: " + formato.format(docemeses));
		System.out.println("A pagar en 24 meses quincenalmente: " + formato.format(veintemeses));
		System.out.println("A pagar en 48 meses quincenalmente: " + formato.format(cuarentameses));
		System.out.println("A pagar en 60 meses quincenalmente: " + formato.format(sesentameses));
		
		
		
		
		
		
		
	

	}

}
