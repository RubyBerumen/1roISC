import java.util.Scanner;

class ObtenerRFC {
	
	public String calcularRFC (String nombre, String fecha) {
		
		return "";
	}
}



public class Ej_07_RFC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre completo:"); 
		String nombre = entrada.nextLine();
		System.out.println("Ingresa tu fecha de nacimiento en formato dd/mm/aaaa");
		String fecha = entrada.nextLine();
		
		ObtenerRFC rfc1 = new ObtenerRFC();
		System.out.println(rfc1.calcularRFC(nombre, fecha));
		
		
	

	}

}
