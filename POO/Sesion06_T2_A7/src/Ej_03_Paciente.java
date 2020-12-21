import java.util.Scanner;

class Paciente {
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	double peso;
	byte edad;
	String ultimaVisita;
	//String alergias[]; //(Debera ser un arreglo de tipo cadena que contenga los
	//medicamentos a los cuales es alergico el paciente)
	
	public Paciente () {}
	
	public Paciente (String nom, String ap, String am, double peso, byte edad, String uv) {
		nombre=nom;
		apellidoPaterno=ap;
		apellidoMaterno=am;
		this.peso=peso;
		this.edad=edad;
		ultimaVisita=uv;
		//alergias = al;
	}
	
	public void imprimirDatos () {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido paterno: "+apellidoPaterno);
		System.out.println("Apellido materno: "+apellidoMaterno);
		System.out.println("Peso: "+peso);
		System.out.println("Edad: "+edad);
		System.out.println("Ultima visita: "+ultimaVisita);
		
	}
	
}//class Paciente

public class Ej_03_Paciente {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = ent.nextLine(); 
		System.out.println("Ingresa tu apellido paterno: ");
		String apellidoP = ent.nextLine(); 
		System.out.println("Ingresa tu apellido materno: ");
		String apellidoM = ent.nextLine();
		System.out.println("Ingresa tu peso: ");
		double peso = ent.nextDouble();
		System.out.println("Ingresa tu edad: ");
		byte edad = ent.nextByte();
		System.out.println("Ingresa tu ultima visita: ");
		String ultimaVisita = ent.nextLine();
		ent.nextLine();
		
		System.out.println("Alergias");
		System.out.println("Cuantas vas a ingresar?");
		byte num = ent.nextByte();
		
		Paciente px1 = new Paciente(nombre, apellidoP, apellidoM, peso, edad, ultimaVisita);
		px1.imprimirDatos();
		
		

	}

}
