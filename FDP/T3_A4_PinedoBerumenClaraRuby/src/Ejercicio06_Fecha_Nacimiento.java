
import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio06_Fecha_Nacimiento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Calendar fechaactual = Calendar.getInstance();
		
		
		System.out.println("== Programa que pide la fecha de nacimiento y muestra ciertos datos ==");
		System.out.println();
		
		System.out.println("Ingresa tu fecha de nacimiento: dd/mm/aaaa ");
		String fecha = entrada.next();
		
		
		String dia = fecha.substring(0,2);
		String mes = fecha.substring(3,5);
		String año = fecha.substring(6,10);
		
		int añoactual = fechaactual.get(Calendar.YEAR);
		
		int dianac = Integer.parseInt(dia);
		int mesnac = Integer.parseInt(mes);
		int añonac = Integer.parseInt(año);
		
		int edad = añoactual-añonac;
		
		
		System.out.println("Elige una opcion: ");
		System.out.println("a) Si día de nacimiento es par o impar");
		System.out.println("b) Signo zodiacal");
		System.out.println("c) Edad");
		
		String opcion = entrada.next();
		
		switch(opcion.toLowerCase()) {
			case "a" :if(dianac%2==0 ) {
					  System.out.println("Su día de nacimiento es par ");
					 }else System.out.println("Su día de nacimiento es impar");break;
			
			case "c" : System.out.println("Su edad es: " + edad);break;
			
			case "b" : if((mesnac==3 && dianac>=21) || (mesnac==4 && dianac<=20)){
				       	   System.out.println("Su signo zodiacal es Aries");
					   }else if((mesnac==4 && dianac>=21) || (mesnac==5 && dianac<=20)){
						   System.out.println("Su signo zodiacal es Tauro");
					   }else if((mesnac==5 && dianac>=21) || (mesnac==6 && dianac<=20)){
						   System.out.println("Su signo zodiacal es Géminis");
					   }else if((mesnac==6 && dianac>=21) || (mesnac==7 && dianac<=20)){
						   System.out.println("Su signo zodiacal es Cáncer");
					   }else if((mesnac==7 && dianac>=23) || (mesnac==8 && dianac<=23)){
						   System.out.println("Su signo zodiacal es Leo");
					   }else if((mesnac==8 && dianac>=24) || (mesnac==9 && dianac<=23)){
						   System.out.println("Su signo zodiacal es Virgo");
					   }else if((mesnac==9 && dianac>=24) || (mesnac==10 && dianac<=22)){
						   System.out.println("Su signo zodiacal es Libra");
					   }else if((mesnac==10 && dianac>=23) || (mesnac==11 && dianac<=22)){
						   System.out.println("Su signo zodiacal es Escorpio");
					   }else if((mesnac==11 && dianac>=22) || (mesnac==12 && dianac<=20)){
						   System.out.println("Su signo zodiacal es Sagitario");
					   }else if((mesnac==12 && dianac>=21) || (mesnac==1 && dianac<=20)){
						   System.out.println("Su signo zodiacal es Capricornio");
					   }else if((mesnac==1 && dianac>=21) || (mesnac==10 && dianac<=18)){
						   System.out.println("Su signo zodiacal es Acuario");
					   }else if((mesnac==2 && dianac>=19) || (mesnac==3 && dianac<=20)){
						   System.out.println("Su signo zodiacal es Picis");
					   }
		
		}
		
		
		
		

	}

}
