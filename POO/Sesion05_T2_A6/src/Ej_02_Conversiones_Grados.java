import java.util.Scanner;

class Conversiones {
	
	public double fahrenheitAC (double gr) {
		
		return (gr-32)/1.8;
	}
	
	public double centigradosAF (double gr) {
		
		return (gr*1.8)+32;
	}
}//class Conversiones


public class Ej_02_Conversiones_Grados {

	public static void main(String[] args) {
	
		Conversiones c1 = new Conversiones ();
		Scanner ent = new Scanner (System.in);
		
		System.out.println("1) Convertir de °F a °C");
		System.out.println("2) Concertir de °C a °F");
		System.out.println("Elige una opción");
		byte op = ent.nextByte();
		
		System.out.println("Ingresa los grados a convertir: ");
		double grados = ent.nextDouble();
		
		if (op==1) {
			System.out.println("Grados Fharenheit: "+grados);
			System.out.println("Grados Centigrados: "+ c1.fahrenheitAC(grados));
		}else if (op==2) {
			System.out.println("Grados Centigrados: "+grados);
			System.out.println("Grados Fharenheit: "+ c1.centigradosAF(grados));	
		}else System.out.println("Opción incorrecta!");
		
		
		

	}

}
