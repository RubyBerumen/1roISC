
import java.util.Scanner;

public class Ejercicio05_meses {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Número de mes: ");
		int mes = entrada.nextInt();
		
		if(mes==2) {
			System.out.println("Tiene 28 días");
		}else if(mes==4 || mes==6 || mes==9 || mes==11) {
			System.out.println("Tiene 30 días");
		}else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			System.out.println("Tiene 31 días");
		}else {
			System.out.println("Inválido");
		}
		
		
		
		

	}

}
