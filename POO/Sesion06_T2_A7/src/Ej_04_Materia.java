import java.util.Scanner;

class Materia {
	String clave;
	String nombre;
	String creditos; //(en formato HorasTeoria-HorasPracica-HorasTotales)
	String semestre;
	
	
	public Materia () {}
	
	public Materia (String clave, String nombre, String creditos, String semestre) {
		this.clave=clave;
		this.nombre=nombre;
		this.creditos=creditos; 
		this.semestre=semestre;
	}
	
	public void impresionAtributos () {
		System.out.println("Clave: "+clave);
		System.out.println("Nombre: "+nombre);
		System.out.println("Creditos SATCA: "+creditos);
		System.out.println("Semestre en que se imparte: "+semestre);
	}
	
}//class Materia

public class Ej_04_Materia {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa el nombre de la materia: ");
		String nombre = ent.nextLine();
		System.out.println("Ingresa la clave: ");
		String clave = ent.nextLine();
		System.out.println("Ingresa los creditos SATCA (en formato HorasTeoria-HorasPracica-HorasTotales): ");
		String creditos = ent.nextLine();
		System.out.println("Ingresa el semestre en que se imparte: ");
		String semestre = ent.nextLine();
		
		Materia m1 = new Materia(clave,nombre,creditos,semestre);
		m1.impresionAtributos();
		
		

	}

}
