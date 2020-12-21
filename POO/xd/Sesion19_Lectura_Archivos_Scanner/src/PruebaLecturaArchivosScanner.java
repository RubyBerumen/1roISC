import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PruebaLecturaArchivosScanner {

	public static void main(String[] args) {
	
		
		Scanner larchivo = null;
		
		
		try {
		larchivo = new Scanner(new BufferedReader(new FileReader("recursos/archivo2.txt")));
		larchivo.useDelimiter(",");
		while(larchivo.hasNext()) {
		System.out.println(larchivo.next());
		}
		//.next(); retorna elemento por elemento separandolos de un token especificado por
		//el programador o usuario, por default es el espacio " "
		
		}catch(FileNotFoundException w) {
			w.printStackTrace();
		}finally {
			larchivo.close();
		}
	}

}
