import java.util.Scanner;
/*
 * Clases -> Atributod y meodos
 * 
 * 		DOS TIPOS DE METODOS
 * 
 * 			1)No retornan valor 
 * 				1a)sin parametros
 * 				1b)con parametros
 * 
 * 				Sintaxis: [modificador_acceso] void nombreMetodo ( [parametro(s)] ) {
 * 
 * 							}
 * 
 * 				Ejemplos: public void lecturaAtributos () {
 * 							//codigo
 * 							}
 * 
 * 			1)Si retornan valor 
 * 				2a)sin parametros
 * 				2b)con parametros
 * 
 *  			Sintaxis: [modificador_acceso] tipoDeRetorno nombreMetodo ( [parametro(s)] ) {
 *  						//cuerpo
 *  
 *  						return variableaRetornar
 * 
 * 							}
 * 
 * 							NOTA: El tipo de retorno puede ser de los dos tipos de vriables que
 * 							permite java, pero SOLO UN DATO o VARIABLE
 * 
 * 
 * 				Ejemplos:  public int calcularEdad() {
 * 							//codigo
 * 							return edad;
 * 							}
 * 
 *  						public String obtenerRFC() {
 * 							//codigo
 * 							return valorRFC;
 * 							}
 *
 *  						public Alumno buscarRegistro() {
 * 							//codigo
 * 							return objAlumno;
 * 							}
 */


class ConversorTemperaturas{
	double gCelsius;
	
	public double convertirAFahrenheit() {
		double gFahr = 0.0;
		
		gFahr = gCelsius * 1.8 + 32;
		
		return gFahr;
	}
	
	/*public byte convertirAFahrenheit() {
		double gFahr = 0.0;
		
		return (byte) gFahr;
	}*/
	
	public void lecturaAtributos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa grados Celsius");
		gCelsius = entrada.nextDouble();
	}
	
	public void imprimirAtributos() {
		System.out.println("Grados celsius a convertir : " + gCelsius);
	}
	
	
	public double convertirAKelvin() {
		return (convertirAFahrenheit() + 459.67) / 1.8;
	}
	
	public double convertirARankine() {
		double gRan = 0.0;
		
		gRan = gCelsius * 1.8 + 491.67;
		
		return gRan;
	}
}//class ConversorTemperaturas


//converit una distancia dada en Km, a millas, pies y pulgadas
class ConversorDistancias{
	double kilometros;
	
	public double[] convertirDistancias() {
		/*double millas;
		double pies;
		double pulgadas;*/
		
		double resultados[] = new double [3];
		
		resultados[0]=0.1;//suponiendo que se calculò 
		resultados[1]=0.2;
		resultados[2]=0.3;
		
		return resultados;
	}
	
}


public class PruebaMetodos {

	public static void main(String[] args) {
	
		ConversorTemperaturas ct1 = new ConversorTemperaturas();
		ct1.lecturaAtributos();
		System.out.println(ct1.convertirAFahrenheit());
		
		double gFahrenheit = ct1.convertirAFahrenheit();
		System.out.println("Grados Fahrenheit: "+gFahrenheit);
		
		
		ConversorTemperaturas ct2 = new ConversorTemperaturas();
		double gKelvin = ct2.convertirAKelvin();
		System.out.println("Grados Kelvin: "+gKelvin);
		
		ConversorTemperaturas ct3 = new ConversorTemperaturas();
		double gRankine = ct3.convertirARankine();
		System.out.println("Grados Rankine: "+gRankine);
		
		System.out.println();
		
		//============================================================================
		
		
		ConversorDistancias cd1 = new ConversorDistancias();
		
		cd1.kilometros = 100;
		//System.out.println("Distancias: "+cd1.convertirDistancias()[2]);
		
		double res [] = cd1.convertirDistancias();
		System.out.println("Millas: " + res[0]);
		System.out.println("Millas: " + res[1]);
		System.out.println("Millas: " + res[2]);
		
		

	}

}
