import java.io.File;
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
		

	}
	
	
	public void menuOpciones() throws IOException{
		Scanner entrada = new Scanner(System.in);
		char op = '0';
		
		System.out.println("¡Bienvenido al Juego del Ahorcado!\n");
		
		do {
			
			System.out.println("1) Verificar archivo");
			System.out.println("2) Llenar archivo con palabras");
			System.out.println("3) Borrar archivo");
			System.out.println("4) Jugar");
			System.out.println("5) Salir");
			System.out.println("Elige una opción:");
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
					System.out.println("El archivo se encuentra vacio!\n"
							+ "Por favor ingresa palabras...\n");
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
			
		}while (op != '5');
		
		
	}
	
//---------------------------------------------------------------------------------------
	
	public void verificarArchivo() throws IOException {
		File archivo = new File("./archivos/palabras.txt");
		Juego_2 juego2 = new Juego_2();
		
		String palabrasEspañol ="";
		String palabrasIngles ="";
		
		String palabras[] = juego2.leerArchivo(archivo).split("/");
		palabrasEspañol = palabras[0];
		palabrasIngles = palabras[1];
		
		palabrasEspañol = palabrasEspañol.trim();
		palabrasIngles = palabrasIngles.trim();
		
		int numPalabras = 0;
		
		if(palabrasEspañol.length()>0) {
			
			numPalabras = numPalabras + palabrasEspañol.length()-palabrasEspañol.replace(",","").length()+1;
		}
		
		
		if(palabrasIngles.length()>0) {
			
			numPalabras = numPalabras + palabrasIngles.length()-palabrasIngles.replace(",","").length()+1;
		}
		
		
		System.out.println("El archivo contiene " + numPalabras + " palabra(s)\n");	
		
	
	}
	
//----------------------------------------------------------------------------------------
	
	public void llenarArchivo() throws IOException {
		Scanner entrada = new Scanner(System.in);
		Juego_2 juego2 = new Juego_2();
		File archivo = new File("./archivos/palabras.txt");
		
		String palabrasEspañol ="";
		String palabrasIngles ="";
		
		String palabras[] = juego2.leerArchivo(archivo).split("/");
		palabrasEspañol = palabras[0];
		palabrasIngles = palabras[1];
		
		palabrasEspañol = palabrasEspañol.trim();
		palabrasIngles = palabrasIngles.trim();
		
		
		char op = '0';
		
		do {
		
			System.out.println("1) Ingresar palabra en español");
			System.out.println("2) Ingresar palabra en ingles");
			System.out.println("3) Regresar");
			System.out.println("Elige una opcion:");
			op = entrada.next().charAt(0);
			entrada.reset();
		
			switch(op) {
				case '1' :
									
					System.out.println("Palabra en español: ");
					String palabra = entrada.next().toLowerCase();
					
					if(palabrasEspañol.length()>0)
						palabrasEspañol = palabrasEspañol + "," + palabra;
					else
						palabrasEspañol = palabra;
					
					break;
				
				
				case '2' :
					
					System.out.println("Palabra en ingles: ");
					String palabraEng = entrada.next().toLowerCase();
					
					if(palabrasIngles.length()>0)
						palabrasIngles = palabrasIngles + "," + palabraEng;
					else
						palabrasIngles = palabraEng;
					
					break;
				
				
				case '3' :
					break;
				
				default:
					System.out.println("Opcion Invalida!\n");
		
		
			}//switch
		
		} while(op!='3');
		
		
		String cadenaNueva = palabrasEspañol+"/"+palabrasIngles;
		archivo.delete();
		archivo.createNewFile();
		
		FileWriter fw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);

            pw.print(cadenaNueva);
           
            System.out.println("La(s) palabra(s) ha(n) sido cargada(s)\n");
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
	
//-----------------------------------------------------------------------------------------
	
	public void borrarArchivo() throws IOException {
		File archivo = new File("./archivos/palabras.txt");
		
		archivo.delete();
		
		System.out.println("El archivo ha sido borrado!\n");
		
		archivo.createNewFile();
		
		FileWriter fw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);

            pw.print("/");
           
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

//-------------------------------------------------------------------------------------------
	
	public boolean archivoVacio() throws IOException {
		Juego_2 juego2 = new Juego_2();
		File archivo = new File("./archivos/palabras.txt");
		
		String palabrasEspañol = "";
		String palabrasIngles = "";
		
		String palabras[] = juego2.leerArchivo(archivo).split("/");
		palabrasEspañol = palabras[0];
		palabrasIngles = palabras[1];
		
		palabrasEspañol = palabrasEspañol.trim();
		palabrasIngles = palabrasIngles.trim();		
		
		String cadenaNueva = palabrasEspañol+palabrasIngles;
		
		if (archivo.exists() && cadenaNueva.length() == 0) {
			return true;
		}else {
			return false;
		}
	

	}
	
	
	
	

}//class

