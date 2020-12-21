import java.util.Scanner;

class Calculadora{
	
	double resultadoOperacion=0;
	
	public String limpiarCadena(String cad) {
		String cad1="";
		for (int i=0; i<cad.length(); i++) {
			
			char caracter = cad.charAt(i);
			byte caracteres = (byte)caracter;
			if  ((caracteres > 46 && caracteres<58) || caracteres == 37 ||
					(caracteres > 41 && caracteres<44) || caracteres == 45) {
				
				cad1=cad1+caracter;
				
			}
		}
		
		return cad1;
	}//limpiar cadena	
	
	
	public char sacarCaracter (String cad) {
		char operacion = ' ';
		for (int i=0; i<cad.length(); i++) {
			char caracter = cad.charAt(i);
		
			if (caracter == '+' || caracter == '-' ||caracter == '*' ||caracter == '/' 
					|| caracter == '%' ) {
				
				operacion = caracter;
				break;
			}
			
			
		}//for

		return operacion;
	}
	
	public void  relizarOperacion(String cad, char operacion) {
		
		try {
			String partes[] = cad.split("\\"+operacion);
			String num1 = partes[0]; 
			String num2 = partes[1]; 
			
			switch (operacion) {
				case '+' : resultadoOperacion = Double.parseDouble(num1) + Double.parseDouble(num2) ;break;	
				case '-' : resultadoOperacion = Double.parseDouble(num1) - Double.parseDouble(num2) ;break;
				case '*' : resultadoOperacion = Double.parseDouble(num1) * Double.parseDouble(num2) ;break;
				case '/' : resultadoOperacion = Double.parseDouble(num1) / Double.parseDouble(num2) ;break;
				case '%' : resultadoOperacion = Double.parseDouble(num1) % Double.parseDouble(num2) ;break;
				default:break;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Debes ingresar números");
		} catch (NumberFormatException e) {
			System.out.println("Debes ingresar números");
		}
		
		
		
	}//realizarOperacion
	
	
	public void resultado () {
		System.out.println("El resultado es: " + resultadoOperacion);
	}
	
}//Class CalculadoraCadenas

public class Ej_01_Calculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa una operacion a resolver: ");
		String cad = ent.nextLine();
		
		String cadena=c1.limpiarCadena(cad);
		c1.relizarOperacion(cadena, c1.sacarCaracter(cadena));
		c1.resultado();
		
		
		
		
		
		
		

	}

}
