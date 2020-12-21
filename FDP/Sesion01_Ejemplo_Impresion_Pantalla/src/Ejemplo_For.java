import java.util.Scanner;

public class Ejemplo_For {

	public static void main(String[] args) {
		
		
Scanner entrada = new Scanner (System.in);
		
		System.out.println("==Programa que imprime figura con altura indicada por el usuario==");
		System.out.println();
		
		
		int altura = 0;
		
		System.out.println("Ingresa la altura: ");
		altura = entrada.nextInt();
		
		
		
		for(int i=0; i<=altura; i++) {
			for (int x=0; x>=0+1; x++ ) {
				System.out.print(x);
			}
			System.out.println();
		}
		
		
		
		
		


	}

}
