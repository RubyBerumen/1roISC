import java.util.Scanner;


class Boton {
	String forma;
	String color;
	double tamaño;
	
	public void prsionar() {
		System.out.println("Hecho");
	}
	public void activar() {
		System.out.println("Boton activado");
	}
	public void desactivar() {
		System.out.println("Boton desactivado");
	}
	
	public void lecturaAtributos() {
		System.out.println("Botón:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la forma: ");
		forma = entrada.nextLine();
		System.out.println("Ingresa el color: ");
		color = entrada.nextLine();
		System.out.println("Ingresa el tamaño: ");
		tamaño = entrada.nextDouble();	
	}
	
	public void mostrarAtributos() {
		System.out.println("Forma: " + forma);
		System.out.println("Color: " + color);
		System.out.println("Tamaño: " + tamaño);
		System.out.println();
	}	
}//class Boton


class CuentaDebito {
	String noCuenta;
	double saldo;
	double cantMin;
	
	public void depositar() {
		System.out.println("Ingrese la cantidad a depositar");
	}
	public void retirar() {
		System.out.println("Ingrese la cantidad a retirar");
	}
	public void transferir() {
		System.out.println("Ingrese la cantidad que desea transferir");
	}
	
	public void lecturaAtributos() {
		System.out.println("Cuenta de débito:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número de cuenta: ");
		noCuenta = entrada.nextLine();
		System.out.println("Ingresa el saldo: ");
		saldo = entrada.nextDouble();
		System.out.println("Ingresa la cantidad mínima: ");
		cantMin= entrada.nextDouble();
	}
		
	public void mostrarAtributos() {
		System.out.println("Número de cuenta: " + noCuenta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Cantidad mínima: " + cantMin);
		System.out.println();
	}
}//class cuentaDebito


class CuentaCredito {
	String noCuenta;
	double saldo;
	double deudas;
	
	public void depositar() {
		System.out.println("Ingrese la cantidad a depositar");
	}
	public void retirar() {
		System.out.println("Ingrese la cantidad a retirar");
	}
	public void transferir() {
		System.out.println("Ingrese la cantidad que desea transferir");
	}
	
	public void lecturaAtributos() {
		System.out.println("Cuenta de crédito:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número de cuenta: ");
		noCuenta = entrada.nextLine();
		System.out.println("Ingresa el saldo: ");
		saldo = entrada.nextDouble();
		System.out.println("Ingresa la cantidad de deudas: ");
		deudas = entrada.nextDouble();
	}
		
	public void mostrarAtributos() {
		System.out.println("Número de cuenta: " + noCuenta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Deudas: " + deudas);
		System.out.println();
	}
}//class cuentaDebito


class Paciente {
	String nombre;
	String enfermedad;
	int edad;
	
	public void morir() {
		System.out.println("El paciente ha muerto :( ");
	}
	public void curar() {
		System.out.println("El paciente se ha curado (: ");
	}
	public void platicar() {
		System.out.println("El paciente está hablando");
	}
	
	public void lecturaAtributos() {
		System.out.println("Paciente:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Ingresa la enfermedad: ");
		enfermedad = entrada.nextLine();
		System.out.println("Ingresa la edad: ");
		edad = entrada.nextInt();
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Enfermedad: " + enfermedad);
		System.out.println("Edad: " + edad);
		System.out.println();
	}
}//class Paciente


class Venta{
	String fecha;
	double cantidad;
	String lugar;
	
	public void registrar() {
		System.out.println("La venta ha sido registrada correctamente");
	}
	public void actualizarInventario() {
		System.out.println("El inventario ha sido actualizado correctamente");
	}
	public void imprimirTicket() {
		System.out.println("Se ha impreso el ticket");
	}
	
	public void lecturaAtributos() {
		System.out.println("Venta:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la fecha: ");
		fecha = entrada.nextLine();
		System.out.println("Ingresa la cantidad: ");
		cantidad = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Ingresa el lugar: ");
		lugar = entrada.nextLine();
	}
	
	public void mostrarAtributos() {
		System.out.println("Fecha: " + fecha);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Lugar: " + lugar);
		System.out.println();
	}
}//class Venta


class Pago {
	String fecha;
	double cantidad;
	String lugar;
	
	public void registrar() {
		System.out.println("El pago ha sido registrado correctamente");
	}
	public void imprimirTicket() {
		System.out.println("Se ha impreso el ticket correctamente");
	}
	public void calcularImpuesto() {
		System.out.println("El impuesto es...");
	}
	
	public void lecturaAtributos() {
		System.out.println("Pago:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la fecha: ");
		fecha = entrada.nextLine();
		System.out.println("Ingresa la cantidad: ");
		cantidad = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Ingresa el lugar: ");
		lugar = entrada.nextLine();
	}
	
	public void mostrarAtributos() {
		System.out.println("Fecha: " + fecha);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Lugar: " + lugar);
		System.out.println();
	}
}//class Pago


class Articulo {
	String tipo;
	String color;
	String prop;
	
	public void usar() {
		System.out.println("Se ha usado el articulo");
	}
	public void vender() {
		System.out.println("El articulo ha sido vendido corrctamente");
	}
	public void comprar() {
		System.out.println("El articulo ha sido comprado corrctamente");
	}
	
	public void lecturaAtributos() {
		System.out.println("Artículo:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el tipo: ");
		tipo = entrada.nextLine();
		System.out.println("Ingresa el color: ");
		color = entrada.nextLine();
		System.out.println("Ingresa el propósito: ");
		prop = entrada.nextLine();
	}
	
	public void mostrarAtributos() {
		System.out.println("Tipo: " + tipo);
		System.out.println("Color: " + color);
		System.out.println("Propósito: " + prop);
		System.out.println();
	}
}//class Articulo


class Vehiculo {
	String tipo;
	String color;
	int noLlantas;
	
	public void girar() {
		System.out.println("Girando hacia el lado....");
	}
	public void frenar() {
		System.out.println("El vehiculo se ha detenido");
	}
	public void avanzar() {
		System.out.println("El vehiculo esta avanzanado");
	}
	
	public void lecturaAtributos() {
		System.out.println("Vehiculo:");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el tipo: ");
		tipo = entrada.nextLine();
		System.out.println("Ingresa el color: ");
		color = entrada.nextLine();
		System.out.println("Ingresa el numero de llantas: ");
		noLlantas = entrada.nextInt();
	}
	
	public void mostrarAtributos() {
		System.out.println("Tipo: " + tipo);
		System.out.println("Color: " + color);
		System.out.println("Número de llantas: " + noLlantas);
		System.out.println();
	}
	
}//class Vehiculo


public class Ejecicio_Lectura_Impresion {

	public static void main(String[] args) {
		
		Boton boton1 = new Boton();
		boton1.lecturaAtributos();
		boton1.mostrarAtributos();
		
		Boton boton2 = new Boton();
		boton2.lecturaAtributos();
		boton2.mostrarAtributos();
		
		Boton boton3 = new Boton();
		boton3.lecturaAtributos();
		boton3.mostrarAtributos();
		
		
		
		CuentaDebito cd1 = new CuentaDebito();
		cd1.lecturaAtributos();
		cd1.mostrarAtributos();
		
		CuentaDebito cd2 = new CuentaDebito();
		cd2.lecturaAtributos();
		cd2.mostrarAtributos();
		
		CuentaDebito cd3 = new CuentaDebito();
		cd3.lecturaAtributos();
		cd3.mostrarAtributos();
		
		
		
		CuentaCredito cc1 = new CuentaCredito();
		cc1.lecturaAtributos();
		cc1.mostrarAtributos();
		
		CuentaCredito cc2 = new CuentaCredito();
		cc2.lecturaAtributos();
		cc2.mostrarAtributos();
		
		CuentaCredito cc3 = new CuentaCredito();
		cc3.lecturaAtributos();
		cc3.mostrarAtributos();
		
		
		
		Paciente px1 = new Paciente();
		px1.lecturaAtributos();
		px1.mostrarAtributos();
		
		Paciente px2 = new Paciente();
		px2.lecturaAtributos();
		px2.mostrarAtributos();
		
		Paciente px3 = new Paciente();
		px3.lecturaAtributos();
		px3.mostrarAtributos();
		
		
		
		Venta venta1 = new Venta();
		venta1.lecturaAtributos();
		venta1.mostrarAtributos();
		
		Venta venta2 = new Venta();
		venta2.lecturaAtributos();
		venta2.mostrarAtributos();
		
		Venta venta3 = new Venta();
		venta3.lecturaAtributos();
		venta3.mostrarAtributos();
		
		
		
		Pago pago1 = new Pago();
		pago1.lecturaAtributos();
		pago1.mostrarAtributos();
		
		Pago pago2 = new Pago();
		pago2.lecturaAtributos();
		pago2.mostrarAtributos();
		
		Pago pago3 = new Pago();
		pago3.lecturaAtributos();
		pago3.mostrarAtributos();
		
		
		
		Articulo art1 = new Articulo();
		art1.lecturaAtributos();
		art1.mostrarAtributos();
		
		Articulo art2 = new Articulo();
		art2.lecturaAtributos();
		art2.mostrarAtributos();
		
		Articulo art3 = new Articulo();
		art3.lecturaAtributos();
		art3.mostrarAtributos();
		
		
		
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.lecturaAtributos();
		vehiculo1.mostrarAtributos();
		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.lecturaAtributos();
		vehiculo2.mostrarAtributos();
		
		Vehiculo vehiculo3 = new Vehiculo();
		vehiculo3.lecturaAtributos();
		vehiculo3.mostrarAtributos();
		

	}

}
