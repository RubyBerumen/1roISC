import java.util.Random;

public class Examen {

	public static void main(String[] args) {
		String temperatura[]= new String [48];
		int cont=0;
		Random n= new Random();
		
		for(int i=0;i<=(temperatura.length-1);i++) {
			if(i%2==0) {
				String x= String.valueOf(cont);
			temperatura[i]=x;
			cont++;
			}
			
		}
		for(int i=0;i<=(temperatura.length-1);i++) {
			if(i%2!=0) {
				int numero=n.nextInt(50);
				String x= String.valueOf(numero);
				temperatura[i]=x;
				temperatura[i]=temperatura[i]+"ºc";
			}
		}
		cont=0;
		//temperatura[1]="30ºc"; para pobrar que funcione
		for(int i=0;i<=(temperatura.length-1);i++) {
			if(temperatura[i]=="30ºc") {
				System.out.println(temperatura[i]);
				System.out.print("en la hora: ");
				System.out.println(temperatura[i-1]);
				cont++;
			}
		}
		System.out.println("en total fueron "+ cont+ "temperaturas");
		cont=cont*2;
		String temperatura2[]= new String [cont];
			int cont2=0;
			
			for(int i=0;i<=(temperatura.length-1);i++) {
				if(temperatura[i]=="30ºc") {
					temperatura2[cont2]=temperatura[i-1];
					cont2++;
					temperatura2[cont2]=temperatura[i];
					System.out.println(temperatura2[1]);
					cont2++;
				}
			}
			int dia=0;
			int noche=0;
			for(int i=0;i<=(temperatura2.length-1);i++) {
				if(i%2==0) {
					int x= Integer.parseInt(temperatura2[i]);
					if(x>=6 && x<=18) {
						dia++;
					}
					else if(x>=19 && x<=5){
						noche++;
					}
				}
			}
			if(dia>noche) {
				System.out.println("fueron mas en el dia");
			}
			else if(dia<noche){
				System.out.println("fueron mas en la noche ");
			}
			else {
				System.out.println("fueron igual");
			}
		}
	
	}//main


