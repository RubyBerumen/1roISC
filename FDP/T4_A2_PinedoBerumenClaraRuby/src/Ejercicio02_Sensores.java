import java.util.Random;
import java.util.Scanner;

public class Ejercicio02_Sensores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Random rnd = new Random();
		
		System.out.println("==Programa que simula la activacion e inactivacion de sensores==");
		System.out.println();
		
		boolean sensores[];
		sensores = new boolean [24];
		
		int abiertos1 = 0;
		int cerrados1 = 0;
		for (int i=0; i<sensores.length/2; i++) {
			sensores[i] = rnd.nextBoolean();
			
			if(sensores[i]) {
				abiertos1++;	
			}else
				cerrados1++;
			 	
		}//for
		
		
		int abiertos2 = 0;
		int cerrados2 = 0;
		for(int i=12; i<sensores.length; i++) {
			sensores[i] = rnd.nextBoolean();
			
			if(sensores[i]) {
				abiertos2++;	
			}else
				cerrados2++;
			
		}//for
		
		System.out.println("Se abrieron " + (abiertos1+abiertos2) + " sensores");
		System.out.println("Se cerraron " + (cerrados1+cerrados2) + " sensores");
		
		if(abiertos1>cerrados1) {
			System.out.println("Se abrieron más sensores en el día, "
					+ "con un total de: "+ abiertos1);
		}else 
			System.out.println("Se cerraron más sensores en el día, "
					+ "con un total de: "+ cerrados1);
		
		if(abiertos2>cerrados2) {
			System.out.println("Se abrieron más sensores en la noche, "
					+ "con un total de: "+ abiertos2);
		}else 
			System.out.println("Se cerraron más sensores en la noche, "
					+ "con un total de: "+ cerrados2);
		
		
		
		
		

	}

}
