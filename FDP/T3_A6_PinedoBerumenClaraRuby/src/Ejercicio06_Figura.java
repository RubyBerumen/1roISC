
public class Ejercicio06_Figura {

	public static void main(String[] args) {
		
		
		System.out.println("==Programa que muestra un triangulo==");
		System.out.println();
		
		for(int i=20; i>0; i--) {
			for(int x=0; x<i; x++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			for(int y=20-i; y>=0; y--) {
				System.out.print(" ");
			}
			
			
		}


	}

}
