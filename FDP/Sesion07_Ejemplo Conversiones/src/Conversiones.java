import java.util.Scanner;

public class Conversiones {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		byte b;
		short s;
		int i;
		long l;
		
		float f;
		double d;
		
		char c;
		
		boolean bool;
		
		System.out.println("Ingresa dato: ");
		String dato = entrada.next();
		
		b = Byte.parseByte(dato);
		s = Short.parseShort(dato);
		i = Integer.parseInt(dato);
		l = Long.parseLong(dato);
		
		System.out.println(Math.cbrt(b));
		System.out.println(Math.cbrt(s));
		System.out.println(Math.cbrt(i));
		System.out.println(Math.cbrt(l));
		
		f = Float.parseFloat(dato);		//100.0
		System.out.println(f);
		d = Double.parseDouble(dato);	//100.0
		System.out.println(d);
		
		System.out.println(Math.cbrt(f));
		System.out.println(Math.cbrt(d));
		
		//=====================================================
		//c = Character.parse... DE STRING A CHAR NO SE PUEDE CONVERTIR
		
		bool = Boolean.parseBoolean(dato);
		System.out.println(bool);
		
		//=====================================================
		
		byte dia = 22;
		byte mes = 7;
		short año = 2001;
		byte edad = 25;
		
		System.out.println(dia+" "+mes+" "+año+" "+edad);
		
		System.out.println(String.valueOf(dia)+(mes+año+edad));
		
		boolean x = true;
		String y = String.valueOf(x);
		
		System.out.println(y);
		
		
		
		

	}

}
