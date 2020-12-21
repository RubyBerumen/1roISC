import java.util.Scanner;

class Calculadora {
	private double resultadoOperacion=0;
	private char op;
	private boolean err = false;
	
	public Calculadora() {
	}
	public Calculadora(double resultadoOperacion, char op) {
		this.resultadoOperacion = resultadoOperacion;
		this.op = op;
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
	public boolean isErr() {
		return err;
	}
	public void setErr(boolean err) {
		this.err = err;
	}
	
	public String removerEspacios(String operacion) {
		String retorno="";
		
		for (int i =0;i<operacion.length();i+=1) {
			byte charT = (byte)operacion.charAt(i);
			if((charT>=48&&charT<=57)||charT==43||charT==45||charT==42||charT==47||charT==37||charT==94||charT==46) {
				retorno=retorno+operacion.charAt(i);
			}
		}
		return retorno;
	}
	
	
	public char tipoDeOperacion(String operacion) {
		int i = 0;
		boolean salir = false;
		while(i<operacion.length()&&salir==false) {
			byte charT = (byte)operacion.charAt(i);
			i+=1;
			
			switch(charT) {
			case 43:op = '+';salir = true;break;
			case 45:op = '-';salir = true;break;
			case 42:op = '*';salir = true;break;
			case 47:op = '/';salir = true;break;
			case 37:op = '%';salir = true;break;
			case 94:op = '^';salir = true;break;
			default: op =' ';break;
			}
		}
		return op;
	}
	public void realizarOperacion(String cadena, char op) {
		String subcadenas[] = cadena.split("\\"+op);
		err = false;
		
		for (int i =0;i<2;i+=1) {
			try {
				int t = 1/(1-subcadenas.length);
			} catch (Exception e) {
				System.out.println("eso no es una operacion");
				err = true;
				break;
			}
			
			
			if(i==0) {
				try {
					resultadoOperacion=Double.parseDouble(subcadenas[i]);
				} catch (NumberFormatException| ArrayIndexOutOfBoundsException e) {
					System.out.println("esos no son numeros");
					err = true;
					break;
				}
			}else {
				try {
					switch(op) {
					case '+':resultadoOperacion=resultadoOperacion+Double.parseDouble(subcadenas[i]);break;
					case '-':resultadoOperacion=resultadoOperacion-Double.parseDouble(subcadenas[i]);break;
					case '*':resultadoOperacion=resultadoOperacion*Double.parseDouble(subcadenas[i]);break;
					case '/':
						 try {
							 if(Double.parseDouble(subcadenas[i])==0) {
								 resultadoOperacion=Math.round(resultadoOperacion)/0;
							 }else {
								 resultadoOperacion=resultadoOperacion/Double.parseDouble(subcadenas[i]);
							 }
			                } catch (ArithmeticException e) {
			                    System.out.println("No se puede dividir por cero!");
								 err = true;
			                    break;
			                }
						break;
					case '%':resultadoOperacion=resultadoOperacion%Double.parseDouble(subcadenas[i]);break;
					case '^':resultadoOperacion=Math.pow(resultadoOperacion, Double.parseDouble(subcadenas[i]));break;
					}
				} catch (NumberFormatException e) {
					System.out.println("puso 2 veces seguidas o más un operador u operadores");
					err = true;
					break;
				}
				
				
				
			}
		}
	}
	
	public void impresionResultado() {
		System.out.print("El resultado de ");
		switch(op) {
		case '+':System.out.print("la suma ");break;
		case '-':System.out.print("la resta ");break;
		case '*':System.out.print("la multiplicación ");break;
		case '/':System.out.print("la division ");break;
		case '%':System.out.print("el residuo ");break;
		case '^':System.out.print("la potencia ");break;
		}
		System.out.print("es : "+resultadoOperacion +"\n");
		
	}

}

public class PruebaExcepciones {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calculadora c = new Calculadora();
		
		boolean salir=false;
		String opc = "";
		int cc=0;
		
		do {
			if(cc>0) {
				System.out.println("¿desea realizar otra operacion?(SI/NO)");
				opc = input.nextLine().toLowerCase();
				
				if(opc.contains("no")){
					System.out.println("proceso terminado correctamente");
					salir = true;
					break;
				}else if(!opc.contains("si")){
					System.out.println("opcion no válida \n");
					continue;
					}
				}
			System.out.println("operacion: ");
			
			String operacion = input.nextLine();
			operacion = c.removerEspacios(operacion);
			c.realizarOperacion(operacion,c.tipoDeOperacion(operacion));
			if(!c.isErr()) {
				c.impresionResultado();
			}
			cc+=1;
			
		}while(salir == false);
		
	}

}
