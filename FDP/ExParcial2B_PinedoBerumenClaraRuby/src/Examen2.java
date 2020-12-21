
import java.util.Scanner;

public class Examen2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println(" Ingresa un número de 4 digitos: ");
		String numero = entrada.next();
	
		
			String num1 = numero.substring(0,1);
			String num2 = numero.substring(1,2);
			String num3 = numero.substring(2,3);
			String num4 = numero.substring(3,4);		
			
		
		System.out.println("1) Residuo");
		System.out.println("2) Intercambiar por letras");
		System.out.println("3) intercambio entre ellos");
		System.out.println("4) Opcion 4");
		System.out.println("elige una opcion: ");
		byte opcion = entrada.nextByte();
		
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		int numero3 = Integer.parseInt(num1);
		int numero4 = Integer.parseInt(num2);
		
		int residuo1 = (numero1+7)%10;
		int residuo2 = (numero2+7)%10;
		int residuo3 = (numero3+7)%10;
		int residuo4 = (numero4+7)%10;
		
		
		switch(opcion) {
			case 3: 
				System.out.println(num3 + num4 + num1 + num2);break;
				
				
			case 2:
				System.out.println(numero.replace('1','A').replace('2','E').replace('3','I')
						.replace('4','O').replace('5','U') );
				System.out.println(numero.replace('A','1').replace('E','2').replace('I','3')
						.replace('O','4').replace('U','5'));break;
						
						
			case 1: 
				System.out.println(residuo1 + residuo2 + residuo3 + residuo4);break;	
			
		
		
		
		
		}//switch
		
		
		
		
		
		
		
		
		
		
	

	}

}
