import java.util.Scanner;
import java.util.Calendar;

interface InterfazEmpleado{
	public void calcularSalario(int diasTrabajados, double pagoPorHora);
	public void calcularAntiguedad(Fecha añoIngreso);
}//Interface Empleado

class Fecha{
	private int dia;
	private int mes;
	private int año;
	
	public Fecha() {}
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}	
}//class fecha

class Persona{
	private String nombre;
	private String primerAp;
	private String segundoAp;
	private Fecha fechaNacimiento;
	
	public Persona() {}
	public Persona(String nombre, String primerAp, String segundoAp, Fecha fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.primerAp = primerAp;
		this.segundoAp = segundoAp;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}
	public String getPrimerAp() {
		return primerAp;}
	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;}
	public String getSegundoAp() {
		return segundoAp;}
	public void setSegundoAp(String segundoAp) {
		this.segundoAp = segundoAp;}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;}
	
	Fecha f1 = new Fecha();

	public int calcularEdad() {
		Calendar fechaActual = Calendar.getInstance();
		int añoActual=fechaActual.get(Calendar.YEAR);
		int edad = añoActual-f1.getAño();
		
	{return edad;}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerAp=" + primerAp + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}//class Persona


abstract class Empleado extends Persona implements InterfazEmpleado{
	private int diasTrabajados;
	private Fecha añoDeIngreso;
	private double pagoPorHora;

	public Empleado() {}
	public Empleado(String nombre, String primerAp, String segundoAp, Fecha fechaNacimiento, int diasTrabajados,
			Fecha añoDeIngreso, double pagoPorHora) {
		super(nombre, primerAp, segundoAp, fechaNacimiento);
		this.diasTrabajados=diasTrabajados;
		this.añoDeIngreso=añoDeIngreso;
		this.pagoPorHora=pagoPorHora;
	}

	public int getDiasTrabajados() {
		return diasTrabajados;}
	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;}
	public Fecha getAñoDeIngreso() {
		return añoDeIngreso;}
	public void setAñoIngreso(Fecha añoDeIngreso) {
		this.añoDeIngreso = añoDeIngreso;}
	public double getPagoPorHora() {
		return pagoPorHora;}
	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora=pagoPorHora;
	}
	
	@Override
	public void calcularSalario(int diasTrabajados, double pagoPorHora) {
		double salario = diasTrabajados*pagoPorHora;
		System.out.println("El salario es: "+ salario);
	}

	Fecha f2 = new Fecha();
	
	@Override
	public void calcularAntiguedad(Fecha añoIngreso) {
		Calendar fechaActual = Calendar.getInstance();
		int añoActual=fechaActual.get(Calendar.YEAR);
		int antiguedad = añoActual-f2.getAño();
	}

	@Override
	public String toString() {
		return "Empleado , diasTrabajados=" + diasTrabajados + ", fechaIngreso="
				+ añoDeIngreso + ", pagoPorHora=" + pagoPorHora + " toString()=" + super.toString() + "]";
	}
	
}


class EmpleadoTiempoCompleto extends Empleado{
	
	public EmpleadoTiempoCompleto(String nombre, String primerAp, String segundoAp, String fechaNacimiento,
			String codigo, int diasTrabajados, int añoDeIngreso, double pagoPorHora) {

	}

	@Override
	public void calcularSalario(int diasTrabajados, double pagoPorHora) {
		double salario = diasTrabajados*pagoPorHora*8;
		System.out.println("El salario es: "+ salario);
	}

}//class EmpleadoTiempoCompleto


class EmpleadoHonorarios extends Empleado{
	private double horasTrabajadas;
	
	public EmpleadoHonorarios(String nombre, String primerAp, String segundoAp, String fechaNacimiento, int diasTrabajados, int añoDeIngreso, int horasTrabajadas2, double pagoPorHora) {}
	public EmpleadoHonorarios(String nombre, String primerAp, String segundoAp, Fecha fechaNacimiento, int diasTrabajados,
			Fecha añoIngreso, double pagoPorHora) {
		super(nombre, primerAp, segundoAp, fechaNacimiento, diasTrabajados, añoIngreso, pagoPorHora);
		this.horasTrabajadas=horasTrabajadas;
	}
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;}
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;}
	
	@Override
	public void calcularSalario(int diasTrabajados, double pagoPorHora) {
		double salario = diasTrabajados*pagoPorHora*horasTrabajadas;
		System.out.println("El salario es: "+ salario);
	}
	
	@Override
	public String toString() {
		return "EmpleadoTiempoParcial [horasTrabajadas=" + horasTrabajadas
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}//class EmpleadotiempoCompleto

class CalculadoraImpuestos{
	
	public void obtenerImpuestos(Empleado empleado) {
		if(empleado instanceof EmpleadoTiempoCompleto) {
			
		}else if(empleado instanceof EmpleadoHonorarios) {
			
		}
	}
	
}//class CalculadoraImpuestos



public class PruebaInterfazEmpleado {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("======Empleado tiempo completo======");
		
		System.out.println("nombre: ");
		String nombre = ent.nextLine();
		System.out.println("primer apellido: ");
		String primerAp = ent.nextLine();
		System.out.println("segundo apellido: ");
		String segundoAp = ent.nextLine();
		System.out.println("fecha de nacimiento DD/MM/AAAA: ");
		String fechaNacimiento = ent.nextLine();
		System.out.println("dias trabajados: ");
		int diasTrabajados = ent.nextInt();
		System.out.println("año de ingreso: ");
		int añoDeIngreso = ent.nextInt();
		System.out.println("pago por hora: ");
		double pagoPorHora = ent.nextDouble();
		ent.nextLine();
		
		EmpleadoTiempoCompleto etc1 = new EmpleadoTiempoCompleto(nombre, primerAp, segundoAp, fechaNacimiento, fechaNacimiento, diasTrabajados, añoDeIngreso, pagoPorHora);
		System.out.println(etc1.toString());
		
		
		System.out.println("edad: "+etc1.calcularEdad()+" años");
		//System.out.println("salario: " + etc1.calcularSalario(diasTrabajados , pagoPorHora));
		//System.out.println("antiguedad: "+etc1.calcularAntiguedad()+" años");
		
		
		System.out.println("======empleado honorario======");
		
		System.out.println("nombre: ");
		nombre = ent.nextLine();
		System.out.println("primer apellido: ");
		primerAp = ent.nextLine();
		System.out.println("segundo apellido: ");
		segundoAp = ent.nextLine();
		System.out.println("fecha de nacimiento DD/MM/AAAA: ");
		fechaNacimiento = ent.nextLine();
		System.out.println("dias trabajados: ");
		diasTrabajados = ent.nextInt();
		System.out.println("año de ingreso: ");
		añoDeIngreso = ent.nextInt();
		System.out.println("horas trabajadas diarias: ");
		int horasTrabajadas = ent.nextInt();
		System.out.println("pago por hora: ");
		pagoPorHora = ent.nextDouble();
		ent.nextLine();
		
		EmpleadoHonorarios eh1 = new EmpleadoHonorarios (nombre, primerAp, segundoAp, fechaNacimiento, diasTrabajados, añoDeIngreso, horasTrabajadas, pagoPorHora);
		
		System.out.println("edad: "+eh1.calcularEdad()+" años");
		//System.out.println("salario: "+eh1.calcularSalario(diasTrabajados, pagoPorHora, horasTrabajadas));
		//System.out.println("antiguedad: "+eh1.calcularAntiguedad()+" años");
		
		
		
		
		
	
	}

}
