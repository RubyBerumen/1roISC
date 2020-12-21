import java.util.Random;

public class EjemploBreakContinue {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int  i;
		for( i=0; i<=100; i++) {
			
			int num = rnd.nextInt(10);
			System.out.println(i+1 + "--->" + num);
			if(num==0)
				break;
			
		}
		
		System.out.println("Se recibieron un total de " + (i+1) );
		
		System.out.println("=====================================");
		
		
		for(i=0; i<=10; i++) {
			if(i==6) {
				
				continue;
			}
			System.out.println(i);
		}
	
		String cadena = "Ingeniero(a) %inmortal";
		
		for(i=0; i<=cadena.length()-1; i++) {
			System.out.println(cadena.charAt(i) + " ");//esta flotando un char 'i'char es un int
			System.out.println(cadena.substring(i,i+1));//esta flotando un string "i"
			
			if (cadena.charAt(i)=='%')
				break;
		}
		
		
		
		
		
		
		

	}

}
