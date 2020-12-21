import java.util.Scanner;

public class Ej_Ex_2B {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una cantidad de 4 digitos:");
		String dato = entrada.nextLine();  //9876
		
		String n1 = dato.substring(0, 1); ///"9"
		String n2 = dato.substring(1, 2);
		String n3 = dato.substring(2, 3);
		String n4 = dato.substring(3, 4);
		
		int n1Entero = Integer.parseInt(n1); //9
		int n2Entero = Integer.parseInt(n2);
		int n3Entero = Integer.parseInt(n3);
		int n4Entero = Integer.parseInt(n4);
		
		n1Entero = (n1Entero + 7) % 10;
		n2Entero = (n2Entero + 7) % 10;
		n3Entero = (n3Entero + 7) % 10;
		n4Entero = (n4Entero + 7) % 10;
		
		//System.out.println(n1Entero + " " + n2Entero + " " + n3Entero + " " + n4Entero);
		
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
		

		System.out.println("DATO CIFRADO: " + cadenaCifrada );
		
		System.out.println("Desea descifrar el dato?");
		System.out.println("1) Si");
		System.out.println("2) No");
		byte op = entrada.nextByte();
		
		switch (op) {
			case 1 : 
				
				String num1 = cadenaCifrada.substring(2,3);
				String num2 = cadenaCifrada.substring(3,4);
				String num3 = cadenaCifrada.substring(0,1);
				String num4 = cadenaCifrada.substring(1,2);
				
				//System.out.println(num1+num2+num3+num4);
				
				String datoNuevo = "";
				
				switch (num1) {
				case "A" : datoNuevo = datoNuevo + "1";break;
				case "E" : datoNuevo = datoNuevo + "2";break;
				case "I" : datoNuevo = datoNuevo + "3";break;
				case "O" : datoNuevo = datoNuevo + "4";break;
				case "U" : datoNuevo = datoNuevo + "5";break;
				default: datoNuevo = datoNuevo + num1;break;
				};
				
				switch (num2) {
				case "A" : datoNuevo = datoNuevo + "1";break;
				case "E" : datoNuevo = datoNuevo + "2";break;
				case "I" : datoNuevo = datoNuevo + "3";break;
				case "O" : datoNuevo = datoNuevo + "4";break;
				case "U" : datoNuevo = datoNuevo + "5";break;
				default: datoNuevo = datoNuevo + num2;break;
				};
				
				switch (num3) {
				case "A" : datoNuevo = datoNuevo + "1";break;
				case "E" : datoNuevo = datoNuevo + "2";break;
				case "I" : datoNuevo = datoNuevo + "3";break;
				case "O" : datoNuevo = datoNuevo + "4";break;
				case "U" : datoNuevo = datoNuevo + "5";break;
				default: datoNuevo = datoNuevo + num3;break;
				};
				
				switch (num4) {
				case "A" : datoNuevo = datoNuevo + "1";break;
				case "E" : datoNuevo = datoNuevo + "2";break;
				case "I" : datoNuevo = datoNuevo + "3";break;
				case "O" : datoNuevo = datoNuevo + "4";break;
				case "U" : datoNuevo = datoNuevo + "5";break;
				default: datoNuevo = datoNuevo + num3;break;
				};
				
				//System.out.println(datoNuevo);
				
				
				int num1Entero = Integer.parseInt(datoNuevo.substring(0,1)); //9
				int num2Entero = Integer.parseInt(datoNuevo.substring(1,2));
				int num3Entero = Integer.parseInt(datoNuevo.substring(2,3));
				int num4Entero = Integer.parseInt(datoNuevo.substring(3,4));
				
				num1Entero = (num1Entero + 3) % 10;
				num2Entero = (num2Entero + 3) % 10;
				num3Entero = (num3Entero + 3) % 10;
				num4Entero = (num4Entero + 3) % 10;
				
				String num1Str = Integer.toString(num1Entero);
				String num2Str = Integer.toString(num2Entero);
				String num3Str = Integer.toString(num3Entero);
				String num4Str = Integer.toString(num4Entero);
				
				
				String datoDescifrado = num1Str+num2Str+num3Str+num4Str;
				
				System.out.println("DATO DESCIFRADO: " + datoDescifrado);
				
				
		
		}//switch
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
