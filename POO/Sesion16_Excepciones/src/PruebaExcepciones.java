import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * EXCEPCIONES - Son errores que aparecen en tiempo de ejecucion, es un evento inseperado que hace
 * 				que nuesto programa termine de forma abrupta.
 * 
 * Para evitar esa terminacion repentina del programa, estas excepciones deben ser capturadas
 * y gestionadas
 * 
 * 
 * Para la gestion de excepciones se debe utilizar un bloque especifico denominado try-catch-finally
 * 
 * 	Sintaxis:   try{
 * 					
 * 					//linea(s) que pudiesen generar una excepcion
 * 
 * 				}catch( excepcione(s) a ser capturadas ){
 * 
 * 				 	//codigo que se ejecuta si se genera una excepcion en el try
 * 
 * 				}finally{
 * 
 * 				}
 * 
 */

public class PruebaExcepciones {

	public static void main(String[] args) {
		
		String cad = "Magia magia";
		
		try {
			System.out.println(cad.charAt(10));
		
		}catch(StringIndexOutOfBoundsException ex) {
			System.out.println("¡¡¡La posicion a la cual desea acceder, no existe!!!");
			
			System.err.println("\n" + ex.getMessage() );
			
			ex.printStackTrace();
			int x = 0;
		}finally {
			System.out.println("CODIGO QUE SE EJECUTA CON o SIN EXCEPCION");
		}
		
		
		
		try {
			int edades[] = new int[10];
			System.out.println(edades[10]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("¡¡¡La posicion a la cual desea acceder, no existe!!!");
		}
		
		System.out.println("---------------------SI CONVENIENTE------------------------------");
		try {
			//System.out.println(10/0);
			
			System.out.println(Integer.parseInt("7x"));
		
			
		}catch (ArithmeticException e) {
			System.out.println("¡¡¡NO se puede dividir entre CERO!!!");
		}catch (NumberFormatException e) {
			System.err.println("No se puede convertir");
		}
		
		
		System.out.println("------------------NO TAN CONVENIENTE --------------------");
		try {
			//System.out.println(10/0);
			
			System.out.println(Integer.parseInt("7x"));
		
			
		}catch (ArithmeticException | NumberFormatException | StringIndexOutOfBoundsException e) {
			System.out.println("ERROR");
		}
		
		
		System.out.println("-------------------- FORMA NO CONVENIENTE --------------------------");
		try {
			System.out.println(10/0);
			
			System.out.println(Integer.parseInt("7x"));
		
		}catch (Exception e) {
			System.out.println("Error.");
		}
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		try {
			byte e = entrada.nextByte();
			
			
		} catch (InputMismatchException e) {
			System.out.println("¡¡¡DEBES INGRESAR UN NUMERO ENTERO!!!");
		}
		
		
		
	}

}
