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
		String[] res=lista.split("\n");
		return res;
	}
	
	public int[] acomodar(String[] numerosOrd, String[] numerosMez) {
		
		String[] retorno = new String[numerosOrd.length+numerosMez.length];
		int[] numeros = new int[numerosOrd.length+numerosMez.length];
		
		for(int i=0;i<numerosOrd.length;i+=1) {
			retorno[i]=numerosOrd[i];
		}
		for(int i=numerosOrd.length;i<retorno.length;i+=1) {
			retorno[i]=numerosMez[i-numerosOrd.length];
		}
		for(int i=0;i<retorno.length;i+=1) {
			numeros[i]=(int) Double.parseDouble(retorno[i]);
		}
		
		
		return numeros;
	}
	
}



public class Ej04_NumerosEnteros {

	public static void main(String[] args) throws IOException{
		

		File numerosO = new File("archivos/numerosOrdenados.txt");
		File numerosM = new File("archivos/numerosMezclados.txt");
		
		NumerosOrdenados num = new NumerosOrdenados();
		
		String numerosOrd = num.readFile(numerosO);
		String numerosMez = num.readFile(numerosM);
		
		String[] numerosOr = num.splitter(numerosOrd);
		String[] numerosMe = num.splitter(numerosMez);
		
		int[] numerosA = num.acomodar(numerosOr, numerosMe);
		Arrays.sort(numerosA);
		
		File file = new File("archivos/numerosFinal.txt");
		
        if (!file.exists()) {
            file.createNewFile();
            }

        FileWriter writer = new FileWriter(file); 
        writer.write(Arrays.toString(numerosA));
        writer.flush();
	    writer.close();
		
		
		
	

	}

}
