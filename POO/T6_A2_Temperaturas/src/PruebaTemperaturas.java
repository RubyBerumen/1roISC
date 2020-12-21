import java.io.*;

class Temperaturas{
	
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
	
	public String[] splitter(String temperaturas) {
		String[] retorno=temperaturas.split("\n");
		return retorno;
	}
	public double promedio(String lineas) {
		String[] temps=lineas.split(",");
		double[] tempsc= new double[temps.length];
		
		for(int i = 0;i<temps.length;i+=1) {
			tempsc[i] = Double.parseDouble(temps[i]);
		}
		double smt = 0;
		for(int i = 0;i<temps.length;i+=1) {
			smt = smt+tempsc[i];
		}
		
		return smt/tempsc.length;
	}
	
}

public class PruebaTemperaturas {

	public static void main(String[] args) throws Exception {
		
		File file = new File("temperaturas.txt");
		
		Temperaturas t0 = new Temperaturas();
		
		String temperaturas = t0.readFile(file);
		
		String[] lineas = t0.splitter(temperaturas);
		
		double[] promedios = new double[lineas.length];
		
		double smt =0;
		double promedio=0;
		for(int i = 0; i<lineas.length;i+=1) {
			promedio = t0.promedio(lineas[i]);
			promedios[i]=promedio;
			System.out.print(lineas[i]+"promedio: "+promedio+"\n");
			smt = smt+promedio;
		}
		System.out.println("promedio general: "+smt/lineas.length);
		for (int i=0;i<promedios.length;i+=1) {
			System.out.println(promedios[i]);
		}
		
		File salida = new File("salida.txt");
	    salida.createNewFile();
	    
	    FileWriter writer = new FileWriter(salida); 
	    for(int i=0;i<lineas.length;i+=1){
	    	writer.write("Promedio semana "+(i+1)+": "+Math.round(promedios[i])+"° ");
	    	for(int j=0;j<promedios[i];j+=1) {
	    		writer.write("*");
	    	}
	    	writer.write("\n");
	    }
	    
	    writer.flush();
	    writer.close();
	    
	}

}
