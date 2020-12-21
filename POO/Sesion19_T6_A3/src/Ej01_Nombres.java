import java.io.*;

class Nombres{

	public String readFile(File file) throws IOException {
		FileReader fr = new FileReader(file); 
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
	public String[] splitter(String nombres) {
		String[] res=nombres.split("\n");
		return res;
	}
	
}

public class Ej01_Nombres {

	public static void main(String[] args) throws IOException{
		
		File file = new File("archivos/nombres.txt");
		
		Nombres nom1 = new Nombres();
		
		String nombres = nom1.readFile(file);
		
		String[] lineas = nom1.splitter(nombres);
		
		for(int i=0;i<lineas.length;i+=1) {
			System.out.println(lineas[i].substring(0,lineas[i].length()-1)+"--> "+(lineas[i].length()-1)+" letras");
		}
		System.out.println("Total de nombres "+lineas.length);
		
		

	}

}
