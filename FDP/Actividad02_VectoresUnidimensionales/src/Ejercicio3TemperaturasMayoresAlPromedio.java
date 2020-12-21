import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3TemperaturasMayoresAlPromedio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Programa que pide un numero especificado de temperaturas y muestra las mayores y las menores al promedio" );
		System.out.println("=======================================================================================================================");
		System.out.println("Ingresa el numero de temperaturas a registrar:");
		int ntempe = entrada.nextInt();
		
		double contador = 0;
		DecimalFormat formato = new DecimalFormat("#.## ");
		Math.round(2);
		
		double temperatura [];
		temperatura = new double[ntempe];
		
		for (int i = 0; i<temperatura.length;i = i+1) {
			System.out.println("Ingresa temperatura "+ (i+1));
			temperatura[i]=entrada.nextDouble();
			contador = contador + temperatura[i];	
		}
		double promedio = contador/temperatura.length;
		
		System.out.println("=========================================================================");
		
		System.out.println("Las temperaturas mayores al promedio son: ");
		for (int i = 0; i<temperatura.length;i = i+1) {
			if (temperatura[i]>promedio) {
				System.out.println("temperatura " + (i+1)+": "+formato.format(temperatura[i]));
			}
		}
		
		System.out.println("Las temperaturas menores al promedio son: ");
		for (int i = 0; i<temperatura.length;i = i+1) {
			if (temperatura[i]<promedio) {
				System.out.println("temperatura " + (i+1)+": "+ formato.format(temperatura[i]));
			}
		}
		
		
		
	}

}
