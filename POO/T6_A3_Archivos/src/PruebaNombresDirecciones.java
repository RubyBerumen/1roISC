import java.io.*;

class NombresDirecciones{
	
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
	public String[] splitter(String lista) {
		String[] retorno=lista.split("\n");
		return retorno;
	}
	
	public String escritura(String[] listNombres, String[] listDirecciones) {
		String ret="";
		int x = Math.max(listNombres.length, listDirecciones.length);
		
		for(int i=0;i<x;i+=1) {
			ret = ret+listNombres[i].substring(0,listNombres[i].length()-1)+"	"+listDirecciones[i]+"\n";
		}
		
		return ret;
	}
}

public class PruebaNombresDirecciones {

	public static void main(String[] args) throws IOException {
		
		NombresDirecciones nd0 = new NombresDirecciones();
		
		File nombres = new File("NombresApellidos.txt");
		String txtNombres = nd0.readFile(nombres);
		String[] listNombres = nd0.splitter(txtNombres);
		
		
		File direcciones = new File("Direcciones.txt");
		String txtDirecciones = nd0.readFile(direcciones);
		String[] listDirecciones = nd0.splitter(txtDirecciones);
		
		File file = new File("NombresDirecciones.txt");
		
        if (!file.exists()) {
            file.createNewFile();
            }

        FileWriter writer = new FileWriter(file); 
        writer.write(nd0.escritura(listNombres, listDirecciones));
        writer.flush();
	    writer.close();
        

	}

}
