import java.util.Scanner;

class Hora {
	int seg; 
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de segundos a convertir: ");
		seg = entrada.nextInt();
	}
	
	public void mostrarAtributos() {
		System.out.println("Segundos: "+ seg);
	}
	
	public void convertirAHoras() {
		int horas = seg/3600;
		int minutos = (seg%3600)/60;
		int segRestantes = (seg%3600)%60;
		
		System.out.print("Horas: ");
		if (horas<10) {
			String horas1 = "0"+Integer.toString(horas);
			System.out.print(horas1 + ":");
		}else System.out.print(horas + ":");
		
		if(minutos<10) {
			String minutos1 = "0"+Integer.toString(minutos);
			System.out.print(minutos1 + ":");
		}else System.out.print(minutos + ":");
		
		if(segRestantes<10) {
			String segRestantes1 = "0"+Integer.toString(segRestantes);
			System.out.println(segRestantes1);
		}else System.out.println(segRestantes);
		
		
		
		
		//System.out.println("Horas: "+ horas+":"+minutos+":"+segRestantes);
	}
}//class Hora 



public class Ej_03_Horas {

	public static void main(String[] args) {
		
		Hora h1 = new Hora();
		h1.lecturaAtributos();
		h1.mostrarAtributos();
		h1.convertirAHoras();
		
		

	}

}
