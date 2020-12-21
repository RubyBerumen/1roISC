import java.util.Scanner;

public class Prueba_Examen1 {

	public static void main(String[] args) {
	
		
		CalculadoraCadenas cc1 = new CalculadoraCadenas();
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa una operacion a resolver: ");
		String cad = ent.nextLine();
		
		String cadena=cc1.limpiarCadena(cad);
		cc1.relizarOperacion(cadena, cc1.sacarCaracter(cadena));
		cc1.resultado();
		

	}

}
