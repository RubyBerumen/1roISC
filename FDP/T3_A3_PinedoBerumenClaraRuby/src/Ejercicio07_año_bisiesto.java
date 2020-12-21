
import java.util.Scanner;

public class Ejercicio07_año_bisiesto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingresa el año: ");
		int año = entrada.nextInt();
		
		if(año%4==0 && año%100!=0) {
			System.out.println("Es año bisiesto");
		}else {
			System.out.println("No es año bisiesto");
		}
		

		
		
		
		
		
		
		
	}

}
