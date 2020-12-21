
public class VectoresBidimensionales {

	public static void main(String[] args) {
		
		int calificaciones[][] = new int[3][3];
		
		calificaciones[2][1] = 5;
		
		System.out.println(calificaciones[2][1]);
		
		double temps [][]= {{10,7,9},
							{3,4,5}};
		
		boolean sensores[][] = { {},{},{},{} };
		
		String nombres [] []= new String [10][3];
		
		System.out.println(calificaciones.length); // total de filas 
		System.out.println(temps.length);
		System.out.println(sensores.length);
		System.out.println(nombres.length);
	
		System.out.println(temps[1][0]);
		System.out.println(temps[1].length);
		System.out.println();
		//====================================================
		
		
		byte calprimersem[][] = new byte [30][7];
		
		for (int i=0; i<calprimersem.length; i++) {
			for (int j=0; j<calprimersem[i].length; j++) {
				calprimersem[i][j]  = (byte)(Math.random()*100);
				
			}//for 2
			
			
		}//for 1
		
		
		for (int i=0; i<calprimersem.length; i++) {           //i=filas	j=columnas
			for (int j=0; j<calprimersem[i].length; j++) {
				System.out.print(calprimersem[i][j] + "	");
				
			}//for 2
			System.out.println();
			
		}//for 1
		System.out.println();
		
		//convertir diagonal principal en -1
		for (int i=0; i<calprimersem.length; i++) {
			for (int j=0; j<calprimersem[i].length; j++) {
				
				if(i==j)
					calprimersem[i][j] = -1;
				System.out.print(calprimersem[i][j] + "	");
			}//for 2
			System.out.println();
			
		}//for 1
		
		
		//Convertir en 0's por encima de la diagonal principal
		//Convertir en -128's por debajo de la diagonal principal
		
		for (int i=0; i<calprimersem.length; i++) {
			for (int j=0; j<calprimersem[i].length; j++) {
				
				if(i==j) {
					calprimersem[i][j] = -1;
				System.out.print(calprimersem[i][j] + "	");
				}else if(j>i) {
					calprimersem[i][j] = 0;
					System.out.print(calprimersem[i][j] + "	");
				}else if(i>j) {
					calprimersem[i][j] = -127;
					System.out.print(calprimersem[i][j] + "	");
				}
			}//for 2
			System.out.println();
			
		}//for 1
		
		
		
		
		
		
		
		
	}

}
