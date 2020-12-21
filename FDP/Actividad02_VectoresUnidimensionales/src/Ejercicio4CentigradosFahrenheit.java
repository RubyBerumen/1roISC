import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4CentigradosFahrenheit {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		 
		 System.out.println("Programa que lee temperaturas en grados Fahrenheit o Centigrados y posteriormente muestra sus promedios");
		 System.out.println("=================================================================================================================");
		 System.out.println("Ingrese el numero de temperaturas:");
		 int ntempe = entrada.nextInt();
		 
		 
		 String cad = "";
		 String grados = "";
		 double gradosn = 0;
		 double tempe [];
		 double far = 0;
		 double cen = 0;
		 int cfar =0;
		 int ccen = 0;
		
		 cad = entrada.nextLine();//solucion de un bug que me saltaba una lectura de teclado en el for
		 tempe = new double [ntempe];
		 System.out.println("=====================================================================");
		 System.out.println("Ingrese las temperaturas con °F o °C al final");
		 System.out.println("=============================================================");
		 
		 for (int i = 0; i<tempe.length;i = i+1) {
			 System.out.println("Ingresa la temperatura " + (i+1) + " en °C o |F");
			 cad = entrada.nextLine();
			 grados = cad.substring(cad.length()-2,cad.length());
			 gradosn = Double.parseDouble(cad.substring(0,cad.length()-2));
			 grados =grados.toLowerCase();
			 
			 tempe [i] = gradosn;
			 if (grados.equals("°f")) {
				 far = far + tempe[i];
				 cfar = cfar +1;
			 }else if (grados.equals("°c")) {
				 cen = cen + tempe[i];
				 ccen = ccen +1;
			 }else System.out.println("temperatura en formato invalido(no ulvides escribi °F o °C)");
			  }
		 DecimalFormat formato = new DecimalFormat("#.## ");
		 DecimalFormat formato2 = new DecimalFormat("#.# ");
		 	System.out.println("================================================================================");
		 	System.out.println("El promedio de las temperaturas en °F es: " + formato2.format(far/cfar)+"°F");
		 	System.out.println("El promedio de las temperaturas en °C es: " + formato.format(cen/ccen)+"°C");
	
	}

}
