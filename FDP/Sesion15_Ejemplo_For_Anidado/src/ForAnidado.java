
import java.util.Scanner;

public class ForAnidado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			
		int altura = 0;
		int ancho = 0;
		
		System.out.println("Ingresa la altura: ");
		altura = entrada.nextInt();
		
		System.out.println("Ingresa el ancho: ");
		ancho = entrada.nextInt();
		
		
		for(int i=1; i<=altura; i++) {
			for (int j=1; j<=ancho; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
