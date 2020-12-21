
public class EjemploVariables {

	public static void main(String [] args) {
		
		/* Sintaxis para declarar una variable en Java:  
		  	tipoDeDato nombreVariable;
		 */
		
		//entero
		byte edad = 0;
		edad = 45;
		
		//edad = 200; NO cabe el 200 en una variable de tipo BYTE
		
		short edad2 = 200;
		int edad3 = 10;
		long edad4;
		
		int numeroOctal = 0561324;  //precedidos por un 0
		
		int numeroHexadecimal = 0xCAFE;
		int numeroHexadecimal2 = 0xa456F;
	
		//Punto flotante
		float temperatura = 4234.43f;
		double distancia = 0.0; 
		
		//Caracter
		char caracter1 = '6';
		char caracter2 = 'k';
		char caracter3 = '&';
		char caracter4 = '\u0064';  //Caracter en su representacion UNICODE
									// en numero HEXADECIMAL
		
		//booleanos
		boolean variableBooeleana = true;
		//======================================================================
		
		String cadena = "";
		String cadena2 = "6";
		String nombre = "Salvatore";
		System.out.println("Hola " + nombre);
		
		/* Reglas para identificadores de variables
		 * 
		 * 	1) NO espacios
		 *  2) NO iniciar con numero o caracter especial (excepto _  o  $ )
		 *  3) NO caracteres especiales (!"·%&/ .... )
		 */
		
		
		
		
	}
}











