import java.util.Scanner;

public class Ejercicio03_Divisores_Pares_W {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que muestra los divisores pares de un número==");
		System.out.println();
		
		
		System.out.println("Ingresa el número: ");
		int num = entrada.nextInt();
		
		System.out.println("Los divisores pares de " + num + " son: ");
		
		int i = 2;
		while( i<=(num/2)) {
			if(num % i== 0 ) 
				System.out.println(i);
			i+=2;
		}
		
		if(num%2 == 0) {
		System.out.println(num);
		}else System.out.println("El número ingresado no tiene divisores pares");
		
		
		
		
		
	}

}
