
interface Cliente{
	//metodos abstractos
}

class ClienteRegular implements Cliente{
	
}

class ClientePreferencial implements Cliente{
	
}

class ClienteVIP implements Cliente{
	
}

class Credito {
	
	Cliente cliente;//variable polimorfica
	private double cantidad;
	
	public Credito(Cliente cliente, double cantidad) {
		this.cliente = cliente;
		this.cantidad = cantidad;
	}
	
}

public class PruebaVariablesPolimorficas {

	public static void main(String[] args) {
		
		Credito cr1 = new Credito (new ClienteRegular(), 5676.87 );
		
		Credito cr2 = new Credito (new ClientePreferencial(), 5676.87 );
		
		Credito cr3 = new Credito (new ClienteVIP(), 5676.87 );
		
		

	}

}
