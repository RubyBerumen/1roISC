
import java.util.Scanner;

public class Ejercicio03_masa_corporal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double imc = 0.0;
		
		System.out.println("Ingresa tu peso: ");
		double peso = entrada.nextDouble();
		System.out.println("Ingresa tu altura en metros: ");
		double altura = entrada.nextDouble();
		
		imc = peso/(Math.pow(altura, 2));
		
		System.out.println("IMC: " + imc);
		
		
		
		if(imc<16) {
			System.out.println("Criterio de ingreso al hospital");
		}else if(imc>=16 && imc<17) {
			System.out.println("Infrapeso");
		}else if(imc>=17 && imc<18) {
			System.out.println("Bajo peso");
		}else if(imc>=18 && imc<25) {
			System.out.println("Peso normal (saludable)");
		}else if(imc>=25 && imc<30) {
			System.out.println("Sobrepeso (obesidad de grado I)");
		}else if(imc>=30 && imc<35) {
			System.out.println("Sobrepeso crónico (obesidad de grado II)");
		}else if(imc>=35 && imc<=40) {
			System.out.println("Obesidad premórbida (obesidad de grado III)");
		}else if(imc>40) {
			System.out.println("Obesidad mórbida (obesidad de grado IV)");
		}
		
		

	}

}
