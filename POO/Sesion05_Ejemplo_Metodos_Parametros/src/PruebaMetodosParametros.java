
/*
 *METODOS CON PARAMETROS
 *
 * -Son valores que los metodos Reciben para trabajar con ellos dentro de su cuerpo
 * 
 * -Son considerados, por su ambito de vida, como Locales, cuando son valores de tipo primitivo.
 * A menos que el (los) parametro(s) sean de tipo referencia.
 * 
 * -Puede haber 0 oN cantidad de parametros
 * 
 * -Los nombres de los parametros son identificadores comunes en java
 * 
 * 		Sintaxis:
 * 
 * 		[modificar_acceso] [static] tipoDeRetorno  nombreMetodo ([parametro1,], [parametro2], ....){
 *      }
 *      
 *      Ejemplos:
 *      
 *       public void calcularEdad(int añoNac){
 *      //codigo
 *      }
 *      
 *      public void calcularRFC(String nombre, String primerApellido,
 *      						String segundoA, String fechaNac){
 *      //codigo
 *      }
 *      
 *       public void verificarTemperatura(String nombreSensor, double temperatura){
 *      //codigo
 *      }
 *      
 *       public void obtenerPromedoTemperaturas(String nombreSensor, double[] temperatura){
 *      //codigo
 *      }
 */

class AireAcondicionado{
	
	public double obtenerPromedioTemperaturas(String nombreSensor, double[] temperaturas ) {
		System.out.println("Obteniendo promedio del sensor: "+nombreSensor);
		double sum =0.0;
		for (int i = 0; i<temperaturas.length; i++) {
			sum += temperaturas[i];
		}
		
		return sum/temperaturas.length;
	}
	
}


public class PruebaMetodosParametros {

	public static void main(String[] args) {
		
		AireAcondicionado obj1 = new AireAcondicionado();
		
		String s = "sensor norte";
		double temp[] = {23.5, 28.7, 20.4, 30.8, 25.0};
										//argumentos
		System.out.println("Resultado; "+obj1.obtenerPromedioTemperaturas(s, temp));

		
		String s2 = "sensor sur";
		double temp2[] = {23.5, 28.7, 20.4, 30.8, 25.0};
										//argumentos
		System.out.println("Resultado; "+obj1.obtenerPromedioTemperaturas(s2, temp2));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
