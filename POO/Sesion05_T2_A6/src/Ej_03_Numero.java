import java.util.Scanner;

class Numero {
	
	public String primo (int num) {
		boolean primo = true;
		
		for(int i=2; i <=num/2; i++ ) {
			if(num % i==0) {
				System.out.println("El número no es primo");
				primo = false; break;
			}
				
		}
		String cad="";
		
		if(primo) {
			cad = "El número es primo";
		}

		return cad;
	}
	
	
	public int factorial (int num) {
		int factorial = 1;
		for (int i=2; i<=num; i++)
			  factorial = factorial * i;
		
		return factorial;
	}
	
	public String divisores (int num) {
		String divisores = "";
		for(int i=1; i<=num/2; i++ ) {
			if(num % i== 0) 
				System.out.println(i);
			
		}
		
		divisores = divisores + Integer.toString(num);

		
		return divisores;
	}
	
	
	
}//class Numero

public class Ej_03_Numero {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("1) Indicar si número es o no PRIMO"); 
		System.out.println("2) Mostrar Factorial de Numero");
		System.out.println("3) Mostrar Divisores");
		System.out.println("4) Mostrar tablas de multiplicar"); 
		System.out.println("Elige una opción");
		byte op = ent.nextByte();
		
		System.out.println("Ingresa el número: ");
		int num = ent.nextInt();
		
		Numero num1 = new Numero();
		
		if (op == 1) {
			System.out.println(num1.primo(num));
		} else if (op==3) {
			System.out.println("Divisores: ");
			System.out.println(num1.divisores(num));
		}else if (op==2) {
			System.out.println("Factorial: "+num1.factorial(num));
		}else if (op==4) {
			for (int i=1;i<=num;i++) {

			  for (int x=0;x<=10;x++) 
			     System.out.println(i + " x " + x + " = " +  (x*i));
			  		System.out.println();
				}
		}else
			System.out.println("Opción incorrecta!");
			
		
		
	}

}
