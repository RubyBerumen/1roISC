
import java.util.Scanner;

public class Ejercicio05_meses {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("N�mero de mes: ");
		int mes = entrada.nextInt();
		
		if(mes==2) {
			System.out.println("Tiene 28 d�as");
		}else if(mes==4 || mes==6 || mes==9 || mes==11) {
			System.out.println("Tiene 30 d�as");
		}else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			System.out.println("Tiene 31 d�as");
		}else {
			System.out.println("Inv�lido");
		}
		
		
		
		

	}

}
