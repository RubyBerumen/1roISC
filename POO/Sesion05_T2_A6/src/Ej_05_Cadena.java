import java.util.Scanner;

class Cadena{
	
	public int cantidadVocales (String cad) {
		int sumaVocales =0;
		for (int i=0; i<cad.length(); i++) {
			
			String caracter = cad.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii==97 || ascii==101 || ascii==105 || ascii==111 ||  ascii==117) {
				sumaVocales++;
			}
		}
		
		return sumaVocales;
	}
	
	public int cantidadConsonantes (String cad) {
		int sumaCons = 0;
		for (int i=0; i<cad.length(); i++) {
			
			String caracter = cad.substring(i,i+1);
			
			int ascii = caracter.charAt(0);	
			
			if(ascii>=97 && ascii<=122 && ascii!=97 && ascii!=101 && ascii!=105
					&& ascii!=111 && ascii!=117){
				sumaCons++;
			}
		}
		
		return sumaCons;
	}
	
	public int aparicionesLetra (String cad, String letra) {
		int sumaLetra = 0;
		for (int i=0; i<cad.length(); i++) {
			
			String caracter = cad.substring(i,i+1);
			
			if (caracter.equals(letra)) {
				sumaLetra++;
			}
		}
		
		return sumaLetra;
	}
	
}//class Cadena


public class Ej_05_Cadena {

	public static void main(String[] args) {
		
		Cadena cad1 = new Cadena();
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra o frase: ");
		String cad = ent.nextLine();
		
		System.out.println("Ingresa una letra para ver cuantas veces aparece: ");
		String letra = ent.nextLine();
		
		System.out.println("Cantidad de vocales: "+cad1.cantidadVocales(cad));
		System.out.println("Cantidad de consonantes: "+cad1.cantidadConsonantes(cad));
		System.out.println("Apariciones de la letra "+letra+":"+cad1.aparicionesLetra(cad, letra));
		
		
		
		
		

	}

}
