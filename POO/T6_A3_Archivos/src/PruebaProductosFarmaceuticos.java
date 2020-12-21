import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class ProductosFarmaceuticos{
	
	public String readFile(File file) throws IOException {
		FileReader fr = new FileReader(file); 
	    BufferedReader br = new BufferedReader(fr);
	      
	    String linea = null;
	    StringBuilder stringBuilder = new StringBuilder();
	    String ls = System.getProperty("line.separator");
	      
	    try {
	    	while((linea = br.readLine()) != null) {
	              stringBuilder.append(linea);
	              stringBuilder.append(ls);
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
		String[] retorno = new String[lista.length];
		String[] temporal = new String[2];
		int x=0;
		for(int i = 0;i<lista.length;i+=1) {
			temporal=lista[i].split(" ");
			if(Double.parseDouble(temporal[1])>precio) {
				retorno[x]=lista[i];
				x+=1;
			}
		}
		return retorno;
	}
	
	
}

public class PruebaProductosFarmaceuticos {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		File productos = new File("ProductosFarmaceuticos.txt");
		
		ProductosFarmaceuticos pf0 = new ProductosFarmaceuticos();
		
		String listaProductos = pf0.readFile(productos);
		String[] productosIndividuales = pf0.splitter(listaProductos);
		
		System.out.println("precio indicado: ");
		double precio = input.nextDouble();
		
		String[] filtrados = pf0.filtro(productosIndividuales, precio);
		
		File file = new File("ProductosFiltrados.txt");
		
        if (!file.exists()) {
            file.createNewFile();
            }

        FileWriter writer = new FileWriter(file); 
        
        for(int i=0;i<filtrados.length;i+=1) {
			if(filtrados[i]!=null) {
		        writer.write(filtrados[i]);
			}
		}
        
        writer.flush();
	    writer.close();		
	}

}
