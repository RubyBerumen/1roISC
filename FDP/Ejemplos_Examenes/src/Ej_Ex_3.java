
public class Ej_Ex_3 {

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
		for (int i=0; i<candidatos.length; i++) {
			for (int j=0; j<candidatos[i].length; j++) {
				
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
		int votos[]= new int [candidatos.length];
		
		for (int i=1; i<candidatos[i].length; i++) {
			for (int j=2; j<candidatos.length; j++) {
				sumaVotos = sumaVotos + Integer.parseInt(candidatos[j][i]);
			}//for2
			System.out.println("Numero de votos del candidato "+candidatos[1][i]+": "+sumaVotos);
			votos[i]=sumaVotos;
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
		
		/*
		//CANDIDATO GANADOR
		for (int i=1; i<candidatos[i].length; i++) {
			for (int j=2; j<candidatos.length; j++) {
				sumaVotos = sumaVotos + Integer.parseInt(candidatos[j][i]);
			}//for2
			if (sumaVotos>sumaTotal/2)
				System.out.println("¡El candidato "+ candidatos[1][i] + " es el ganador!");
			sumaVotos=0;
		}//for1
		System.out.println();
		*/
		
		
		//CANDIDATO MAS VOTADO
		int votosOrdenados [] = new int[votos.length];
		for (int i=0; i<votos.length; i++) {
			votosOrdenados[i]=votos[i];
		}
		
		for(int i=0; i<votosOrdenados.length-1; i++) {
			for (int j=0; j<votosOrdenados.length-1; j++) {
				
				if (votosOrdenados[j]<votosOrdenados[j+1]) {
					
					int temp = votosOrdenados[j+1];
					votosOrdenados[j+1]=votosOrdenados[j];
					votosOrdenados[j]=temp;
				}
			}
		}
		
		int lugar = 0;
		int lugar2=0;
		for (int i=0; i<votos.length; i++) {
			if(votos[i]==votosOrdenados[0]) {
				lugar = i ;
				//System.out.println("lugar"+lugar);
			}
			if (votos[i]==votosOrdenados[1]) {
				lugar2=i;
			}
		}
		
		System.out.println("El candidato con más votos es el:  "+ candidatos[1][lugar]);
	
		
		//CANDIDATOS QUE PASAN A LA SIGUIENTE RONDA
		
		int porcentaje = (votos[lugar]*100)/sumaTotal;
		
		if(porcentaje>50) {
			System.out.println("El candidato "+ candidatos[1][lugar]+ " es el ganador!");
		}else {
			System.out.println("El segundo candidato con mas votos es "+ candidatos[1][lugar2]);
			System.out.println("Ambos pasan a la siguente ronda");
		}
		
		
		
		
		
		
	}

}
