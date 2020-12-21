import java.util.Scanner;
import java.util.Calendar;

public class Ejercicio03_mayor_o_menor_edad {
	
	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner (System.in);
		Calendar fechaactual = Calendar.getInstance();
		
		String año = "";
		String mes = "";
		String dia = "";
		
		System.out.println("Ingrese su fecha de nacimiento: dd/mm/aaaa: ");
		String fecha = entrada.nextLine();
		
		dia = fecha.substring(0,2);
		mes = fecha.substring(3,5);
		año = fecha.substring(6,10);
		
		int diaactual = fechaactual.get(Calendar.DATE);
		int mesactual = fechaactual.get(Calendar.MONTH);
		int añoactual = fechaactual.get(Calendar.YEAR);
		
		int dianac = Integer.parseInt(dia);
		int mesnac = Integer.parseInt(mes);
		int añonac = Integer.parseInt(año);
		
		int edad = añoactual-añonac;
		
		
		if(edad>18) {
			System.out.println("Mayor de edad");
		}else if(edad==18) {	
			
			if(mesnac<mesactual) {
				System.out.println("Mayor de edad");
				
			}else if(mesnac==(mesactual+1)) {
				
				if(dianac<=diaactual) {
					System.out.println("Mayor de edad");
				}else {
					System.out.println("Menor de edad 1");
				}
				
			}else {
				System.out.println("Menor de edad 2");
			
				}
			
			
			
		}else {
			System.out.println("Menor de edad 3");
		}
		
		

		
		
		
		
	   
		
	}

}
