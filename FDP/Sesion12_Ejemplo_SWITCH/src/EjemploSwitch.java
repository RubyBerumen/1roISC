import java.util.Scanner;
/*ESTRUCTURA DE CONTROL SELECTIVA
 * 
 * 	Permite COMPARAR una variable con varios casos posibles, aunque solo 
 *	uno se va a cumplir
 * 
 *	Sintaxis:
 *
 *	switch(variable_a_comparar) {
 *		case dato : codigo
 *					break;
 *
 *		case dato2 : codigo
 *					break;
 *
 *		....
 *
 *		case datoN : codigo
 *					 break;
 *
 *		default : codigo
 *				  break;
 *	}
 *
 *		TIPO DE DATO DE LA VARIABLE A COMPARAR: enteros, caracter, boolean y cadenas
 *		
 */

public class EjemploSwitch {

	public static void main(String[] args) {
		
		char letra1 = 'g';
		switch(letra1) {
			case 'a': case'A' : System.out.println("vocal");break;
			case 'e': case'E' : System.out.println("vocal");break;
			case 'i': case'I' : System.out.println("vocal");break;
			case 'o': case'O' : System.out.println("vocal");break;
			case 'u': case'U' : System.out.println("vocal");break;
			default: System.out.println("Consonante");break;
		}
		
		System.out.println("1) Opcion 1");
		System.out.println("2) Opcion 2");
		System.out.println("3) Opcion 3");
		System.out.println("4) Salir");
		System.out.println("elige una opcion: ");
		Scanner entrada = new Scanner(System.in);
		byte opcion = entrada.nextByte();
		
		switch(opcion) {
			case 2: System.out.println("Elegiste opcion 2");break;
			case 4: System.out.println("Elegiste salir");break;
			case 1: System.out.println("Elegiste opcion 1");break;
			case 3: System.out.println("Elegiste opcion 3");break;
			default : System.out.println("vocal");break;
		}
		
		String letra2 = "x".toLowerCase();
		
		switch(letra2) {
		case "a": System.out.println("vocal");break;
		case "e": System.out.println("vocal");break;
		case "i": System.out.println("vocal");break;
		case "o": System.out.println("vocal");break;
		case "u": System.out.println("vocal");break;
		default: System.out.println("Consonante");break;
		}
		
		
		System.out.println("A) Area del circulo");
		System.out.println("B) Area del triangulo");
		System.out.println("C) Area del rectangulo");
		System.out.println("----------------------");
		System.out.println("d) Salir");
		System.out.println("elige una opcion: ");
		String op = entrada.next();
		switch(op.toUpperCase()) {
			case "A": System.out.println("== Obtener Area del Circulo == ");
					  System.out.println("Ingresa el radio");
					  double radio = entrada.nextDouble();
					  System.out.println("Area:" + (Math.PI*Math.pow(radio,2)) );
					  break;
		}
		

	}

}



















