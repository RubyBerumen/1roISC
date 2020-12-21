import java.util.Scanner;
import java.util.Random;

public class Ejercicio05_CalificacionesAleatorias {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random rnd = new Random();
		
		
		System.out.println("==Programa que genera calificacionesa aleatorias\n "
				+ "y le da al usuario a elegir entre ciertas opciones==");
		System.out.println();
		
		System.out.println("Ingresa el numero de calificaciones que deseas obrener: ");
		byte numcal = entrada.nextByte();
		
		int sumcal = 0;
		
		int calificaciones[];
		calificaciones = new int [numcal];
		for (int i=0; i<calificaciones.length; i++){
			int num = rnd.nextInt(100);
			calificaciones[i] = num;
			
			sumcal = sumcal + calificaciones[i];
		}//for
		
	    int promedio = (sumcal/numcal);
	    
	    int mayprom = 0;
	    int menprom = 0;
	    
		for(int i=0; i<calificaciones.length; i++ ) {
					
			if(calificaciones[i]>promedio) {
						mayprom++;	
				}else if(calificaciones[i]<promedio) {
						menprom++;	
				}
			}//for
		
		int calificacionesa[];
		int calificacionesr[];
		
		int numapro = 0;
		int numrepro = 0;
		for (int i = 0; i<calificaciones.length; i++) {
			if (calificaciones[i]>=70) {
				numapro++;
				
			}else if(calificaciones[i]<70) {
				 numrepro++; 
			}
				}
		
		calificacionesa = new int[numapro];
		calificacionesr = new int[numrepro];
		
		int sumapro = 0;
		int sumrepro = 0;
		
		int a = -1;
		int b = -1;
		
		for (int i = 0; i<calificaciones.length; i++) {
			if(calificaciones[i]>=70) {
				a++;
				calificacionesa[a] = calificaciones[i];
				sumapro = sumapro +calificacionesa[a];
			}else if (calificaciones[i]<70) {
				b++;
				calificacionesr[b] = calificaciones[i];
				sumrepro = sumrepro + calificacionesr[b];
			}	
		}
	
		
		
		
		int aprobatorias = sumapro/numapro;
		int reprobatorias = sumrepro/numrepro;
	
				
		System.out.println("1) Obtener el promedio de calificaciones");
	    System.out.println("2) Mostrar cuantas calificaciones están por encima del promedio "
	     		+ "y cuantas por debajo");
	    System.out.println("3)Separar calificaciones aprobatorias y reprobatorias "); 
	    System.out.println("Elige una opción");
	    byte opcion = entrada.nextByte();
				
				
		switch (opcion) {
			 case 1 : System.out.println("El promedio es: "+ promedio);break;	
			 case 2 : 
			 	System.out.println("Hay "+mayprom+ " calificaciones por encima del promedio");
			 	System.out.println("Hay "+menprom+ " calificaciones por debajo del promedio");break;
			 case 3 : 
				 System.out.println("1) Promedio de calificaciones aprobatorias");
				 System.out.println("2) Promedio de calificaciones reprobatorias");
				 System.out.println("Elige una opción");
				 byte opcion2 = entrada.nextByte();
				 switch(opcion2) {
				 	case 1 : System.out.println("El promedio es: "+ aprobatorias);break;
				 	case 2 : System.out.println("El promedio es: "+ reprobatorias);break;
				 }
		
		
		}//switch
	    
	
		
		
		

	}

}
