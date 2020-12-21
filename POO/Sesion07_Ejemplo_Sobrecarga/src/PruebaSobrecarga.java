
/*SOBRECARGA
 * 
 * Cuando un método o constructor tienen el mismo nombre, pero se diferencian a traves
 * de los PARAMETROS
 * 
 * Para difernciar a traves de los parametros a los metodos sobrecargados. Java verifica
 * lo siguiente:
 * 
 * 		1)Cantidad de parametros
 * 		2)En caso de tener la misma cantidad, los diferencia a traves del TIPO de dato
 * 		3)En caso de tener los mismos tipos de parametros, los diferencia a traves del ORDEN
 *
 */

class Temperaturas{
	// 1)declaracion  -  2)Creacion/Instanciación  -  3)Inicialización/uso
	double registroSemena1[];
	
	int x;
	boolean y;
	
	
	//constructores
	public Temperaturas() {}
	
	public Temperaturas(int tamaño) {
		registroSemena1 = new double [tamaño];
	}
	
	public Temperaturas(int x, boolean y) {
		this.x = x;
		this.y = y;
	}
	
	
	//Métodos sobrecargados
	public double buscarTemperatura(double x, String hora) {
		return 0.0;
	}
	
	public double buscarTemperatura(String hora, double y) {
		return 0.0;
	}
	
	public double [] obtenerTemperaturasInferiores30() {
		//codigo
		return null;
	}
	
	public double promedioTemperaturas() {
		double res [] = obtenerTemperaturasInferiores30();
		return 0.0;
	}
	
	
	public double promedioTemperaturas(double datos[]) {
		//analizar datos
		return 0.0;
	}
	
	
	
}//class Temperaturas


public class PruebaSobrecarga {

	public static void main(String[] args) {
		
		Temperaturas t1 = new Temperaturas();
		t1.buscarTemperatura("17", 25);
		t1.buscarTemperatura(30.48, "19");
		
		//--------------------------------------------------
		t1.promedioTemperaturas(t1.obtenerTemperaturasInferiores30());
		
		Temperaturas t2 = new Temperaturas(10);
		
		
		
	

	}

}
