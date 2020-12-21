
// Paso 1: Importar la clase BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// import java.io.*;
public class LecturaBufferedReader {
                                     // Paso 4: Quitar error de IOException
	public static void main(String[] args) throws IOException {
		// Paso 2: Preparar el flujo de entrada de datos.
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int n1;
		double n2;
		
		System.out.println("Programa que lee desde el teclado dos números, uno entero y uno de punto flotante para mostrar su suma.");
		
		System.out.println("Ingresa un numero entero: ");
		// Lectura desde teclado. Paso 3: 
		n1 = Integer.parseInt( entrada.readLine() );  //readline lee todo COMO CADENA DE CARACTERES.	
		                          /*
		                           * Por lo tanto se necesitan FUNCIONES de CONVERSION DE DATOS
		                           * 
		                           * Para convertir de String (cadena) a:
		                           * 
		                           * Entero: byte  Byte.parseByte( cadena )
		                           *         short Short.parseShort( cadena )
		                           *         int   Integer.parseInt( cadena )
		                           *         long  Long.parseLong( cadena )
		                           *         
		                           * Punto Flotante:  float   Float.parseFloat( cadena )
		                           *                  double  Double.parseDouble( cadena )
		                           */
		System.out.println("Ingresa el numero de punto flotante: ");
		
		Double.parseDouble("234234.23423");
		
		n2 = Double.parseDouble(entrada.readLine());
		
		System.out.println("Resultado de la suma: " + (n1+n2));
	}

}
