import java.text.DecimalFormat;



public class FormatoDecimales {
	
	public static void main(String args[]) {
		//paso 1: utilizar la clase DecimalFormat
												//patron de impresion
		DecimalFormat formato = new DecimalFormat("$0,000.00");
		
		double venta = 7*16.78;
		double salario = 233.33*13;
		
		System.out.println(venta);
		System.out.println(salario);
		
		//paso2: aplicar el formato de impresion a los numeros de punto flotante
		
		System.out.println(formato.format(venta) );
		System.out.println(formato.format(salario) );
		System.out.println(formato.format(234.567) );
		System.out.println(formato.format(12445.50) );
		
		//el de arriba está mal, este es el chido
		DecimalFormat formato2 = new DecimalFormat("$#,##0.00");
		System.out.println(formato2.format(234.567) );
		System.out.println(formato2.format(12445.50) );
		System.out.println(formato2.format(0.567) );
		
		
		//=================================================================
		//Formato con simbolo de YENES
		System.out.println("'\u00A5'");
		DecimalFormat formatoYenes = new DecimalFormat("'\u00A5'#,##0.00");
		System.out.println(formatoYenes.format(1543489.50));
		
		//=================================================================
		DecimalFormat formatomonedageneral = new DecimalFormat("\u00A4#,##0.00");
		System.out.println(formatomonedageneral.format(1543489.50));
		
	}
	

}
