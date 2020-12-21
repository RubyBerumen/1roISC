import java.util.Scanner;

class Empleado{
	private String nombre;
	private String puesto;
	private String fechaIngreso;
	private double salarioMensual;
	
	public Empleado() {}
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

public class Ej03_Empleado {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("---Docente---");
		System.out.println("Nombre: ");
		String nombre = ent.nextLine();
		System.out.println("Puesto: ");
		String puesto = ent.nextLine();
		System.out.println("Fecha de ingreso a la empresa: ");
		String fechaIngreso = ent.nextLine();
		System.out.println("Salario mensual: ");
		double salarioMensual = ent.nextDouble();
		System.out.println("Días trabajados: ");
		int diasTrabajados = ent.nextInt();
		ent.nextLine();
		
		Docente doc = new Docente(nombre, puesto, fechaIngreso, salarioMensual);
		doc.calcularSueldo(diasTrabajados);
		
		
		System.out.println("---Administrativo---");
		System.out.println("Nombre: ");
		nombre = ent.nextLine();
		System.out.println("Puesto: ");
		puesto = ent.nextLine();
		System.out.println("Fecha de ingreso a la empresa: ");
		fechaIngreso = ent.nextLine();
		System.out.println("Salario mensual: ");
		salarioMensual = ent.nextDouble();
		System.out.println("Días trabajados: ");
		diasTrabajados = ent.nextInt();
		ent.nextLine();
		
		Administrativo adm = new Administrativo(nombre, puesto, fechaIngreso, salarioMensual);
		adm.calcularSueldo(diasTrabajados);


		
		

	}

}
