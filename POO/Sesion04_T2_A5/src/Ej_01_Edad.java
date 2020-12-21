import java.util.Scanner;
import java.util.Calendar;

class Edad {
	int añoNac;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu año de nacimiento: ");
		añoNac = entrada.nextInt();
	}
	
	public String calcularEdad() {
		Calendar Calendario = Calendar.getInstance();
		int añoActual = Calendario.get(Calendar.YEAR);
		int edad = añoActual-añoNac;
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
