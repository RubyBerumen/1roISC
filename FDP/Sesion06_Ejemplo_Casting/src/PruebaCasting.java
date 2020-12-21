
import java.util.Calendar;
import java.util.Scanner;
/* CASTING - Moldeado
 * 
 * 		Esta relacionado con los tamaños de las variables
 * 
 * 		IMPLICITO
 * 			Automaticamente
 * 
 * 		EXPLICITO
 * 			Espacificado por el programador
 * 
 */

public class PruebaCasting {
	public static void main(String[] args) {
		
		//entero
		byte varByte = 100;			//----  1byte
		short varShort = 1000;		//----	2byte
		int varInt = 9876543;		//----	4byte
		long varLong = 876543210;	//----	8byte
		
		//reales
		float varFloat = 567.89F;	//----	2byte
		double varDouble = 65432.243; //----	4bytes
		
		char varChar = '&';			//----	2byte
		
		// ================Casting IMPLICITO================
		
		varShort = varByte;
		System.out.println(varShort);
		varInt = varByte;
		System.out.println(varInt);
		varLong = varByte;
		System.out.println(varLong);
		
		//===============Casting EXPLICITO==================
		varShort = 10000;
		varInt = 9876543;
		varLong = 876543210;
		
		varByte = (byte)varInt;  //casting explicito - HAY PERDIDA DE INFORMACION
		System.out.println(varByte);
		
		System.out.println(varInt);
		varFloat = varInt;
		
		System.out.println(varFloat);
		
		varInt = (int)varDouble;
		System.out.println(varInt);
		
		
		float x = 2.3F;
		int y = 0;
		
		y = (int)x;  //casting explicito por tipo de dato
		System.out.println(y);
		
		byte dato = 64;
		char c;
		
		c = (char)dato;
		System.out.println(c);
		
		
		//=================================================
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("ingresa año de nacimiento: ");
		short año = entrada.nextShort();
		
		Calendar cal = Calendar.getInstance();
		int añoActual = cal.get(Calendar.YEAR);
		
		byte edad = (byte)(añoActual - año);
		System.out.println(edad);
		//=================================================
		
		byte n1 = 7, n2= 21, res;
		res =(byte)(n2/n1);  // toda opereacion entre enteros da como resultado un INT
		
		//  =)
		
		
		
		
		
		
	}

}
