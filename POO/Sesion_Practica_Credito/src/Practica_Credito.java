import java.util.Scanner;

class SimuladorCreditoAuto{
	String nombre;
	int edad; 
	double antigüedad;
	double valorAuto; 
	int plazoCredito; 
	double total;
	double pago;
	
	public void lecturaAtributos() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		nombre = ent.nextLine();
		System.out.println("Ingresa tu edad: ");
		edad = ent.nextInt();
		System.out.println("Ingresa tu antigüedad en el empleo en años: ");
		antigüedad = ent.nextDouble();
		System.out.println("Ingresa el valor del auto: ");
		valorAuto = ent.nextDouble();
		System.out.println("Ingresa el plazo del crédito en meses (12/24):  ");
		plazoCredito = ent.nextInt();	
	}
	
	public void calcularPagos() {
		
		if (antigüedad >= 5) {
			if (plazoCredito == 12) {
				total = valorAuto + (valorAuto*.0841);
			}else if (plazoCredito == 24) {
				total = valorAuto + (valorAuto*.0975);
			}else {
				System.out.println("hola1");
			}
		}else System.out.println("No se otorgara el credito ya que la"
				+ "antigüedad en el empleo es menor a 5 años ");
	}
	
	public void calcularPagoAbonos() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Como desea que sea su pago?");
		System.out.println("1)Semanal");
		System.out.println("2)Quincenal");
		System.out.println("3)Mensual");
		System.out.println("Elija una opcion:");
		byte op = ent.nextByte();
		
		if (plazoCredito == 12) {
			if (op == 3){
				pago = total/12;
			}else if (op == 2) {
				pago = total/24;
			}else if (op == 1) {
				pago = total/52;
				System.out.println("Holaaaaaa");
			}else System.out.println("Hola2");
			
		}else if (plazoCredito == 24) {
			if (op == 3){
				pago = total/24;
			}else if (op == 2) {
				pago = total/48;
			}else if (op == 1) {
				pago = total/104;
			}else System.out.println("Hola3");
		}
	}
	
	public void tabla () {
		
		while (pago>0) {
			System.out.println("Abono");
			System.out.println(total-pago);
		}
		
	}
	
	
	
}//class SimuladorCreditoAuto

public class Practica_Credito {

	public static void main(String[] args) {
		
		SimuladorCreditoAuto sca1 = new SimuladorCreditoAuto();
		sca1.lecturaAtributos();
		sca1.calcularPagos();
		sca1.calcularPagoAbonos();
		sca1.tabla();
		
		
		
	

	}

}
