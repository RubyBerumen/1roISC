
import java.util.Scanner;

public class Ejercicio01_numero_positivo_o_negativo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero = 0;
				
		System.out.println(" Ingresa un nùmero entero");
		numero = entrada.nextInt();
		
		if(numero<0) {
			System.out.println("numero negativo");
		}else if(numero>0) {
			System.out.println("numero positivo");
		}
			
			
		
	}

}
