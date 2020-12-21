
import java.util.Scanner;

public class Ejercicio07_Dado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que pide el lado de un dado y muestra el número de letras de la cara opuesta==");
		
			   
		System.out.println("ingresa el resultado obtenido al lanzar un dado de seis caras"); 
		int dato = entrada.nextInt();
		
		String numero = "";
		
		switch (dato) {
			case 1 : numero = "seis" ;break;
		
			case 2 : numero = "cinco" ;break;
			
			case 3 : numero = "cuatro" ;break;
			
			case 4 : numero = "tres" ;break;
			
			case 5 : numero = "dos" ;break;
			
			case 6 : numero = "uno";break;
			
			default : System.out.println("Error número incorrecto");
		}
		if(dato>=1 && dato<=6) {
			System.out.println("numero de letras de la cara opuesta:" + numero.length());
		}
		 
		
		
		
		
		
		
		
		
		
		
	

	}

}
