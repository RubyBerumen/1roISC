
import java.util.Arrays;

class Conjunto {
	private String letras[];
	
	public Conjunto() {}
	public Conjunto(String letras[]) {
		this.letras = letras;
	}

	public void setLetras(String letras[]) {
		this.letras=letras;
	}
	public String[] getLetras() {
		return this.letras;
	}
	
	public void impresionAtributos() {
		for(int i =0;i<letras.length;i++) {
			System.out.print(letras[i]+" ");
		}
	}
}//class Conjunto


class OperacionesConjuntos {
	private String conjuntoU[];
	private String resUnionConjuntos[];
	
	public OperacionesConjuntos() {}
	public OperacionesConjuntos(String conjuntoUniverso[]) {
		this.conjuntoU=conjuntoU;
	}
	
	
	
	public void unionConjuntos(Conjunto c1, Conjunto c2) {
		
		String cN1 [] = c1.getLetras();
		String cN2 [] = c2.getLetras();
		
		resUnionConjuntos = new String [c1.getLetras().length+c2.getLetras().length];
		
		int cont = 0;
		for (int i=0; i<cN1.length; i++) {
			resUnionConjuntos[i] = cN1[i];
			cont++;
		}
		
		
		int cont2 = 0;
		for (int i=0; i<cN1.length; i++) {
			
			for (int j=0; j<cN2.length; i++) {
				if(cN1[i]==cN2[j]) {
					cont2++;
					resUnionConjuntos[cont+cont2] = cN2[j];
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(resUnionConjuntos));
		
		
	}//unionConjuntos
	
	

}//class OperacionesConjuntos


public class Ejemplo_ExP2 {

	public static void main(String[] args) {
		
		
		String universo[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
				"ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		String A[]= {"e","c","h","i","o","a","n","m"};
		String B[]= {"a","r","c","b","y","i","m","g","w","s"};
		
		Conjunto c = new Conjunto();
		Conjunto c1 = new Conjunto(A);
		Conjunto c2 = new Conjunto(B);
		
		OperacionesConjuntos oc = new OperacionesConjuntos(universo);
		oc.unionConjuntos(c1, c2);
		System.out.println("Union A U B:");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
