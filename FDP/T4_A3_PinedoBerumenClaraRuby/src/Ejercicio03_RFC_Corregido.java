
public class Ejercicio03_RFC_Corregido {

	public static void main(String[] args) {
		
		String nombres[][] = new String [3][3];
		String fechas[][] = new String [3][3];
		
		nombres [0][0] = "Pinedo Berumen Clara Ruby";
		nombres [0][1] = "Morales Escobedo Denise";
		nombres [0][2] = "Valdez Calderon Bryan";
		nombres [1][0] = "Orquiz Ramos Sarahi";
		nombres [1][1] = "Casas Casas Alejandra";
		nombres [1][2] = "Carrillo Garay Myriam";
		nombres [2][0] = "Ramirez Rodriguez Cesar";
		nombres [2][1] = "Berumen Lopez Evelin";
		nombres [2][2] = "Gracia Sanchez Gabriela";
		
		fechas [0][0] = "15/08/2001";
		fechas [0][1] = "25/01/1990";
		fechas [0][2]= "30/06/1991";
		fechas [1][0] = "15/12/1995";
		fechas [1][1] = "15/01/2003";
		fechas [1][2]= "22/06/1987";
		fechas [2][0] = "19/09/2011";
		fechas [2][1] = "25/07/2002";
		fechas [2][2]= "26/11/1939";
		
		for (int i=0; i<nombres.length; i++) {
			for (int j=0; j<nombres[i].length; j++) {
				
				System.out.println(nombres [i][j]);
				
			}//for 2		
			
		}//for 1
		
		System.out.println();
		
		for (int i=0; i<fechas.length; i++) {
			for (int j=0; j<fechas.length; j++) {
				System.out.println(fechas [i][j]);
				
			}//for2
					
		}//for1
		
		System.out.println();
		
		String nombreCompleto = "";
		int posicionEspacio = 0;
		String apellido1 = "";
		String vocal = "";
		String apellido2 = "";
		String nom = "";
		String rfc = "";
		
		for (int i=0; i<nombres.length; i++) {
			for (int j=0; j<nombres[i].length; j++) {
				
				nombreCompleto = nombres[i][j];
				
				posicionEspacio = nombreCompleto.indexOf(" ");
				
				apellido1 = nombreCompleto.substring(0,posicionEspacio);
				
				nombreCompleto = nombreCompleto.substring(posicionEspacio+1);
					
				for (int k = 1; k< apellido1.length(); k++) {
					char ascii = apellido1.charAt(k);

					if ((ascii == 'a') || (ascii == 'e') || (ascii == 'i') || (ascii == 'o') || (ascii== 'u')) {
						
						vocal = Character.toString(ascii);
			        
						break;//se obtiene la primer vocal del primer apellido      	
			        }

			    }//for
								
				apellido1 = apellido1.substring(0,1);
					
				rfc += apellido1;
				
				rfc += vocal;
				
				posicionEspacio = nombreCompleto.indexOf(" ");
				
				apellido2 = nombreCompleto.substring(0, posicionEspacio);
				
				apellido2 = apellido2.substring(0,1);
					
				rfc = rfc + apellido2;
					
				nom = nombreCompleto.substring(posicionEspacio+1);
				
				//nom = nom.substring(0,1);
					
				rfc += nom.substring(0,1);
				
				rfc = rfc + fechas[i][j].substring(8);//se esta tomando el año
				rfc = rfc + fechas[i][j].substring(3,5);//se esta tomando el mes
				rfc = rfc + fechas[i][j].substring(0,2);//se toma el dia
				
				System.out.println("RFC de " + nombreCompleto.substring(posicionEspacio+1) + " es: "+ rfc.toUpperCase());
			
				rfc = "";
				
			}//for2
										
		}//for1
		
	}

}
