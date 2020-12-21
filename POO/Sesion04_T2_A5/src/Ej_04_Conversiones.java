import java.util.Scanner;

class Conversiones {
	double cant;
	double resultados[];
	
	public void lecturaAtributos() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa la cantidad a convertir: ");
		cant = ent.nextDouble();
	}
	
	public double[] kilometros() {
		double millas;
		double pies;
		double pulgadas;
		
		resultados = new double [3];
		
		resultados[0]=cant/1.609; 
		resultados[1]=cant*3281;
		resultados[2]=cant*39370;
		
		return resultados;
	}
	
	public double[] millas() {
		double km;
		double metros;
		double cm;
		
		resultados = new double [3];
		
		resultados[0]=cant*1.609; 
		resultados[1]=cant*1609;
		resultados[2]=cant*160934;
		
		return resultados;
		
	}
	
}//class Conversiones

public class Ej_04_Conversiones {

	public static void main(String[] args) {
		
		Conversiones cn1 = new Conversiones();
		Scanner ent = new Scanner(System.in);
		
		System.out.println("1) Kilómetros a Millas, Pies y Pulgadas");
		System.out.println("2) Millas a Kilómetros, Metros y Centímetros");
		System.out.println("Elige una opción");
		byte op = ent.nextByte();
		
		cn1.lecturaAtributos();
		
		if (op == 1) {
			double res [] = cn1.kilometros();
			System.out.println("Millas: " + res[0]);
			System.out.println("Pies: " + res[1]);
			System.out.println("Pulgadas: " + res[2]);
		} 
		else if (op == 2) {
			double res [] = cn1.millas();
			System.out.println("Kilometros: " + res[0]);
			System.out.println("Metros: " + res[1]);
			System.out.println("Centimetros: " + res[2]);
		} 
		else System.out.println("Opción incorrecta");
	
		
		
		
		

	}

}
