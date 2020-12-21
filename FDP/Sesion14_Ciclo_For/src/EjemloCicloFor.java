
/* ====ESTRUCTURAS DE CONTROL DE FLUJO=======
 * 
 * ----- Estructuras de control REPETITIVAS (Ciclos o Bucles)--------
 * 
 * 		1)FOR
 * 		2)WHILE
 * 		3)DO-WHILE
 * 
 * 		Ciclo FOR
 * 
 * 		Sintaxis
 * 
 * 			for(variable_indice ; condicion fin ; incremento )  {
 * 				//còdigo a repetirse
 * 			}
 * 
 * 			indice - Indica el inicio de las rapeticiones
 * 
 */

public class EjemloCicloFor {

	public static void main(String[] args) {
		
		
		//Obtener el promedio de 5 calificaciones
		//Leer la calificaciòn 1
		//Leer la calificaciòn 2
		//Leer la calificaciòn 3
		//Leer la calificaciòn 4
		//Leer la calificaciòn 500
		
		//Realizar sumatoria y dividirla entre la cantidad de calificaciones
		
		
		//Ciclo infinito
		//for(;;) {
			//System.out.println("Magia magia");
		//}
		
		int i;			//incremento en 1   --> i = i + 1   --> i+=1
		for(i=0; i<=10; i++ ) {
			System.out.println(i + " Magia magia");
		}
		
		
		System.out.println("=======================");
		for(i=100; i<=110; i++ ) {
			System.out.println(i + " Magia magia");
		}
		
		
		System.out.println("=======================");
		for(i=100; i<=90; i++ ) {
			System.out.println(i + " Magia magia");
		}
		//No entra al ciclo porque no se cumple la condicion desde el principio

		
		System.out.println("=======================");
		for(int x=1; x<=20; x+=2 ) {
			System.out.println(x + " Magia magia");
		}
		
		
		
		//CICLO INVERSO
		for(int x=100; x>=0; x--) { //x-= 1   x = x -1
			
		}
		
		
		

		//===============================
		boolean sensor = true;
		
		int suma = 0; //Variable local
		
		if(sensor) {
			suma = 857;  //Variable de bloque
		}

		
		//==================================================
		
		int n = 7;
		
		for (int y =1; y<=10; y=y+1) {
			System.out.println( n + " * " + y + " = " + (n*y));
		}
		
		
		System.out.println("=========================");
		
		//Mostrar los nùmeros Impares del 1 al 100
		
		for(int x=1; x<=100; x+=2) {
			System.out.println(x);
		}
			
		//Mostrar los nùmeros Impares del 1 al 100 CON INCREMENTOS DE 1en 1
		
		for(int x=1; x<=100; x+=1) {
			if(x%2 == 1)
				System.out.println(x);
			
			
		}
		
			
		
		
		
		
		
		
		
		
		
		
	}//main

}//
