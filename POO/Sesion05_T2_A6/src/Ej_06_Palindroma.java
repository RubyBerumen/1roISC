import java.util.Scanner;

class Palindroma {
	
	public String analizadorCadena (String palabra) {
		String cad;
		boolean palindroma = false;
		
		for(int i= 0; i<palabra.length()/2; i++) {
			
			if(palabra.charAt(i)==palabra.charAt(palabra.length()-1-i)) {
				palindroma = true;
				
			}
				
		}
		if(palindroma) {
			cad = "Es palindroma";
		}else {
			cad = "No es palindroma";
		}

		
		return cad;
	}
	
}


public class Ej_06_Palindroma {

	public static void main(String[] args) {
		
		Palindroma p1 = new Palindroma ();
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra o frase para\n "
				+ "saber si es palindroma o no: ");
		String cadena = ent.nextLine();
		
		System.out.println(p1.analizadorCadena(cadena));
		
		
		


	}

}
