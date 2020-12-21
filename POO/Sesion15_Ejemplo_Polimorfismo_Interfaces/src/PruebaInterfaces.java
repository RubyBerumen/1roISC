
/*
 * Estructura similar a las clases pero con caracteristicas muy especificas. Estas sirven definir el 
 * fucnionamiento que otras clases que las implementan, vayan a tener
 * 
 * Caracteristicas de las intefaces:
 * 	
 * 	1) Se define a traves de la palabra reservada 'interface'
 * 	2) NO debe contener atributos
 * 	3) NO permite constructores
 * 	4) SI permite metodos, estos de manera predeterminada, SON ABSTRACTOS
 * 
 * 	5) Las interfaces no se heredan, se implementan a través de la palabra reservada 'implements'
 */

interface EjemploInterfaz1{
	public abstract void metodoAbstracto1(int x); 
	public void metodoAbstracto2(); //TODOS los metodos son abstractos de forma predeterminda
	public boolean[] metodo3(String sensores[]);
}

interface EjemploInterfaz2{
	public void metodo1Interfaz2();
	public int metodo2Interfaz2();
}

interface EjemploInterfaz3{
	public void metodo1Interfaz3();
	public int metodo2Interfaz3();
}

class Uno{
}
class Dos{
}

class AplicacionInterfaces extends Uno implements EjemploInterfaz1, EjemploInterfaz3{
	//atributos
	private int x;
	private double y;
	
	//constructor(es)
	
	//getters y setter
	
	//otros metodos
	public void metodo1Interfaz3() {
		//codigo
	}
	public int metodo2Interfaz3() {return 0;}
	
	@Override
	public void metodoAbstracto1(int x) {
	}
	@Override
	public void metodoAbstracto2() {
	}
	@Override
	public boolean[] metodo3(String[] sensores) {
		return null;
	}
	
	
	//metodo toString
}




public class PruebaInterfaces {

	public static void main(String[] args) {
		
		//EjemploInterfaz1 obj1 = new EjemploInterfaz1(); //las INTERFACES NO se pueden instanciar

		AplicacionInterfaces obj2 = new AplicacionInterfaces();
		obj2.metodo1Interfaz3();
		
		
		EjemploInterfaz1 obj3 = new EjemploInterfaz1() {
			
			@Override
			public void metodoAbstracto2() {
			}
			
			@Override
			public void metodoAbstracto1(int x) {
			}
			
			@Override
			public boolean[] metodo3(String[] sensores) {
				return null;
			}
		};
		
		
	}//main
}//class Prueba





interface ConexionBD{
	public boolean conexion(String url);
	public boolean desconexion(String url);
}

class SistemaABCC implements ConexionBD{
	@Override
	public boolean conexion(String url) {
		return false;
	}

	@Override
	public boolean desconexion(String url) {
		return false;
	}
}



