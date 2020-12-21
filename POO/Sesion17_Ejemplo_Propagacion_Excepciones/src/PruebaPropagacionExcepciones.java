import javax.swing.JOptionPane;

/*
 * Propagacion de excepciones
 * 
 * Es cuando un metodo que puede generar una excepcion, no la gestiona internamente
 * y en su lugar, la envia a un metodo que haya invocado a dicho metodo que genero
 * la excepcion
 * 
 */

class PropagacionExcepcion{
	
	public void metodo1() {
		System.out.println("metodo 1");
		
		try {
			metodo2();
		} catch (Exception e) {
			System.out.println("no division por 0");
		}
		
		
	}
	public void metodo2() throws ArithmeticException{
		System.out.println("metodo 2");
		
		metodo3();
		
	}
	public void metodo3() throws ArithmeticException{
		System.out.println("metodo 3");
		int x = 10,y = 0;
		System.out.println(x/y);
		//la propagacion de la excepcion generada en la linea anterior consiste en si capturar dicha
		//excepcion, pero no gestionarla aqui, sino lanzarla hacia otro lugar
	}
	
}

//----------------------------------------------------------

//funcionalidad del programa o reglas de negocio
class Calculadora{
	
	public double sumar(double x, double y) {
		return x+y;
	}
	public double restar(double x, double y) {
		return x-y;
	}
	public double multiplicar(double x, double y) {
		return x*y;
	}
	public double dividir(double x, double y) {
		double r = 0.0;

		try {
			r = x/y;
		} catch (ArithmeticException e) {
			System.out.println("no dividir por 0");
		}

		return r;
	}
	
	
}

public class PruebaPropagacionExcepciones {

	public static void main(String[] args){
		
		//new PropagacionExcepcion().metodo1();
	
		// Simular que la GUI(Graphic User Interface) o Interfaz Grafica de Usuario
		
		/*double x = 5.6, y = 7.8;
		
		System.out.println(new Calculadora().sumar(x, y));
		System.out.println(new Calculadora().restar(x, y));	
		System.out.println(new Calculadora().multiplicar(x, y));
		System.out.println(new Calculadora().dividir(x, y));		
		*/
		
		//simular que se presiona el boton de sumar
		//el boton sumar obtiene los datos de las cajas de texto para despues enviarlos
		//al codigo que realiza la suma
		double x = 4.5,y = 0;
		
		Calculadora c = new Calculadora();
		
		double res=0.0;
		try {
			res = c.dividir(x, y);
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "no se puede dividir entre 0");
		}
		
		//simular la imresion del resultado en una caja de texto
		System.out.println("resultado division: "+res);
	}

}
