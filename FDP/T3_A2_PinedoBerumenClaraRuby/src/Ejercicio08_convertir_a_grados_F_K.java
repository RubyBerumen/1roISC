
import java.util.Scanner;

public class Ejercicio08_convertir_a_grados_F_K {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		double gcentigrados = 0.0;
		double gfahrenheit = 0.0;
		double gkelvin = 0.0;
		
		System.out.println("Ingrese los grados centigrados: ");
		gcentigrados = entrada.nextDouble();
		
		System.out.println("Convertir a:");
		System.out.println("1) Grados Fahrenheit");
		System.out.println("2) Grados Kelvin");
		System.out.println("Elige una opción:");
		byte opcion = entrada.nextByte();
		
		gfahrenheit = (gcentigrados*1.8)+32;
		gkelvin = gcentigrados+273.15;
		
		if(opcion==1) {
			System.out.println("Grados Fahrenheit: " + gfahrenheit);
		}
		
		if(opcion==2) {
			System.out.println("Grados Kelvin: " + gkelvin);
		}
		
		
		
		

	}

}
