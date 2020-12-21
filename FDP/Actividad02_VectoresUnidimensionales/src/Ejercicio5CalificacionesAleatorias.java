import java.util.Random;
import java.util.Scanner;

public class Ejercicio5CalificacionesAleatorias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Programa que Asigna calificaciones aleatorias y muestra un menu para promedios");
		System.out.println("===================================================================================");
		System.out.println("Ingresa el numero de calificaciones que se vana evaluar:");
		int ncal = entrada.nextInt();
		
		int calificaciones [];
		calificaciones = new int [ncal];
		int contcali = 0;
		Random ali = new Random();
		int contencima = 0;
		int contdebajo =0;
		int apro = 0;
		int repro = 0;
		int contencima1 = 0;
		int contdebajo1 =0;
		
		for (int i = 0; i<calificaciones.length;i = i+1) {
			calificaciones[i]=ali.nextInt(100);
			
			contcali = contcali + calificaciones[i];
		}
		
		int promedio = contcali/calificaciones.length;
		System.out.println("=====================================================================================================");
		System.out.println("Inrese la opcion que desea obtener:");
		System.out.println("1)Obtener el promedio de las calificaciones");
		System.out.println("2)Mostrar cuantas calificaciones estan por encima del promedio y cuantas por debajo del promedio");
		System.out.println("3)Separar Calificaciones aprobatorias y reprobatorias en otros vectores");
		int opcion = entrada.nextByte();
		
		for (int i = 0; i<calificaciones.length; i = i+1) {
			if (calificaciones[i]>=promedio) {
				contencima = contencima + 1;
			}else if (calificaciones[i]<promedio) {
				contdebajo = contdebajo + 1;
			}
				}
		
		
		int caliA [];
		int caliR [];
		
		
		for (int i = 0; i<calificaciones.length; i = i+1) {
			if (calificaciones[i]>=70) {
				contencima1 = contencima1 + 1;
				
			}else if(calificaciones[i]<70) {
				contdebajo1 = contdebajo1 + 1; 
			}
				}
		caliA = new int [contencima1];
		caliR = new int [contdebajo1];
		int a = -1;
		int b = -1;
		
		for (int i = 0; i<calificaciones.length; i = i +1) {
			if (calificaciones[i]>=70) {
				a = a +1;
				caliA[a]=calificaciones[i];
			}else if (calificaciones[i]<=69) {
				b = b +1;
				caliR[b] = calificaciones[i];
			}
		}
		int k = 0;
		int l = 0;
		
		for (int i = 0;i<caliA.length;i = i +1) {
			k = k + caliA[i];
		}
		for (int i = 0; i<caliR.length;i=i+1) {
			l = l + caliR[i];
		}
		
		if (contdebajo1==0) {
			contdebajo1=1;
		}
		
		if  (contencima1==0) {
			contencima1=1;
		}
		
		
		System.out.println("========================================================================================");
		switch (opcion) {
		case 1:System.out.println("El promedio de las calificaciones es: " + promedio);break;
		case 2:System.out.println("la cantidad de calificaciones encima del promedio son: " + contencima);
			   System.out.println("La cantidad de calificaciones debajo del promedio son: " + contdebajo);break;
		case 3: System.out.println("Elige cual promedio decea obtener:");
				System.out.println("1)Mostar el promedio de las calificaciones aprobatorias");
				System.out.println("2)Mostar el promedio de las calificaciiones reporbatorias");
				int opcion2 = entrada.nextByte();
				switch(opcion2) {
				case 1:System.out.println("El promedio de las calificaciones APROBATORIAS es: " + (k/contencima1));break;
				case 2:System.out.println("El promedio de las calificaciones REPROBATORIAS es: " + (l/contdebajo1));break;
				default: System.out.println("Opcion invalida!");break;
				}
		
		}
		
	}

}
