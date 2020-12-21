import java.util.Scanner;

class Calculadora {
	
	public void operacion (int num1, int num2) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa lo a operacion a realizar ej. + , - , * , / ");
		char op = ent.nextLine().charAt(0);
		
		int res = 0;
		
		switch (op) {
		case '+' : res = num1+num2;break;
		case '-' : res = num1-num2;break;
		case '*' : res = num1*num2;break;
		case '/' : res = num1/num2;break;
		}
		
		System.out.println("El resultado es: "+ res);
		
	}
	
	
	public void operacion (double num1, double num2) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa lo a operacion a realizar ej. + , - , * , / ");
		char op = ent.nextLine().charAt(0);
		
		double res = 0;
		
		switch (op) {
		case '+' : res = num1+num2;break;
		case '-' : res = num1-num2;break;
		case '*' : res = num1*num2;break;
		case '/' : res = num1/num2;break;
		}
		
		System.out.println("El resultado es: "+ res);
	}
	
	
	public void operacion (int num1, double num2) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa lo a operacion a realizar ej. + , - , * , / ");
		char op = ent.nextLine().charAt(0);
		
		double res = 0;
		
		switch (op) {
		case '+' : res = num1+num2;break;
		case '-' : res = num1-num2;break;
		case '*' : res = num1*num2;break;
		case '/' : res = num1/num2;break;
		}
		
		System.out.println("El resultado es: "+ res);
		
	}
	
	
	public void operacion (double num1, int num2) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa lo a operacion a realizar ej. + , - , * , / ");
		char op = ent.nextLine().charAt(0);
		
		double res = 0;
		
		switch (op) {
		case '+' : res = num1+num2;break;
		case '-' : res = num1-num2;break;
		case '*' : res = num1*num2;break;
		case '/' : res = num1/num2;break;
		}
		
		System.out.println("El resultado es: "+ res);
		
	}
	
	
}//class Calculadora



		
public class Ej01_Calculadora {

	public static void main(String[] args) {
		
		
		Scanner ent = new Scanner(System.in);
		Calculadora cal1 = new Calculadora();
		System.out.println("Ingresa el primer número: ");
		int num1 = ent.nextInt();
		System.out.println("Ingresa el segundo número: ");
		double num2 = ent.nextDouble();
		
		cal1.operacion(num1, num2);
		
		
		
		
	

	}

}
