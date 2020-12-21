import java.util.Scanner;


class NumeroRacional{
	
	private int numerador;
	private int denominador;
	
	public NumeroRacional() {}
	
	public NumeroRacional(int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	public int getNumerador() {return numerador;}
	public void setNumerador(int numerador) {
		this.numerador=numerador;
	}
	
	public int getDenominador() {return denominador;}
	public void setDenominador(int denominador) {
		this.denominador=denominador;
	}
	
	
	public NumeroRacional multiplicacionNumeroRacionalRetorno(NumeroRacional nr1, NumeroRacional nr2) {		
		
		NumeroRacional res = new NumeroRacional();
		int resNumerador= nr1.getNumerador()*nr2.getNumerador();
		int resDenominador=nr1.getDenominador()*nr2.getDenominador();
		
		res.setNumerador(resNumerador);
		res.setDenominador(resDenominador);
		
		return res;
	}
	

	public void multiplicacionNumeroRacional(NumeroRacional nr1, NumeroRacional nr2) {
		int resNumerador= nr1.getNumerador()*nr2.getNumerador();
		int resDenominador=nr1.getDenominador()*nr2.getDenominador();
		
		System.out.println("Resultado de la multiplicacion: "+resNumerador+"/"+resDenominador);
		
	}
	
	public void multiplicacionNumeroRacional(NumeroRacional nr1, NumeroRacional nr2, NumeroRacional nr3) {
		int resNumerador= nr1.getNumerador()*nr2.getNumerador()*nr3.getNumerador();
		int resDenominador=nr1.getDenominador()*nr2.getDenominador()*nr3.getDenominador();
		
		System.out.println("Resultado de la multiplicacion: "+resNumerador+"/"+resDenominador);
		
	}
	
	
	
	public void sumaNumeroRacional(NumeroRacional nr1, NumeroRacional nr2) {
		int resNumerador= (nr1.getNumerador()*nr2.getDenominador())+(nr2.getNumerador()*nr1.getDenominador());
		int resDenominador=nr1.getDenominador()*nr2.getDenominador();
		
		System.out.println("Resultado de la suma: "+resNumerador+"/"+resDenominador);
		
	}
	
	
	
}//class NumeroRacional

public class Ej_01_NumerosRacionales {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		System.out.println("Ingresa el númerador del primer número ");
		int num1 = ent.nextInt();
		System.out.println("Ingresa el denominador del primer número ");
		int den1 = ent.nextInt();
		System.out.println("Ingresa el númerador del segundo número ");
		int num2 = ent.nextInt();
		System.out.println("Ingresa el denominador del segundo número ");
		int den2 = ent.nextInt();
		System.out.println("Ingresa el númerador del tercer número ");
		int num3 = ent.nextInt();
		System.out.println("Ingresa el denominador del tercer número ");
		int den3 = ent.nextInt();
		
		NumeroRacional obj1 = new NumeroRacional(num1,den1);
		NumeroRacional obj2 = new NumeroRacional(num2,den2);
		NumeroRacional obj3 = new NumeroRacional(num3,den3);
		
		NumeroRacional obj4 = new NumeroRacional(); 
		obj4.multiplicacionNumeroRacional(obj1, obj2);
		obj4.multiplicacionNumeroRacional(obj1, obj2, obj3);
		obj4.sumaNumeroRacional(obj1, obj2);
		
		
		

	}

}
