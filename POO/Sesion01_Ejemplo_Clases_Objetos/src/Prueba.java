

class Perro{
	
	//Atributos o Variables de instancia  -->caracteristicas
	String raza;
	String colorPelaje;
	double tamaño;
	boolean estaVacunado;
	
	//metodos -->comportamiento del objeto
	public void ladrar() {
		//codigo
	}
	
	public void correr() {
		
	}
	
	public void corretearLadrones() {
		
	}
	
}//classPerro

class Auto{
	//Atributos
	String marca;
	int año;
	double tamañoMotor;
	
	//Metodos
	public void encender() {}
	public void apagar() {}
	public void cambiarVelocidad() {}
	
	
}





public class Prueba {

	public static void main(String[] args) {
		System.out.println("==Pruebas de cracion de objetos==");
		
		/*Sintaxis para instanciar un objeto:
		 * 
		 * 		NombreClase		nombreObjeto = new NombreClase();
		 * 
		 */
		
		Perro perrito1 = new Perro();
		perrito1.raza = "Doberman";
		perrito1.colorPelaje = "Negro";
		perrito1.tamaño = 70;
		perrito1.estaVacunado = true;

		
		
		Perro perrito2 = new Perro();
		Perro perrito3 = new Perro();
		
		System.out.println(perrito1);
		
		Auto auto1 = new Auto();
		
		//=========================================================
		/*Para acceder a los miembros de una clase (atributos y metodos):
		 * 
		 * objeto.atributo
		 * 
		 * objeto.metodo()
		 * 
		 */
		System.out.println(perrito1.raza);
		System.out.println(perrito1.colorPelaje);
		System.out.println(perrito1.tamaño);
		System.out.println(perrito1.estaVacunado);
		
		
		
		
		
		
		
		
		
		

	}

}
