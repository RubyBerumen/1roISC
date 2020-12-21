
public class Ej_Ex_3_PJ {

	public static void main(String[] args) {

		
		String candidatos[][] = {{"Dist", "Cand", "Cand", "Cand", "Cand"},
				 {" ", "A", "B", "C", "D"},
				 {"1", "194", "48", "206", "45"},
				 {"2", "180", "20", "320", "16"},
				 {"3", "221", "90", "140", "20"},
				 {"4", "432", "50", "821", "14"},
				 {"5", "820", "61", "946", "18"},
				};
		
		//IMPRESION
		for (int i=0; i<=candidatos.length-1; i++) {
			for (int j=0; j<=candidatos[i].length-1; j++) {
						
				System.out.print(candidatos[i][j] + "\t");
						
			}//for 2
			System.out.println();
		}//for 1
		System.out.println();
				
				
		//SUMA TOTAL
		int sumaTotal = 0;
						
		for (int i=1; i<candidatos[i].length; i++) {
			for (int j=2; j<candidatos.length; j++) {
				sumaTotal = sumaTotal + Integer.parseInt(candidatos[j][i]);
			}//for2
					
		}//for1
		
		
		//NUMERO DE VOTOS POR CANDIDATO
		int sumaVotos = 0;
								
		for (int i=1; i<candidatos[i].length; i++) {
			for (int j=2; j<candidatos.length; j++) {
				sumaVotos = sumaVotos + Integer.parseInt(candidatos[j][i]);
			}//for2
			System.out.println("Numero de votos del candidato "+candidatos[1][i]+": "+sumaVotos);
					
			sumaVotos=0;
		}//for1
		System.out.println();
				
				
		//PORCENTAJE POR CANDIDATO
		for (int i=1; i<candidatos[i].length; i++) {
			for (int j=2; j<candidatos.length; j++) {
				sumaVotos = sumaVotos + Integer.parseInt(candidatos[j][i]);
						
			}//for2
			System.out.println("Porcentaje del candidato "+candidatos[1][i]+": "+(sumaVotos*100)/sumaTotal + "%");
			sumaVotos=0;
		}//for1
		System.out.println();
		
		
		//NUMERO DE VOTOS POR DISTRITO
		int sumaDis = 0;
		
		for (int i=2; i<candidatos.length; i++) {
			for (int j=1; j<candidatos[i].length; j++) {
				sumaDis = sumaDis + Integer.parseInt(candidatos[i][j]);
			}
			System.out.println("Número de votos del distrito "+candidatos[i][0]+": "+sumaDis);
			sumaDis=0;
		}
		System.out.println();
		
		
		//PORCENTAJE POR DISTRITO
		int porciento = 0;
		
		for (int i=2; i<candidatos.length; i++) {
			for (int j=1; j<candidatos[i].length; j++) {
				sumaDis = sumaDis + Integer.parseInt(candidatos[i][j]);
			}
			porciento = (sumaDis*100)/sumaTotal;
			System.out.println("Porcentaje del distrito "+candidatos[i][0]+": "+porciento+"%");
			if(porciento>50) {
	            System.out.println("    ¡Candidato con mayor numero de votos!");
	            System.out.println("    ¡Candidato ganador!");
			}
			sumaDis=0;
			porciento=0;
		}
		
		
		
		
		

	}

}
