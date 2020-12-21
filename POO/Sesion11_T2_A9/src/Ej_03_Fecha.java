import java.util.Scanner;
import java.util.Calendar;

class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	
	public Fecha() {}

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {return dia;}
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {return mes;}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {return año;}
	public void setAño(int año) {
		this.año = año;
	}
	
	
	public int obtenerDiasDosFechas(Fecha f1,Fecha f2) {
			
			int dias= ((f1.getAño()-f2.getAño())*365)+((f1.getMes()-f2.getMes())*30)+(f1.getDia())-f2.getDia();
			
			return dias;
		}
	
	public int obtenerDiasSistema(Fecha f1,Fecha f2) {
		 Calendar cal = Calendar.getInstance();
		 int diaSistema= (cal.get(Calendar.DATE));
		 int mesSistema = (cal.get(Calendar.MONTH));
		 int añoSistema = (cal.get(Calendar.YEAR));
		 f1.setDia(diaSistema);
		 f1.setMes(mesSistema);
		 f1.setAño(añoSistema);
		 
		 int res = ((f1.getAño()-f2.getAño())*365)+((f1.getMes()-f2.getMes())*30)+(f1.getDia())-f2.getDia();
		 
		 
		 return res;
		
		}
		
	
	
}//class Fecha

public class Ej_03_Fecha {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Elige una opción");
		Calendar cal = Calendar.getInstance();
		int diaSistema= (cal.get(Calendar.DATE));
		int mesSistema = (cal.get(Calendar.MONTH));
		int añoSistema = (cal.get(Calendar.YEAR));
		Fecha fs = new Fecha(diaSistema, mesSistema, añoSistema);
		 

		System.out.println("1) Calcular los dias desde una fecha hasta la fecha actual: ");
		System.out.println("2) Calcular los dias que hay entre dos fechas: ");
		int op = ent.nextInt();
		Fecha ff = new Fecha();
		Fecha f1 = new Fecha(0, 0, 0);
		Fecha f2 = new Fecha(0, 0, 0);
				
		
			switch(op) {
			case 1 :System.out.println("Ingrese el día de la fecha: Ej. (01)");
					f1.setDia(ent.nextInt());
					System.out.println("Ingrese el mes de la fecha: Ej. (01)");
					f1.setMes(ent.nextInt());
					System.out.println("Ingrese el año de la fecha: Ej. (2001)");
					f1.setAño(ent.nextInt());
					System.out.println("Días: " + ff.obtenerDiasSistema(fs, f1));break;
			
			
			case 2 :System.out.println("Ingrese el día de la fecha 1: Ej. (01)");
					f1.setDia(ent.nextInt());
					System.out.println("Ingrese el mes de la fecha 1: Ej. (01)");
					f1.setMes(ent.nextInt());
					System.out.println("Ingrese el año de la fecha 1: Ej. (2001)");
					f1.setAño(ent.nextInt());
					
					System.out.println("Ingrese el día de la fecha 2: Ej. (01)");
					f2.setDia(ent.nextInt());
					System.out.println("Ingrese el mes de la fecha 2: Ej. (01)");
					f2.setMes(ent.nextInt());
					System.out.println("Ingrese el año de la fecha 2: Ej. (2001)");
					f2.setAño(ent.nextInt());
					System.out.println("Días: " + ff.obtenerDiasDosFechas(f1, f2));
			}

	}

}
