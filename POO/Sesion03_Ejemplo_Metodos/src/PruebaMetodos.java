import java.util.Scanner;

class Triangulo{
	//atributos o variables de instancia
	double base; 
	double altura;
	
	//metodos
	public void lecturaAtributos(){
		System.out.println("TRIANGULO");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la base: ");
		base = entrada.nextDouble();
		System.out.println("Ingresa la altura: ");
		altura = entrada.nextDouble();
	}
	public void mostrarAtributos() {
		System.out.println("Datos del triangulo: ");
		System.out.println("Base: "+ base);
		System.out.println("Altura: "+ altura);
	}
	
	public void obtenerArea () {
		System.out.println("Area: " + (base*altura)/2);
	}
	
	
}//class triangulo


class Circulo{
	double radio;
	double area; //No sera leida desde teclado, si no calculada
	
	public void lecturaAtributos() {
		System.out.println("Circulo");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el radio: ");
		radio = entrada.nextDouble();
	}
	
	public void mostrarAtributos() {
		System.out.println("Datos del circulo");
		System.out.println("Radio: " + radio);
	}
	
	public void obtenerArea() {
		area = Math.pow(radio, 2);
		System.out.println("Area: " + area);
	}
	
}


public class PruebaMetodos {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		t1.lecturaAtributos();
		t1.obtenerArea();
		
		Triangulo t2 = new Triangulo();
		t2.lecturaAtributos();
		t2.obtenerArea();
		
		Triangulo t3 = new Triangulo();
		t3.lecturaAtributos();
		t3.obtenerArea();
		
		
		
		Circulo c1 = new Circulo ();
		c1.lecturaAtributos();
		c1.mostrarAtributos();
		c1.obtenerArea();
		
		Circulo c2 = new Circulo ();
		c2.lecturaAtributos();
		c2.mostrarAtributos();
		c2.obtenerArea();
		
		Circulo c3 = new Circulo ();
		c3.lecturaAtributos();
		c3.mostrarAtributos();
		c3.obtenerArea();
		
		System.out.println("Sumatoria de aeras: "+ (c1.area+c2.area+c3.area));
		
		
		
		
		
	}

}
