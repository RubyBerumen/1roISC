
import java.util.Scanner;

public class Ejercicio07_a�o_bisiesto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingresa el a�o: ");
		int a�o = entrada.nextInt();
		
		if(a�o%4==0 && a�o%100!=0) {
			System.out.println("Es a�o bisiesto");
		}else {
			System.out.println("No es a�o bisiesto");
		}
		

		
		
		
		
		
		
		
	}

}
