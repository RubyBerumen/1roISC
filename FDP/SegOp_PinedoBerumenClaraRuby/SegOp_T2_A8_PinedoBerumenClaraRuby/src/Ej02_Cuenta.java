import java.util.Scanner;

class CuentaBancaria{
	private String numeroCuenta; 
	private String nombreCliente;
	private String fechaApertura;
	private double saldoActual;
	private String fechasDepositos; 
	private String fechasUso;
	private String lugaresCompras;
	
	public CuentaBancaria() {}
	public CuentaBancaria(String numeroCuenta, String nombreCliente, String fechaApertura, double saldoActual,
			String fechasDepositos, String fechasUso, String lugaresCompras) {
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
		this.fechaApertura = fechaApertura;
		this.saldoActual = saldoActual;
		this.fechasDepositos = fechasDepositos;
		this.fechasUso = fechasUso;
		this.lugaresCompras = lugaresCompras;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
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
	public String getFechasDepositos() {
		return fechasDepositos;
	}
	public void setFechasDepositos(String fechasDepositos) {
		this.fechasDepositos = fechasDepositos;
	}
	public String getFechasUso() {
		return fechasUso;
	}
	public void setFechasUso(String fechasUso) {
		this.fechasUso = fechasUso;
	}
	public String getLugaresCompras() {
		return lugaresCompras;
	}
	public void setLugaresCompras(String lugaresCompras) {
		this.lugaresCompras = lugaresCompras;
	}
	
	
	public void impresionAtributos() {
		System.out.println("N�mero de cuenta: "+numeroCuenta);
		System.out.println("Nombre del cliente: "+nombreCliente);
		System.out.println("Fecha de apertura: "+fechaApertura);
		System.out.println("Saldo actual: "+saldoActual);
		System.out.println("Fechas de dep�sitos: "+fechasDepositos);	 
		System.out.println("Fechas de uso de la tarjeta: "+fechasUso); 
		System.out.println("Lugares de compras: "+lugaresCompras);
		
	}
	
	
	public void actualizarSaldo(double cantidadDeposito, String fechaDeposito) {
		saldoActual = saldoActual + cantidadDeposito;
		fechasDepositos = fechasDepositos +" , "+ fechaDeposito;

	}
	
	
	public void actualizarSaldo(double cantidadGastada, String fechaCompra, String lugarCompra) {
		saldoActual = saldoActual - cantidadGastada;
		fechasUso = fechasUso + " , " + fechaCompra;
		lugaresCompras = lugaresCompras +" , "+ lugarCompra;
		
	}
	
	

}//class CuentaBancaria

public class Ej02_Cuenta {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingrese los siguientes datos: ");
		System.out.println("N�mero de cuenta: ");
		String numeroCuenta = ent.nextLine(); 
		System.out.println("Nombre del cliente: ");
		String nombreCliente = ent.nextLine();
		System.out.println("Fecha de apertura: ");
		String fechaApertura = ent.nextLine();
		System.out.println("Saldo actual: ");
		double saldoActual = ent.nextDouble();
		System.out.println("Fechas de dep�sitos: ");	 
		String fechasDepositos = ent.nextLine(); 
		fechasDepositos = ent.nextLine();
		System.out.println("Fechas de uso de la tarjeta: "); 
		String fechasUso = ent.nextLine();
		System.out.println("Lugares de compras: ");
		String lugaresCompras = ent.nextLine();
		
		CuentaBancaria cb = new CuentaBancaria(numeroCuenta, nombreCliente, fechaApertura, saldoActual, fechasDepositos, fechasUso, lugaresCompras ); 

		char op = '0';
		
		
		
		
		do {
			System.out.println("1) Hacer dep�sito");
			System.out.println("2) Compra");
			System.out.println("Elige una opcion");
			op = ent.next().charAt(0);
			
			
			switch (op) {
			case '1' : 
				System.out.println("---Dep�sito---");
				System.out.println("Cantidad a depositar: ");
				double cantidadDeposito = ent.nextDouble();
				System.out.println("Fecha del dep�sito: ");
				String fechaDeposito = ent.nextLine();
				fechaDeposito = ent.nextLine();
				
				cb.actualizarSaldo(cantidadDeposito, fechaDeposito);
				
				break;
				
			case '2' : 
				System.out.println("---Compra---");
				System.out.println("Cantidad gastada: ");
				double cantidadGastada = ent.nextDouble();
				System.out.println("Fecha de la compra: ");
				String fechaCompra = ent.nextLine();
				fechaCompra = ent.nextLine();
				System.out.println("Lugar de la compra: ");
				String lugarCompra = ent.nextLine();
				
				
				cb.actualizarSaldo(cantidadGastada, fechaCompra, lugarCompra);
				
				break;
				
			default : System.out.println("Opci�n inv�lida!\n");
				break;

		}
			
		}while (op != '1' && op != '2');
		
		
		System.out.println("---Datos actualizados---");
		cb.impresionAtributos();
		
		
		
		
		
		
		

		
		
		
	}

}
