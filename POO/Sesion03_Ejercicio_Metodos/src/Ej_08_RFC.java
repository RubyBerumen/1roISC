import java.util.Scanner;

class ObtenerRegistroFederalContribuyentes{
	String nombre;
	String apellidoP;
	String apellidoM; 
	String fecha;
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre"); 
		nombre = entrada.nextLine();
		System.out.println("Ingresa tu apellido Paterno");
		apellidoP = entrada.nextLine();
		System.out.println("Ingresa tu apellido Materno");
		apellidoM = entrada.nextLine();
		System.out.println("Ingresa tu fecha de nacimiento en formato dd/mm/aaaa");
		fecha = entrada.nextLine();
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: "+nombre); 
		System.out.println("Apellido Paterno: "+apellidoP);
		System.out.println("Apellido Materno: "+apellidoM);
		System.out.println("Fecha de nacimiento: "+fecha);
	}
	
	public void obtenerRFC() {
		String apellidoP1 = apellidoP.substring(0, 1).toLowerCase();
		apellidoM = apellidoM.substring(0,1);
		nombre = nombre.substring(0,1);
		String año = fecha.substring(8,10);
		String mes = fecha.substring(3,5);
		String dia = fecha.substring(0,2);

		String vocales = "";
		
        for (int i = 1; i < apellidoP.length(); i++) {
        	char ascii = apellidoP.charAt(i);
            if ((ascii == 'a') || (ascii == 'e') || (ascii == 'i') || (ascii == 'o') || (ascii== 'u')) {
            	vocales = vocales + ascii; 
            }
        }//for
        
        String vocal2 = vocales.substring(0, 1);
		
		String rfc = apellidoP1+vocal2+apellidoM+nombre+año+mes+dia;
			System.out.println("Su RFC es: " + rfc.toUpperCase());
	}
	
}//class ObtenerRegistroFederalContribuyentes

public class Ej_08_RFC {

	public static void main(String[] args) {
		
		ObtenerRegistroFederalContribuyentes rfc1 = new ObtenerRegistroFederalContribuyentes();
		rfc1.lecturaAtributos();
		rfc1.mostrarAtributos();
		rfc1.obtenerRFC();
		
		
	}

}
