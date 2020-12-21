import java.util.Scanner;

public class Examen2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una cantidad de 4 digitos:");
		int dato = entrada.nextInt();  //9876
		
		String datoCadena = String.valueOf(dato);  //"98764"
		
		String n1 = datoCadena.substring(0, 1); ///"9"
		String n2 = datoCadena.substring(1, 2);
		String n3 = datoCadena.substring(2, 3);
		String n4 = datoCadena.substring(3, 4);
		
		System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

		System.out.println(n1 + 7);
		
		int n1Entero = Integer.parseInt(n1); //9
		int n2Entero = Integer.parseInt(n2);
		int n3Entero = Integer.parseInt(n3);
		int n4Entero = Integer.parseInt(n4);
		
		n1Entero = (n1Entero + 7) % 10;
		n2Entero = (n2Entero + 7) % 10;
		n3Entero = (n3Entero + 7) % 10;
		n4Entero = (n4Entero + 7) % 10;
		
		System.out.println(n1Entero + " " + n2Entero + " " + n3Entero + " " + n4Entero);
		
		String nuevoDato = "";
		
		switch (n1Entero) {
			case 1: nuevoDato = nuevoDato + "A";break;
			case 2: nuevoDato = nuevoDato + "E";break;
			case 3: nuevoDato = nuevoDato + "I";break;
			case 4: nuevoDato = nuevoDato + "O";break;
			case 5: nuevoDato = nuevoDato + "U";break;
			default: nuevoDato = nuevoDato + n1Entero;break;
		}
			switch (n2Entero) {
			case 1: nuevoDato = nuevoDato + "A";break;
			case 2: nuevoDato = nuevoDato + "E";break;
			case 3: nuevoDato = nuevoDato + "I";break;
			case 4: nuevoDato = nuevoDato + "O";break;
			case 5: nuevoDato = nuevoDato + "U";break;
			default: nuevoDato = nuevoDato + n2Entero;break;
		}
			switch (n3Entero) {
			case 1: nuevoDato = nuevoDato + "A";break;
			case 2: nuevoDato = nuevoDato + "E";break;
			case 3: nuevoDato = nuevoDato + "I";break;
			case 4: nuevoDato = nuevoDato + "O";break;
			case 5: nuevoDato = nuevoDato + "U";break;
			default: nuevoDato = nuevoDato + n3Entero;break;
		}
			switch (n4Entero) {
			case 1: nuevoDato = nuevoDato + "A";break;
			case 2: nuevoDato = nuevoDato + "E";break;
			case 3: nuevoDato = nuevoDato + "I";break;
			case 4: nuevoDato = nuevoDato + "O";break;
			case 5: nuevoDato = nuevoDato + "U";break;
			default: nuevoDato = nuevoDato + n4Entero;break;
		}
			
		String 	cadenaCifrada = String.valueOf(nuevoDato.charAt(2)) + 
				String.valueOf(nuevoDato.charAt(3)) + 
						String.valueOf(nuevoDato.charAt(0)) +
								String.valueOf(nuevoDato.charAt(1));
		
		System.out.println("DATO CIFRADO: " + cadenaCifrada);
		
			
	}//main
}//class
