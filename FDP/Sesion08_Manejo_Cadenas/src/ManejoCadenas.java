
public class ManejoCadenas {
	public static void main(String[] args) {
		
		String cad = "Ingeniería en Sistemas Computacionales7";
		
		//==============Convertir a mayusculas===================
		String cadenaMayusculas = cad.toUpperCase();
		System.out.println(cadenaMayusculas);
		
		//==============Convertir a minusculas===================
		System.out.println(cad.toLowerCase());
		
		//=========Longitud (tamaño o cantidad de caracteres)===================
		System.out.println("Tamaño de la cadena: " + cad.length());
		
		//=========Obtener un caracter de una posicion especifica===============
		char C = cad.charAt(0);
		System.out.println(C);
		
		//System.out.println(cad.charAt(38));
		System.out.println(cad.charAt(37));
		
		System.out.println(cad.charAt(cad.length()-1));
		
		//===============Obtener una subcadena===============
		System.out.println(cad.substring(7));
		System.out.println(cad.substring(0,10));  //Limite superior siempre retorna n-1
		
		//===============Reemplazar caracteres===============
		System.out.println(cad.replace('a', '@').toUpperCase().replace('S', '$') );
		
		//===============Ocurrencias===============
		System.out.println( cad.indexOf('n'));
		
		
		
		
		
		
		
		
	}

}
