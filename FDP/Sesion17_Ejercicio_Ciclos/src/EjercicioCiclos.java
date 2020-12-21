
import java.util.Random;

public class EjercicioCiclos {

	public static void main(String[] args) {
		
		String cadenaJSON = "Ingeniero(a)&%$en&%$en&%$Sistemas&%$Computacionales&%$INMORTAL";
		
		//System.out.println(cadenaJSON.charAt(9));
		//System.out.println(cadenaJSON.substring(9,10));
		
		String cadenaURL = "http://192.168.1.10/proyecto%5%web";
		
		//"Limpiar" las cadenas para eliminar caracteres NO validos
		
		String cadenaNueva = "";
		for(int i=0; i<cadenaJSON.length(); i++) {
			char c = cadenaJSON.charAt(i);
			String c2 = cadenaJSON.substring(i, i+1).toLowerCase();
			//System.out.println(c2);
			
			//if(c2.equals("a") || c2.equals("b"))
			
			if((int)c>=65 && (int)c<=90) {
				//System.out.println(c);
				cadenaNueva = cadenaNueva + c;
			}else if((int)c>=97 && (int)c<=122) {
				//System.out.println(c);
				cadenaNueva += c;
			}else if((int)c>=40 && (int)c<=41) {
				//System.out.println(c);
				cadenaNueva += c;
			}
			
			
					
		}//for
		System.out.println(cadenaNueva);
		
		// 65_A --> 90_Z
		// 97_a --> 122_z
		
		
		//====================================================================
		System.out.println("-------GENERACION DE NÚMEROS ALEATORIOS---------");
		
		System.out.println((int)(Math.random()*100));
		
		Random numAleatorio = new Random();
		
		//Generar calificaciones de 0 - 100
		System.out.println(numAleatorio.nextInt(100));
		
		//Generar numeros entre 20 y 30
		System.out.println(numAleatorio.nextInt(10) + 20);
		
		
		
		
		
		


	}

}
