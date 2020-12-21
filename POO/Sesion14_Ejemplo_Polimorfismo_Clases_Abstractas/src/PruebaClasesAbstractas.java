
/*	POLIMORFISMO - Varias formas
 * 
 * 	En programacion OO, el comportamiento que tienen algunas variables de referencia en un contexto
 * 	determinado
 * 
 * 	Una forma muy basica y general en Java es la sobrecarga de operadores
 * 
 * 		El operador  '+' se comporta de una manera si se utiliza con valores enteros, y de otra forma
 * 		si se utiliza con cadenas
 * 			3 + 3
 * 			"3" + "3"
 * 
 * 	PARA APLICAR EL POLIMORSIMO DE MANERA ESTRICTA Y CORRECTA EN JAVA, se debe implementar con HERENCIA y a traves de
 * 	CLASES ABSTRACTAS e INTERFACES
 * 
 * 	========= CLASES ABSTRACTAS ============
 * 
 * 		Son similares a una clase normal en Java, pero pueden contener:
 * 			
 * 			1) Atributos
 * 			2) Metodos "normales"
 * 			3) DEBEN tener al menos UN METODO ABSTRACTO (aquel metodo que no tiene cuerpo) 
 * 
 * 			NOTA: Las clases abstractas NO SE PUEDEN INSTANCIAR
 */

class X{}

class ClaseNormal1{
	//atributos
	//constructo(es)
	//getters y setters
	//otros metodos
	//metodos sobreescritos, por ejemplo toString()
}

class ClaseNormal2{
	int x;
	boolean b;
	public String metodo1() {
		return null;
	}
}

abstract class ClaseAbstracta1{
	double y;
	String z;
	
	public void metodoNormal1(int a) {
		System.out.println("metodo normal de clase Abstracta");
	}
	public abstract void metodoAbstracto1(); //metodo abstracto que no define su funcionalidad, es decir NO TIENE CUERPO
		
}

class ClaseNormal3 extends ClaseNormal2{
	//codigo
}

class ClaseNormal4 extends ClaseAbstracta1{
	String cad;
	
	public void metodoAbstracto1() {
		//codigo para la funcionalidad dentro de la clase ClaseNormal4
		System.out.println("Codigo de clase 4");
	}
}

class ClaseNormal5 extends ClaseAbstracta1{
	String cad;
	
	public void metodoAbstracto1() {
		//codigo para la funcionalidad dentro de la clase ClaseNormal5
		System.out.println("Codigo de clase 5");
	}
}

//===========================================================================================
abstract class Empleado{
	String nombre;
	
	public void calcularImpuestos() {
		System.out.println("Codigo para calcular impuestos");
	}
	
	public abstract void calcularSalario(double precioHora);	
}

class EmpleadoTiempoCompleto extends Empleado{
	
	//metodo IMPLEMENTAR de la clase Empleado
	public void calcularSalario(double ph) {
		//Codigo para calcular salario con datos de un tiempo COMPLETO
	}
	
	//metodo SOBRECARGA de la clase EmpleadoTiempoCompleto
	public void calcularSalario(double ph, int x) {
		//Codigo para calcular salario con datos de un tiempo COMPLETO
	}
	
	//metodo SOBREESCRITO de la clase Empleado
	@Override
	public void calcularImpuestos() {
		System.out.println("Codigo para calcular impuestos, CON NUEVA FUNCIONALIDAD ");
	}
}

class EmpleadoTiempoParcial extends Empleado{
	
	//metodo implementado de la clase Empleado
	public void calcularSalario(double precioHora) {
		//Codigo para calcular salario con datos de un tiempo PARCIAL
	}
}

public class PruebaClasesAbstractas {
	public static void main(String[] args) {
		System.out.println(new X().toString());
		
		ClaseNormal2 obj1 = new ClaseNormal2();
		obj1.metodo1();
		
		//ClaseAbstracta1 obj2 = new ClaseAbstracta1(); // NO SE PUEDE INSTANCIAR POR SER ABSTRACTA

		ClaseNormal4 cn4 = new ClaseNormal4();
		cn4.metodoAbstracto1();
		
		
		ClaseNormal5 cn5 = new ClaseNormal5();
		cn5.metodoAbstracto1();
		
	}

}






