import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Productos{
	
	public String readFile(File archivo) throws IOException {
		FileReader fr = new FileReader(archivo); 
	    BufferedReader br = new BufferedReader(fr);
	      
	    String linea = null;
	    StringBuilder stringBuilder = new StringBuilder();
	    String separador = System.getProperty("line.separator");
	      
	    try {
	    	while((linea = br.readLine()) != null) {
	              stringBuilder.append(linea);
	              stringBuilder.append(separador);
	          }

	    	return stringBuilder.toString();
	    } finally { 
	          br.close();
	          fr.close();
	    }
	}
	public String[] splitter(String lista) {
		String[] retorno=lista.split("\n");
		return retorno;
	}
	public String[] filtro(String[] lista, double precio) {
		String[] res = new String[lista.length];
		String[] temporal = new String[2];
		int x=0;
		for(int i = 0;i<lista.length;i+=1) {
			temporal=lista[i].split(" ");
			if(Double.parseDouble(temporal[1])>precio) {
				res[x]=lista[i];
				x+=1;
			}
		}
		return res;
	}
	
	
}

public class Ej05_Productos {

	public static void main(String[] args) throws IOException {

		Scanner ent = new Scanner(System.in);
		
		File productos = new File("archivos/productos.txt");
		
		Productos prod = new Productos();
		
		String listaProductos = prod.readFile(productos);
		String[] productosIndividuales = prod.splitter(listaProductos);
		
		System.out.println("Ingrese un precio: ");
		double precio = ent.nextDouble();
		
		String[] nuevos = prod.filtro(productosIndividuales, precio);
		
		File archivoNuevo = new File("archivos/productosNuevo.txt");
		
        if (!archivoNuevo.exists()) {
        	archivoNuevo.createNewFile();
            }

        FileWriter writer = new FileWriter(archivoNuevo); 
        
        for(int i=0;i<nuevos.length;i+=1) {
			if(nuevos[i]!=null) {
		        writer.write(nuevos[i]);
			}
		}
        
        writer.flush();
	    writer.close();		
		

	}

}
