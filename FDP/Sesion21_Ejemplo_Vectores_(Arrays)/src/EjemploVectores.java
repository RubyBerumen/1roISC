
public class EjemploVectores {

	public static void main(String[] args) {
		
		
		//-------------------------------------------------
		/*800 calificaciones
		 * 
		 * calificaciones se almacenan -> promedio
		 * separar las calificaciones -> aprobatorias / reprobatorias
		 * aprobatorias verificar las de excelencia (95-100)
		 */
		
		/*ETAPAS en la implementacion de vectores en Java
		 * 
		 * 1)Declaracion
		 * 		Indicar el tipo de dato que almacenará
		 * 		Sintaxis: tipo_dato nombre_vector[]
		 * 
		 * 2)Cracion o instanciacion
		 * 		Indicar el tamaño del vector
		 * 		Sintaxis: nombre_vector = new int[tamaño];	
		 * 				tamaño: cantidad de elementos	
		 * 
		 * 3)Inicializacion
		 * 		Asignacion inicial de los valores que contendra
		 * 
		 */
		
		
		//1)DECLARACION
		byte calificaciones[];
		String nombres[];
		double temperaturas[];
		boolean sensores[];
		char datos[];
		
		//2)CREACION
		calificaciones = new byte[10];
		nombres = new String[5];
		temperaturas = new double[5];
		sensores = new boolean[5];
		datos = new char[5];
		
		System.out.println(calificaciones[2]);
		System.out.println(nombres[2]);
		System.out.println(temperaturas[2]);
		System.out.println(sensores[2]);
		//System.out.println(datos[5]); error, no hay posicion 5
		
		//3)INICIALIZACION
		temperaturas[2] = 34.7;
		temperaturas[1] = 4.7;
		temperaturas[3] = 3.7;
		temperaturas[0] = 34.8;
		temperaturas[4] = 4.9;
		
		temperaturas[2] = 0.0;//
		//----------------------------------------------------------
		
		String registroPagos[] = new String [20]; //Declaracion y creacion
		registroPagos[0]= "B0721";
		
		
		//declaracion, creacion e inicializacion
		double ventas[] = {234.23, 564.6, 98.0, 454.5, 876.8};
		
		double x= ventas[3];
		System.out.println(x);
		
		System.out.println("Magia Magia".length());
		
		System.out.println(temperaturas.length);
		System.out.println(nombres.length);
		System.out.println(calificaciones.length);
		System.out.println(sensores.length);

		
		
		
		
	}

}
