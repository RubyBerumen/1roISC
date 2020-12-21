import java.util.Scanner;

class CuentaCredito{
	String numCuenta;
	double saldoActual;
	double limiteCredito;
	
	public void verificarSaldo() {
		System.out.println("Saldo actual es...");
	}
	public void ragistrarCompra() {
		System.out.println("Compra registrada corrrectamente...");
	}
	public void registrarPagoTarjeta() {
		System.out.println("Su pago ha sido abonado...");
	}
	
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el numero de cuenta: ");
		numCuenta = entrada.nextLine();
		System.out.println("Ingresa el saldo de la cuenta: ");
		saldoActual = entrada.nextDouble();
		System.out.println("Ingresa el limite de credito: ");
		limiteCredito = entrada.nextDouble();	
	}
	
	
	public void mostrarAtributos() {
		System.out.println("Numero de cuenta: " + numCuenta);
		System.out.println("Saldo de la cuenta: " + saldoActual);
		System.out.println("Limite de credito: " + limiteCredito);
		System.out.println();
		
		
	}
	
	
	
}//cuentaCredito


public class PruebaObjetos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		CuentaCredito cc1 = new CuentaCredito();
		
		cc1.lecturaAtributos();
		cc1.mostrarAtributos();
		
		
		CuentaCredito cc2 = new CuentaCredito();
		
		cc2.lecturaAtributos();
		cc2.mostrarAtributos();
		
		
		
		CuentaCredito cc3 = new CuentaCredito();
		
		System.out.println("Ingresa el numero de cuenta: ");
		cc3.numCuenta = entrada.nextLine();
		System.out.println("Ingresa el saldo de la cuenta: ");
		cc3.saldoActual = entrada.nextDouble();
		System.out.println("Ingresa el limite de credito: ");
		cc3.limiteCredito = entrada.nextDouble();
		
		System.out.println("Numero de cuenta: " + cc3.numCuenta);
		System.out.println("Saldo de la cuenta: " + cc3.saldoActual);
		System.out.println("Limite de credito: " + cc3.limiteCredito);
		
		

	}

}
