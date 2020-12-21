
import java.lang.Math;

public class OperacionesMatematicas {
	public static void main (String [] args) {
		
		int a = 234, b = 6534, c = 765;
		
		double res = 0;
		
		res = a + b;
		System.out.println("Resultado suma: " + res);
		res = a - b;
		System.out.println("Resultado resta: " + res);
		res = a * b;
		System.out.println("Resultado multiplicacion: " + res);
		res = a / b;
		System.out.println("Resultado division: " + res);
		res = a % b;
		System.out.println("Resultado residuo: " + res);
		
		//Funciones matematicas ================
		
		System.out.println("'a' Elevda al cuadrado: " + (a*a) );
		
		System.out.println("'a' Elevda a la decima potencia: " + ( Math.pow(a, 10)) );
		
		System.out.println("Raiz cuadrada de 'c' : " +  Math.sqrt(c) );
		
		System.out.println("Raiz cubica de 'c' : " +  Math.cbrt(c) );
	
	}
}
