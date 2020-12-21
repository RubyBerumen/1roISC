
class Persona{
	private String nombre;
	private String primerAp;
	
	public Persona() {}

	public Persona(String nombre, String primerAp) {
		this.nombre = nombre;
		this.primerAp = primerAp;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerAp() {
		return primerAp;
	}
	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;
	}
	
	//otros metodos
	
}

class Paciente extends Persona{
	private String alergias[];
	private String fechaProximaCita;
	private double temperatura;
	
	public Paciente(){}

	public Paciente(String[] alergias, String fechaProximaCita, double temperatura, String nombre, String primerAp) {
		super(nombre, primerAp);
		this.alergias = alergias;
		this.fechaProximaCita = fechaProximaCita;
		this.temperatura = temperatura;
	}

	public String[] getAlergias() {
		return alergias;
	}
	public void setAlergias(String[] alergias) {
		this.alergias = alergias;
	}
	public String getFechaProximaCita() {
		return fechaProximaCita;
	}
	public void setFechaProximaCita(String fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	//otros metodos
}

class PacienteAfiliado extends Paciente{
	private boolean activo;

	public PacienteAfiliado(boolean activo, String[] alergias, String fechaProximaCita, 
											double temperatura, String nombre, String primerAp) {
		
		super(alergias, fechaProximaCita, temperatura, nombre, primerAp);
		this.activo = activo;
	}
}

public class PruebaHerenciaConstructores {

	public static void main(String[] args) {
		
		Paciente obj1 = new Paciente();
		obj1.setNombre("Luke Skywalker");
		
		String a[] = {"A1", "A2", "A3"};
		Paciente obj2 = new Paciente(a, "01/01/2000", 37.0, "Han", "Solo");
		
		System.out.println("=== Datos del PACIENTE 2 ===");
		System.out.println("NOMBRE: " + obj2.getNombre());
		System.out.println("PRIMER AP.: " + obj2.getPrimerAp());
		System.out.println("ALERGIAS: " + obj2.getAlergias()[1]);
		System.out.println("FECHA CITA: " + obj2.getFechaProximaCita());
		System.out.println("TEMPERTATURA: " + obj2.getTemperatura());
		
		PacienteAfiliado pa1 = new PacienteAfiliado(true, a, "02/02/02", 37.5, "Leia", "Organa");
		
		System.out.println("=== Datos del PACIENTE 3 (AFILIADO) ===");
		System.out.println("NOMBRE: " + pa1.getNombre());
		System.out.println("PRIMER AP.: " + pa1.getPrimerAp());
		//System.out.println("ALERGIAS: " + pa1.getAlergias()[1]);
		System.out.println("FECHA CITA: " + pa1.getFechaProximaCita());
		System.out.println("TEMPERTATURA: " + pa1.getTemperatura());
		
	}

}



