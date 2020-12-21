import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Clase2 {
	
	public void llenarArchivo() throws IOException {
		Scanner entrada = new Scanner(System.in);
		Juego_2 juego3 = new Juego_2();
		File archivo = new File("./archivos/palabras.txt");
		
		String palabrasEspañol ="";
		String palabrasIngles ="";
		
		String palabras[] = juego3.leerArchivo(archivo).split("/");
		palabrasEspañol = palabras[0];
		palabrasIngles = palabras[1];
		
		System.out.println(palabrasEspañol);
		System.out.println(palabrasIngles);
		
		
		System.out.println("1)Ingresar palabras en español");
		System.out.println("2)Ingresar palabras en ingles");
		System.out.println("3)Salir");
		System.out.println("Elige una opcion:");
		char op = entrada.next().charAt(0);
		
		System.out.println("¿Cuantas palabras desea ingresar?");
		int numPalabras = entrada.nextInt();
		
		
		switch(op) {
			case '1' :
				for (int i=0; i<numPalabras; i++) {
					System.out.println("Ingresa una palabra: ");
					String palabra = entrada.nextLine();
					palabrasEspañol = palabrasEspañol+palabra+",";
				}
				break;
				
				
			case '2' :
				for (int i=0; i<numPalabras; i++) {
					System.out.println("Ingresa una palabra: ");
					String palabra = entrada.nextLine();
					palabrasIngles = palabrasIngles+palabra+",";
				}
				break;
				
				
			case '3' :
				
				break;
				
			default:
				System.out.println("Opcion Invalida!\n");
		
		
		}//switch
		
		System.out.println(palabrasEspañol);
		System.out.println(palabrasIngles);
		
		String cadenaNueva = palabrasEspañol+"/"+palabrasIngles;
		System.out.println("cadena nueva"+cadenaNueva);
		archivo.delete();
		archivo.createNewFile();
		
		FileWriter fw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);

            pw.print(1); pw.println(cadenaNueva);
           
            System.out.println("Las palabras han sido cargadas");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            pw.close();
            try {
                pw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        

		
       
		
		
	}
	
	
	
	
	
	
}//clase2

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
	
		Clase2 cl = new Clase2();
		
		cl.llenarArchivo();
		
		
		
		
		
		
		
		
	}

}
