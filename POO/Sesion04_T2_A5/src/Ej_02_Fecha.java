import java.util.Scanner;

class Fecha {
	String fecha;
	String dia;
	String mes;
	String año;
	
	public void lecturaAtributos() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa la fecha en formato dd/mm/aaaa: ");
		fecha = ent.nextLine();
	}
	
	public String dia () {
		dia = fecha.substring(0,2);
		String dia1 = "";
		switch (dia) {
		case "01" : dia1 = "Uno";break;
		case "02" : dia1 = "Dos";break;
		case "03" : dia1 = "Tres";break;
		case "04" : dia1 = "Cuatro";break;
		case "05" : dia1 = "Cinco";break;
		case "06" : dia1 = "Seis";break;
		case "07" : dia1 = "Siete";break;
		case "08" : dia1 = "Ocho";break;
		case "09" : dia1 = "Nueve";break;
		case "10" : dia1 = "Diez";break;
		case "11" : dia1 = "Once";break;
		case "12" : dia1 = "Doce";break;
		case "13" : dia1 = "Trece";break;
		case "14" : dia1 = "Catorce";break;
		case "15" : dia1 = "Quince";break;
		case "16" : dia1 = "Dieciseis";break;
		case "17" : dia1 = "Diecisiete";break;
		case "18" : dia1 = "Dieciocho";break;
		case "19" : dia1 = "Diecinueve";break;
		case "20" : dia1 = "Veinte";break;
		case "21" : dia1 = "Veintiuno";break;
		case "22" : dia1 = "Veintidos";break;
		case "23" : dia1 = "Veintitres";break;
		case "24" : dia1 = "Veinticuatro";break;
		case "25" : dia1 = "Veinticinco";break;
		case "26" : dia1 = "Veintiseis";break;
		case "27" : dia1 = "Veintisiete";break;
		case "28" : dia1 = "Veintiocho";break;
		case "29" : dia1 = "Veintinueve";break;
		case "30" : dia1 = "Treinta";break;
		case "31" : dia1 = "Treintaiuno";break;
		
		}
		 
		return dia1;
	}
	
	
	public String mes () {
		mes = fecha.substring(3,5);
		String mes1 = "";
		
		switch (mes) {
		case "01" : mes1 = "Enero";break;
		case "02" : mes1 = "Febrero";break;
		case "03" : mes1 = "Marzo";break;
		case "04" : mes1 = "Abril";break;
		case "05" : mes1 = "Mayo";break;
		case "06" : mes1 = "Junio";break;
		case "07" : mes1 = "Julio";break;
		case "08" : mes1 = "Agosto";break;
		case "09" : mes1 = "Septiembre";break;
		case "10" : mes1 = "Octubre";break;
		case "11" : mes1 = "Noviembre";break;
		case "12" : mes1 = "Diciembre";break;
		}
		return mes1;
	}
	
	public String año () {
		año = fecha.substring(6,10);
		return año;
	}
	
	
}//class Fecha

public class Ej_02_Fecha {

	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha();
		fecha1.lecturaAtributos();
		System.out.println(fecha1.dia()+" de "+fecha1.mes()+ " de "+ fecha1.año());;
		
		
		
		
		
		

	}

}
