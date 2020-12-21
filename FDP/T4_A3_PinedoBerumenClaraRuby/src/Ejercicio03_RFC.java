
public class Ejercicio03_RFC {

	public static void main(String[] args) {
		
		String nombres[][] = new String [3][3];
		String fechas[] = new String [3];
		
		nombres [0][0] = "Pinedo";
		nombres [0][1] = "Berumen";
		nombres [0][2] = "Clara";
		
		nombres [1][0] = "Pinedo";
		nombres [1][1] = "Berumen";
		nombres [1][2] = "Carlos";
		
		nombres [2][0] = "Pinedo";
		nombres [2][1] = "Berumen";
		nombres [2][2] = "Porfirio";
		
		fechas [0] = "15/08/2001";
		fechas [1] = "25/01/1990";
		fechas [2] = "30/06/1991";
		
		for (int i=0; i<nombres.length; i++) {
			for (int j=0; j<nombres[i].length; j++) {
				System.out.print(nombres [i][j]+ " ");
				
			}//for 2
			System.out.println();
			
		}//for 1
		
		for (int i=0; i<fechas.length; i++) {
			System.out.println(fechas [i]);
		}
		
		String apellido1 = "";
		String apellido2 = "";
		String nom = "";
		String rfc = "";
		
		for (int i=0; i<nombres.length; i++) {
			for (int j=0; j<nombres[i].length; j++) {
				
				if (j==0) {//apellido1
					apellido1 = nombres[i][j];
					apellido1 = apellido1.substring(0,1);
					
					rfc = rfc + apellido1;
					
					for (int k = 1; k < nombres[i][j].length(); k++) {
			        	char ascii = nombres[i][j].charAt(k);

			            if ((ascii == 'a') || (ascii == 'e') || (ascii == 'i') || (ascii == 'o') || (ascii== 'u')) {

			            	rfc = rfc + ascii;
			            	break;	  //se obtiene la primer vocal del primer apellido   
			            	
			            }

			        }//for

					
				}else if (j==1) {//apellido2
					apellido2 = nombres[i][j];
					apellido2 = apellido2.substring(0,1);
					
					rfc = rfc + apellido2;
					
				}else {
					nom = nombres[i][j];
					nom = nom.substring(0,1);
					
					rfc = rfc + nom;
				}
				
			}//for2
			
			rfc = rfc + fechas[i].substring(8);//se esta tomando el año
			rfc = rfc + fechas[i].substring(3,5);//se esta tomando el mes
			rfc = rfc + fechas[i].substring(0,2);//se toma el dia
			
			System.out.println("RFC de la persona " + (i+1) + " es: "+ rfc.toUpperCase());
			
			rfc = "";
	
		}//for1
		
		
	
		
		
		
		
		

	}

}
