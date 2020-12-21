

interface InterfazEmpleado{
	public void calcularSalario();
	public void obtenerAntiguedad();
}

class Fecha{}
class Persona{
	private String nombre;
	private String primerAp;
	private Fecha fechaNacimiento;
	
	public byte calcularEdad() {return 0;}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerAp=" + primerAp + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}

class Empleado extends Persona implements InterfazEmpleado{

	private String cveEmpleado;
	private int diasTrabajados;
	private Fecha fechaIngreso;
	
	@Override
	public void calcularSalario() {
		//Codigo
	}

	@Override
	public void obtenerAntiguedad() {
		//codigo
	}

	@Override
	public String toString() {
		return "Empleado [cveEmpleado=" + cveEmpleado + ", diasTrabajados=" + diasTrabajados + ", fechaIngreso="
				+ fechaIngreso + ", toString()=" + super.toString() + "]";
	}

	
	
}

class EmpleadoTiempoCompleto extends Empleado{
	private double pagoPorDia;
	
	@Override
	public void calcularSalario() {
		//OTRA FUNCIONALIDAD
	}

	@Override
	public String toString() {
		return "EmpleadoTiempoCompleto [pagoPorDia=" + pagoPorDia + ", toString()=" + super.toString() + "]";
	}

	
	
	
}

class EmpleadoTiempoParcial extends Empleado{
	private double pagoPorHora;
	private double horasTrabajadas;
	@Override
	public String toString() {
		return "EmpleadoTiempoParcial [pagoPorHora=" + pagoPorHora + ", horasTrabajadas=" + horasTrabajadas
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}

class CalculadoraImpuestos{
	
	public void obtenerImpuestos(Empleado empleado) {
		
		//Como saber cual es TC y cual es TP
		
		//FORMA 1 ------------------------------------------------------------------
		if(empleado.getClass().getName().equals("EmpleadoTiempoCompleto")) {
			
			//calculo para tiempo completo
			System.out.println(empleado);
			System.out.println("impuestos");
			
		}else if(empleado.getClass().getName().equals("EmpleadoTiempoParcial")) {
			//calculo para tiempo parcial
			System.out.println(empleado);
			System.out.println("impuestos");
			
		}
		
		//FORMA 2--------------------------------------------------------------------
		if(empleado instanceof EmpleadoTiempoCompleto) {
			//calculo para tiempo completo
			System.out.println("impuestos");
		}else if(empleado instanceof EmpleadoTiempoParcial) {
			//calculo para tiempo PARCIAL
			System.out.println("impuestos");
		}
	}
	
}

public class PruebaInterfaces {
	public static void main(String[] args) {
		EmpleadoTiempoCompleto etc1 = new EmpleadoTiempoCompleto();
		EmpleadoTiempoParcial etp1 = new EmpleadoTiempoParcial();
		
		CalculadoraImpuestos ci = new CalculadoraImpuestos();
		ci.obtenerImpuestos(etc1);
		ci.obtenerImpuestos(etp1);
	}
	
}
