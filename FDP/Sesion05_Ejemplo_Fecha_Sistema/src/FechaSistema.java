import java.util.Calendar;
import java.util.Scanner;

public class FechaSistema {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que lee el a�o de nacimiento para calcular la edad==");
		System.out.println("Ingresa tu a�o de nacimiento: ");
		int a�oNac = entrada.nextInt();
		
		//Codigo para obtener la fecha del sistema
		Calendar fechaactual = Calendar.getInstance();
		System.out.println(fechaactual);
		
		int a�oactual = fechaactual.get(Calendar.YEAR);
		System.out.println(a�oactual);
		System.out.println(fechaactual.get(Calendar.MONTH));
		System.out.println(fechaactual.get(Calendar.DATE));
		System.out.println(fechaactual.get(Calendar.DAY_OF_WEEK));
		System.out.println(fechaactual.get(Calendar.HOUR));
		System.out.println(fechaactual.get(Calendar.MINUTE));
		
		
		
		
		System.out.println("Tu edad es: " + (2019-a�oNac));
		

	}

}
