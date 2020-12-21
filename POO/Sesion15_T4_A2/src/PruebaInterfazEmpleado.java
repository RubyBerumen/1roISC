import java.util.Scanner;
import java.util.Calendar;

interface InterfazEmpleado{
	public void calcularSalario(int diasTrabajados, double pagoPorHora);
	public void calcularAntiguedad(Fecha a�oIngreso);
}//Interface Empleado

class Fecha{
	private int dia;
	private int mes;
	private int a�o;
	
	public Fecha() {}
	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
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
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		int a�oActual=fechaActual.get(Calendar.YEAR);
		int edad = a�oActual-f1.getA�o();
		
	{return edad;}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerAp=" + primerAp + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}//class Persona


abstract class Empleado extends Persona implements InterfazEmpleado{
	private int diasTrabajados;
	private Fecha a�oDeIngreso;
	private double pagoPorHora;

	public Empleado() {}
	public Empleado(String nombre, String primerAp, String segundoAp, Fecha fechaNacimiento, int diasTrabajados,
			Fecha a�oDeIngreso, double pagoPorHora) {
		super(nombre, primerAp, segundoAp, fechaNacimiento);
		this.diasTrabajados=diasTrabajados;
		this.a�oDeIngreso=a�oDeIngreso;
		this.pagoPorHora=pagoPorHora;
	}

	public int getDiasTrabajados() {
		return diasTrabajados;}
	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;}
	public Fecha getA�oDeIngreso() {
		return a�oDeIngreso;}
	public void setA�oIngreso(Fecha a�oDeIngreso) {
		this.a�oDeIngreso = a�oDeIngreso;}
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
	public void calcularAntiguedad(Fecha a�oIngreso) {
		Calendar fechaActual = Calendar.getInstance();
		int a�oActual=fechaActual.get(Calendar.YEAR);
		int antiguedad = a�oActual-f2.getA�o();
	}

	@Override
	public String toString() {
		return "Empleado , diasTrabajados=" + diasTrabajados + ", fechaIngreso="
				+ a�oDeIngreso + ", pagoPorHora=" + pagoPorHora + " toString()=" + super.toString() + "]";
	}
	
}


class EmpleadoTiempoCompleto extends Empleado{
	
	public EmpleadoTiempoCompleto(String nombre, String primerAp, String segundoAp, String fechaNacimiento,
			String codigo, int diasTrabajados, int a�oDeIngreso, double pagoPorHora) {

	}

	@Override
	public void calcularSalario(int diasTrabajados, double pagoPorHora) {
		double salario = diasTrabajados*pagoPorHora*8;
		System.out.println("El salario es: "+ salario);
	}

}//class EmpleadoTiempoCompleto


class EmpleadoHonorarios extends Empleado{
	private double horasTrabajadas;
	
	public EmpleadoHonorarios(String nombre, String primerAp, String segundoAp, String fechaNacimiento, int diasTrabajados, int a�oDeIngreso, int horasTrabajadas2, double pagoPorHora) {}
	public EmpleadoHonorarios(String nombre, String primerAp, String segundoAp, Fecha fechaNacimiento, int diasTrabajados,
			Fecha a�oIngreso, double pagoPorHora) {
		super(nombre, primerAp, segundoAp, fechaNacimiento, diasTrabajados, a�oIngreso, pagoPorHora);
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
		System.out.println("a�o de ingreso: ");
		int a�oDeIngreso = ent.nextInt();
		System.out.println("pago por hora: ");
		double pagoPorHora = ent.nextDouble();
		ent.nextLine();
		
		EmpleadoTiempoCompleto etc1 = new EmpleadoTiempoCompleto(nombre, primerAp, segundoAp, fechaNacimiento, fechaNacimiento, diasTrabajados, a�oDeIngreso, pagoPorHora);
		System.out.println(etc1.toString());
		
		
		System.out.println("edad: "+etc1.calcularEdad()+" a�os");
		//System.out.println("salario: " + etc1.calcularSalario(diasTrabajados , pagoPorHora));
		//System.out.println("antiguedad: "+etc1.calcularAntiguedad()+" a�os");
		
		
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
		System.out.println("a�o de ingreso: ");
		a�oDeIngreso = ent.nextInt();
		System.out.println("horas trabajadas diarias: ");
		int horasTrabajadas = ent.nextInt();
		System.out.println("pago por hora: ");
		pagoPorHora = ent.nextDouble();
		ent.nextLine();
		
		EmpleadoHonorarios eh1 = new EmpleadoHonorarios (nombre, primerAp, segundoAp, fechaNacimiento, diasTrabajados, a�oDeIngreso, horasTrabajadas, pagoPorHora);
		
		System.out.println("edad: "+eh1.calcularEdad()+" a�os");
		//System.out.println("salario: "+eh1.calcularSalario(diasTrabajados, pagoPorHora, horasTrabajadas));
		//System.out.println("antiguedad: "+eh1.calcularAntiguedad()+" a�os");
		
		
		
		
		
	
	}

}
