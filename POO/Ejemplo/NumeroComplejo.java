import java.util.Scanner;

class NumeroComplejo {

	private int parteReal;
	private String parteImaginaria;
	private int divisor=1;
	
	
	public int getParteReal() {
		return this.parteReal;
	}
	public void setParteReal(int parteReal) {
		this.parteReal=parteReal;
	}

	public String getParteImaginaria() {
		return this.parteImaginaria;
	}
	public void setParteImaginaria(String parteImaginaria) {
		this.parteImaginaria=parteImaginaria;
	}
	
	public int getDivisor() {
		return this.divisor;
	}
	public void setDivisor(int divisor) {
		this.divisor=divisor;
	}
	
	public NumeroComplejo(int parteReal,String parteImaginaria) {
		this.parteReal=parteReal;
		this.parteImaginaria=parteImaginaria;
	}
	public NumeroComplejo() {
		
	}

	public NumeroComplejo dividir(NumeroComplejo nc1,NumeroComplejo nc2) {
	
		int a= nc1.getParteReal();
		
		String conversion="";
		for(int i=0;i<nc1.getParteImaginaria().length();i+=1) {
			if((nc1.getParteImaginaria().charAt(i)>=48&&nc1.getParteImaginaria().charAt(i)<=57)||nc1.getParteImaginaria().charAt(i)==45) {
				conversion=conversion+nc1.getParteImaginaria().charAt(i);
			}
		}
		int b = Integer.parseInt(conversion);
		
		int c= nc2.getParteReal();
		
		conversion="";
		for(int i=0;i<nc2.getParteImaginaria().length();i+=1) {
			if((nc2.getParteImaginaria().charAt(i)>=48&&nc2.getParteImaginaria().charAt(i)<=57)||nc2.getParteImaginaria().charAt(i)==45) {
				conversion=conversion+nc2.getParteImaginaria().charAt(i);
			}
		}
		int d = Integer.parseInt(conversion);
	
		int num1 = (a*c)+(b*d);
		String num2 = ((b*c)-(a*d))+"i";
		divisor =((c*c)+(d*d));
		
		return new NumeroComplejo(num1,num2);
	}
	public NumeroComplejo multiplicar(NumeroComplejo nc1,NumeroComplejo nc2) {
	
		int a= nc1.getParteReal();	

		String conversion="";
		for(int i=0;i<nc1.getParteImaginaria().length();i+=1) {
			if((nc1.getParteImaginaria().charAt(i)>=48&&nc1.getParteImaginaria().charAt(i)<=57)||nc1.getParteImaginaria().charAt(i)==45) {
				conversion=conversion+nc1.getParteImaginaria().charAt(i);
			}
		}
		int b = Integer.parseInt(conversion);
		
		int c= nc2.getParteReal();
		
		conversion="";
		for(int i=0;i<nc2.getParteImaginaria().length();i+=1) {
			if((nc2.getParteImaginaria().charAt(i)>=48&&nc2.getParteImaginaria().charAt(i)<=57)||nc2.getParteImaginaria().charAt(i)==45) {
				conversion=conversion+nc2.getParteImaginaria().charAt(i);
			}
		}
		int d = Integer.parseInt(conversion);
	
		int num1 = (a*c)-(b*d);
		String num2 = ((b*c)+(a*d))+"i";
		
		return new NumeroComplejo(num1,num2);
	}
	
	public void imprimirAtributos() {
		System.out.println("("+parteReal+" + "+parteImaginaria+")/ "+divisor);
	}
	public void elegirOpcion(NumeroComplejo nc1,NumeroComplejo nc2) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opc=0;
		
		do {
			
		System.out.println("Eliga una opcion: ");
		System.out.println("1)Multiplicacion");
		System.out.println("2)Division");
		opc = entrada.nextInt();
		
		}while(opc!=1&&opc!=2);
		System.out.println("Resultado: ");
		if(opc == 1) {
			
			
			NumeroComplejo nc0= new NumeroComplejo();
			NumeroComplejo imp = nc0.multiplicar(nc1, nc2);
			imp.imprimirAtributos();
		}else{
			
			NumeroComplejo nc4= new NumeroComplejo();
			NumeroComplejo impresion = nc4.dividir(nc1, nc2);
			
			impresion.setDivisor(nc4.getDivisor());
			impresion.imprimirAtributos();
		}
		
	}
	
	
	
}