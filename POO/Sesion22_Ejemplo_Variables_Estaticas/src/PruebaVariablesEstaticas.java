import java.util.Arrays;
import java.util.Scanner;

class Alumno{
	
	//Variables de clase o estaticas
	static byte calificaciones [] = new byte [6];
	
	
	//Variables de instancia o atributos
	private String nombre;
	private byte edad;
	
	Scanner ent = new Scanner(System.in);
	
	 private int posicion = 0;
	
	//Constructor(es)
	public Alumno() {};
	public Alumno(String nombre, byte edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters y setters
	
	//Otros métodos 
	public void metodo1() {
		ent.nextLine();
	}
	
	public void agregarCalificacion(byte cal) {
		calificaciones[posicion]=cal;
		posicion++;
	}
	
	
	//Sobreescritura de métodos
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "] " + Arrays.toString(calificaciones);
	}
}

public class PruebaVariablesEstaticas {
	
	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Ruby",(byte)18);
		System.out.println(a1);
		
		Alumno a2 = new Alumno("Clara",(byte)18);
		System.out.println(a2);
		
		System.out.println(a2.calificaciones[0]);

		System.out.println(Alumno.calificaciones[0]);
		
		
		//PRUEBA CON MODIFICACION DE LA VARIABLE ESTATICA (Calificaciones)
		Alumno a10 = new Alumno ("10",(byte)10);
		a10.agregarCalificacion((byte)50);
		
		
		Alumno a11 = new Alumno ("11",(byte)11);
		System.out.println("A11: "+ a11);
		
		Alumno a12 = new Alumno ("12",(byte)12);
		a12.agregarCalificacion((byte)100);
		System.out.println("A12: "+ a12);
		
		
		
		
		
		
	}

}
