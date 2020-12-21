
//Primer paso: Importar paquete de Lectura desde teclado
import java.util.Scanner;

public class LecturaTeclado {
	public static void main(String[] args) {
		//paso 2: Preparar el flujo de lectura de datos
		Scanner entrada = new Scanner(System.in);
		
		//declracion de variables
		double primerNumero = 0.0;
		double segundoNumero = 0.0;
		double resultado = 0.0;
		
		System.out.println("Ingresa el primer numero a sumar: ");
		//paso 3: leer los datos a traves de las funciones especificas para ello
		primerNumero = entrada.nextDouble();
		
		System.out.println("Ingresa el segundo numero a sumar: ");
		segundoNumero = entrada.nextDouble();
		
		resultado = primerNumero + segundoNumero;
		
		System.out.println("Resultado de la suma: " + resultado);
		//==========================================================
		System.out.println("=======================================");
		byte edad = 0;
		String nombre = "";
		
		/*NOTA: Si despues de leer numeros de punto flotante y/o enteros, se necesita
		 * leer cadenas con la funcion nextLine(), SE DEBE LIMPIAR EL BUFFER DE LECTURA
		 */
		entrada.nextLine(); 
		
		System.out.println("Ingresa tu nombre: ");
		//nombre = entrada.next();   La funcion next()  solo lee hasta el primer espacio
		nombre = entrada.nextLine(); //nextLine() lee toda la linea, incluyendo espacios
		
		
		
		System.out.println("Hola " + nombre + ", bienvenido a la magia de la programacion");
		
		
		
	}
}










