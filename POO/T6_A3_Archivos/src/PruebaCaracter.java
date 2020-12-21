import java.io.*;
import java.util.Scanner;

class Caracter{
	
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

	    	return stringBuilder.toString().toLowerCase();
	    } finally {
	          br.close();
	          fr.close();
	    }
	}
	public int Contador(String archivo, char c){
		int cc=0;
		for(int i=0;i<archivo.length();i+=1) {
			if(c==archivo.charAt(i)) {
				cc+=1;
			}
		}
		return cc;
	}
	
}

public class PruebaCaracter {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		File file = new File("Caracter.txt");
		
		Caracter c1 = new Caracter();
		
		String archivo = c1.readFile(file);
		
		System.out.println("Caracter a buscar: ");
		char c = input.nextLine().toLowerCase().charAt(0);

		System.out.println(c+" aparece "+c1.Contador(archivo, c)+" veces");
	}

}
