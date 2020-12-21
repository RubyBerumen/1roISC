
import java.util.Scanner;

	/*leer una calificacion desde teclado e indicar su valor de acuerdo a la
	 * siguiente tabla:
	 * 
	 * 100 - 91 -> A
	 * 90 - 81 -> B
	 * 80 - 71 -> C
	 * 70 - 60 -> D
	 * 59 - 0 -> E
	 */

public class prueba {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		byte cal = 90;
		
		if(cal>100) {
			System.out.println("Incorrecta");
		}else if(cal>=91) {
			System.out.println("A");
		}else if(cal>=81) {
			System.out.println("B");
		}else if(cal>=71) {
			System.out.println("C");
		}else if(cal>=60) {
			System.out.println("D");	
		}else if(cal>=59) {
			System.out.println("E");
		}else if(cal<0) {
			System.out.println("Incorrecto");
		}
		
		
		//=========================================
		if(cal>=91 && cal<=100)
			System.out.println("A");
		else if(cal>=81 && cal<=90)
			System.out.println("B");
		else if(cal>=71 && cal<=80)
			System.out.println("C");
		else if(cal>=60 && cal<=70)
			System.out.println("D");
		else if(cal>=0 && cal<=59)
			System.out.println("E");
		else
			System.out.println("Calificacion incorrecta");
		
		
		
	}

}
