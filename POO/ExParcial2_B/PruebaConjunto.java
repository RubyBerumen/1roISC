import java.util.Scanner;

public class PruebaConjunto {
	
	public static void main(String[] args) {
		
		char universo[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		char a[]= {'e','c','h','i','o','a','n','m'};
		char b[]= {'a','r','c','b','y','i','m','g','w','s'};
		
		Conjunto conjunto1 = new Conjunto(a);
		Conjunto conjunto2 = new Conjunto(b);
		Conjunto conjunto0 = new Conjunto();
		
		OperacionesConjuntos op1 = new OperacionesConjuntos(universo);
		
		op1.obtenerUnionConjuntos(conjunto1, conjunto2);
		System.out.println("union A U B:");
		op1.imprimirResultadoUnion();
		
		Conjunto conjunto3 = op1.obtenerInterseccionConjuntos(conjunto1, conjunto2);
		System.out.println("\n \n union A n B:");
		conjunto3.impresionAtributos();
		
		System.out.println("\n \ndiferencia A-B:");
		op1.obtenerDiferenciaConjuntos(conjunto1, conjunto2);
		
		Conjunto complementoA = op1.obtenerComplementoConjuntos(conjunto1);
		System.out.println("\n \ncomplemento de A:");
		complementoA.impresionAtributos();
		
		Conjunto complementoB = op1.obtenerComplementoConjuntos(conjunto2);
		System.out.println("\n \nComplemento de B:");
		complementoB.impresionAtributos();
	}

}
