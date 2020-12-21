import java.io.*;
import java.util.Calendar;
import java.util.Random;
import java.text.SimpleDateFormat;

class TemperaturasYFechas {
	
	public String readFile(File file) throws IOException {
		FileReader fr = new FileReader(file); 
	    BufferedReader br = new BufferedReader(fr);
	      
	    String linea = null;
	    StringBuilder stringBuilder = new StringBuilder();
	      
	    try {
	    	while((linea = br.readLine()) != null) {
	              stringBuilder.append(linea);
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
	public String[][] Almacen(File temperaturas, File fechas, TemperaturasYFechas tf0) throws IOException {
		String[] strTemp = tf0.readFile(temperaturas).split(" ");
		String[] strFech = tf0.readFile(fechas).split(" ");
		
		int x = Math.max(strTemp.length, strFech.length);
		
		String[][] retorno= new String[2][x];
		for(int i=0;i<strTemp.length;i+=1) {
			retorno[0][i]=strTemp[i];
			retorno[1][i]=strFech[i];
		}
		
		return retorno;
	}
	
}


public class PruebaTemperaturasYFechas {

	public static void main(String[] args) throws IOException {
		
		
		File temperaturas = new File("Temperaturas.txt");
		
        if (!temperaturas.exists()) {
        	temperaturas.createNewFile();
            }

        FileWriter writer = new FileWriter(temperaturas); 
        Random rand = new Random();
        
        for(int i=0;i<100;i+=1) {
        	int n = rand.nextInt(50);
        	writer.write(n+" ");
		}
        writer.flush();
	    writer.close();	
	    
	    
	    File fechas = new File("Fechas.txt");
	    
	    if (!fechas.exists()) {
	    	fechas.createNewFile();
            }

        FileWriter writer1 = new FileWriter(fechas); 
        
        for(int i=0;i<100;i+=1) {
        	int n = rand.nextInt(50);
        	writer1.write((rand.nextInt(10)+2014)+"/"+(rand.nextInt(12)+1)+"/"+(rand.nextInt(30)+1)+" ");
		}
        writer1.flush();
	    writer1.close();	
	    
	    TemperaturasYFechas tf0 = new TemperaturasYFechas();
	    
	    String[][] arreglos = tf0.Almacen(temperaturas, fechas, tf0);
	    
	    int smt=0;
	    for(int i=0;i<arreglos[0].length;i+=1) {
	    	smt = smt+Integer.parseInt(arreglos[0][i]);
	    }
	    double promedio=smt/arreglos[0].length;
	    System.out.println("temperatura promedio: "+promedio);
	   
	    int h = 0;
	    for(int i=0;i<arreglos[0].length;i+=1) {
	    	if(Double.parseDouble(arreglos[0][i])>promedio) {
	    		System.out.print(arreglos[1][i]+"	");
	    		System.out.print("("+arreglos[0][i]+")	");
		    	for(int j=0;j<(int)Double.parseDouble(arreglos[0][i]);j+=1) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    	h+=1;
	    	}
	   }
	   System.out.print("Cantidad de temperaturas por encima del promedio:");
	   for(int i = 0;i<h;i+=1) {
		   System.out.print("*");
	   }
	   System.out.println("("+h+")");
	    
	   int c = 0;
	   for(int i=0;i<arreglos[0].length;i+=1) {
		    if(Double.parseDouble(arreglos[0][i])<promedio) {
		    	System.out.print(arreglos[1][i]+"	");
		    	System.out.print("("+arreglos[0][i]+")	");
		    	for(int j=0;j<(int)Double.parseDouble(arreglos[0][i]);j+=1) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    	c+=1;
	    	}
	   }
	   System.out.print("Cantidad de temperaturas por debajo del promedio: ");
	   for(int i = 0;i<c;i+=1) {
		   System.out.print("*");
	   }
	   System.out.println("("+c+")");
	   System.out.print("temperaturas identicas al promedio: ");
	   for(int i = 0;i<(100-c-h);i+=1) {
		   System.out.print("*");
	   }
	   System.out.println("("+(100-c-h)+")");
	   
	    
	  

	}

}
