import java.util.Scanner;
import java.util.Calendar;

class Edad {
	int a�oNac;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu a�o de nacimiento: ");
		a�oNac = entrada.nextInt();
	}
	
	public String calcularEdad() {
		Calendar Calendario = Calendar.getInstance();
		int a�oActual = Calendario.get(Calendar.YEAR);
		int edad = a�oActual-a�oNac;
		//System.out.println(edad);
		String x = "";
		if (edad<18) {
			x = "Menor de edad";
		}else if (edad>=18) {
			x = "Mayor de edad";
		}
		
	return x;	
	}
	

}//class edad


public class Ej_01_Edad {

	public static void main(String[] args) {
		
		Edad edad1 = new Edad();
		edad1.lecturaAtributos();
		System.out.println(edad1.calcularEdad());
		
		
		
		
		
		
		
		
	}

}
