import java.util.Scanner;

public class Ejercicio03_Temperaturas {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que llena un vector con temperaturas==");
		System.out.println();
		
		System.out.println("Cuantas temperaturas desea ingresar?");
		byte numtem = entrada.nextByte();
		
		double sumatem = 0;
		double promedio = 0;
		
		double temperaturas[];
		temperaturas = new double [numtem];
		
		
		for(int i=0; i<temperaturas.length; i++ ) {
			System.out.println("Ingresa temperatura "+(i+1)+":");
			temperaturas[i] = entrada.nextDouble();
			
			temperaturas[i] = temperaturas[i] * 100;
			temperaturas[i] = Math.round(temperaturas[i]);
			
			temperaturas[i] = temperaturas[i] / 100;
			
			sumatem = sumatem + temperaturas[i];
			

			
			
		}//for
		
		promedio = sumatem/numtem;
		
		System.out.println("Temperaturas mayores al promedio");
		for(int i=0; i<temperaturas.length; i++ ) {
			
			if(temperaturas[i]>promedio) {
				System.out.println((i+1)+": "+temperaturas[i]);
			}
		}
		
		System.out.println("Temperaturas menores al promedio");
		for(int i=0; i<temperaturas.length; i++ ) {
			
			if(temperaturas[i]<promedio) {
				System.out.println((i+1)+": "+temperaturas[i]);
			}
		}
		
		
		


	}

}
