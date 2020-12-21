import java.util.Scanner;
public class Ejercicio01_menú_área_perímetro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("1) Círculo");
		System.out.println("2) Triángulo");
		System.out.println("3) Rectángulo");
		System.out.println("Elige una opción:");
		byte opcion = entrada.nextByte();
		
		if(opcion==1) {
			System.out.println("==Círculo==");
			System.out.println("1) Área");
			System.out.println("2) Perímetro");
			System.out.println("Elige una opción:");
			byte op1 = entrada.nextByte();
			
				if(op1==1) {
					System.out.println("==Área==");
					System.out.println("Ingresa radio:");
					double radio = entrada.nextDouble();
					System.out.println("Área:" + (Math.PI*Math.pow(radio,2)) );
				}else if(op1==2) {
					System.out.println("==Perímetro==");
					System.out.println("Ingresa radio:");
					double radio = entrada.nextDouble();
					System.out.println("Perímetro:" + (Math.PI*2*radio));
				}
		
		}else if(opcion==2) {
			System.out.println("==Triángulo==");
			System.out.println("1) Área");
			System.out.println("2) Perímetro");
			System.out.println("Elige una opción:");
			byte op2 = entrada.nextByte();
			
				if(op2==1) {
					System.out.println("==Área==");
					System.out.println("Ingresa base");
					double base = entrada.nextDouble();
					System.out.println("Ingresa altura");
					double altura = entrada.nextDouble();
					System.out.println("Área: " + (base*altura)/2);
				}else if(op2==2) {
					System.out.println("==Perímetro==");
					System.out.println("Ingresa lado 1;");
					double lado1 = entrada.nextDouble();
					System.out.println("Ingresa lado 2:");
					double lado2 = entrada.nextDouble();
					System.out.println("Ingresa lado 3:");
					double lado3 = entrada.nextDouble();
					System.out.println("Perímetro: " + (lado1+lado2+lado2));
					
				}
				
		}else if(opcion==3) {
			System.out.println("==Rectángulo==");
			System.out.println("1) Área");
			System.out.println("2) Perímetro");
			System.out.println("Elige una opción:");
			byte op3 = entrada.nextByte();
				
				if(op3==1) {
					System.out.println("==Área==");
					System.out.println("Ingresa base:");
					double base = entrada.nextDouble();
					System.out.println("Ingresa altura:");
					double altura = entrada.nextDouble();
					System.out.println("Área: " + (base*altura));
				}else if(op3==2) {
					System.out.println("==Perímetro==");
					System.out.println("Ingresa base:");
					double lado1 = entrada.nextDouble();
					System.out.println("Ingresa altura:");
					double lado2 = entrada.nextDouble();
					System.out.println("Perímetro: " + (lado1+lado2)*2);
				}
				
			}
				
			
			


	}

}
