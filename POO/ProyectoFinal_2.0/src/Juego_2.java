import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

interface Interfaz1 {
	public String[] cargarPalabras() throws IOException;
	public String elegirPalabras(String palabras[]);
}


class JuegoAhorcado implements Interfaz1{
	private int numA = 0;
	private String lenguaje = "";
	String letra;
	String  letrasIngresadas [] = new String[27] ;
	public String palabraSecreta;
	public String palabraAleatoria;
	byte letrasAdivinadas = 0;
	int contLetras = 0;
	
	Oportunidades op = new Oportunidades();
	PruebaJuegoAhorcado pja = new PruebaJuegoAhorcado();
	
	
	public JuegoAhorcado() {}
	public JuegoAhorcado(int numA, String lenguaje) {
		super();
		this.numA = numA;
		this.lenguaje = lenguaje;
	}

	public int getNumA() {
		return numA;
	}
	public void setNumA(int numA) {
		this.numA = numA;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

//---------------------------------------------------------------------------------------------
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
	public String[] cargarPalabras() throws IOException {
		
		JuegoAhorcado obj1 = new JuegoAhorcado();
		File archivo = new File("./archivos/palabras.txt");
		
		String [] español = {};
		String [] ingles = {};
		
		String partes[] = obj1.leerArchivo(archivo).split("/");
		español = partes[0].split(",");
		ingles = partes[1].split(",");
		
		numA = (int)(Math.random()*((2-1)+1))+1;
		if (numA == 1) {
			return español;
		}else if (numA==2) {
			return ingles;
		}else {
			return null;
		}
			
	}//cargarPalabras
//--------------------------------------------------------------------------------------------------
	
	public String elegirPalabras(String[] palabras) {
		Random rnd = new Random();
		
		palabraAleatoria = palabras[rnd.nextInt(palabras.length)];
		
		if (numA == 1) {
			lenguaje = "español";
		}else if (numA == 2) {
			lenguaje = "inglés";
		}
		
		
		return palabraAleatoria;
	}//elegirPalabras
	
//-------------------------------------------------------------------------------------------------
	
	public void inicioAhorcado(String palabraAleatoria ) throws IOException{
		
		Scanner ent = new Scanner(System.in);
		JuegoAhorcado ja = new JuegoAhorcado();
		
		ja.palabraAleatoria = palabraAleatoria;
		
		//System.out.println(ja.palabraAleatoria);
		
		System.out.println("¡Bienvenido al juego del Ahorcado!\r\n" + 
				"Estoy pensando en una palabra en "+lenguaje+" de " + palabraAleatoria.length() + " letras.");
	
		System.out.println("-----------------------------------------\n");
		
		ja.ingresarLetra();
		
		
	}//inicioAhorcado
	
//------------------------------------------------------------------------------------------------
	
	public void ingresarLetra() throws IOException{
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Tienes "+op.getIntentos()+" oportunidades");
		
		System.out.println("letras disponibles: "+obtenerLetrasDisponibles(letrasIngresadas));
		
		
		System.out.println("\nPor favor ingresa una letra: ");
		letra = ent.next().toLowerCase().substring(0,1);
		
		char caracter = letra.charAt(0);
		byte caracteres = (byte)caracter;
		
		if(caracteres == -15 || (caracteres > 96 && caracteres<123)) {
			
			letrasIngresadas[contLetras] = letra;
			
			for (int i=0; i<contLetras; i++) {
				
				if(letrasIngresadas[i].equals(letra)) {
					System.out.println("Oops! Ya habìas ingresado esa letra");
					ingresarLetra();
				}
				
			}//for
			
			System.out.println(obtenerPalabraAdivinada(this.palabraAleatoria, letrasIngresadas));
			
			contLetras++;
			
		}else {
			System.out.println("Caracter invalido!\n" );
			ingresarLetra();
		}
		
		
		
		if(seAdivinoPalabra(this.palabraAleatoria, letrasIngresadas)) {
			
			System.out.println("--------------------------------");
			System.out.println("Felicidades, has Ganado!");
			pja.menuOpciones();
		}else {
			if (op.getIntentos()>0) {
				ingresarLetra();
			} else {
				System.out.println("Lo siento, te has quedado sin oportunidades para adivinar.");
				System.out.println("NO HAS ADIVINADO LA PALABRA.");
				System.out.println("La palabra secreta era: "+ this.palabraAleatoria.toUpperCase());
				pja.menuOpciones();
			}
			
		}
		
		
		
	}// ingresarLetra
	
//-------------------------------------------------------------------------------------------------	
	
	public boolean seAdivinoPalabra (String palabraAleatoria, String letrasIngresadas[]) {
		
		letrasAdivinadas = 0;
		
		for (int i=0; i<palabraAleatoria.length(); i++ ) {
			String letra = palabraAleatoria.substring(i,i+1);
	
			for (int j=0; j<contLetras; j++) {
				if(letrasIngresadas[j].equals(letra)) {
					letrasAdivinadas++;
				}//if
				
			}//for2
			
		}//for1
		
		if (letrasAdivinadas==palabraAleatoria.length()) {
			return true;
		} else {
			return false;
		}
		
		
	}//seAdivinoLaPalabra
	
//-----------------------------------------------------------------------------------------------------
	
	public String obtenerPalabraAdivinada (String palabraAleatoria, String letrasIngresadas[]) {
		
		String palabraSecreta [] = new String [palabraAleatoria.length()];
		
		//System.out.println(palabraAleatoria);
		
		for (int i=0; i<palabraSecreta.length; i++) {
			palabraSecreta[i]= "_";
		}//for
		
		for (int i=0; i<palabraAleatoria.length(); i++ ) {
			String letra = palabraAleatoria.substring(i,i+1);
	
			
			for (int j=0; j<=contLetras; j++) {
				if(letrasIngresadas[j].equals(letra)) {
					palabraSecreta[i]=letra;
		
				}//if
				
			}//for2
			
		}//for1
		
		
		String palabraNueva = "";
		for (int i=0; i<palabraSecreta.length; i++) {
			palabraNueva = palabraNueva + palabraSecreta[i]+" ";
		}

		
		if (palabraAleatoria.contains(letrasIngresadas[contLetras])) {	
			System.out.print("Bien hecho: ");
			
		} else {
			System.out.println("Oops! Esa letra no está en la palabra secreta: ");
			op.descontarIntento();
		
		}
		
		return palabraNueva.toUpperCase();
		
		
	 }//obtenerPalabraAdivinada
//-----------------------------------------------------------------------------------------------------
	
	
	public String obtenerLetrasDisponibles(String letrasIngresadas[]) {
		String letrasDisponibles = "abcdefghijklmnñopqrstuvwxyz";
		
        for(int i=0; i<letrasDisponibles.length(); i++) {
            
            for(int j=0; j<letrasIngresadas.length; j++) {
                if(letrasDisponibles.substring(i, i+1).equals(letrasIngresadas[j])){
                    letrasDisponibles = letrasDisponibles.replace(letrasIngresadas[j], "-");
                }
            }   
        }


	return letrasDisponibles;}//obtenerLetrasDisponobles
//--------------------------------------------------------------------------------------------------------
		
}//class JuegoAhorcado


class Oportunidades {
	private byte intentos=8;

	public byte getIntentos() {
		return intentos;
	}

	public void setIntentos(byte intentos) {
		this.intentos = intentos;
	}
	
	
	public void descontarIntento() {
		intentos--;
	}
	
	
}// class Oportunidades



public class Juego_2 extends JuegoAhorcado{
	
	public static void main(String[] args) throws IOException {
		
		Juego_2 juego = new Juego_2();
		
		juego.inicioAhorcado(juego.elegirPalabras(juego.cargarPalabras()));
		
		
		
		
		 
	

	}//public class

}//main
