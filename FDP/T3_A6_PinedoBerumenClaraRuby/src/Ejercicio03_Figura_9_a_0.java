
public class Ejercicio03_Figura_9_a_0 {

	public static void main(String[] args) {
		
		System.out.println("==Programa que muestra un triangulo de 9 a 0==");
		System.out.println();
		
		for(int i=9; i>=0; i=i-1) {
			for(int j=9; j>=9-i; j=j-1) {
				System.out.print(j);
			}
			System.out.println();
		}
		


	}

}
