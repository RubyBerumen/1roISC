import java.io.*;
import java.util.Scanner;

class Letra{
	
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
	public int Contador (String archivo, char letra){
		int sum=0;
		for(int i=0;i<archivo.length();i+=1) {
			if(letra==archivo.charAt(i)) {
				sum+=1;
			}
		}
		return sum;
	}
	
}

public class Ej02_ContarLetras {

	public static void main(String[] args)  throws IOException {
		
		Scanner ent = new Scanner(System.in);
		
		File archivo = new File("archivos/letras.txt");
		
		Letra l1 = new Letra();
		
		String archivoo = l1.readFile(archivo);
		
		System.out.println("Ingrese una letra para buscar: ");
		char letra = ent.nextLine().toLowerCase().charAt(0);

		System.out.println("Número de veces que aparece la letra "+letra+" en el archivo: "+l1.Contador(archivoo, letra));
		
		
		
	
		
		
		
		
	
	}

}
