import java.util.Random;
import java.util.Scanner;

/*
 * Herencia: Cuando una clase hereda atributos y metodos a otra clase
 * 
 * 	- Clase BASE y clase DERIVADA
 *  - SUPER clase y SUB clase 
 * 	- Clase PADRE y clase HIJA
 * 
 * 		TIPOS:
 * 
 * 			1) Herencia SIMPLE (cuando solo se hereda de una clase) - Java
 * 			2) Herencia MULTINIVEL
 * 			3) Herencia JERARQUICA
 * 			4) Herencia MULTIPLE (cuando se hereda de 1 o mas clases) - Python
 * 
 * 	Para indicar la herencia en java se utiliza la palabra reservada EXTENDS
 * 
 * 	GENERALIZACION y ESPECIALIZACION
 * 
 */


class Persona{
	private String nombre;
	private String primerAp;
	private String segundoAp;
	private int añoNacimiento;
	private String sexo;
	private double estatura;
	
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
	public String getSegundoAp() {
		return segundoAp;
	}
	public void setSegundoAp(String segundoAp) {
		this.segundoAp = segundoAp;
	}
	public int getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	

}

class Alumno{
	private String numControl;
	private String materias[];
	private String carrera;
	private byte promedio;
	private int añoIngreso;
}

class Empleado extends Persona{
	private double salario;
	private String turno;
	private String puesto;
	
	//Constructores
	
	//getters y setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double calcularImpuestos(int IVA) {
		return 0.0;
	}
}//class Empleado

class EmpleadoTiempoCompleto extends Empleado{
	
	private String fechaContratoIndeterminado;

	public EmpleadoTiempoCompleto() {}
	public EmpleadoTiempoCompleto(String fechaContratoIndeterminado) {
		this.fechaContratoIndeterminado = fechaContratoIndeterminado;
	}
	
	public String getFechaContratoIndeterminado() {
		return fechaContratoIndeterminado;
	}
	public void setFechaContratoIndeterminado(String fechaContratoIndeterminado) {
		this.fechaContratoIndeterminado = fechaContratoIndeterminado;
	}
	
	public void imprimirRecibosNomina() {
	}
}

class EmpleadoTiempoParcial{
	private String diasDeTrabajo[];
}

public class PruebaHerencia {
	public static void main(String[] args) {
		EmpleadoTiempoCompleto etc1 = new EmpleadoTiempoCompleto();
		EmpleadoTiempoCompleto etc2 = new EmpleadoTiempoCompleto("01/01/2001");
		
		Object o = new Object();
		
		etc1.setFechaContratoIndeterminado("10/10/10");
		etc1.setPuesto("Docente");
		etc1.setSalario(1000);
		etc1.setTurno("Matutino");
		
		etc1.setNombre("Luke Skywalker");
		
		EmpleadoTiempoCompleto etc3 = new EmpleadoTiempoCompleto();
		
		System.out.println("------------------------------------------");
		System.out.println(etc3.getNombre());  //heredados de PERSONA
		System.out.println(etc3.getPrimerAp());
		System.out.println(etc3.getSegundoAp());
		System.out.println(etc3.getAñoNacimiento());
		System.out.println(etc3.getSexo());
		System.out.println(etc3.getEstatura());
		
		System.out.println(etc3.getSalario());  //heredados de EMPLEADO
		System.out.println(etc3.getTurno());
		System.out.println(etc3.getPuesto());
		
		System.out.println(etc3.getFechaContratoIndeterminado()); //propio
		
		
	}
}


/*  NO SE PUEDE ESTABLECER HERENCIA CICLICA
class A extends B{
	
	int a;
	int b;
	
}


class B extends A{
	int x;
	int y;
}
*/






