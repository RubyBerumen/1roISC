
class Conjunto {
	private String conjunto [];
	
	public Conjunto () {}
	
	public Conjunto (String conjunto []) {
		this.conjunto = conjunto;
	}
	

	public String[] getConjunto() {return conjunto;}
	public void setConjunto(String[] conjunto) {
		this.conjunto = conjunto;
	}
	
	
}//class Conjunto


class OperacionesConjuntos {
	private String conjuntoUniverso[];
	private String resultadoUnion[];
	
	public OperacionesConjuntos () {}
	public OperacionesConjuntos (String conjuntoUniverso[], String resultadoUnion[]) {
		this.conjuntoUniverso=conjuntoUniverso;
		this.resultadoUnion=resultadoUnion;
	}
	
	
	public String[] getConjuntoUniverso() {return conjuntoUniverso;}
	public void setConjuntoUniverso(String conjuntoUniverso[]) {
		this.conjuntoUniverso = conjuntoUniverso;
	}
	public String[] getResultadoUnion() {return resultadoUnion;}
	public void setResultadoUnion(String resultadoUnion[]) {
		this.resultadoUnion = resultadoUnion;
	}
	
	
	
	public void obtenerUnionConjuntos (String cA[], String cB[]) {
		
		for (int i = 0; i<cA.length; i++) {
			resultadoUnion [i] = cA[i];
		}
		
		for (int i=0; i<cB.length; i++) {
			
		}
	
	
	}
	
	
	
	public Conjunto obtenerInterseccionConjuntos (Conjunto cA [], Conjunto cB[]) {
		
		Conjunto resultado = new Conjunto();
		
		for (int i=0; i<cA.length; i++)
		

		return resultado;
		return resultado;
	}
	
	public void obtenerDifeenciaConjuntos (Conjunto cA, Conjunto cB) {
		
	}
	
	public Conjunto obtenerComplementoConjuntos (Conjunto cA, Conjunto cB) {
		return null;
	}
	
	
}//class OperacionesConjuntos


public class Examen_2 {

	public static void main(String[] args) {
		
		
		
		
		
		
		

	}

}
