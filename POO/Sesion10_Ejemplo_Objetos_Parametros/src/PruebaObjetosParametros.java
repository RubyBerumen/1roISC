import java.util.Arrays;
import java.util.Scanner;

class Alumno{
	
	Scanner ent = new Scanner(System.in);
	
	private String numControl;
	private String nombre;
	private byte calificaciones[];
	private byte califExtra[];
	
	public Alumno () {}
	public Alumno(String numControl, String nombre, byte calificaciones[]) {
		this.numControl=numControl;
		this.nombre=nombre;
		this.calificaciones=calificaciones;
	}
	
	public String getNumControl() {return numControl;}
	public void setNumControl(String numControl) {
		this.numControl=numControl;
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public byte[] getCalificaciones() {return calificaciones;}
	public void setCalificaciones(byte calificaciones[]) {
		this.calificaciones=calificaciones;
	}
	
	
	public void mostrarAtributos () {
		System.out.println("-----------Datos del alumno-------------");
		System.out.println("Numero de control :"+numControl);
		System.out.println("Nombre: "+nombre);
		System.out.println("Calificaciones: "+Arrays.toString(calificaciones));
	}
	
	
	
}//class Alumno


class GeneradorKardex{
	int x;
	
	public double obtenerPromedioGeneral(Alumno a) {
		byte calif[] = a.getCalificaciones();
		
		int suma = 0;
		for (int i = 0; i<calif.length; i++){
			suma+= calif[i];
		}
		return suma/calif.length;
	}
	
	
	
}//class GeneradorKardex

public class PruebaObjetosParametros {

	public static void main(String[] args) {
		
		byte c[] = {80,75,90,50,100};
		
		Alumno a1 = new Alumno("S19070080", "Ruby", c);
		a1.mostrarAtributos();
		
		
		GeneradorKardex obj1 = new GeneradorKardex();
		System.out.println("Promedio general: " + obj1.obtenerPromedioGeneral(a1) );
		
		
		

	}

}
