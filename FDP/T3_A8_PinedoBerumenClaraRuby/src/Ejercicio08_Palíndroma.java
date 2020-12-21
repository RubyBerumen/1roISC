import java.util.Scanner; 

public class Ejercicio08_Palíndroma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que determina si una palabra es palíndroma==");
		System.out.println();
		
		System.out.println("Ingresa la palabra: ");
		String palabra = entrada.nextLine();
		
		boolean palindroma = false;
		
		for(int i= 0; i<palabra.length()/2; i++) {
			
			if(palabra.charAt(i)==palabra.charAt(palabra.length()-1-i)) {
				palindroma = true;
				
			}
				
		}
		if(palindroma) {
			System.out.println("Es palindroma");
		}else {
			System.out.println("No es palindroma");
		}
			
			
		
	

		
	}

}
