import java.io.*;

class NombresApellidosDirecciones{
	
	public String readFile(File archivo) throws IOException {
		FileReader fr = new FileReader(archivo); 
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
	public String[] splitter(String lista) {
		String[] res=lista.split("\n");
		return res;
	}
	
	public String escritura(String[] listaNombres, String[] listaDirecciones) {
		String res="";
		int x = Math.max(listaNombres.length, listaDirecciones.length);
		
		for(int i=0;i<x;i+=1) {
			res = res+listaNombres[i].substring(0,listaNombres[i].length()-1)+"	"+listaDirecciones[i]+"\n";
		}
		
		return res;
	}
}
public class Ej03_NombresApellidosDirecciones {

	public static void main(String[] args) throws IOException{
		
		NombresApellidosDirecciones obj1 = new NombresApellidosDirecciones();
		File nombres = new File("archivos/nombres_ej03.txt");
		String txtNombres = obj1.readFile(nombres);
		String[] listaNombres = obj1.splitter(txtNombres);
		
		File direcciones1 = new File("archivos/direcciones.txt");
		String direcciones = obj1.readFile(direcciones1);
		String[] listaDirecciones = obj1.splitter(direcciones);
		
		File archivo = new File("archivos/nombresConDirecciones.txt");
		
        if (!archivo.exists()) {
            archivo.createNewFile();
            }

        FileWriter writer = new FileWriter(archivo); 
        writer.write(obj1.escritura(listaNombres, listaDirecciones));
        writer.flush();
	    writer.close();
		
		

	}

}
