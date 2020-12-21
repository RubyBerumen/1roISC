import java.util.Scanner;

public class Ejercicio06_Figura_Usuario_W {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("==Programa que imprime figura con altura indicada por el usuario==");
		System.out.println();
		
		
		int altura = 0;
		
		System.out.println("Ingresa la altura: ");
		altura = entrada.nextInt();
		
		
		int i=1;
		while( i<=altura ) {
			int j=1;
			while ( j<=10 ) {
				System.out.print("@");
				j++;
			}
			System.out.println();
			i++;
		}
		
	

	}

}
