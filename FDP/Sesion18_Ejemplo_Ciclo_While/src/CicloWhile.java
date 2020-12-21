import java.lang.Math;

import java.util.Random;

import java.util.Scanner;
/* ESTRUCTURAS DE CONTROL
 * 
 * 		Repeticiones (Ciclos o Bucles)
 * 		
 * 		1. FOR --> Se utiliza cuando se conoce la cantidad de repeticiones
 * 		2. WHILE --> Cunado NO se conoce la cantidad de repeticiones
 * 		3. DO-WHILE 
 * 
 * 			Sintaxis: 		while (condicion) {
 * 								//codigo a repetirse
 * 							}
 * 
 * 							while(a<b){
 * 							}
 * 
 */

public class CicloWhile {

	public static void main(String[] args) {
		
		//CICLO INFINITO
		
		/*while(true) {
			System.out.println("Magia magia con WHILE");
		}*/
		
		
		int numero = 0;
		while (numero !=10) {
			System.out.println(numero);
			
			//numero = (int)(Math.random()*10+1);
			
			Random n = new Random();
			numero = n.nextInt(11);
		}
		
		System.out.println("================================================");
		
		/*for(int i=1; i<=10; i++) {
			System.out.println(i);
		}*/
		
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			
			//codigo
			
			i++;
		}
		
		System.out.println("===============================================");
		
		i = 1;
		int num = 5;
		while (i<=10) {
			
			System.out.println(num + " * " + i + "= " +(num*i));
			
			i++;
		}
		
		System.out.println("========================================");
		
		Scanner entrada = new Scanner(System.in);
		boolean adivinado = false;
		Random rnd = new Random();
		byte numeroMagico = (byte)rnd.nextInt(100);
		byte vidasRestantes = 0;
		
		while (!adivinado && vidasRestantes<=5) {
			System.out.println("Estoy pensando en un número (0-100), Adiviana cual es: ");
			num= entrada.nextInt();
			if(num==numeroMagico) {
				System.out.println("Lo adivinaste :) ");
				adivinado = true;
			}else if(num>numeroMagico) {
				vidasRestantes++;
				System.out.println("Tu número es Mayor");
			}else 
				System.out.println("Tu número es Menor");
			vidasRestantes++;
		}
		
		
		System.out.println("==========================================");
		i=1;
		int j=1;
		while(i<=10) {
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
			j=1;//Se debe reiniciar J para el siguiente ciclo de la I
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
