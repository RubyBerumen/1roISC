import java.util.Scanner;

class CuentaBancaria{
	private String fechaApertura;
	private double saldoActual;
	
	public CuentaBancaria() {	}
	public CuentaBancaria(String fechaApertura, double saldoActual) {
		this.fechaApertura = fechaApertura;
		this.saldoActual = saldoActual;
	}
	
	public String getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public double retirarEfectivo(double cantidad) {
		if(saldoActual>cantidad) {
			return saldoActual-cantidad;
		}else {
			System.out.println("Saldo insuficiente");
			return saldoActual;
		}
	}
	
	public String toString() {
		return "Fecha de apertura: "+fechaApertura+", Saldo actual: "+saldoActual;
	}
	
}// class CuentaBancaria


class CuentaDebito extends CuentaBancaria{
	
	private int numeroNomina;
	private String fechaDepositoNomina;
	
	public CuentaDebito() {}
	public CuentaDebito(String fechaApertura, double saldoActual, int numeroNomina, String fechaDepositoNomina) {
		super(fechaApertura, saldoActual);
		this.numeroNomina = numeroNomina;
		this.fechaDepositoNomina = fechaDepositoNomina;
	}
	
	public int getNumeroNomina() {
		return numeroNomina;
	}
	public void setNumeroNomina(int numeroNomina) {
		this.numeroNomina = numeroNomina;
	}
	public String getFechaDepositoNomina() {
		return fechaDepositoNomina;
	}
	public void setFechaDepositoNomina(String fechaDepositoNomina) {
		this.fechaDepositoNomina = fechaDepositoNomina;
	}
	
	public String toString() {
		return super.toString()+", Número de nomina: "+numeroNomina+ ", Fecha del deposito de nomina: "+ fechaDepositoNomina;
	}

}//class CuentaDébito


class CuentaCredito extends CuentaBancaria{
	
	private double tasaInteresCobrado;
	private double limiteDeCredito;
	
	public CuentaCredito() {}
	public CuentaCredito(String fechaApertura, double saldoActual, double tasaInteresCobrado, double limiteDeCredito) {
		super(fechaApertura, saldoActual);
		this.tasaInteresCobrado = tasaInteresCobrado;
		this.limiteDeCredito = limiteDeCredito;
	}
	
	public double getTasaInteresCobrado() {
		return tasaInteresCobrado;
	}
	public void setTasaInteresCobrado(double tasaInteresCobrado) {
		this.tasaInteresCobrado = tasaInteresCobrado;
	}
	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}
	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
	
	public double retirarEfectivo(double cantidad) {
		tasaInteresCobrado = tasaInteresCobrado+((getSaldoActual()+cantidad)/getSaldoActual());
		setSaldoActual(getSaldoActual()-cantidad);
		return 0;
	}
	
	public String toString() {
		return super.toString()+", Tasa de interés cobrado: "+tasaInteresCobrado+ ", Límite de credito: "+ limiteDeCredito;
	}
	
}//class CuentaDébito



public class Ej02_CuentaBancaria {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("---Cuenta de crédito---");
		System.out.println("Fecha de apertura: ");
		String fechaApertura = ent.nextLine();
		System.out.println("Saldo actual: ");
		double saldoActual = ent.nextDouble();
		System.out.println("Tasa de interes cobrado: ");
		double tasaInteresCobrado = ent.nextDouble();
		System.out.println("Límite de crédito: ");
		double limiteDeCredito = ent.nextDouble();
		
		CuentaCredito cc = new CuentaCredito(fechaApertura, saldoActual, tasaInteresCobrado, limiteDeCredito);
		
		System.out.println("Cantidad de efectivo a retirar: ");
		double cantidad = ent.nextDouble();
		cc.retirarEfectivo(cantidad);
		System.out.println(cc.toString());
		
		
		System.out.println("---Cuenta de dédito---");
		System.out.println("Fecha de apertura: ");
		fechaApertura = ent.nextLine();
		System.out.println("Saldo actual: ");
		saldoActual = ent.nextDouble();
		System.out.println("Número de nómina: ");
		int numeroNomina = ent.nextInt();
		System.out.println("Fecha del depósito: ");
		String fechaDepositoNomina = ent.nextLine();
		
		CuentaDebito cd = new CuentaDebito(fechaApertura, saldoActual, numeroNomina , fechaDepositoNomina);
		
		System.out.println(cd.toString());
	}

}
