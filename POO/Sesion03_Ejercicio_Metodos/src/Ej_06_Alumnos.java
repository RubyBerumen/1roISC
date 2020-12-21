import java.util.Scanner;
import java.util.Calendar;

class Alumno{
	String nombre;
	String apellidoP;
	String apellidoM;
	String numControl;
	int añoNac;
	double calificaciones [];
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Ingresa tu apellido paterno: ");
		apellidoP = entrada.nextLine();
		System.out.println("Ingresa tu apellido materno: ");
		apellidoM = entrada.nextLine();
		System.out.println("Ingresa tu nuúmero de control: ");
		numControl = entrada.nextLine();
		System.out.println("Ingresa tu año de nacimiento: ");
		añoNac = entrada.nextInt();
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: " +nombre);
		System.out.println("Apellido paterno: "+apellidoP);
		System.out.println("Apellido materno: " +apellidoM);
		System.out.println("Número de control: "+numControl);
		System.out.println("Año de nacimiento: "+añoNac);
	}
	
	public void obtenerEdad() {
		Calendar Calendario = Calendar.getInstance();
		int año = Calendario.get(Calendar.YEAR);
		int edad = año-añoNac;
		System.out.println("Edad: " + edad);
	}
	
	public void obtenerPromedio() {
		System.out.println("Obtener promedio");
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantas calificaciones desea ingresar?");
		byte numCal = entrada.nextByte();
		
		calificaciones = new double [numCal];
		double sumaCal =0;
		
		for (int i = 0; i<calificaciones.length; i++) {
			System.out.println("Ingresa la calificación "+ (i+1) +":");
			calificaciones [i]=entrada.nextDouble();
			sumaCal = sumaCal + calificaciones[i];
		}
		double promedio = sumaCal/numCal;
		System.out.println(nombre + " tu promedio es: "+ promedio);	
	}

}//class Alumno 


public class Ej_06_Alumnos {

	public static void main(String[] args) {
		
		Alumno al1 = new Alumno();
		al1.lecturaAtributos();
		al1.mostrarAtributos();
		al1.obtenerEdad();
		al1.obtenerPromedio();
		
		
		
	}

}
