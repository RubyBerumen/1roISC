import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLecturaCaracteres {

	public static void main(String[] args) {
			File archivo = new File("./recursos/archivo.txt");
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			int c = br.read();
			
			
			while(c != -1){
				System.out.println((char)c);
				System.out.println("---> D " + Character.isDigit(c));
				System.out.println("---> A " + Character.isAlphabetic(c));
				System.out.println("---> S " + Character.isWhitespace(c));
				c=br.read();
			}
			
			
			}catch(FileNotFoundException w) {
				System.out.println("No se encontro archivo");
			} catch (IOException e) {
				System.out.println("Error al leer");
			}finally{
				try {
					br.close();
					fr.close();
				}catch(IOException ww) {
					
				}
				
			}
		
		
		
			
			
			
			
	}

}
