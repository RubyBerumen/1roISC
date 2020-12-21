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
}//class Triangulo


class Circulo{
	double radio;
	double area; //No sera leida desde teclado, si no calculada
	double perimetro;
	
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
		area = Math.PI*Math.pow(radio, 2);
		System.out.println("Area: " + area);
	}
	
	public void obtenerPerimetro() {
		perimetro = 2*Math.PI*radio;
		System.out.println("Perimetro: " + perimetro);
	}
}//class circulo


class Cilindro{
	double altura;
	double radio;
	double area;
	double volumen;
	
	public void lecturaAtributos() {
		System.out.println("Cilindro");
		System.out.println("Ingresa la altura: ");
		Scanner entrada = new Scanner(System.in);
		altura = entrada.nextDouble();
	}
	
	public void mostrarAtributos () {
		System.out.println("Altura: " + altura);
		System.out.println("Radio: " + radio);
	}
	
	public void obtenerArea () {
		area = 2*Math.PI*radio*(radio+altura);
		System.out.println("Área: " + area);
	}
	
	public void obtenerVolumen() {
		volumen = Math.PI*Math.pow(radio, 2)*altura;
		System.out.println("volumen: " + volumen);
	}
	
}//class cilindro


public class Ej_01_Figuras {

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
		c1.obtenerPerimetro();
		
		Circulo c2 = new Circulo ();
		c2.lecturaAtributos();
		c2.mostrarAtributos();
		c2.obtenerArea();
		c2.obtenerPerimetro();
		
		Circulo c3 = new Circulo ();
		c3.lecturaAtributos();
		c3.mostrarAtributos();
		c3.obtenerArea();
		c3.obtenerPerimetro();
		
		
		
		Cilindro ci1 = new Cilindro();
		ci1.lecturaAtributos();
		ci1.mostrarAtributos();
		ci1.obtenerArea();
		ci1.obtenerVolumen();
		
		Cilindro ci2 = new Cilindro();
		ci2.lecturaAtributos();
		ci2.mostrarAtributos();
		ci2.obtenerArea();
		ci2.obtenerVolumen();
		
		Cilindro ci3 = new Cilindro();
		ci3.lecturaAtributos();
		ci3.mostrarAtributos();
		ci3.obtenerArea();
		ci3.obtenerVolumen();
	

	}

}
