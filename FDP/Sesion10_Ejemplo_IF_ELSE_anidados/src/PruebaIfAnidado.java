
public class PruebaIfAnidado {
	
	public static void main(String [] args) {
		
		//IF interno
		//Aplicar un 5% de descuento si la venta total exede 5000, ademas si tiene trjeta de descuento
		//aplicar un 3% extra
		
		double ventaTotal = 5000.00;
		boolean tarjeta = true;
		
		if(ventaTotal>=5000) {
			ventaTotal = ventaTotal*0.95;
			
			//ventaTotal = ventaTotal - (ventaTotal * (5/100));
			
			System.out.println("Total con 5% de descuento:" + ventaTotal);
			if(tarjeta) {
				ventaTotal = ventaTotal*0.97;
				System.out.println("Total con 3% de descuento extra:" + ventaTotal);
				
			}
		}else {
			System.out.println("Total sin dscuentos: " + ventaTotal);
		}
		
		
		
		
		 
		
		
	}//main

}//class
