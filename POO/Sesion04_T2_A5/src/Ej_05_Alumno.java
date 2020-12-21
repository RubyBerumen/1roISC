import java.util.Scanner;
import java.util.Calendar;

class Alumno{
	String nombre;
	String apellidoP;
	String apellidoM;
	String numControl;
	int a�oNac;
	int calificaciones [];
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Ingresa tu apellido paterno: ");
		apellidoP = entrada.nextLine();
		System.out.println("Ingresa tu apellido materno: ");
		apellidoM = entrada.nextLine();
		System.out.println("Ingresa tu nu�mero de control: ");
		numControl = entrada.nextLine();
		System.out.println("Ingresa tu a�o de nacimiento: ");
		a�oNac = entrada.nextInt();
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: " +nombre);
		System.out.println("Apellido paterno: "+apellidoP);
		System.out.println("Apellido materno: " +apellidoM);
		System.out.println("N�mero de control: "+numControl);
		System.out.println("A�o de nacimiento: "+a�oNac);
	}
	
	public int obtenerEdad() {
		Calendar Calendario = Calendar.getInstance();
		int a�o = Calendario.get(Calendar.YEAR);
		int edad = a�o-a�oNac;
		
		return edad;
	}
	
	public int obtenerPromedio() {
		System.out.println("Obtener promedio");
		Scanner entrada = new Scanner(System.in);
		System.out.println("�Cuantas calificaciones desea ingresar?");
		byte numCal = entrada.nextByte();
		
		calificaciones = new int [numCal];
		int sumaCal =0;
		
		for (int i = 0; i<calificaciones.length; i++) {
			System.out.println("Ingresa la calificaci�n "+ (i+1) +":");
			calificaciones [i]=entrada.nextInt();
			sumaCal = sumaCal + calificaciones[i];
		}
		int promedio = sumaCal/numCal;
	
		return promedio;
	}

}//class Alumno 

public class Ej_05_Alumno {

	public static void main(String[] args) {
	
		Alumno al1 = new Alumno();
		al1.lecturaAtributos();
		al1.mostrarAtributos();
		System.out.println("La edad es: "+al1.obtenerEdad());
		System.out.println("El promedio es: "+al1.obtenerPromedio());
		
		

	}

}
