
public class Parcial_3 {

	public static void main(String[] args) {
		
		int votos1[][] = {{194, 48, 206, 45},
						{180, 20, 320, 16},
						{221, 90 ,140, 20},
						{432, 50, 821, 14},
						{820, 61, 946,18},
						};
		
		
		int sumaVotos = 0;
		
		
		for (int i = 0; i<votos1.length; i++ ) {
			for (int j = 0; j<votos1[i].length; j++ ) {
				System.out.print(votos1[i][j] + "    ");
			}
			System.out.println();
		}//for1
		
		System.out.println();
		
		for (int i = 0; i<votos1[i].length; i++ ) {
			for (int j = 0; j<votos1.length; j++ ) {
				System.out.print(votos1[j][i] + "    ");
				
			}
			System.out.println();
		}//for1
		
		
		System.out.println();
		
		for (int i = 0; i<votos1[i].length; i++ ) {
			for (int j = 0; j<votos1.length; j++ ) {
				sumaVotos = sumaVotos + votos1[j][i];
			}
			System.out.println("Numero de votos del candidato " + (i+1) + ": "+ sumaVotos);
			sumaVotos=0;
		}//for1
		
		
		
		
		
		
		
		
		//
		
		
		
		
		

	}

}
