 
public class Conjunto {
	private char letras[];
	

	public Conjunto() {
		
	}
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
		for(int i =0;i<letras.length;i+=1) {
			System.out.print(letras[i]+" ");
		}
	}
}

class OperacionesConjuntos {
	private char conjuntoUniverso[];
	private char resOpUnionConjuntos[];
	
	public OperacionesConjuntos() {
		
	}
	public OperacionesConjuntos(char conjuntoUniverso[]) {
		this.conjuntoUniverso=conjuntoUniverso;
		//this.resOpUnionConjuntos=resOpUnionConjuntos;
	}

	public void obtenerUnionConjuntos(Conjunto conjunto1, Conjunto conjunto2) {
		
		int x = 0;
		x= conjunto1.getLetras().length+conjunto2.getLetras().length;
		char resOpUnionConjuntos[]=new char[x];
		this.resOpUnionConjuntos=resOpUnionConjuntos;//le asigna el espacio al resultado de la union de conjuntos
		
		char localConjunto1[]=conjunto1.getLetras();
		char localConjunto2[]=conjunto2.getLetras();//se asignan los arreglos de la otra clase
		
		
		for(int i = 0;i<localConjunto1.length;i+=1) {
			this.resOpUnionConjuntos[i]=localConjunto1[i];
		}
		
		int y =0;
		for(int i = 0;i<localConjunto2.length;i+=1) {
			int validacion =1;
			
			for(int j = 0;j<localConjunto1.length;j+=1) {
				if(localConjunto1[j]==localConjunto2[i]) {
					validacion*=0;
				}else {
					validacion*=1;
				}
			}
			
			if(validacion==1) {
				this.resOpUnionConjuntos[y+conjunto1.getLetras().length]=localConjunto2[i];
				y+=1;
			}
			
		}
		
	}
	public Conjunto obtenerInterseccionConjuntos(Conjunto conjunto1, Conjunto conjunto2) {
		
		int x = Math.max(conjunto1.getLetras().length, conjunto2.getLetras().length);
		char resInterseccionConjuntos[]=new char[x];
		
		char localConjunto1[]=conjunto1.getLetras();
		char localConjunto2[]=conjunto2.getLetras();
		
		
		int y=0;
		
		for(int i=0;i<localConjunto1.length;i+=1) {
			for(int j=0;j<localConjunto2.length;j+=1) {
				if(localConjunto1[i]==localConjunto2[j]) {
					resInterseccionConjuntos[y]=localConjunto1[i];
					y+=1;
					break;
				}
			}
		}
		
		Conjunto interseccion = new Conjunto(resInterseccionConjuntos);
		return interseccion;
		
		
	}
	public void obtenerDiferenciaConjuntos(Conjunto conjunto1, Conjunto conjunto2) {
		
		char localConjunto1[]=conjunto1.getLetras();
		char localConjunto2[]=conjunto2.getLetras();
		char diferencia[]=new char[localConjunto1.length];
		
		int x =0;
		int validacion =1;
		for(int i = 0;i<localConjunto1.length;i+=1) {
			validacion =1;
			for(int j = 0;j<localConjunto2.length;j+=1) {
				if(localConjunto1[i]==localConjunto2[j]) {
					validacion*=0;
				}
			}
			if(validacion==1) {
				diferencia[x]=localConjunto1[i];
				x+=1;
			}
		}
		
		for(int i = 0;i<diferencia.length;i+=1) {
			System.out.print(diferencia[i]+" ");
		}
		
	}
	public Conjunto obtenerComplementoConjuntos(Conjunto conjunto1) {
		
		char localConjunto1[]=conjunto1.getLetras();
		
		char complemento[]=new char[conjuntoUniverso.length];
		
		int x =0;
		int validacion =1;
		
		for(int i = 0;i<conjuntoUniverso.length;i+=1) {
			validacion =1;
			for(int j = 0;j<localConjunto1.length;j+=1) {
				if(conjuntoUniverso[i]==localConjunto1[j]) {
					validacion*=0;
				}
			}
			if(validacion==1) {
				complemento[x]=conjuntoUniverso[i];
				x+=1;
			}
		}
		
		Conjunto comp = new Conjunto(complemento);
		return comp;
	}
	public void imprimirResultadoUnion() {
		
		for(int i =0;i<resOpUnionConjuntos.length;i+=1) {
			System.out.print(resOpUnionConjuntos[i]+" ");
		}
	}
}

