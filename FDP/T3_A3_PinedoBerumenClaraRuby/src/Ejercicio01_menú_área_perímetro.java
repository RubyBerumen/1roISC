import java.util.Scanner;
public class Ejercicio01_men�_�rea_per�metro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("1) C�rculo");
		System.out.println("2) Tri�ngulo");
		System.out.println("3) Rect�ngulo");
		System.out.println("Elige una opci�n:");
		byte opcion = entrada.nextByte();
		
		if(opcion==1) {
			System.out.println("==C�rculo==");
			System.out.println("1) �rea");
			System.out.println("2) Per�metro");
			System.out.println("Elige una opci�n:");
			byte op1 = entrada.nextByte();
			
				if(op1==1) {
					System.out.println("==�rea==");
					System.out.println("Ingresa radio:");
					double radio = entrada.nextDouble();
					System.out.println("�rea:" + (Math.PI*Math.pow(radio,2)) );
				}else if(op1==2) {
					System.out.println("==Per�metro==");
					System.out.println("Ingresa radio:");
					double radio = entrada.nextDouble();
					System.out.println("Per�metro:" + (Math.PI*2*radio));
				}
		
		}else if(opcion==2) {
			System.out.println("==Tri�ngulo==");
			System.out.println("1) �rea");
			System.out.println("2) Per�metro");
			System.out.println("Elige una opci�n:");
			byte op2 = entrada.nextByte();
			
				if(op2==1) {
					System.out.println("==�rea==");
					System.out.println("Ingresa base");
					double base = entrada.nextDouble();
					System.out.println("Ingresa altura");
					double altura = entrada.nextDouble();
					System.out.println("�rea: " + (base*altura)/2);
				}else if(op2==2) {
					System.out.println("==Per�metro==");
					System.out.println("Ingresa lado 1;");
					double lado1 = entrada.nextDouble();
					System.out.println("Ingresa lado 2:");
					double lado2 = entrada.nextDouble();
					System.out.println("Ingresa lado 3:");
					double lado3 = entrada.nextDouble();
					System.out.println("Per�metro: " + (lado1+lado2+lado2));
					
				}
				
		}else if(opcion==3) {
			System.out.println("==Rect�ngulo==");
			System.out.println("1) �rea");
			System.out.println("2) Per�metro");
			System.out.println("Elige una opci�n:");
			byte op3 = entrada.nextByte();
				
				if(op3==1) {
					System.out.println("==�rea==");
					System.out.println("Ingresa base:");
					double base = entrada.nextDouble();
					System.out.println("Ingresa altura:");
					double altura = entrada.nextDouble();
					System.out.println("�rea: " + (base*altura));
				}else if(op3==2) {
					System.out.println("==Per�metro==");
					System.out.println("Ingresa base:");
					double lado1 = entrada.nextDouble();
					System.out.println("Ingresa altura:");
					double lado2 = entrada.nextDouble();
					System.out.println("Per�metro: " + (lado1+lado2)*2);
				}
				
			}
				
			
			


	}

}
