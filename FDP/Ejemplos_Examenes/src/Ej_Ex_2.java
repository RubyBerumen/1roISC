import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej_Ex_2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingresa una cantidad de 4 digitos:");
		String dato = entrada.readLine();  //9876
		
		String n1 = dato.substring(0,1); ///"9"
		String n2 = dato.substring(1,2);
		String n3 = dato.substring(2,3);
		String n4 = dato.substring(3,4);
		
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
		
		if (n1Entero==1) {
			nuevoDato = nuevoDato + "A";
		}else if (n1Entero==2) {
			nuevoDato = nuevoDato + "E";
		}else if (n1Entero==3) {
			nuevoDato = nuevoDato + "I";
		}else if (n1Entero==4) {
			nuevoDato = nuevoDato + "O";
		}else if (n1Entero==5) {
			nuevoDato = nuevoDato + "U";
		}else {
			nuevoDato = nuevoDato + n1Entero;
		}
		
		
		if (n2Entero==1) {
			nuevoDato = nuevoDato + "A";
		}else if (n2Entero==2) {
			nuevoDato = nuevoDato + "E";
		}else if (n2Entero==3) {
			nuevoDato = nuevoDato + "I";
		}else if (n2Entero==4) {
			nuevoDato = nuevoDato + "O";
		}else if (n2Entero==5) {
			nuevoDato = nuevoDato + "U";
		}else {
			nuevoDato = nuevoDato + n2Entero;
		}
		
		
		if (n3Entero==1) {
			nuevoDato = nuevoDato + "A";
		}else if (n3Entero==2) {
			nuevoDato = nuevoDato + "E";
		}else if (n3Entero==3) {
			nuevoDato = nuevoDato + "I";
		}else if (n3Entero==4) {
			nuevoDato = nuevoDato + "O";
		}else if (n3Entero==5) {
			nuevoDato = nuevoDato + "U";
		}else {
			nuevoDato = nuevoDato + n3Entero;
		}
		
		
		if (n4Entero==1) {
			nuevoDato = nuevoDato + "A";
		}else if (n4Entero==2) {
			nuevoDato = nuevoDato + "E";
		}else if (n4Entero==3) {
			nuevoDato = nuevoDato + "I";
		}else if (n4Entero==4) {
			nuevoDato = nuevoDato + "O";
		}else if (n4Entero==5) {
			nuevoDato = nuevoDato + "U";
		}else {
			nuevoDato = nuevoDato + n4Entero;
		}
		
		//System.out.println(nuevoDato);
		
		String 	cadenaCifrada = String.valueOf(nuevoDato.charAt(2)) + 
				String.valueOf(nuevoDato.charAt(3)) + 
				String.valueOf(nuevoDato.charAt(0)) +
				String.valueOf(nuevoDato.charAt(1));
		
		System.out.println("DATO CIFRADO: " + cadenaCifrada );
		
		
		
		String num1 = cadenaCifrada.substring(2,3);
		String num2 = cadenaCifrada.substring(3,4);
		String num3 = cadenaCifrada.substring(0,1);
		String num4 = cadenaCifrada.substring(1,2);
				
		//System.out.println(num1+num2+num3+num4);
				
		
		String datoNuevo = "";
		
		
		if (num1.equals("A")) {
			datoNuevo = datoNuevo + "1";
		}else if (num1.equals("E")) {
			datoNuevo = datoNuevo + "2";
		}else if (num1.equals("I")) {
			datoNuevo = datoNuevo + "3";
		}else if (num1.equals("O")) {
			datoNuevo = datoNuevo + "4";
		}else if (num1.equals("U")) {
			datoNuevo = datoNuevo + "5";
		}else {
			datoNuevo = datoNuevo + num1;
		}
		
		
		if (num2.equals("A")) {
			datoNuevo = datoNuevo + "1";
		}else if (num2.equals("E")) {
			datoNuevo = datoNuevo + "2";
		}else if (num2.equals("I")) {
			datoNuevo = datoNuevo + "3";
		}else if (num2.equals("O")) {
			datoNuevo = datoNuevo + "4";
		}else if (num2.equals("U")) {
			datoNuevo = datoNuevo + "5";
		}else {
			datoNuevo = datoNuevo + num2;
		}
		
		
		if (num3.equals("A")) {
			datoNuevo = datoNuevo + "1";
		}else if (num3.equals("E")) {
			datoNuevo = datoNuevo + "2";
		}else if (num3.equals("I")) {
			datoNuevo = datoNuevo + "3";
		}else if (num3.equals("O")) {
			datoNuevo = datoNuevo + "4";
		}else if (num3.equals("U")) {
			datoNuevo = datoNuevo + "5";
		}else {
			datoNuevo = datoNuevo + num3;
		}
		
		
		if (num4.equals("A")) {
			datoNuevo = datoNuevo + "1";
		}else if (num4.equals("E")) {
			datoNuevo = datoNuevo + "2";
		}else if (num4.equals("I")) {
			datoNuevo = datoNuevo + "3";
		}else if (num4.equals("O")) {
			datoNuevo = datoNuevo + "4";
		}else if (num4.equals("U")) {
			datoNuevo = datoNuevo + "5";
		}else {
			datoNuevo = datoNuevo + num4;
		}
		
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
		
		
		System.out.println("Desea descifrar el dato?");
		System.out.println("1) Si");
		System.out.println("2) No"); 
		byte op = Byte.parseByte(entrada.readLine());
		
		
		if (op==1)
		System.out.println("DATO DESCIFRADO: " + datoDescifrado);
		
		
		
		
		
	}

}
