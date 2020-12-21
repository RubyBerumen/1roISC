
/*
 * CONTROL DE FLUJO
 * 
 * Ejecucion SECUENCIAL de instrucciones
 * 
 * 		Estructuras de CONTROL
 * 
 * 		Permiten modificar la secuencia de ejecucion del codigo
 * 
 * 		En JAVA existen dos tipos de estructuras de control:
 * 
 * 		1) Estructuras de control basadas en decisiones
 * 
 * 			1a) condicionales
 * 				-IF-THEN / IF-THEN-ELSE
 * 
 * 			2a) selectivas
 * 				-SWITCH
 * 
 * 		2) Estructuras de control REPETITIVAS (ciclos o bucles)
 * 				-WHILE
 * 				-DO-WHILE
 * 				-FOR
 * 
 */

public class EjemploIfElse {
	
	public static void main(String[] args) {
		
		/*Sintaxis IF-THEN
		 * 
		 * if(condicion(es)) {
		 * 		//codigo
		 * 
		 */
		System.out.println("Inicio de ejecucion");
		
		if(true) {
			System.out.println("Codigo de IF");
			
		}//if
		
		/*OPERADORES CONDICIONALES
		 * 
		 * ==	Igual a
		 * >	Mayor a
		 * <	Menor a
		 * <=	Menor o igual a
		 * >=	Mayor o igual a
		 * !=	Diferente a
		 */
		
		if(3>2) {
			System.out.println("3 es mayor que dos");
		}
		
		
		if(3<2) {
			System.out.println("Este codigo no se ejecutara");
		}
		
		boolean res = true;
		if(res == true) {
			
		}
		
		
		byte x = 7;
		byte y = 8;
		
		
		if(x==y) {
			System.out.println("Las variables son iguales");
		}
		
		if(x<y) {
			System.out.println("X es menor que Y");
		}
		
		if(x>y) {
			System.out.println("X es mayor que Y");
		}
		
		if(x<=y) {
			System.out.println("X es menor o igual que Y");
		}
		
		if(x>=y) {
			System.out.println("X es mayor o igual que Y");
		}
		
		if(x!=y) {
			System.out.println("Las variables son diferentes");
		}
		
		
		byte a = 7, b = 8, c;
		if((c=b) < a) {
			System.out.println("Ultimo If");
		}
		
		
		/*OPERADORES LOGICOS
		 * 
		 * 	&& ---> AND
		 * 	|| ---> OR
		 * 	!	---> NOT 
		 */
		
		if( a<b  && a<100) {
			System.out.println("Entando al codigo secreto AND");	
		}
		
		if( a<b  || a<100) {
			System.out.println("Entando al codigo secreto OR");	
		}
		
			
		System.out.println("Fin de ejecucion");
	}//main

}//class
