import java.util.Scanner;

class Vehiculo{
	private String matricula;
	private int modelo;
	private double potenciaCV;
	
	public Vehiculo(){}
	public Vehiculo(String matricula, int modelo, double potenciaCV) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.potenciaCV = potenciaCV;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public double getPotenciaCV() {
		return potenciaCV;
	}
	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	public String toString() {
		return "Matricula: "+matricula+", Modelo: "+modelo+", PotenciaCV: "+potenciaCV;
	}

}//class Vehiculo


class Taxi extends Vehiculo{
	
	private boolean verificado;
	private int numeroLicencia;
	
	public Taxi() {}
	public Taxi(String matricula, int modelo, double potenciaCV, int numeroLicencia, boolean verificado) {
		super(matricula, modelo, potenciaCV);
		this.numeroLicencia = numeroLicencia;
		this.verificado = verificado;
	}
	
	public int getNumeroLicencia() {
		return numeroLicencia;
	}
	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}
	public boolean getVerificado() {
		return verificado;
	}
	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
	
	public String toString() {
		return super.toString()+", Verificado: "+verificado+", Número de licencia: "+numeroLicencia;
	}

}//class Taxi


class Autobus extends Vehiculo{
	
	private boolean verificado;
	private int numeroPlazas;

	public Autobus() {}
	public Autobus(String matricula, int modelo, double potenciaCV, int numeroPlazas, boolean verificado) {
		super(matricula, modelo, potenciaCV);
		this.numeroPlazas = numeroPlazas;
		this.verificado = verificado;
	}
	
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	public boolean getVerificado() {
		return verificado;
	}
	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
	
	public String toString() {
		return super.toString()+", Verificado: "+verificado+", Número de plazas: "+numeroPlazas;
	}

}//class Autobus


class VerificacionVehiculo{
	
	public Taxi registrarVerificacionTaxi(Taxi taxi) {
		if(taxi.getNumeroLicencia()<9999) {
			if(taxi.getModelo()>=2004&&taxi.getModelo()<=2014) {
				taxi.setVerificado(true);
			}else {
				taxi.setVerificado(false);
			}
		}else {
			taxi.setVerificado(false);
		}
		System.out.println(taxi.toString());
		return taxi;
	}
	
	public void registrarVerificacionAutobus(Autobus autobus) {
		if(autobus.getModelo()>=2009&&autobus.getModelo()<=2014) {
			autobus.setVerificado(true);
		}else {
			autobus.setVerificado(false);
		}
		System.out.println(autobus.toString());
	}
	
}//class VerificacionVehiculo



public class Ej01_Vehiculo {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		VerificacionVehiculo vv = new VerificacionVehiculo();
		
		System.out.println("---Taxi---");
		System.out.println("Matricula: ");
		String matricula = ent.next();
		System.out.println("Modelo: ");
		int modelo = ent.nextInt();
		System.out.println("Potencia CV: ");
		double potenciaCV = ent.nextDouble();
		System.out.println("Número de licencia: ");
		int numeroLicencia = ent.nextInt();
		ent.nextLine();
		
		boolean verificado= false;
		byte temp = 0;
		do {
			System.out.println("Verificado  0)No   1)Si ");
			temp = ent.nextByte();
		}while(temp!=0&&temp!=1);
		if(temp==0) {
			verificado=false;
		}else {
			verificado=true;
		}
		ent.nextLine();
		
		Taxi tx = new Taxi(matricula,modelo,potenciaCV,numeroLicencia,verificado);
		vv.registrarVerificacionTaxi(tx);
		
	
		System.out.println("---Autobus---");
		System.out.println("Matricula: ");
		matricula = ent.next();
		System.out.println("Modelo: ");
		modelo = ent.nextInt();
		System.out.println("Potencia CV: ");
		potenciaCV = ent.nextDouble();
		System.out.println("Número de plazas: ");
		int numeroPlazas = ent.nextInt();
		ent.nextLine();
		
		verificado= false;
		temp = 0;
		do {
			System.out.println("Verificado  0)No   1)si");
			temp = ent.nextByte();
		}while(temp!=0&&temp!=1);
		if(temp==0) {
			verificado=false;
		}else {
			verificado=true;
		}
		ent.nextLine();
		
		Autobus a = new Autobus(matricula,modelo,potenciaCV,numeroPlazas,verificado);
		vv.registrarVerificacionAutobus(a);

		
		
		
		

	}

}
