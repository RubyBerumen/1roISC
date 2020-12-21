
import java.util.Scanner;

public class Ejercicio03_D�a_Semana_N�mero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("== Programa que pide un d�a de la semana y muestra su n�mero ==");
		System.out.println();
		
		
		System.out.println("Ingresa un d�a de la semana: ");
		String dia = entrada.nextLine().toLowerCase();
		
		switch (dia) {
			case "lunes": System.out.println("Es el d�a no. 1");break;
			case "martes": System.out.println("Es el d�a no. 2");break;
			case "miercoles": case "mi�rcoles" : System.out.println("Es el d�a no. 3");break;
			case "jueves": System.out.println("Es el d�a no. 4");break;
			case "viernes": System.out.println("Es el d�a no. 5");break;
			case "sabado": case "s�bado" : System.out.println("Es el d�a no. 6");break;
			case "domingo": System.out.println("Es el d�a no. 7");break;
				default: System.out.println("Inv�lido");break;
		}
		
		
		
		
		
		
		
		

	}

}
