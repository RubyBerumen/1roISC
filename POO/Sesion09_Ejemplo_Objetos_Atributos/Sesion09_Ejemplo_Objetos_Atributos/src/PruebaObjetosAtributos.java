

class Enfermedad{
	
	//atributos
	private String nombre;
	private String sintomas;
	private double indiceMortalidad;
	
	//constructores
	public Enfermedad() {}
	public Enfermedad(String nombre, String sintomas, double indiceMortalidad) {
		this.nombre = nombre;
		this.sintomas = sintomas;
		this.indiceMortalidad = indiceMortalidad;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public double getIndiceMortalidad() {
		return indiceMortalidad;
	}
	public void setIndiceMortalidad(double indiceMortalidad) {
		this.indiceMortalidad = indiceMortalidad;
	}
	
	public void modificarIndiceMortalidad(double dato) {
		//calcular el nuevo indice de mortalidad
	}
	public void mostrarAtributos() {
		System.out.println("Enfermedad [nombre=" + nombre + ", sintomas=" + sintomas + ", indiceMortalidad=" + indiceMortalidad
				+"]");
	}
	
}//class Enfermedad

class Paciente{

	private String nombreCompleto;
	private String citasProgramadas[];
	private Enfermedad enfermedad; //objeto como atributos
	
	public Paciente() {}
	public Paciente(String nombreCompleto, Enfermedad enfermedad) {
		this.nombreCompleto = nombreCompleto;
		this.enfermedad = enfermedad;
	}
	public Paciente(String nombreCompleto, String citasProgramadas[], Enfermedad enfermedad) {
		this.nombreCompleto = nombreCompleto;
		this.citasProgramadas = citasProgramadas;
		this.enfermedad = enfermedad;
	}
	
	public Enfermedad getEnfermedad() {return enfermedad;}
	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public void mostrarAtributos() {
		System.out.println("NOMBRE COMPLETO: " + nombreCompleto);
		
		System.out.println("CITAS PROGRAMADAS: ");
		for (int i = 0; i < citasProgramadas.length; i++) {
			System.out.println(citasProgramadas[i]);
		}
		System.out.println("ENFERMEDAD: " );
		enfermedad.mostrarAtributos();
	}
	
}


public class PruebaObjetosAtributos {
	public static void main(String[] args) {
		/*Paciente paciente1 = new Paciente();
		
		System.out.println(paciente1);
		paciente1.mostrarAtributos();
		
		paciente1 = new Paciente();
		
		System.gc();*/
		
		String citas[] = {"1", "2", "3"};
		
		
		System.out.println("---------------------PACIENTE 1--------------------");
		Enfermedad e1 = new Enfermedad();
		Paciente paciente1 = new Paciente("Luke Skywalker", citas, e1);
		paciente1.mostrarAtributos();
		
		System.out.println("-------------------PACIENTE 2-------------------");
		Enfermedad e2 = new Enfermedad("Coronavirus", "Fiebre, tos, ....", 70.4);
		Paciente paciente2 = new Paciente("Han Solo", citas, e2);
		paciente2.mostrarAtributos();
		
		
	}
}


/*	Ejercicio:  1) Modificar el programa anteirior, para agregar al paciente un vector que alamcene
 * 				sus alergias
 * 
 * 
 * 				2a) Agregar a la clase Enfermedad un atributo llamdo dosisTratamiento.
 * 				2b) Agregar a la clase Enfermedad un atributo llamdo tratamieto.
 * 
 *  			3) Ademas, modificar la clase Enfermedad para que se almacenen varios tratamientos
 *  			Por lo tanto, tambien modificar la dosis que debe corresponder para cada tratamiento
 * 
 * 			Crear 3 objetos para leer los datos, asignarlos a los objetos a traves del constructor
 * 			y mostrar toda la informacion
 */

