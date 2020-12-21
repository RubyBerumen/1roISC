
import java.util.Scanner;

public class Ejercicio03_Día_Semana_Número {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("== Programa que pide un día de la semana y muestra su número ==");
		System.out.println();
		
		
		System.out.println("Ingresa un día de la semana: ");
		String dia = entrada.nextLine().toLowerCase();
		
		switch (dia) {
			case "lunes": System.out.println("Es el día no. 1");break;
			case "martes": System.out.println("Es el día no. 2");break;
			case "miercoles": case "miércoles" : System.out.println("Es el día no. 3");break;
			case "jueves": System.out.println("Es el día no. 4");break;
			case "viernes": System.out.println("Es el día no. 5");break;
			case "sabado": case "sábado" : System.out.println("Es el día no. 6");break;
			case "domingo": System.out.println("Es el día no. 7");break;
				default: System.out.println("Inválido");break;
		}
		
		
		
		
		
		
		
		

	}

}
