import java.util.Scanner;


class Perro{
	
	//Atributos
	String raza;
	String colorPelaje;
	double tamaño;
	
	//Metodos
	public void ladrar() {}
	public void correr() {}
	public void corretearLadrones() {}
	
}//classPerro



class Bicicleta{
	
	//Atributos
	String color;
	String marca;
	String tipo;
	
	//Metodos
	public void rodar() {}
	public void frenar() {}
	public void subirse() {}
	
}//classBicicleta



class Auto{
	//Atributos
	String marca;
	int año;
	double tamañoMotor;
	
	//Metodos
	public void encender() {}
	public void apagar() {}
	public void cambiarVelocidad() {}
		
}//classAuto



class Computadora{
	
	//Atributos
	String color;
	String marca;
	String procesador;
	
	//Metodos
	public void prender() {}
	public void apagar() {}
	public void conectarse_a_iinternet() {}
	
}//classComputadora



class Persona{
	
	//Atributos
	String nombre;
	double altura;
	String genero;
	
	//Metodos
	public void hablar() {}
	public void respirar() {}
	public void pensar() {}
	
}//classPersona



class Libro{
	
	//Atributos
	String titulo;
	String autor;
	String editorial;
	
	//Metodos
	public void abrirlo() {}
	public void cerrarlo() {}
	public void romperlo() {}
	
}//classLibro



class Calculadora{
	
	//Atributos
	String color;
	String marca;
	String tipo;
	
	//Metodos
	public void sumar() {}
	public void restar() {}
	public void multiplicar() {}
	
}//classCalculadora



class TelefonoCelular{
	
	//Atributos
	String color;
	String marca;
	String modelo;
	
	//Metodos
	public void prender() {}
	public void apagar() {}
	public void reiniciar() {}
	
}//classTelefonoCelular




public class Ejercicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		Perro perrito1 = new Perro();
		System.out.println("Perro");
		System.out.println("Ingresa la raza: ");
		perrito1.raza = entrada.nextLine();
		System.out.println("Ingresa el color de pelaje: ");
		perrito1.colorPelaje = entrada.nextLine();
		System.out.println("Ingresa el tamaño: ");
		perrito1.tamaño = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Raza:  " + perrito1.raza);
		System.out.println("Color del pelaje:  " + perrito1.colorPelaje);
		System.out.println("tamaño: " + perrito1.tamaño);
		System.out.println();
		
		
		
		Bicicleta bici1 = new Bicicleta();
		System.out.println("Bicicleta");
		System.out.println("Ingresa el color: ");
		bici1.color = entrada.nextLine();
		System.out.println("Ingresa la marca: ");
		bici1.marca = entrada.nextLine();
		System.out.println("Ingresa el tipo: ");
		bici1.tipo = entrada.nextLine();
		
		System.out.println("Color:  " + bici1.color);
		System.out.println("Maraca: " + bici1.marca);
		System.out.println("Tipo: " + bici1.tipo);
		System.out.println();
		
		
		
		Auto auto1 = new Auto();
		System.out.println("Auto");
		System.out.println("Ingresa la marca: ");
		auto1.marca = entrada.nextLine();
		System.out.println("Ingresa el año: ");
		auto1.año = entrada.nextInt();
		System.out.println("Ingresa el tamaño del motor:");
		auto1.tamañoMotor = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Marca " + auto1.marca);
		System.out.println("Año: " + auto1.año);
		System.out.println("Tamaño del motor: " + auto1.tamañoMotor );
		System.out.println();
		
		
		
		
		Computadora comp1 = new Computadora();
		System.out.println("Computadora");
		System.out.println("Ingresa el color: ");
		comp1.color = entrada.nextLine();
		System.out.println("Ingresa la marca: ");
		comp1.marca = entrada.nextLine();
		System.out.println("ingresa el precesador: ");
		comp1.procesador = entrada.nextLine();
		
		System.out.println("Color: " + comp1.color);
		System.out.println("Marca: " + comp1.marca);
		System.out.println("Procesador: " + comp1.marca);
		System.out.println();
		
		
		
		Persona persona1 = new Persona();
		System.out.println("Persona");
		System.out.println("Ingresa el nombre:");
		persona1.nombre = entrada.nextLine();
		System.out.println("Ingresa la altura: ");
		persona1.altura = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Ingresa el genero:");
		persona1.genero = entrada.nextLine();
		
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Altura: " + persona1.altura);
		System.out.println("Genero: " + persona1.genero );
		System.out.println();
		
		
		
		Libro libro1 = new Libro();
		System.out.println("Libro");
		System.out.println("Ingresa el titulo:");
		libro1.titulo = entrada.nextLine();
		System.out.println("Ingresa el autor: ");
		libro1.autor = entrada.nextLine();
		System.out.println("Ingresa la editorial:");
		libro1.editorial = entrada.nextLine();
		
		System.out.println("Titulo: " + libro1.titulo);
		System.out.println("Autor: " + libro1.autor);
		System.out.println("Editorial: " + libro1.editorial);
		System.out.println();
		
		
		
		Calculadora cal1 = new Calculadora();
		System.out.println("Calculadora");
		System.out.println("Ingresa la marca:");
		cal1.marca = entrada.nextLine();
		System.out.println("Ingresa el color:");
		cal1.color = entrada.nextLine();
		System.out.println("Ingresa el tipo:");
		cal1.tipo = entrada.nextLine();
		
		System.out.println("Marca: " + cal1.marca);
		System.out.println("Color: " + cal1.color);
		System.out.println("Tipo: " + cal1.tipo);
		System.out.println();
		
		
		
		TelefonoCelular cel1 = new TelefonoCelular();
		System.out.println("Telefono Celular");
		System.out.println("Ingresa la marca:");
		cel1.marca = entrada.nextLine();
		System.out.println("Ingresa el color:");
		cel1.color = entrada.nextLine();
		System.out.println("Ingresa el modelo:");
		cel1.modelo = entrada.nextLine();
		
		System.out.println("Marca: " + cel1.marca);
		System.out.println("Color: " + cel1.color);
		System.out.println("Modelo: " + cel1.modelo);
	
				

	}

}
