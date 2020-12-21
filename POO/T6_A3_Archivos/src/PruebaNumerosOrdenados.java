import java.io.*;
import java.util.Arrays;

class NumerosOrdenados{
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
	
	public int[] asignacion(String[] conjuntos1, String[] conjuntos2) {
		
		String[] retorno = new String[conjuntos1.length+conjuntos2.length];
		int[] numeros = new int[conjuntos1.length+conjuntos2.length];
		
		for(int i=0;i<conjuntos1.length;i+=1) {
			retorno[i]=conjuntos1[i];
		}
		for(int i=conjuntos1.length;i<retorno.length;i+=1) {
			retorno[i]=conjuntos2[i-conjuntos1.length];
		}
		for(int i=0;i<retorno.length;i+=1) {
			numeros[i]=(int) Double.parseDouble(retorno[i]);
		}
		
		
		return numeros;
	}
	
}

public class PruebaNumerosOrdenados {

	public static void main(String[] args) throws IOException{
		
		File numeros1 = new File("Numeros1.txt");
		File numeros2 = new File("Numeros2.txt");
		
		NumerosOrdenados no0 = new NumerosOrdenados();
		
		String conjunto1 = no0.readFile(numeros1);
		String conjunto2 = no0.readFile(numeros2);
		
		String[] conjuntos1 = no0.splitter(conjunto1);
		String[] conjuntos2 = no0.splitter(conjunto2);
		
		int[] conjuntos = no0.asignacion(conjuntos1, conjuntos2);
		/*for(int i=0;i<conjuntos.length;i+=1) {
			System.out.println(conjuntos[i]);
		}*/
		Arrays.sort(conjuntos);
		
		File file = new File("NumerosOrdenados.txt");
		
        if (!file.exists()) {
            file.createNewFile();
            }

        FileWriter writer = new FileWriter(file); 
        writer.write(Arrays.toString(conjuntos));
        writer.flush();
	    writer.close();
		
		
	}

}
