import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaJuegoAhorcado {

	public PruebaJuegoAhorcado() {}
	
	
	public static void main(String[] args) throws IOException{
		
		PruebaJuegoAhorcado pja1 = new PruebaJuegoAhorcado();
		
		pja1.menuOpciones();
		
	}//main
	
	File archivo = new File("./archivos/palabras.txt");
	Juego_2 juego2 = new Juego_2();
	
	public void menuOpciones() throws IOException{
		Scanner entrada = new Scanner(System.in);
		char op = 0;
		
		System.out.println("¡Bienvenido al Juego del Ahorcado!\n");
		
		do {
			
			System.out.println("1) Verificar archivo");
			System.out.println("2) Llenar archivo con palabras");
			System.out.println("3) Borrar archivo");
			System.out.println("4) Jugar");
			System.out.println("5) Salir");
			System.out.println("Elije una opción:");
			op = entrada.next().charAt(0);
			
			
			switch(op) {
			case '1' :
				verificarArchivo();
				break;
				
			case '2' :
				llenarArchivo();
				break;
				
			case '3' :
				borrarArchivo();
				break;
				
			case '4' :
				
				if(archivoVacio()) {
					llenarArchivo();
				}else {
					JuegoAhorcado juego1 = new JuegoAhorcado();
					
					juego1.inicioAhorcado(juego1.elegirPalabras(juego1.cargarPalabras()));
				}
				
				break;
				
			case '5' :
				System.out.println("Gracias por haber jugado al ahorcado!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Opcion Invalida!\n");
				
			}//switch
			
		}while (op != 5);
		
		
	}
	
	public void verificarArchivo() throws IOException {	
		String palabras[] = juego2.leerArchivo(archivo).split(",");
		System.out.println("El archivo contiene "+(palabras.length)+" palabras\n");
		
	}
	
	
	public void llenarArchivo() throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		String palabrasEspañol ="";
		String palabrasIngles ="";
		
		String palabras[] = juego2.leerArchivo(archivo).split("/");
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
		
		
	}// llenar archivo
	
	
	
	public void borrarArchivo() throws IOException {
		archivo.delete();
		archivo.createNewFile();
		
	}
	
	
	
	public boolean archivoVacio() {	
		if (archivo.exists() && archivo.length() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
