import java.util.Scanner;

class Calculadora{
	private double resultadoOperacion=0;
	private boolean error = false;
	
	public Calculadora() {}
	public Calculadora(double resultadoOperacion) {
		this.resultadoOperacion = resultadoOperacion;
	}

	public double getResultadoOperacion() {
		return resultadoOperacion;
	}
	public void setResultadoOperacion(double resultadoOperacion) {
		this.resultadoOperacion = resultadoOperacion;
	}
	public boolean getError () {
		return error;
	}
	
	
	public String limpiarCadena(String cad) {
		String cad1="";
		for (int i=0; i<cad.length(); i++) {
			
			char caracter = cad.charAt(i);
			byte caracteres = (byte)caracter;
			if  ((caracteres > 46 && caracteres<58) || caracteres == 37 ||
					(caracteres > 41 && caracteres<44) || caracteres==45) {
				
				cad1=cad1+caracter;
				
			}
				
		}
		
		return cad1;
	}//limpiar cadena
	
	
	public char sacarCaracter (String cad) {
		char operacion = '0';
		boolean salir = false;
		
		int i = 0;
		while (i<cad.length() && salir == false) {
		//for ( i=0; i<cad.length(); i++) {
			char caracter = cad.charAt(i);
			i++;
		
			if (caracter == '+' || caracter == '-' ||caracter == '*' ||caracter == '/' 
					|| caracter == '%' ) {
				operacion = caracter;
				salir = true;
				break;
			}else break;
			
		//}//for
		}

		return operacion;
	}
	
	
	public void  relizarOperacion(String cad, char operacion) {
		String partes[] = cad.split("\\"+operacion);
		error = false;
		
		for (int i = 0; i<2; i++ ){
			try {
				int t = 1/(1-partes.length);
			} catch (Exception e) {
				System.out.println("No es una operacion");
				error = true;
				break;
			}
			
			
			if(i ==0 ) {
				try {
					resultadoOperacion=Double.parseDouble(partes[i]);
				} catch (NumberFormatException e) {
					System.out.println("Debes ingresar números");
					error = true;
					break;
					
				}
				
			}else {
				
				try {
					switch (operacion) {
					case '+' : resultadoOperacion = resultadoOperacion+Double.parseDouble(partes[i]);break;
					case '-' : resultadoOperacion = resultadoOperacion-Double.parseDouble(partes[i]);break;
					case '*' : resultadoOperacion = resultadoOperacion*Double.parseDouble(partes[i]);break;
					case '/' : 
						try {
							if(Double.parseDouble(partes[i])==0) {
								resultadoOperacion=Math.round(resultadoOperacion)/0;
							}else {
							 resultadoOperacion=resultadoOperacion/Double.parseDouble(partes[i]);
							}

						} catch (ArithmeticException e) {
							System.out.println("No se puede dividir entre cero");
							error=true;
							break;
						}
					case '%' : resultadoOperacion = resultadoOperacion%Double.parseDouble(partes[i]);break;
					
				}//switch
					
				} catch (NumberFormatException e) {
					System.out.println("No puedes poner dos operadores seguidos");
					error = true;
					break;
				}
				

			}//else
		}
	}
	
	public String toString() {
		return "El resultado es: " + resultadoOperacion;
	}
	
	
}//Class Calculadora


public class Ej01_Calculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		Scanner ent = new Scanner(System.in);

		boolean salir = false;
		char op = '0';
		int cont = 0;
		
		do {
			
			if (cont>0) {
				System.out.println("Deseas ingresar otra operacion?");
				System.out.println("1) Si");
				System.out.println("2) No");
				op = ent.next().charAt(0);
				
				if (op=='2') {
					salir = true;
					break;
				}else if(op != '1') {
					System.out.println("Opción inválida! ");
					continue;
				}
				
			}
		
		System.out.println("Ingresa una operacion a resolver: ");
		String cad = ent.nextLine();
		
		String cadena=c1.limpiarCadena(cad);
		c1.relizarOperacion(cadena, c1.sacarCaracter(cadena));
		
		if (!c1.getError()) {
			System.out.println(c1);
		}
		
		
		cont++;
		
		}while (salir == false);
		
	

	}

}
