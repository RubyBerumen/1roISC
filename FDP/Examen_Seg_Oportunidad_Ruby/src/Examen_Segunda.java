import java.util.Random;

public class Examen_Segunda {

	public static void main(String[] args) {
		
		System.out.println("Programa que muestra las temperaturas en una mina"
				+ "y su hora");
		
		Random rnd = new Random();
		
		String temperaturas [] = new String [48];
		
		//LLenado horas
		for (int i=0; i<temperaturas.length; i+=2) {
			
			temperaturas [i] = String.valueOf(i/2);
			
			//System.out.println("hora: " + temperaturas[i]);
		}
		
		
		//LLenado temperaturas
		for (int i=1; i<temperaturas.length; i+=2) {
			
			temperaturas[i] = String.valueOf(rnd.nextInt(50)+"°C");
			
			//System.out.println("temperaturas: "+temperaturas[i]);
		}
		
		
		//Impresion
		for (int i=0; i<temperaturas.length/2; i++) {
			System.out.print(temperaturas[i]+" ");
		}
		System.out.println();
		for (int i=temperaturas.length/2; i<temperaturas.length; i++) {
			System.out.print(temperaturas[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		
		//temperaturas igual a 30
		int num=0;
		System.out.println("Temperaturas que son exactamente igual a 30");
		for (int i=0; i<temperaturas.length; i++) {
			
			if (temperaturas[i].contains("30")) {
				num++;
				System.out.println(temperaturas[i-1]+" "+temperaturas[i]);
			}
		}
		System.out.println("Total de temperaturas con 30°C: "+num);
		
		
		//Guardado de 30°C en otro vector
		String temperaturas30 [] = new String [num*2];
		int num2 =0;
		
		for (int i=1; i<temperaturas.length; i+=2) {
			if (temperaturas[i].equals("30°C")){
				temperaturas30[num2] = temperaturas[i-1];
				num2++;
				temperaturas30[num2]= temperaturas[i];
				num2++;
			}
					
		}
		
	
		int dia=0;
		int noche=0;
		for (int i=0; i<temperaturas30.length; i+=2) {
				int hora = Integer.parseInt(temperaturas30[i]);
				if (hora>=6 && hora>=18){
					dia++;
				}else if(hora>=19 && hora<=5) {
					noche++;
			}
		}
	
		
		if(dia>noche) {
			System.out.println("Hubo mas temperaturas con 30°C en el dia");
		}else if(dia<noche){
			System.out.println("Hubo mas temperaturas con 30°C en la noche");
		}
		else if (dia==noche){
			System.out.println("La cantidad de temperaturas con 30°C en el dia y la noche fue igual");
		}
		
	

	}

}
