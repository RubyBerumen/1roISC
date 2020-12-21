import java.util.Scanner;

class CuentaBancaria{
	
	private String fechaApertura;
	private double saldoActual;
	
	public CuentaBancaria() {	
	}
	public CuentaBancaria(String fechaApertura, double saldoActual) {
		super();
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
	
	public String toString() {
		return "fecha de apertura: "+fechaApertura+", saldo actual: "+saldoActual;
	}
	
	public double retirarEfectivo(double cantidad) {
		if(saldoActual>cantidad) {
			return saldoActual-cantidad;
		}else {
			System.out.println("saldo insuficiente");
			return saldoActual;
		}
		
	}
	
}

class CuentaDebito extends CuentaBancaria{
	
	private int numeroNomina;
	private String fechaDepositoNomina;
	
	public CuentaDebito() {
	}
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
		return super.toString()+", numero de nomina: "+numeroNomina+ ", fecha del deposito de nomina: "+ fechaDepositoNomina;
	}
	
	
	
}

class CuentaCredito extends CuentaBancaria{
	
	private double tasaInteresCobrado;
	private double limiteDeCredito;
	
	public CuentaCredito() {	
	}
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
	
	public String toString() {
		return super.toString()+", tasa de interes cobrado: "+tasaInteresCobrado+ ", limite de credito: "+ limiteDeCredito;
	}
	
	public double retirarEfectivo(double cantidad) {
		tasaInteresCobrado = tasaInteresCobrado+((getSaldoActual()+cantidad)/getSaldoActual());
		setSaldoActual(getSaldoActual()-cantidad);
		return 0;
	}
	
}

public class PruebaCuentaBancaria {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("===Cuenta de credito===");
		System.out.println("fecha de apertura: ");
		String fechaApertura = input.nextLine();
		System.out.println("saldo actual: ");
		double saldoActual = input.nextDouble();
		System.out.println("tasa de interes cobrado: ");
		double tasaInteresCobrado = input.nextDouble();
		System.out.println("limite de credito: ");
		double limiteDeCredito = input.nextDouble();
		
		CuentaCredito cc1 = new CuentaCredito(fechaApertura, saldoActual, tasaInteresCobrado, limiteDeCredito);
		
		System.out.println("cantidad de efectivo a retirar: ");
		double cantidad = input.nextDouble();
		cc1.retirarEfectivo(cantidad);
		System.out.println(cc1.toString());
		

	}

}
