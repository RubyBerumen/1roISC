import java.util.Arrays;

class Alumno{
	private String numControl;
	private String nombre;
	
	public Alumno() {}
	public Alumno(String numControl, String nombre) {
		this.numControl = numControl;
		this.nombre = nombre;
	}
	
	public void registrarInscripcion() {
		System.out.println("Inscrito correctamente");
	}
	
	public String toString() {
		return "NUMERO DE CONTROL: " + numControl + ", NOMBRE: " + nombre;
	}
}

class AlumnoEscolarizado extends Alumno{
	private String diasClase[];
	public AlumnoEscolarizado(String numControl, String nombre, String[] diasClase) {
		super(numControl, nombre);
		this.diasClase = diasClase;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", DIAS DE CLASE: " + Arrays.toString(diasClase);
	}
}

class AlumnoSemiescolarizado extends Alumno{
	private byte moduloActual;
	public AlumnoSemiescolarizado(String numControl, String nombre, byte moduloActual) {
		super(numControl, nombre);
		this.moduloActual = moduloActual;
	}

	//redefinicion o sobreescritura de metodos
	@Override
	public void registrarInscripcion() {
		byte promedioModulo = 50;
		if(promedioModulo>=70)
			System.out.println("Inscrito correctamente");
		else
			System.out.println("NO INSCRITO, DEBE RECURSAR EL MODULO!!!");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", MODULO ACTUAL: " + moduloActual;
	}
}


public class PruebaHerenciaMetodos {

	public static void main(String[] args) {
		
		System.out.println("==== Alumno ESCOLARIZADO ===");
		String dias[] = {"L", "M", "X", "J"};
		AlumnoEscolarizado ae1 = new AlumnoEscolarizado("01", "Luke", dias);
		ae1.registrarInscripcion();
		
		
		System.out.println("==== Alumno SEMI ESCOLARIZADO ===");
		AlumnoSemiescolarizado as1 = new AlumnoSemiescolarizado("02", "Leia", (byte)12);
		as1.registrarInscripcion();

		System.out.println("\n\n  -------------- IMPRESION DE OBJETOS -------------");
		
		System.out.println(ae1);
		System.out.println(as1);
		
		Alumno a1 = new Alumno();
		System.out.println(a1);
		
		
		
		Object o = new Object();
		
		//-------------------------------------------------------------------------
		Automovil auto1 = new Automovil();
		Motocicleta moto1 = new Motocicleta();
		
		System.out.println(auto1);
		System.out.println(moto1);
	}//metodo MAIN
}//class Prueba


//===============================================================================

//SUPER CLASE
class Vehiculo{
	byte cantidadRuedas;
	int tamañoMotor;
	
	public String toString() {
		return "CANTIDAD RUEDAS: " + cantidadRuedas+ ", TAMAÑO MOTOR: "+ tamañoMotor;
	}
}

//SUB CLASE
class Automovil extends Vehiculo{
	byte cantidadPuertas;
	
	public String toString() {
		return super.toString() + ", CANTIDAD DE PUERTAS: " + cantidadPuertas;
	}
}

//SUB CLASE
class Motocicleta extends Vehiculo{
	String tipoEncendido; //electronico y cran
	
	public String toString() {
		return super.toString() + ", TIPO DE ENCENDIDO: " + tipoEncendido;
	}
}




