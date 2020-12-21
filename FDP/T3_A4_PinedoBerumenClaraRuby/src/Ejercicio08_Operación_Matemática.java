
import java.util.Scanner;

public class Ejercicio08_Operación_Matemática {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una operación matemática a resolver: ej: '7*4' ");
		String operacion = entrada.nextLine();
		
		operacion = operacion.replaceAll(" ","");
		
		System.out.println(operacion);
		
		String simbolo = "";
		int indicesim = 0;
		
		if(operacion.contains("+")) {
			simbolo = "+";
			indicesim = operacion.indexOf("+");
			
		}else if(operacion.contains("-")){
			simbolo = "-";
			indicesim = operacion.indexOf("-");
			
		}else if(operacion.contains("*")){
			simbolo = "*";
			indicesim = operacion.indexOf("*");
			
		}else if(operacion.contains("/")){
			simbolo = "/";
			indicesim = operacion.indexOf("/");
			
		}else if(operacion.contains("%")) {
			simbolo = "%";
			indicesim = operacion.indexOf("%");
			
		}else System.out.println("Inválido");
		
		String num1 = operacion.substring(0,indicesim);
		String num2 = operacion.substring(indicesim+1);
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		int resultado = 0;
		
		switch(simbolo) {
			case "+" : resultado = numero1 + numero2;break;
		
			case "-" : resultado = numero1 - numero2;break;
			
			case "*" : resultado = numero1 * numero2;break;
			
			case "/" : resultado = numero1 / numero2;break;
			
			case "%" : resultado = numero1 % numero2;break;
			
		}
		
		System.out.println("Resultado: " + resultado);
		
		
		
		
		
	

	}

}
