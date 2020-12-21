import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio04_Temperaturas_C_F {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==Programa que llena un vector de temperaturas, "
				+ "con el formato de °C y °F==");
		System.out.println();
		
		System.out.println("Cuantas temperaturas desea ingresar?");
		byte numtem = entrada.nextByte();
		
		int numcen = 0;
		int numfar = 0;
		double sumcen = 0.0;
		double sumfar = 0.0;
		
		String cen[];
		cen = new String [numtem];
		String far[];
		far = new String [numtem];
		
		String temperaturas[];
		temperaturas = new String [numtem];
		
		System.out.println("Las temperaturas pueden ser en formato 34.12 °C o 78.4 °F,"
				+ " ingresa un espacio entre el numero y °C/°F");
		for(int i=0; i<temperaturas.length; i++ ) {
			System.out.println("Ingresa temperatura "+(i+1)+":");
			temperaturas[i]=entrada.nextLine();
		
		}//for
		
		double cen1[];
		cen1 = new double [numtem];
		double far1[];
		far1 = new double [numtem];
		
		int a = -1;
		int b = -1;
		
		for (int i = 0; i<temperaturas.length; i++) {
			if(temperaturas[i].substring(temperaturas[i].length(), temperaturas[i].length()-1)
					.equals("C")) {
				a++;
				cen[a] = temperaturas[i].replace("C", "");
				cen1[a] = Double.parseDouble(cen[a]);
				
			}else if (temperaturas[i].substring(temperaturas[i].length(), temperaturas[i].length()-1)
					.equals("F")) {
				b++;
				far[a] = temperaturas[i].replace("F", "");
				far1[a] = Double.parseDouble(far[a]);
			}	
		}
		
		
		for(int i=0; i<cen1.length; i++) {
			sumcen = sumcen + cen1[i];
			numcen++;
			}
		for(int i=0; i<far1.length; i++) {
			sumfar = sumfar + far1[i];
			numfar++;
			}
	
		
		 DecimalFormat formato1 = new DecimalFormat("#.# ");
		 DecimalFormat formato2 = new DecimalFormat("#.## ");
		 	
		 System.out.println("El promedio de las temperaturas en °F es: " + formato1.format(sumfar/numfar));
		 System.out.println("El promedio de las temperaturas en °C es: " + formato2.format(sumcen/numcen));
		
		
		
		 
		

	}

}
