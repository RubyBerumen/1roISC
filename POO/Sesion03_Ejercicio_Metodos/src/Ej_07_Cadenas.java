import java.util.Scanner;

class AnalizadorCadenas{
	String cadenaEnAnalisis;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la palabra a analizar: ");
		cadenaEnAnalisis = entrada.nextLine();
	}
	
	public void mostrarAtributos() {
		System.out.println("Palabra a analizar: "+cadenaEnAnalisis);
	}
	
	public void obtenerCantidadVocales(){
		int sumaVocales =0;
		for (int i=0; i<cadenaEnAnalisis.length(); i++) {
			
			String caracter = cadenaEnAnalisis.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii==97 || ascii==101 || ascii==105 || ascii==111 ||  ascii==117) {
				sumaVocales++;
			}
		}	
		System.out.println("Cantidad de vocales: " +sumaVocales);
	}
	
	public void obtenerCantidadConsonantes() {
		int sumaCons = 0;
		for (int i=0; i<cadenaEnAnalisis.length(); i++) {
			
			String caracter = cadenaEnAnalisis.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii>=97 && ascii<=122 && ascii!=97 && ascii!=101 && ascii!=105
					&& ascii!=111 && ascii!=117){
				sumaCons++;
			}
		}
		System.out.println("Cantidad de consonantes: "+ sumaCons);
	}
	
	public void mostrarCadenaInvertida() {
		System.out.print("Palabra invertida: ");
		int palabra1 = cadenaEnAnalisis.length();
		for(int i=palabra1-1; i>=0; i--) {
		
			char caracter = cadenaEnAnalisis.charAt(i);
			
			System.out.print(caracter);
		}
	}
	
	
	
}//class AnalizadorCadenas

public class Ej_07_Cadenas {

	public static void main(String[] args) {
		
		AnalizadorCadenas cad1 = new AnalizadorCadenas();
		cad1.lecturaAtributos();
		cad1.mostrarAtributos();
		cad1.obtenerCantidadVocales();
		cad1.obtenerCantidadConsonantes();
		cad1.mostrarCadenaInvertida();
		
		
	

	}

}
