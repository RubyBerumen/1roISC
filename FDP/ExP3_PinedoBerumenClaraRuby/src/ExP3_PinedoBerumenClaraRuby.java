
public class ExP3_PinedoBerumenClaraRuby {

	public static void main(String[] args) {
		
		String candidatos [][] = new String [7][5];
		
		
		candidatos [0][0] = "";
		candidatos [0][1] = "Cand";
		candidatos [0][2] = "Cand";
		candidatos [0][3] = "Cand";
		candidatos [0][4] = "Cand";
		
		candidatos [1][0] = "Dist";
		candidatos [1][1] = "A";
		candidatos [1][2] = "B";
		candidatos [1][3] = "C";
		candidatos [1][4] = "D";
		
		
		candidatos [2][0] = "1";
		candidatos [2][1] = "194";
		candidatos [2][2] = "48";
		candidatos [2][3] = "206";
		candidatos [2][4] = "45";
		
		
		candidatos [3][0] = "2";
		candidatos [3][1] = "180";
		candidatos [3][2] = "20";
		candidatos [3][3] = "320";
		candidatos [3][4] = "16";
		
		
		candidatos [4][0] = "3";
		candidatos [4][1] = "221";
		candidatos [4][2] = "90";
		candidatos [4][3] = "140";
		candidatos [4][4] = "20";
		
		candidatos [5][0] = "4";
		candidatos [5][1] = "432";
		candidatos [5][2] = "50";
		candidatos [5][3] = "821";
		candidatos [5][4] = "14";
		
		candidatos [6][0] = "5";
		candidatos [6][1] = "820";
		candidatos [6][2] = "61";
		candidatos [6][3] = "946";
		candidatos [6][4] = "18";
		
		
		
		for (int i=0; i<=candidatos.length-1; i++) {
			for (int j=0; j<=candidatos[i].length-1; j++) {
				
				System.out.print(candidatos[i][j] + "\t");
				
			}//for 2
			
			System.out.println();
			
		}//for 1
		
		System.out.println();
		
		int numvotos = 0;
		int sumtotal = 0;
		
		for (int j=1; j<5; j++) {
			for (int i=2; i<7; i++) {
				
				sumtotal = sumtotal + Integer.parseInt(candidatos[i][j]);
									
			}//for 2
			
		}//for 1
		
		
		//votos candidatos
		for (int j=1; j<5; j++) {
			for (int i=2; i<7; i++) {
				
				numvotos = numvotos + Integer.parseInt(candidatos[i][j]);
									
			}//for 2
			
			System.out.println("Numero de votos del candidato " + candidatos[1][j] + ": " + numvotos);
			
			System.out.println((numvotos*100)/sumtotal + "%");
			numvotos=0;
			
		}//for 1
		
		
			

		
		
		
		
		
		
		
	}

}
