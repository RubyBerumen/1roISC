
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio04_Pantalones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		
			System.out.println("Número de pantalones que se desean comprar");
			int piezas = entrada.nextInt();
			
			if(piezas<5) {
				System.out.println("Total a pagar: "+ formato.format(piezas*356.82));
				
			}else if(piezas>=5 && piezas<12) {
				System.out.println("Total a pagar: "+ formato.format(piezas*356.82*.85));
			}else if(piezas>=12) {
				System.out.println("Total a pagar: "+ formato.format(piezas*356.82*.70));
			}
	

	}

}
