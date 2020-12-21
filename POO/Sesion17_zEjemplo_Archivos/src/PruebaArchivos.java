import java.io.File;
import java.io.IOException;

/*ruta/path
 * 
 * Absolutas-Son aquellas que indican la ruta completa del recurso a utilizar
 * 
 * 		windows = "C:/programs/Eclipse/Proyectos"
 * 		Unix = "/User/Luke/programas/codigo.java"
 * 
 * 		web = http://www.tecjerez.edu.mx/archivos/becas/formato.pdf"
 * 
 * 
 * Relativas-Una parte de la ruta relacionada al codigo que la esta utilizando
 * 
 * 		Ejemplo = 
 * 		"nombres.txt"	el codigo buscara el archivo nombres.txt en el mismo lugar donde se encuentre dicho codigo
 * 		"../recursos/archivos/nombres.txt"	regresa una carpeta atras y luego entra al directorio
 * 		"./nombres.txt"
 * 
 */


public class PruebaArchivos {

	public static void main(String[] args) {
		
		String ruta = "./archivos/nombres4.txt";
		
		File archivo = new File(ruta);
		
		if(archivo.exists()) {
			System.out.println("puedes usar el archivo");
		}else {
			System.out.println("no se encontro el archivo\n");
			
			try {
				archivo.createNewFile();
				System.out.println("archivo creado correctamente");
			} catch (IOException e) {
				System.out.println("No se puede crear el archivo");
				e.printStackTrace();
			}
		}
		

	}

}
