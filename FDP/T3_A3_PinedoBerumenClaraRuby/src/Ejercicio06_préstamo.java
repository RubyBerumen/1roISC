
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio06_préstamo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		
		System.out.println("Ingresa tu nombre:");
		String nombre = entrada.nextLine();
		System.out.println("Ingresa tu historia crediticial: b)buena m)mala");
		char historiac = entrada.next().charAt(0);
		System.out.println("Ingresa la cantidad a pedir: ");
		double cantidad = entrada.nextDouble();
		System.out.println("Ingresa tu salario anual: ");
		double salarioa= entrada.nextDouble();
		System.out.println("Ingresa el valor de otras propiedades: ");
		double propiedades = entrada.nextDouble();
		int puntos= 0 ;
		
		if(historiac=='m'||historiac=='M') {
			System.out.println("No se le hará el prestamo ");
		}
		
		if(historiac=='b'||historiac =='B' && cantidad>0 && salarioa>0) {
			if((salarioa)>=(cantidad/2)) {
				puntos= puntos+5;
			}else if(salarioa>=(cantidad/4) && salarioa<(cantidad/2)) {
				puntos = puntos+3;
			}else if(salarioa>=(cantidad/10) && salarioa<(cantidad/4)) {
				puntos = puntos+1;}
			
			else if (propiedades>=(cantidad*2)) {
				puntos= puntos +5;
			}else if(propiedades >=cantidad && propiedades<(cantidad*2) ) {
				puntos = puntos+3;
			}
			if(puntos>6) {
				System.out.println("Se le dará un prestamo de: " + formato.format(cantidad));
			}
		}else {
			System.out.println("Entrada no valida");
		}

	}

}
