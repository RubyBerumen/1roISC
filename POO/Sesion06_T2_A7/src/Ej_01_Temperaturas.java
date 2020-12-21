import java.util.Scanner;

class Temperaturas{
	double temperaturaRegistrada;
	double horaRegistro;
	String fechaRegistro;
	String sensorQueLaRegistro;
	
	public void lecturaAtributos() {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingresa  una temperatura en °C");
		double temperatura = ent.nextDouble();
	}
	
	public Temperaturas() {}
	
	public Temperaturas(double tr, double hr, String fr, String sr) {
		temperaturaRegistrada=tr;
		horaRegistro=hr;
		fechaRegistro=fr;
		sensorQueLaRegistro=sr;
	}
	
	public double [] convertirTemperaturas(double tempRegistrada) {
		temperaturaRegistrada = tempRegistrada;
		double temperaturas [] = new double [3];
		temperaturas [0] = temperaturaRegistrada*(1.8)+32;
		temperaturas [1] = temperaturaRegistrada*(1.8)+491.67;
		temperaturas [2] = temperaturaRegistrada+273.15;
		
		return temperaturas;
	}
	
	public void impresion(double [] temps) {
		System.out.println("°F: "+ temps[0]);
		System.out.println("°R: "+ temps[1]);
		System.out.println("°K: "+ temps[2]);
	}
	
	
	
}//class Temperaturas


public class Ej_01_Temperaturas {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double temperatura;
		Temperaturas tem1 = new Temperaturas();
		System.out.println("Ingresa  una temperatura en °C");
		temperatura = ent.nextDouble();
		tem1.impresion(tem1.convertirTemperaturas(temperatura));
		
		Temperaturas tem2 = new Temperaturas();
		System.out.println("Ingresa  una temperatura en °C");
		temperatura = ent.nextDouble();
		tem2.impresion(tem2.convertirTemperaturas(temperatura));
		
		Temperaturas tem3 = new Temperaturas();
		System.out.println("Ingresa  una temperatura en °C");
		temperatura = ent.nextDouble();
		tem3.impresion(tem3.convertirTemperaturas(temperatura));
		

		

	}

}
