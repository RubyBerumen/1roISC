import java.util.Scanner;

/*
 * Crear un programa en Java que obtenga la edad de una persona con base
 * en su año de nacimiento
 * 
 */

//SOLUCIUONES ORIENTADAS A OBJETOS
class Persona {
	
	byte edad;
	
	//2) metodo TODOLOGO (peor)
	public void obtenerEdadV1() {
		System.out.println("===Solucion 00 V1===");
		Scanner ent = new Scanner(System.in);
		
		//1) Solucion estructurada
		System.out.println("Ingresa tu año de nacimiento: ");
		int añoNac = ent.nextInt();
		byte edad = (byte)(2020-añoNac);
		System.out.println("Tu edad es: "+edad);
	}
	
	
	//3) metodo Con Parametros (buena)
	public byte obtenerEdadV2(int añoNacimiento) {
		System.out.println("===Solucion 00 V2===");
		return (byte)(2020-añoNacimiento);
	}
	
	//4) metodo con variables de instancia
	public void obtenerEdadV3 (int añoNacimiento) {
		System.out.println("===Solucion 00 V3===");
		edad = (byte)(2020-añoNacimiento);
	}
	
	
}//class Persona


public class PruebaSoluciones {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//1) SOLUCION ESTRUCTURADA
		System.out.println("Ingresa tu año de nacimiento: ");
		int añoNac = ent.nextInt();
		byte edad = (byte)(2020-añoNac);
		System.out.println("Tu edad es: "+edad);
		//--------------------------------------------------------
		Persona obj1 = new Persona();
		obj1.obtenerEdadV1();
		//---------------------------------------------------------
		Persona obj2 = new Persona();
		System.out.println("Ingresa tu año de nacimiento: ");
		int x = ent.nextInt();
		System.out.println("Tu edad es: "+ obj2.obtenerEdadV2(x));
		//---------------------------------------------------------
		Persona obj3 = new Persona();
		System.out.println("Ingresa tu año de nacimiento: ");
		int y = ent.nextInt();
		obj3.obtenerEdadV3(y);
		System.out.println("Tu edad es: "+obj3.edad);
		
		
		


	}

}
