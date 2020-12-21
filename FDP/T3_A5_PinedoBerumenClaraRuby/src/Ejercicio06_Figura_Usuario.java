
import java.util.Scanner;

public class Ejercicio06_Figura_Usuario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("==Programa que imprime figura con altura indicada por el usuario==");
		System.out.println();
		
		
		int altura = 0;
		
		System.out.println("Ingresa la altura: ");
		altura = entrada.nextInt();
		
		
		
		for(int i=1; i<=altura; i++) {
			for (int x=1; x<=10; x++ ) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		
		
		


	}

}
