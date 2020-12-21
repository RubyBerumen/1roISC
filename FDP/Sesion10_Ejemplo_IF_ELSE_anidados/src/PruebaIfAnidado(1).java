import java.util.Scanner;

public class PruebaIfAnidado {
	public static void main(String[] args) {
		
		System.out.println("========== IF ELSE Internos ===============");
		// IF interno
		// Aplicar 5% decsuento si venta total excede 5000, ademas su tiene tarjeta de descuent
		// aplicar un 3% extra
		
		double ventaTotal = 5000.00;
		boolean tarjeta = true;
		
		if(ventaTotal>5000) {
			ventaTotal = ventaTotal * 0.95;
			
			//ventaTotal = ventaTotal - ( ventaTotal * (5/100) );
			
			System.out.println("Total con 5% desuento: " + ventaTotal );
			
			if(tarjeta) {
				ventaTotal = ventaTotal * 0.97;
				System.out.println("Total con 3% desuento EXTRA: " + ventaTotal );
			}
		}else {
			System.out.println("Total SIN descuentos: " + ventaTotal);
		}
		
		System.out.println("========== IF ELSE ANIDADOS ===============");
		
		// Programa que indique si una letra leida desde teclado es VOCAL o CONSONANTE
		
		String letra = "s";
		char l = 's';
		/* POSIBLES SOLUCIONES:
		 * 
		 * 	1) A traves de caracteres
		 */
		Scanner e = new Scanner(System.in);
		System.out.println("Ingresa una letra");
		String x = e.next().toLowerCase();
		
		l = x.toLowerCase().charAt(0);
		
		if(l == 'a' || l=='e' || l=='i' || l=='o' || l=='u' || l =='A') {
			System.out.println("vocal");
		}else {
			System.out.println("consonantes");
		}
		
		
		/* POSIBLES SOLUCIONES:
		 * 
		 * 	2) A traves de CADENAS
		 */
		System.out.println("Ingresa otra letra");
		x = e.next();
		
		if(x.equalsIgnoreCase("A") || x.equalsIgnoreCase("e") ||x.equalsIgnoreCase("i") 
				||x.equalsIgnoreCase("o") ||x.equalsIgnoreCase("U") ) {
			System.out.println("vocal");
		}else {
			System.out.println("consonante");
		}
		
		
		System.out.println("========== IF ===============");
		/* POSIBLES SOLUCIONES:
		 * 
		 * 	3) A traves de IF's  "SEPARADOS"
		 */
		String y = "E";
		
		if(y.equalsIgnoreCase("a")) {
			System.out.println("vocal");
		}
		
		if(y.equalsIgnoreCase("e")) {
			System.out.println("vocal");
		}
		
		if(y.equalsIgnoreCase("i")) {
			System.out.println("vocal");
		}
		
		if(y.equalsIgnoreCase("o")) {
			System.out.println("vocal");
		}
		
		if(y.equalsIgnoreCase("u")) {
			System.out.println("vocal");
		}else {
			System.out.println("CONSONANTE");
		}
		
		System.out.println("========== IF-ELSE ANIDADO ==============");
		/* POSIBLES SOLUCIONES:
		 * 	4) A traves de IF's  "ANIDADOS"
		 */

		if(y.equalsIgnoreCase("a")) {
			System.out.println("vocal");
		}else if(y.equalsIgnoreCase("e")) {
			System.out.println("vocal");
		}else if(y.equalsIgnoreCase("i")) {
			System.out.println("vocal");
		}else if(y.equalsIgnoreCase("o")) {
			System.out.println("vocal");
		}else if(y.equalsIgnoreCase("u")) {
			System.out.println("vocal");
		}else {
			System.out.println("CONSONANTE");
		}
		
		
		
	}//main
}//class
























