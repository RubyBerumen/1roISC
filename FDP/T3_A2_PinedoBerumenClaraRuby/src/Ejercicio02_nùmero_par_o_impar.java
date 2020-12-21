
import java.util.Scanner;

public class Ejercicio02_nùmero_par_o_impar {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
		
		int numero = 0;
		
		
		System.out.println("ingresa un numero entero: ");
		numero = entrada.nextInt();
		
		if(numero%2==1) {
			System.out.println("numero impar");	
		}else if(numero%2==0) {
			System.out.println("numero par");
		}
		
		
			
		
		
		
	}		

}
