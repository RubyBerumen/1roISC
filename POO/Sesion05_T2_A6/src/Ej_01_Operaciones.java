import java.util.Scanner;


class Operaciones {
	
	public double suma (double num1, double num2) {
		double res=num1+num2;
		return res;
	}
	
	public double resta (double num1, double num2) {
		double res=num1-num2;
		return res;
	}
	
	public double multiplicacion (double num1, double num2) {
		double res=num1*num2;
		return res;
	}
	
	public double division (double num1, double num2) {
		double res=num1/num2;
		return res;
	}
	
	public double residuo (double num1, double num2) {
		double res=num1%num2;
		return res;
	}
	
	public double raizCuadrada (double num1) {
		double res= Math.sqrt(num1);
		return res;
	}
	
	public double raizCubica (double num1) {
		double res= Math.cbrt(num1);
		return res;
	}
	
	
	
	
}//class Operaciones



public class Ej_01_Operaciones {

	public static void main(String[] args) {
		
		Operaciones op1 = new Operaciones();
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Ingresa el número 1");
		double n1= ent.nextDouble();
		
		System.out.println("Ingresa el número 2");
		double n2= ent.nextDouble();
		
		System.out.println("Suma: "+ op1.suma(n1, n2));
		
		System.out.println("Resta: "+ op1.resta(n1, n2));
		
		System.out.println("Multiplicacion: "+ op1.multiplicacion(n1, n2));
		
		System.out.println("Division: "+ op1.division(n1, n2));
		
		System.out.println("Residuo de la division: "+ op1.residuo(n1, n2));
		
		System.out.println("Raiz cuadrada: "+ op1.raizCuadrada(n1));
		
		System.out.println("Raiz cubica: "+ op1.raizCubica(n1));
		

	}

}
