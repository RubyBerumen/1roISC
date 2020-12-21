import java.util.Scanner;

class ConversorTemperaturas{
	double gC;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa grados Celsius:");
		gC = entrada.nextDouble();
	}
	
	public void mostrarAtributos() {
		System.out.println("Grados celsius: "+ gC);
	}
	
	public void convertirAFahrenheit() {
		double gF = gC*1.8+32;
		System.out.println("Grados fahrenheit: "+ gF);
	}
	
	public void convertirAKelvin() {
		double gK = gC+273.15;
		System.out.println("Grados kelvin: "+gK);
	}
	
	public void convertirARankine() {
		double gR = gC*1.8+491.67;
		System.out.println("Grados rankine: " + gR);
	}
}



public class Ej_02_Temperaturas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ConversorTemperaturas ct1 = new ConversorTemperaturas();
		ct1.lecturaAtributos();
		ct1.mostrarAtributos();
		
		System.out.println("A que desea convertir los °C ? ");
		System.out.println("1) grados Fahrenheit");
		System.out.println("2) grados Kelvin");
		System.out.println("3) grados Rankine");
		byte op = entrada.nextByte();
		
		switch (op){
			case 1 : ct1.convertirAFahrenheit();break;
			case 2 : ct1.convertirAKelvin();break;
			case 3 : ct1.convertirARankine();break;
			default : System.out.println("Opción incorrecta");
		
		}
		
		
		
	}

}
