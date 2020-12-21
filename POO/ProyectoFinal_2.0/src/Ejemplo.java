import java.io.*;
import java.util.Arrays;
import java.util.Random;

class Clase1 {
	
	public void verificarArchivo() throws IOException {	
		Juego_2 juego2 = new Juego_2();
		File archivo = new File("./archivos/palabras.txt");
		
		System.out.println(juego2.leerArchivo(archivo));
		
		
		
		String palabras[] = juego2.leerArchivo(archivo).split(",");
		System.out.println(Arrays.toString(palabras));
		
		System.out.println("El archivo contiene "+(palabras.length)+" palabras");
	}
	
	
	public void leerArchivo () {
		 File archivo = new File("./archivos/palabras.txt");
	        FileReader fr = null;
	        BufferedReader br = null;
	        
	        String [] español = {};
			String [] ingles = {};
			
			String [] español1 = {};
			String [] ingles1 = {};
	        
			int numPalEsp = 0;
	        
	        
	        try {
	            fr = new FileReader(archivo);
	            br = new BufferedReader(fr);

	            String fila;
	            
	            while ((fila=br.readLine()) != null){
	                String partes[] = fila.split("/");
	        		español = partes[0].split(",");
	        		ingles = partes[1].split(",");
	        		
	        		System.out.println("esp"+Arrays.toString(español));
	        		System.out.println("ing"+Arrays.toString(ingles));
	                
	        		/*
	        		for (int i=0; i<español.length; i++) {
	    				español1 [numPalEsp] = español [i];
	    				numPalEsp++;
	    				
	    			}*/
	        		
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("NO se encontro el archivo");
	            e.printStackTrace();
	        } catch (IOException e) {
	            System.out.println("Error en la lectura");
	            e.printStackTrace();
	        }finally {
	            try {
	                br.close();
	                fr.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        
	       
	        
	        
	        
	        
	        
	        /*int numA = (int)(Math.random()*((2-1)+1))+1;
			if (numA == 1) {
				return español;
			}else if (numA==2) {
				return ingles;
			}else {
				return null;
			}*/
	        
	        
	       
		
	}//leerArchivo
	
//-----------------------------------------------------------------------------------------
	

	

//----------------------------------------------------------------------------------------
	
	public String leerArchivo (File archivo) throws IOException {
		FileReader fr = new FileReader(archivo); 
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
	
	}//leerArchivo
	
//------------------------------------------------------------------------------------------	
	
	
	
	
	
}//clase1


public class Ejemplo {

	public static void main(String[] args) throws IOException {
		
		Clase1 c = new Clase1();
		
		
		c.verificarArchivo();
		System.out.println("-----------------------------------");
		
		c.leerArchivo(); 
		
		
	   //System.out.println(Arrays.toString(c.leerArchivo()));
	    
		
		
		
		/*
        FileReader fr = null;
        BufferedReader br = null;
        
        String [] español = {};
		String [] ingles = {};  
        
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String fila;
            
            while ((fila=br.readLine()) != null){
                String partes[] = fila.split("/");
        		español = partes[0].split(",");
        		ingles = partes[1].split(",");
        		
            }
        } catch (FileNotFoundException e) {
            System.out.println("NO se encontro el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error en la lectura");
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        

        int numA = (int)(Math.random()*((2-1)+1))+1;
		if (numA == 1) {
			return español;
		}else if (numA==2) {
			return ingles;
		}else {
			return null;
		}*/
	    
		
		
	}

}
