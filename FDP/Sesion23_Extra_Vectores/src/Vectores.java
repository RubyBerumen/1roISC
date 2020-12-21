
public class Vectores {

	public static void main(String[] args) {
		
		//---------------------Split---------------------------
		
		String cadena = "Ya casi soy ingeniero inmortal";
		
		//Se recomienda el metodo SPLIT de la calse Srting
		
		String res[] = cadena.split(" ");
		
		System.out.println(res[3]);
		
		cadena= "Ya-casi-soy-ingeniero-inmortal";
		
		System.out.println(cadena.split("-")[3]);
		System.out.println(cadena.split(" ")[0]);
		
		
		//-------------Declaracion----------------------------
		
		double temperaturas[] = new double[5]; 
		double []estaturas = new double[5] ;
		
		int edades[], promedio;
		promedio = 80;
		
		int []calificaciones, sensores; //Todos son vectores
		
		calificaciones = new int[5];
		calificaciones[0] = 100;
		
		//sensores=10; ERROR ya que la variable sensores es un vector
		
		sensores = new int[5];
		sensores [3] = 5;
		
		
		


	}

}
