import java.util.Scanner;

public class Ejercicio12_RFC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa para obtener el RFC de una paersona==");
		System.out.println();
		
		
		System.out.println("Ingresa tu nombre"); 
		String nombre = entrada.nextLine();
		
		System.out.println("Ingresa tu apellido Paterno");
		String apellidoP = entrada.nextLine();
		
		System.out.println("Ingresa tu apellido Materno");
		String apellidoM = entrada.nextLine();
		
		System.out.println("Ingresa tu fecha de nacimiento en formato dd/mm/aaaa");
		String fecha = entrada.nextLine();
		
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

}
