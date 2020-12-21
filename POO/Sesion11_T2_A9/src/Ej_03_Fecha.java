import java.util.Scanner;
import java.util.Calendar;

class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	
	
	public Fecha() {}

	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public int getDia() {return dia;}
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {return mes;}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {return a�o;}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
	public int obtenerDiasDosFechas(Fecha f1,Fecha f2) {
			
			int dias= ((f1.getA�o()-f2.getA�o())*365)+((f1.getMes()-f2.getMes())*30)+(f1.getDia())-f2.getDia();
			
			return dias;
		}
	
	public int obtenerDiasSistema(Fecha f1,Fecha f2) {
		 Calendar cal = Calendar.getInstance();
		 int diaSistema= (cal.get(Calendar.DATE));
		 int mesSistema = (cal.get(Calendar.MONTH));
		 int a�oSistema = (cal.get(Calendar.YEAR));
		 f1.setDia(diaSistema);
		 f1.setMes(mesSistema);
		 f1.setA�o(a�oSistema);
		 
		 int res = ((f1.getA�o()-f2.getA�o())*365)+((f1.getMes()-f2.getMes())*30)+(f1.getDia())-f2.getDia();
		 
		 
		 return res;
		
		}
		
	
	
}//class Fecha

public class Ej_03_Fecha {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Elige una opci�n");
		Calendar cal = Calendar.getInstance();
		int diaSistema= (cal.get(Calendar.DATE));
		int mesSistema = (cal.get(Calendar.MONTH));
		int a�oSistema = (cal.get(Calendar.YEAR));
		Fecha fs = new Fecha(diaSistema, mesSistema, a�oSistema);
		 

		System.out.println("1) Calcular los dias desde una fecha hasta la fecha actual: ");
		System.out.println("2) Calcular los dias que hay entre dos fechas: ");
		int op = ent.nextInt();
		Fecha ff = new Fecha();
		Fecha f1 = new Fecha(0, 0, 0);
		Fecha f2 = new Fecha(0, 0, 0);
				
		
			switch(op) {
			case 1 :System.out.println("Ingrese el d�a de la fecha: Ej. (01)");
					f1.setDia(ent.nextInt());
					System.out.println("Ingrese el mes de la fecha: Ej. (01)");
					f1.setMes(ent.nextInt());
					System.out.println("Ingrese el a�o de la fecha: Ej. (2001)");
					f1.setA�o(ent.nextInt());
					System.out.println("D�as: " + ff.obtenerDiasSistema(fs, f1));break;
			
			
			case 2 :System.out.println("Ingrese el d�a de la fecha 1: Ej. (01)");
					f1.setDia(ent.nextInt());
					System.out.println("Ingrese el mes de la fecha 1: Ej. (01)");
					f1.setMes(ent.nextInt());
					System.out.println("Ingrese el a�o de la fecha 1: Ej. (2001)");
					f1.setA�o(ent.nextInt());
					
					System.out.println("Ingrese el d�a de la fecha 2: Ej. (01)");
					f2.setDia(ent.nextInt());
					System.out.println("Ingrese el mes de la fecha 2: Ej. (01)");
					f2.setMes(ent.nextInt());
					System.out.println("Ingrese el a�o de la fecha 2: Ej. (2001)");
					f2.setA�o(ent.nextInt());
					System.out.println("D�as: " + ff.obtenerDiasDosFechas(f1, f2));
			}

	}

}
