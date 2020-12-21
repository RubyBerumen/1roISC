import java.util.Scanner;

class AnalizadorCadenas{
	String cadenaEnAnalisis;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la palabra a analizar: ");
		cadenaEnAnalisis = entrada.nextLine();
	}
	
	public int obtenerCantidadVocales(){
		int sumaVocales =0;
		for (int i=0; i<cadenaEnAnalisis.length(); i++) {
			
			String caracter = cadenaEnAnalisis.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii==97 || ascii==101 || ascii==105 || ascii==111 ||  ascii==117) {
				sumaVocales++;
			}
		}	
		return sumaVocales;
	}
	
	public int obtenerCantidadConsonantes() {
		int sumaCons = 0;
		for (int i=0; i<cadenaEnAnalisis.length(); i++) {
			
			String caracter = cadenaEnAnalisis.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii>=97 && ascii<=122 && ascii!=97 && ascii!=101 && ascii!=105
					&& ascii!=111 && ascii!=117){
				sumaCons++;
			}
		}
		return sumaCons;
	}
	
	public String mostrarCadenaInvertida() {
		System.out.print("Palabra invertida: ");
		String x = "";
		int palabra1 = cadenaEnAnalisis.length();
		for(int i=palabra1-1; i>=0; i--) {
		
			char caracter = cadenaEnAnalisis.charAt(i);
			
			x=x+caracter;
		}
		return x;
	}
	
	
	
}//class AnalizadorCadenas


public class Ej_06_Cadena {

	public static void main(String[] args) {
		
		AnalizadorCadenas cad1 = new AnalizadorCadenas();
		cad1.lecturaAtributos();
		System.out.println("Número de vocales: "+cad1.obtenerCantidadVocales());
		System.out.println("Número de consonantes: "+cad1.obtenerCantidadConsonantes());
		System.out.println("Cadena invertida: "+cad1.mostrarCadenaInvertida());
		
		

	}

}
