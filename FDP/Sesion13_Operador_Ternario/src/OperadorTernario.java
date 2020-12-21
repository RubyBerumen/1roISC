
/* 		Operador condicional  (ternario)
 * 			
 * 			?:
 * 
 * 		Sintaxis:
 * 			(condicion) ? valor_de_etorno_en_caso_TRUE : valor_de_retorno_en_caso_FALSE
 */


public class OperadorTernario {

	public static void main(String[] args) {
		
		
		int a = 7, b = 8, c = 9;
		
		System.out.println("Valor mayor: " + ((a>b) ? "a":"b") );
		
		String res = (a>b) ? "a" : "b";
		
		System.out.println(res);
		
		//Obtener mayor de a,b,c
		System.out.println("Mayor"  );
		
		//Retornar número o cadena
		//Si número es PAR ratornarlo, en caso contrario indicar que es invalido
		int num = 7;
		System.out.println("Dato analizado: " + (num%2==0 ? num : "Invalido") );
		

	}

}
