import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio06_Prestamo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato1 = new DecimalFormat("$#,##0.00");
		
		System.out.println("programa para determinar si un solicitante puede lograr un prestamo \n \n ingresa tu nombre");
		String name = entrada.nextLine();
		System.out.println("historia crediticial: b)buena m)mala");
		char hc = entrada.next().charAt(0);
		System.out.println("cantidad a pedir: ");
		double cnt = entrada.nextDouble();
		System.out.println("salario anual: ");
		double sla= entrada.nextDouble();
		System.out.println("valor de otras propiedades: ");
		double vlow = entrada.nextDouble();
		int pnt= 0 ;
		
		if(hc=='m'||hc=='M') {
			System.out.println("no se le hara el prestamo debido a que su historia crediticial es mala o un dato es incongruente");
		}else if(hc=='b'||hc =='B' && cnt>0 && sla>0) {
			if((sla)>=(cnt/2)) {
				pnt= pnt+5;
			}else if(sla>=(cnt/4) && sla<(cnt/2)) {
				pnt = pnt+3;
			}else if(sla>=(cnt/10) && sla<(cnt/4)) {
				pnt = pnt+1;}
			
			if (vlow>=(cnt*2)) {
				pnt= pnt +5;
			}else if(vlow >=cnt &&vlow<(cnt*2) ) {
				pnt = pnt+3;
			}
			if(pnt>6) {
				System.out.println("el prestamo por un monto de: " + formato1.format(cnt) + ", ha sido autorizado para: " + name);
			}
		}else {
			System.out.println("entrada no valida");
		}
		
	}

}
