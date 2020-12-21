import java.util.Scanner;



class CifradoCesar {
	String textoCifrado;
	
	public void mostrarAtributos () {
		System.out.println(textoCifrado);
	}
	
	public String cifrar (String texto, int numero) {
		String palabra = "";
		for (int i=0; i<texto.length(); i++) {
		
			char caracter = texto.charAt(i);

				
			if (caracter >= 'a' && caracter<= 'z') {
				if ((caracter + numero)>'z') {
					caracter = (char) (caracter+numero-26);
					palabra += Character.toString(caracter);
				}else {
					caracter = (char) (caracter+numero);
					palabra += Character.toString(caracter);
				}
				
			}else if(caracter >= 'A' && caracter<= 'Z') {
				if ((caracter + numero)>'Z') {
					caracter = (char) (caracter+numero-26);
					palabra += Character.toString(caracter);
				}else {
					caracter = (char) (caracter+numero);
					palabra += Character.toString(caracter);
				}
			}	
			
		}
		
		
		return palabra;
	}
	
	
	public String descifrar (String texto, int numero) {
		String palabra = "";
		for (int i=0; i<texto.length(); i++) {
		
			char caracter = texto.charAt(i);

				
			if (caracter >= 'a' && caracter<= 'z') {
				if ((caracter - numero)<'a') {
					caracter = (char) (caracter-numero+26);
					palabra += Character.toString(caracter);
				}else {
					caracter = (char) (caracter-numero);
					palabra += Character.toString(caracter);
				}
				
			}else if(caracter >= 'A' && caracter<= 'Z') {
				if ((caracter - numero)>'A') {
					caracter = (char) (caracter-numero+26);
					palabra += Character.toString(caracter);
				}else {
					caracter = (char) (caracter-numero);
					palabra += Character.toString(caracter);
				}
			}	
			
		}
		
		
		return palabra;
	}
	
	
	
}//class CifradoCesar


public class Cifrado_César {

	public static void main(String[] args) {
		
		
		CifradoCesar  cc1 = new CifradoCesar();
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa el texto a cifrar: ");
		String texto = ent.nextLine();
		System.out.println("Ingresa el número de desplazamientos: ");
		int desplazamientos = ent.nextInt();
		desplazamientos = desplazamientos%26;
		
		System.out.println("Texto cifrado: "+cc1.cifrar(texto, desplazamientos));
		
		System.out.println("Texto descifrado: "+cc1.descifrar(cc1.cifrar(texto, desplazamientos), desplazamientos));

	}

}
