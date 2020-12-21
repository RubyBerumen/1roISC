import java.util.Scanner;

class CalculadoraCadenas{
	double resultadoOperacion=0;
	
	public String limpiarCadena(String cad) {
		String cad1="";
		for (int i=0; i<cad.length(); i++) {
			
			char caracter = cad.charAt(i);
			if(caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' ||
					caracter == '5' || caracter == '6' || caracter == '7' || caracter == '8' ||
					caracter == '9' || caracter == '0' || caracter == '+' || caracter == '*' ||
					caracter == '/' || caracter == '-' || caracter == '%' || caracter == '^') {
				
				 cad1=cad1+caracter;
			}
		}
		
		return cad1;
	}
	
	public char sacarCaracter (String cad) {
		char operacion = ' ';
		for (int i=0; i<cad.length(); i++) {
			char caracter = cad.charAt(i);
		
			if (caracter == '+' || caracter == '-' ||caracter == '*' ||caracter == '/' 
					|| caracter == '%' || caracter == '^') {
				
				operacion = caracter;
				break;
			}
			
		}//for

		return operacion;
	}
	
	public void  relizarOperacion(String cad, char operacion) {
		String partes[] = cad.split("\\"+operacion);
		
		for (int i = 0; i<partes.length; i+=1 ){
			if(i ==0 ) {
				resultadoOperacion=0+Double.parseDouble(partes[i]);
			}else {
				switch (operacion) {
					case '+' : resultadoOperacion = resultadoOperacion+Double.parseDouble(partes[i]);break;
					case '-' : resultadoOperacion = resultadoOperacion-Double.parseDouble(partes[i]);break;
					case '*' : resultadoOperacion =resultadoOperacion*Double.parseDouble(partes[i]);break;
					case '/' : resultadoOperacion = resultadoOperacion/Double.parseDouble(partes[i]);break;
					case '%' : resultadoOperacion = resultadoOperacion%Double.parseDouble(partes[i]);break;
					case '^' : resultadoOperacion = Math.pow(resultadoOperacion,Double.parseDouble(partes[i]));break;
					default:break;
				}
			} 
		}
	}
	
	
	public void resultado () {
		System.out.println("El resultado es: " + resultadoOperacion);
	
	}
	
}//Class CalculadoraCadenas




public class Examen_1 {

	public static void main(String[] args) {
		
		CalculadoraCadenas cc1 = new CalculadoraCadenas();
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa una operacion a resolver: ");
		String cad = ent.nextLine();
		
		String cadena=cc1.limpiarCadena(cad);
		cc1.relizarOperacion(cadena, cc1.sacarCaracter(cadena));
		cc1.resultado();
		
		
		
	

	}

}
