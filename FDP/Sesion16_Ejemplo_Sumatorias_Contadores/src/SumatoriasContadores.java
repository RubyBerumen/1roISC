
public class SumatoriasContadores {

	public static void main(String[] args) {
		
		//Sumatroia de todos los números del 1 al 100
		
		int sumatoria = 0;
		
		for(int i=0; i<=100; i++) {	
			sumatoria = sumatoria + i;
		}
		
		System.out.println("Suma: " + sumatoria);
		
		
		//Sumatoria de los números impares
		
		sumatoria = 0;
		for(int i=0; i<=100; i++) {	
			if(i%2==1)
			sumatoria = sumatoria + i;
		}
		
		System.out.println("Suma impares: " + sumatoria);
		
		
		//Sumatoria de los multiplos de 5
		
		sumatoria = 0;
		for(int i=0; i<=10; i++) {	
			if(i%5==0)
			sumatoria += i;
		}
		System.out.println("Suma multiplos del 5: " + sumatoria);
		
		
		//CUANTOS multiplos hay entre 1 y 100
		
		int contador = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%5==0);
				contador = contador +1;
			
		}
		
		System.out.println("Cantidad de multiplos de 5: " + contador);
		
		
		System.out.println((char)64);
		System.out.println((char)97);
		
		for(int i=1; i<=137374; i++) {
			if(i%30==0)
				System.out.println();
			System.out.print((char)i + "-");
		}
		
		
		
		
		


	}

}
