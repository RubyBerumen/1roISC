import java.util.Scanner;

public class PruebaNumeroComplejo {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Parte real del primer numero:");
		int parteRealnc1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Parte imaginaria del primer numero:");
		String parteImgc1 = entrada.nextLine();
		
		NumeroComplejo numeroComplejo1 = new NumeroComplejo(parteRealnc1, parteImgc1);
		
		System.out.println("Parte real del segundo numero:");
		int parteRealnc2 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Parte imaginaria del segundo numero:");
		String parteImgc2 = entrada.nextLine();
		
		NumeroComplejo numeroComplejo2 = new NumeroComplejo(parteRealnc2, parteImgc2);
		
		NumeroComplejo nc3 = new NumeroComplejo();
		nc3.elegirOpcion(numeroComplejo1, numeroComplejo2);
		
	}
	
}