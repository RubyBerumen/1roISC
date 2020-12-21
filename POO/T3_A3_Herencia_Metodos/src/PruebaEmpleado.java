import java.util.Scanner;

class Empleado{
	private String nombre;
	private String puesto;
	private String fechaIngreso;
	private double salarioMensual;
	
	public Empleado() {
	}
	public Empleado(String nombre, String puesto, String fechaIngreso, double salarioMensual) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.fechaIngreso = fechaIngreso;
		this.salarioMensual = salarioMensual;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	public String toString() {
		return "nombre: "+nombre+", puesto: "+puesto+", fecha de ingreso: "+fechaIngreso+", salario mensual: "+salarioMensual;
	}
	
	public void calcularSueldo(int diasTrabajados){
		int mesesComp = 0;
		int diasSobrantes = 0;
		if(diasTrabajados%30==0) {
			mesesComp=diasTrabajados/30;
		}else {
			mesesComp=diasTrabajados/28;
			diasSobrantes= diasTrabajados-mesesComp*28;
			
		}
		
		
		
		if(diasSobrantes==0) {
			System.out.println("$"+(mesesComp*salarioMensual)+" en "+mesesComp+" meses");
		}else {
			System.out.println("$"+(mesesComp*salarioMensual)+" en "+mesesComp+" meses ($"+(diasSobrantes*salarioMensual/28)+" en "+diasSobrantes+" dias).");
		}
	}
}

class Docente extends Empleado{

	public Docente(String nombre, String puesto, String fechaIngreso, double salarioMensual) {
		super(nombre, puesto, fechaIngreso, salarioMensual);
	}

	public String toString() {
		return super.toString();
	}
}
class Administrativo extends Empleado{

	public Administrativo(String nombre, String puesto, String fechaIngreso, double salarioMensual) {
		super(nombre, puesto, fechaIngreso, salarioMensual);
	}
	
	public String toString() {
		return super.toString();
	}
	
}

public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("======Docente======");
		System.out.println("nombre: ");
		String nombre = input.nextLine();
		System.out.println("puesto: ");
		String puesto = input.nextLine();
		System.out.println("fecha de ingreso a la empresa: ");
		String fechaIngreso = input.nextLine();
		System.out.println("salario mensual: ");
		double salarioMensual = input.nextDouble();
		System.out.println("dias trabajados: ");
		int diasTrabajados = input.nextInt();
		input.nextLine();
		
		Docente doc1 = new Docente(nombre, puesto, fechaIngreso, salarioMensual);
		doc1.calcularSueldo(diasTrabajados);
		
		System.out.println("======Administrativo======");
		System.out.println("nombre: ");
		nombre = input.nextLine();
		System.out.println("puesto: ");
		puesto = input.nextLine();
		System.out.println("fecha de ingreso a la empresa: ");
		fechaIngreso = input.nextLine();
		System.out.println("salario mensual: ");
		salarioMensual = input.nextDouble();
		System.out.println("dias trabajados: ");
		diasTrabajados = input.nextInt();
		input.nextLine();
		
		Docente adm1 = new Docente(nombre, puesto, fechaIngreso, salarioMensual);
		adm1.calcularSueldo(diasTrabajados);

	}

}
