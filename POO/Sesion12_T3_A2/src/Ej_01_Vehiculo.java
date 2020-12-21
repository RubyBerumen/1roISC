
class Vehiculo{
	private String matricula;
	private String modelo;
	private String potenciaCV;
	
	public Vehiculo() {}
	public Vehiculo(String matricula, String modelo, String potenciaCV) {
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPotenciaCV() {
		return potenciaCV;
	}
	public void setPotenciaCV(String potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
}//class Vehiculo


class Taxi extends Vehiculo{
	private String numeroLicencia;
	
	
	
}//class Taxi


public class Ej_01_Vehiculo {

	public static void main(String[] args) {
		

	}

}
