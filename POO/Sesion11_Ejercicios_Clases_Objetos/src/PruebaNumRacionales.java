

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
	
	
}//class NumeroRacional

public class PruebaNumRacionales {

	public static void main(String[] args) {
	

		NumeroRacional obj1 = new NumeroRacional(1,3);
		NumeroRacional obj2 = new NumeroRacional(2,5);
		NumeroRacional obj3 = new NumeroRacional(1,2);
		
		NumeroRacional obj4 = new NumeroRacional(); //se usara para invocar el metodo de multiplicacion
		obj4.multiplicacionNumeroRacional(obj1, obj2);
		obj4.multiplicacionNumeroRacional(obj1, obj2, obj3);
		
		//obj4.multiplicacionNumeroRacionalRetorno(obj1, obj2).getNumerador();
		//obj4.multiplicacionNumeroRacionalRetorno(obj1, obj2).getDenominador();	
		
		NumeroRacional x = obj4.multiplicacionNumeroRacionalRetorno(obj1, obj2);
		
		System.out.println("Resultado: "+ x.getNumerador()+"/"+x.getDenominador());
		
		
	}

}
