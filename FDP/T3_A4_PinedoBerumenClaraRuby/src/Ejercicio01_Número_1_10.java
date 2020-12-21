
import java.util.Scanner;

public class Ejercicio01_Número_1_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("==Programa que lee un número del 1 al 10 y lo imprime en palabra==");
		System.out.println();
		
		System.out.println("Ingresa un número del 1 al 10: ");
		int opcion = entrada.nextInt();
		
		switch(opcion) {
			case 1: System.out.println("Uno");break;
			case 2: System.out.println("Dos");break;
			case 3: System.out.println("Tres");break;
			case 4: System.out.println("Cuatro");break;
			case 5: System.out.println("Cinco");break;
			case 6: System.out.println("Seis");break;
			case 7: System.out.println("Siete");break;
			case 8: System.out.println("Ocho");break;
			case 9: System.out.println("Nueve");break;
			case 10: System.out.println("Diez");break;
				default : System.out.println("Inválido");break;
		}

		

	}

}
