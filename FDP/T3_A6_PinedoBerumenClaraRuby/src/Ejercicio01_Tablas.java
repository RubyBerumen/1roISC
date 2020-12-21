
import java.util.Scanner;

public class Ejercicio01_Tablas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("==Programa que le muestra al usuario las tablas que desea imprimir==");
		System.out.println();
		
		
		
		System.out.println("Ingrese cuantas tablas desea imprimir: ");
		int tablas = entrada.nextInt();
		System.out.println("Hasta que multiplicación se hará la tabla? ");
		int fin = entrada.nextInt();
		
		
		for (int i=1;i<=tablas;i++) {

		  for (int x=0;x<=fin;x++) 
		     System.out.println(i + " x " + x + " = " +  (x*i));
		  		System.out.println();
		       

		}
	
		

	}

}
