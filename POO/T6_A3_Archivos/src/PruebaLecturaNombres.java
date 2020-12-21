import java.io.*;

class Nombres{

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
	public String[] splitter(String temperaturas) {
		String[] retorno=temperaturas.split("\n");
		return retorno;
	}
	
}

public class PruebaLecturaNombres {

	public static void main(String[] args) throws IOException {
		
		File file = new File("NOMBRES.txt");
		
		Nombres n0 = new Nombres();
		
		String nombres = n0.readFile(file);
		
		String[] lineas = n0.splitter(nombres);
		
		for(int i=0;i<lineas.length;i+=1) {
			System.out.println(lineas[i].substring(0,lineas[i].length()-1)+"--> "+(lineas[i].length()-1)+" letras");
		}
		System.out.println("TOTAL DE NOMBRES: "+lineas.length);
		
	}

}
