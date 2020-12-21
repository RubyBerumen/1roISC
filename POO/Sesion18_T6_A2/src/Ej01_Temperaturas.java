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
		double sumaTemps = 0;
		for(int i = 0;i<temps.length;i+=1) {
			sumaTemps = sumaTemps+tempsc[i];
		}
		
		return sumaTemps/tempsc.length;
	}
	
}

public class Ej01_Temperaturas {

	public static void main(String[] args) throws Exception{
		
		File file = new File("archivos/temperaturas.txt");
		
		Temperaturas tem1 = new Temperaturas();
		
		String temperaturas = tem1.readFile(file);
		
		String[] lineas = tem1.splitter(temperaturas);
		
		double[] promedios = new double[lineas.length];
		
		double sumaTemps =0;
		double promedio=0;
		for(int i = 0; i<lineas.length;i+=1) {
			promedio = tem1.promedio(lineas[i]);
			promedios[i]=promedio;
			System.out.print(lineas[i]+"Promedio: "+promedio+"\n");
			sumaTemps = sumaTemps+promedio;
		}
		System.out.println("Promedio general: "+sumaTemps/lineas.length);
		
		File prom1 = new File("archivos/promedios_histograma.txt");
	    prom1.createNewFile();
	    
	    FileWriter writer = new FileWriter(prom1); 
	    for(int i=0;i<lineas.length;i+=1){
	    	writer.write("Promedio de la semana "+(i+1)+": "+Math.round(promedios[i])+"° ");
	    	for(int j=0;j<promedios[i];j+=1) {
	    		writer.write("*");
	    	}
	    	writer.write("\n");
	    }
	    writer.flush();
	    writer.close();
		
	
	
		
		

	}

}
