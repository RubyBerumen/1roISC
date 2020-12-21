import java.util.Scanner;

class Automovil{
	String linea;
	String color;
	String numSerie;
	String tipo;
	int a�oFabricacion;
	String modalidadSeguro;
	
	public void lectura() {
		
	}
	
	public Automovil() {}
	
	public Automovil(String linea, String color, String ns, String tipo, int a�o, String ms) {
		this.linea = linea;
		this.color = color;
		numSerie = ns;
		this.tipo = tipo;
		a�oFabricacion = a�o;
		modalidadSeguro = ms;
	}
	
	public void imprimirDatos () {
		System.out.println("Linea: "+linea);
		System.out.println("Color: "+color);
		System.out.println("N�mero de serie: "+numSerie);
		System.out.println("Tipo: "+tipo);
		System.out.println("A�o de fabricaci�n: "+a�oFabricacion);
		System.out.println("Modalidad del seguro: "+modalidadSeguro);
	}
	
	public int costoMantenimiento (int a�o, int km) {
		int costo = 0;
		
		if (a�o == 2015) {
			if (km >= 15000 || km <= 29999) {
				costo=1233;
			}else if (km >= 30000 || km <= 44999) {
				costo=2270;
			}else if (km >= 45000 || km <= 59999) {
				costo=1233;
			}else if (km >= 60000 || km <= 74999) {
				costo=4103;
			}else if (km >= 75000 || km <= 89999) {
				costo=1185;
			}if (km >= 90000 || km <= 104999) {
				costo=3978;
			}else if (km >= 105000 || km <= 119999) {
				costo=1233;
			}else if (km >= 120000 || km <= 134999) {
				costo=4103;
			}else if (km >= 135000 || km <= 149999) {
				costo=1233;
			}else if (km >= 135000 || km <= 149999) {
				costo=1233;
			}else if (km>= 150000) {
				costo=2485;
			}else;
			
		}else if (a�o >= 2012 || a�o <= 2014) {
			if (km >= 15000 || km <= 29999) {
				costo=1624;
			}else if (km >= 30000 || km <= 44999) {
				costo=1278;
			}else if (km >= 45000 || km <= 59999) {
				costo=3509;
			}else if (km >= 60000 || km <= 74999) {
				costo=1936;
			}else if (km >= 75000 || km <= 89999) {
				costo=2203;
			}if (km >= 90000 || km <= 104999) {
				costo=3114;
			}else if (km >= 105000 || km <= 119999) {
				costo=2547;
			}else if (km >= 120000 || km <= 134999) {
				costo=1936;
			}else if (km >= 135000 || km <= 149999) {
				costo=3460;
			}else if (km>= 150000) {
				costo=1808;
			}else;
			
		}else if (a�o <= 2011) {
			if (km >= 10000 || km <= 19999) {
				costo=1747;
			}else if (km >= 20000 || km <= 29999) {
				costo=1286;
			}else if (km >= 30000 || km <= 39999) {
				costo=3045;
			}else if (km >= 40000 || km <= 49999) {
				costo=1945;
			}else if (km >= 50000 || km <= 59999) {
				costo=2326;
			}if (km >= 60000 || km <= 69999) {
				costo=2536;
			}else if (km >= 70000 || km <= 79999) {
				costo=3650;
			}else if (km >= 80000 || km <= 89999) {
				costo=1945;
			}else if (km >= 90000 || km <= 99999) {
				costo=2997;
			}else if (km>= 100000) {
				costo=1817;
			}else;
			
		}
		
		return costo;
	}
	
	
}//class Automovil

public class Ej_02_Automovil {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa la linea del automovil: ");
		String linea = ent.nextLine();
		System.out.println("Ingresa el color del automovil: ");
		String color = ent.nextLine();
		System.out.println("Ingresa el n�mero de serie del automovil: ");
		String numSerie = ent.nextLine();
		System.out.println("Ingresa el tipo de automovil: ");
		String tipo = ent.nextLine();
		System.out.println("Ingresa el a�o de fabricaci�n del automovil: ");
		int a�o = ent.nextInt();
		System.out.println("Ingresa la modalidad de seguro del automovil: ");
		String modalidadSeguro = ent.nextLine();
		ent.nextLine();
		
		Automovil a1 = new Automovil(linea,color, numSerie, tipo, a�o, modalidadSeguro);
		a1.imprimirDatos();
		System.out.println("Ingresa el kilometraje actual del auto: ");
		int km = ent.nextInt();
		
		System.out.println("El costo a pagar por mantenimiento es: $"+a1.costoMantenimiento(a�o, km));
		
		Automovil a2 = new Automovil("Camaro", "Rojo", "S19070080", "Deportivo", 2015, "Cobertura amplia");
		a2.imprimirDatos();
		System.out.println("Ingresa el kilometraje actual del auto: ");
		km = ent.nextInt();
		System.out.println("El costo a pagar por mantenimiento es: $"+a1.costoMantenimiento(2015, km));

	}

}
