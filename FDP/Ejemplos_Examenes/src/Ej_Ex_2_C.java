import java.util.Scanner;

public class Ej_Ex_2_C {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una cantidad de 4 digitos:");
		String dato = entrada.nextLine();  //9876
		
		String n1 = dato.substring(0,1); ///"9"
		String n2 = dato.substring(1,2);
		String n3 = dato.substring(2,3);
		String n4 = dato.substring(3,4);
		
		String datos [] = {n1,n2,n3,n4};
		int datosEntero [] = new int [datos.length];
	
		for (int i=0; i<datos.length; i++) {
			datosEntero[i] = Integer.parseInt(datos[i]);
			datosEntero[i] = (datosEntero[i]+7)%10;
			//System.out.print(datosEntero[i]+ " ");
		}
		System.out.println();
		
		
		String nuevoDato[] = new String[dato.length()];
		
		for (int i=0; i<datosEntero.length; i++) {
			if(datosEntero[i]==1) {
				nuevoDato[i]="A";
			}else if(datosEntero[i]==2) {
				nuevoDato[i]="E";
			}else if(datosEntero[i]==3) {
				nuevoDato[i]="I";
			}else if(datosEntero[i]==4) {
				nuevoDato[i]="O";
			}else if(datosEntero[i]==5) {
				nuevoDato[i]="U";
			}else {
				nuevoDato[i] = String.valueOf(datosEntero[i]);
			}
			
			//System.out.print(nuevoDato[i]);
						
		}//for
		System.out.println();
		
		
		
		String intercambio ="";
		
		for (int i=0; i<nuevoDato.length; i++) {
			
			intercambio=intercambio +nuevoDato[i];
			
		}
		 
		String num1 = intercambio.substring(0,1);
		String num2 = intercambio.substring(1,2);
		String num3 = intercambio.substring(2,3);
		String num4 = intercambio.substring(3,4);
		
		System.out.println("DATO CIFRADO: "+num3+num4+num1+num2);
		
		
		intercambio = num1+num2+num3+num4;
		
		//System.out.println(intercambio);
		
		String numeros[]= {num1,num2,num3,num4};
		
		String datoNuevo[] = new String[dato.length()];
		
		for (int i=0; i<numeros.length; i++) {
			
			if (numeros[i].equals("A")) {
				datoNuevo[i] = "1";
			}else if (numeros[i].equals("E")) {
				datoNuevo[i] = "2";
			}else if (numeros[i].equals("I")) {
				datoNuevo[i] = "3";
			}else if (numeros[i].equals("O")) {
				datoNuevo[i] = "4";
			}else if (numeros[i].equals("U")) {
				datoNuevo[i] = "5";
			}else {
				datoNuevo[i] = numeros[i];
			}
			
			//System.out.print(datoNuevo[i]);
		}
		System.out.println();
		
		int datosEnteros2[]=new int[datoNuevo.length];
		
		System.out.println("Desea descifrar el dato?");
		System.out.println("1) Si");
		System.out.println("2) No");
		byte op = entrada.nextByte();
		
		
		if(op==1) {
			System.out.print("DATO DESCIFRADO: ");
			for (int i=0; i<datoNuevo.length; i++) {
			datosEnteros2[i] = Integer.parseInt(datoNuevo[i]);
			datosEnteros2[i] = (datosEnteros2[i]+3)%10;
			System.out.print(datosEnteros2[i]);
			}
		}
	

	}

}
