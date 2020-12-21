
class Conjunto {
	private char letras[];
	
	public Conjunto() {}
	public Conjunto(char letras[]) {
		this.letras = letras;
	}

	public void setLetras(char letras[]) {
		this.letras=letras;
	}
	public char[] getLetras() {
		return this.letras;
	}
	
	public void impresionAtributos() {
		for(int i =0;i<letras.length;i++) {
			System.out.print(letras[i]);
		}
	}
}//class Conjunto


class OperacionesConjuntos {
	private char conjuntoUniverso[];
	private char resUnionConjuntos[];
	
	public OperacionesConjuntos() {}
	public OperacionesConjuntos(char conjuntoUniverso[]) {
		this.conjuntoUniverso=conjuntoUniverso;
	}

	public void obtenerUnionConjuntos(Conjunto c1, Conjunto c2) {
		
		resUnionConjuntos = new char [c1.getLetras().length+c2.getLetras().length];
		char cN1[]=c1.getLetras();
		char cN2[]=c2.getLetras();
		
		for(int i = 0;i<cN1.length;i+=1) {
			resUnionConjuntos[i]=cN1[i];
		}
		
		int cont = 0;
		for(int i = 0;i<cN2.length;i+=1) {
			int x = 1;
			
			for(int j = 0;j<cN1.length;j+=1) {
				if(cN1[j]==cN2[i]) {
					x*=0;
				}else {
					x*=1;
				}
			}
			
			if(x==1) {
				resUnionConjuntos[cont+c1.getLetras().length]=cN2[i];
				cont++;
			}
		}
		
		for(int i =0;i<resUnionConjuntos.length;i+=1) {
			System.out.print(resUnionConjuntos[i]);
		}
	}//obtenerUnionConjuntos
	
	
	public Conjunto obtenerInterseccionConjuntos(Conjunto c1, Conjunto c2) {
		
		char resInterseccionConjuntos[]=new char[Math.max(c1.getLetras().length, c2.getLetras().length)];
		char cN1[]=c1.getLetras();
		char cN2[]=c2.getLetras();
		
		int cont = 0;
		for(int i=0;i<cN1.length;i+=1) {
			for(int j=0;j<cN2.length;j+=1) {
				if(cN1[i]==cN2[j]) {
					resInterseccionConjuntos[cont]=cN1[i];
					cont+=1;
					break;
				}//if
			}//for2
		}//for1
		
		Conjunto interseccion = new Conjunto(resInterseccionConjuntos);
		return interseccion;
	}//obtenerInterseccionConjuntos
	
	
	public void obtenerDiferenciaConjuntos(Conjunto c1, Conjunto c2) {
		
		char cN1[]=c1.getLetras();
		char cN2[]=c2.getLetras();
		char diferencia[]=new char[cN1.length];
		
		int cont = 0;
		int x = 1;
		for(int i = 0;i<cN1.length;i+=1) {
			x = 1;
			for(int j = 0;j<cN2.length;j+=1) {
				if(cN1[i]==cN2[j]) {
					x*=0;
				}
			}
			if(x==1) {
				diferencia[cont]=cN1[i];
				cont+=1;
			}
		}
		
		for(int i = 0;i<diferencia.length;i+=1) {
			System.out.print(diferencia[i]);
		}
	}//obtenerDiferenciaConjuntos
	
	
	public Conjunto obtenerComplementoConjuntos(Conjunto c1) {
		
		char cN1[]=c1.getLetras();
		char complemento[]=new char[conjuntoUniverso.length];
		
		int cont = 0;
		int x = 1;
		for(int i = 0;i<conjuntoUniverso.length;i+=1) {
			x =1;
			for(int j = 0;j<cN1.length;j+=1) {
				if(conjuntoUniverso[i]==cN1[j]) {
					x*=0;
				}
			}
			if(x==1) {
				complemento[cont]=conjuntoUniverso[i];
				cont+=1;
			}
		}
		
		Conjunto complemento1 = new Conjunto(complemento);
		return complemento1;
	}//obtenerComplementoConjuntos
	

}//class OperacionesConjuntos

public class Examen {

	public static void main(String[] args) {
		
		char universo[]= {'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		char A[]= {'e','c','h','i','o','a','n','m'};
		char B[]= {'a','r','c','b','y','i','m','g','w','s'};
		
		Conjunto c1 = new Conjunto(A);
		Conjunto c2 = new Conjunto(B);
		
		OperacionesConjuntos oc = new OperacionesConjuntos(universo);
		System.out.println("Union(A U B):");
		oc.obtenerUnionConjuntos(c1, c2);
		System.out.println("\n");
		
		Conjunto conjunto3 = oc.obtenerInterseccionConjuntos(c1, c2);
		System.out.println("Interseccion (A n B):");
		conjunto3.impresionAtributos();
		System.out.println("\n");
		
		System.out.println("Diferencia (A - B):");
		oc.obtenerDiferenciaConjuntos(c1, c2);
		System.out.println("\n");
		
		Conjunto complementoA = oc.obtenerComplementoConjuntos(c1);
		System.out.println("Complemento A':");
		complementoA.impresionAtributos();
		System.out.println("\n");
		
		Conjunto complementoB = oc.obtenerComplementoConjuntos(c2);
		System.out.println("Complemento B':");
		complementoB.impresionAtributos();
	
		
	}

}
