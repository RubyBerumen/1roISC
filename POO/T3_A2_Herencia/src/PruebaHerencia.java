import java.util.Scanner;

class Vehiculo{
	private String matricula;
	private int modelo;
	private double potenciaCV;
	
	public Vehiculo(){
		
	}
	public Vehiculo(String matricula, int modelo, double potenciaCV) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.potenciaCV = potenciaCV;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public int getModelo() {
		return modelo;
	}
	public double getPotenciaCV() {
		return potenciaCV;
	}

	public String toString() {
		return "matricula: "+matricula+", modelo: "+modelo+", potenciaCV: "+potenciaCV;
	}

}//class

class Taxi extends Vehiculo{
	
	private boolean verificado;
	private int numeroLicencia;
	
	public Taxi() {
	}
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
		return super.toString()+", verificado: "+verificado+", numero de licencia: "+numeroLicencia;
	}

}//class

class Autobus extends Vehiculo{
	
	private boolean verificado;
	private int numeroPlazas;

	public Autobus() {
	}
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
		return super.toString()+", verificado: "+verificado+", numero plazas: "+numeroPlazas;
	}
}//class

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
	
}


class PruebaHerenciaVehiculo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VerificacionVehiculo vv0 = new VerificacionVehiculo();
		
		System.out.println("======Taxi======");
		System.out.println("matricula: ");
		String matricula = input.next();
		System.out.println("modelo: ");
		int modelo = input.nextInt();
		System.out.println("potencia CV: ");
		double potenciaCV = input.nextDouble();
		System.out.println("numero licencia: ");
		int numeroLicencia = input.nextInt();
		input.nextLine();
		
		boolean verificado= false;
		byte temp = 0;
		do {
			System.out.println("verificado(0:no,1:si):");
			temp = input.nextByte();
		}while(temp!=0&&temp!=1);
		if(temp==0) {
			verificado=false;
		}else {
			verificado=true;
		}
		input.nextLine();
		
		Taxi taxi1 = new Taxi(matricula,modelo,potenciaCV,numeroLicencia,verificado);
		vv0.registrarVerificacionTaxi(taxi1);
		
		
		
		System.out.println("======Autobus======");
		System.out.println("matricula: ");
		matricula = input.next();
		System.out.println("modelo: ");
		modelo = input.nextInt();
		System.out.println("potencia CV: ");
		potenciaCV = input.nextDouble();
		System.out.println("numero plazas: ");
		int numeroPlazas = input.nextInt();
		input.nextLine();
		
		verificado= false;
		temp = 0;
		do {
			System.out.println("verificado(0:no,1:si):");
			temp = input.nextByte();
		}while(temp!=0&&temp!=1);
		if(temp==0) {
			verificado=false;
		}else {
			verificado=true;
		}
		input.nextLine();
		
		Autobus autobus1 = new Autobus(matricula,modelo,potenciaCV,numeroPlazas,verificado);
		vv0.registrarVerificacionAutobus(autobus1);
	}

}
