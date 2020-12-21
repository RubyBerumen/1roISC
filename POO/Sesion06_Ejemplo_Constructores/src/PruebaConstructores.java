import java.util.Scanner;

/*CONSTRUCTORES
 * 		Son metodos especializados que sirven para inicializar objetos con valores especificos.
 * 		
 * 		Pueden o no recibir parametros.
 * 
 *  	Existen dos tipos: PREDETERMINADO y CON PARAMETROS
 * 
 * 
 * 
 * 
 */

class Alumno{
	String numControl;
	String nombre;
	byte edad;
	byte [] calificaciones;
	
	//constructor(es)
	public Alumno() { //Constructor predeterminado (no tiene parametros)
		//Inicializa variables de instancia en sus valores predeterminados
	}
	
	public Alumno (String nc,String n,byte e, byte [] c) {
		numControl = nc;
		nombre=n;
		edad=e;
		calificaciones =c;
	}
	
	//metodos
	public void agregarMaterias() {}
	
	public boolean registrarInscripcion(String folio) {return false;}
}//class Alumno




class CuentaBancaria{
	String tipoCuenta;
	double saldoActual;
	boolean activa;
	
	//constructores
	public CuentaBancaria() {}
	public CuentaBancaria(String tc, double sa, boolean a) {
		tipoCuenta = tc;
		saldoActual = sa;
		activa = a;
	}
	
	//otros metodos
	public double calcularPagoMensual () {
		return 0;
	}
}	


class Paciente{
	String nombre;
	double peso;
	boolean citaRealizada;
	
	public Paciente() {}
	public Paciente(String nombre, double peso, boolean citaRealizada) {
		this.nombre=nombre;
		this.peso=peso;
		this.citaRealizada=citaRealizada;
		
	}
}
	


public class PruebaConstructores {

	public static void main(String[] args) {
		
		Paciente px1 = new Paciente("Ana",45,true);
		System.out.println("Nombre: " + px1.nombre);
		System.out.println("Edad: " + px1.peso);
		System.out.println("Cita realizada: " + px1.citaRealizada);
		
		
		CuentaBancaria cb1 = new CuentaBancaria("credito",1000,true);
		
		
						//invocacion al constructor PREDETDRMINADO
		Alumno a1 = new Alumno();
		System.out.println("Numero de control: "+a1.numControl);
		System.out.println("Edad: "+a1.edad);
		System.out.println("Calificaciones: "+ a1.calificaciones);
		//-------------------------------------------------------------
		
		byte cal [] = {90,100,100};
		Alumno a2 = new Alumno("01","Ruby", (byte)50,cal);
		
		
		Scanner e = new Scanner(System.in);
		System.out.println("Ingresa el numero de control");
		String x=e.nextLine();
		
		Alumno a3 = new Alumno(x,"yyy", (byte)30, cal);
	

	}

}
