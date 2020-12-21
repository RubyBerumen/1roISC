import java.util.Random;
public class VectoresUnidimensionales {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		/*Se desea almacenar la temperatura detectada por
		 * 2 sensores en un invernadero, estas de registran 
		 * durante un mes
		 * 
		 */
		
		double temperaturas[] = new double [60];
		
		temperaturas [0] = 23.4;
		temperaturas [1] = 16.0;
		
		
		
		//LO MEJOR PARA MANIPULAR VECTORES SON LOS CICLOS
		
		for (int i=0; i<temperaturas.length; i++){
			double num = rnd.nextInt(30)+20;
			temperaturas[i] = num;
			
		}//for
		
		for (int i=0; i<temperaturas.length; i++){
		
			System.out.println(i + " --> "+temperaturas[i]);
		}//for
		
		//Suponiendo que el sensor 1 registro en pocisiones pares
		System.out.println("------------------------------------");
		
		for (int i=0; i<temperaturas.length; i++){
			if(i%2==0)
			System.out.println(i + " --> "+temperaturas[i]);
		}//for
		
		System.out.println("-------------------------------------");
		//Suponiendo que el sensor 1 registro en pocisiones pares 
		//y se desea verificar cuantas temperaturas de este sensor 
		//excedieron de 30º
		
		
		byte contador = 0;
		for (int i=0; i<temperaturas.length; i++){
			if(i%2==0 && temperaturas[i]>30 )
				contador++;
				
		}//for
		
		System.out.println("La cantidad de temperaturas que excedieron de 30º es:" + contador);
		
		//Generar temperaturas aleatorias entre 20 y 50
		
		
	

	}//main

}//class
