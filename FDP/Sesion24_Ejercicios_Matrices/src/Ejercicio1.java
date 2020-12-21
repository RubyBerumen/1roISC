
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[][] al1 = new int [1][5] ;
		int[][] al2 = new int [1][5] ;
		int[][] al3 = new int [1][5] ;
		int[][] al4 = new int [1][5] ;
		int[][] al5 = new int [1][5] ;
		
		
		
		int calificaciones[][] = new int[5][5];
		
		for (int i=0; i<calificaciones.length; i++) {
			for (int j=0; j<calificaciones[i].length; j++) {
				calificaciones[i][j]  = (byte)(Math.random()*100);
				
				System.out.print(calificaciones[i][j] + "	");
			}//for 2
			
			System.out.println();
			
		}//for 1
		System.out.println("---------------------------------------");
		
		for (int i=0; i<calificaciones[1].length; i++) {
			for (int j=0; j<calificaciones[i].length; j++) {
				
				//al1[i][j] = al1[i][j] + calificaciones[i][j];
				
			}//for 2
			
			System.out.println();
			
		}//for 1
		
		//System.out.println(al1);
		
		
		


	}

}
