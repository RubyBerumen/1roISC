import java.util.Scanner;

class Calculadora {
	private double resultadoOperacion=0;
	private char op;
	private boolean error = false;
	
	public Calculadora() {
	}
	public Calculadora(double resultadoOperacion, char op, boolean err) {
		this.resultadoOperacion = resultadoOperacion;
		this.op = op;
		this.error = error;
	}
	
	public double getResultadoOperacion() {
		return resultadoOperacion;
	}
	public void setResultadoOperacion(double resultadoOperacion) {
		this.resultadoOperacion = resultadoOperacion;
	}
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	}
	public boolean getErr() {
		return error;
	}
	public void setErr(boolean err) {
		this.error = error;
	}
	
	public String removerEspacios(String operacion) {
		String res = "";
		
		for (int i =0;i<operacion.length();i+=1) {
			byte charT = (byte)operacion.charAt(i);
			if((charT>=48&&charT<=57)||charT==43||charT==45||charT==42||charT==47||charT==37||charT==94||charT==46) {
				res=res+operacion.charAt(i);
			}
		}
		return res;
	}
	
	
	public char tipoDeOperacion(String operacion) {
		int i = 0;
		boolean salir = false;
		while(i<operacion.length()&&salir==false) {
			byte caracter = (byte)operacion.charAt(i);
			i+=1;
			
			switch(caracter) {
			case 43:op = '+';salir = true;break;
			case 45:op = '-';salir = true;break;
			case 42:op = '*';salir = true;break;
			case 47:op = '/';salir = true;break;
			case 37:op = '%';salir = true;break;
			default: op =' ';break;
			}
		}
		return op;
	}
	public void realizarOperacion(String cadena, char op) {
		String partes[] = cadena.split("\\"+op);
		error = false;
		
		for (int i =0;i<2;i+=1) {
			try {
				int t = 1/(1-partes.length);
			} catch (Exception e) {
				System.out.println("No es una operacion");
				error = true;
				break;
			}
			
			
			if(i==0) {
				try {
					resultadoOperacion=Double.parseDouble(partes[i]);
				} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
					System.out.println("Debes ingresar números");
					error = true;
					break;
				}
			}else {
				try {
					switch(op) {
					case '+':resultadoOperacion=resultadoOperacion+Double.parseDouble(partes[i]);break;
					case '-':resultadoOperacion=resultadoOperacion-Double.parseDouble(partes[i]);break;
					case '*':resultadoOperacion=resultadoOperacion*Double.parseDouble(partes[i]);break;
					case '/':
						 try {
							 if(Double.parseDouble(partes[i])==0) {
								 resultadoOperacion=Math.round(resultadoOperacion)/0;
							 }else {
								 resultadoOperacion=resultadoOperacion/Double.parseDouble(partes[i]);
							 }
			                } catch (ArithmeticException e) {
			                    System.out.println("No se puede dividir entre cero");
			                    error = true;
			                    break;
			                }
						break;
					case '%':resultadoOperacion=resultadoOperacion%Double.parseDouble(partes[i]);break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Solo puedes ingresar un operador");
					error = true;
					break;
				}
				
				
				
			}
		}
	}
	
	public void impresionResultado() {
		System.out.println("El resultado es: "+ resultadoOperacion);
	}
	

}//class

public class Ej01_Calculadora {

	public static void main(String[] args) {
		
		
		Scanner ent = new Scanner(System.in);
		Calculadora c = new Calculadora();
		
		boolean salir=false;
		String opc = "";
		int cont=0;
		
		do {
			if(cont>0) {
				System.out.println("¿Desea realizar otra operacion? (si/no)");
				opc = ent.nextLine().toLowerCase();
				
				if(opc.contains("no")){
					System.out.println("Proceso terminado");
					salir = true;
					break;
				}else if(!opc.contains("si")){
					System.out.println("Opcion iválida \n");
					continue;
					}
				}
			System.out.println("Ingresa una operación: ");
			
			String operacion = ent.nextLine();
			operacion = c.removerEspacios(operacion);
			c.realizarOperacion(operacion,c.tipoDeOperacion(operacion));
			if(!c.getErr()) {
				c.impresionResultado();
			}
			cont++;
			
		}while(salir == false);
		
		
		

	}

}
