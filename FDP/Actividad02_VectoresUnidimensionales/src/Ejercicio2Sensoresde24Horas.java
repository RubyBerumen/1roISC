import java.util.Random;
import java.util.Scanner;

public class Ejercicio2Sensoresde24Horas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Programa que captura los estados de un sensor en 24 horas (un estado por hora)");
		System.out.println("===================================================================================");
		
		boolean sensor [];
		sensor = new boolean [24];
		byte contadorT = 0; 
		byte contadorTT = 0;
		byte contadorFF = 0;
		
		 Random sensorAli = new Random();
		
		for (int i = 0;i<sensor.length; i = i+1) {
			sensor[i] = sensorAli.nextBoolean();
		
			if (sensor[i]==true) {
				contadorT = (byte) (contadorT +1);
				
				
			}
		}
		
		
		
		
		
		System.out.println("=======================================================");
		System.out.println("Sensores abiertos: " + contadorT);
		System.out.println("Sensores cerrados: " + (24-contadorT));
		
		
		for (int i = 0; i<=11;i = i+1) {
			
			if (sensor[i]==true) {
				contadorTT = (byte) (contadorTT + 1);
			}else contadorFF = (byte) (contadorFF+1);
		}
		
		if (contadorTT>contadorFF) {
			System.out.println("Durante el DIA el sensor estuvo mayormente ABIERTO");
		}else if(contadorTT==contadorFF) {
				System.out.println("Durante la NOCHE estuvo Abierto y Cerrado el mismo numero de veces ");
		}else System.out.println("Durante el DIA el sensor estuvo mayormente CERRADO");
		
		
		contadorTT = 0;
		contadorFF = 0;
		
for (int i = 12; i<=23;i = i+1) {
			
			if (sensor[i]==true) {
				contadorTT = (byte) (contadorTT + 1);
			}else contadorFF = (byte) (contadorFF+1);
		}
		
		if (contadorTT>contadorFF) {
			System.out.println("Durante la NOCHE el sensor estuvo mayormente ABIERTO");
		}else if (contadorTT==contadorFF) {
			System.out.println("Durante la NOCHE estuvo Abierto y Cerrado el mismo numero de veces ");
		}else System.out.println("Durante la NOCHE el sensor estuvo mayormente CERRADO");
		
		
		
	}

}
