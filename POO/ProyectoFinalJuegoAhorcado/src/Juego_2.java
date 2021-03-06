import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

interface Juego {
	public String leerArchivo (File archivo) throws IOException;
	public String[] cargarPalabras() throws IOException;
	public String elegirPalabras(String palabras[]);
}


class JuegoAhorcado implements Juego{
	private int numA = 0;
	private String lenguaje = "";
	private String letra;
	private String letrasIngresadas [] = new String[27] ;
	private String palabraSecreta;
	private String palabraAleatoria;
	private byte letrasAdivinadas = 0;
	private int contLetras = 0;
	
	Oportunidades op = new Oportunidades();
	PruebaJuegoAhorcado pja = new PruebaJuegoAhorcado();
	
	
	public JuegoAhorcado() {}
	
	public JuegoAhorcado(int numA, String lenguaje, String letra, String[] letrasIngresadas, String palabraSecreta,
			String palabraAleatoria, byte letrasAdivinadas, int contLetras) {
		super();
		this.numA = numA;
		this.lenguaje = lenguaje;
		this.letra = letra;
		this.letrasIngresadas = letrasIngresadas;
		this.palabraSecreta = palabraSecreta;
		this.palabraAleatoria = palabraAleatoria;
		this.letrasAdivinadas = letrasAdivinadas;
		this.contLetras = contLetras;
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
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public String[] getLetrasIngresadas() {
		return letrasIngresadas;
	}
	public void setLetrasIngresadas(String[] letrasIngresadas) {
		this.letrasIngresadas = letrasIngresadas;
	}
	public String getPalabraSecreta() {
		return palabraSecreta;
	}
	public void setPalabraSecreta(String palabraSecreta) {
		this.palabraSecreta = palabraSecreta;
	}
	public String getPalabraAleatoria() {
		return palabraAleatoria;
	}
	public void setPalabraAleatoria(String palabraAleatoria) {
		this.palabraAleatoria = palabraAleatoria;
	}
	public byte getLetrasAdivinadas() {
		return letrasAdivinadas;
	}
	public void setLetrasAdivinadas(byte letrasAdivinadas) {
		this.letrasAdivinadas = letrasAdivinadas;
	}
	public int getContLetras() {
		return contLetras;
	}
	public void setContLetras(int contLetras) {
		this.contLetras = contLetras;
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
		
		String [] espa�ol = {};
		String [] ingles = {};
		
		String partes[] = obj1.leerArchivo(archivo).split("/");
		espa�ol = partes[0].split(",");
		ingles = partes[1].split(",");
		
		numA = (int)(Math.random()*((2-1)+1))+1;
		
		System.out.println("Cargando lista de palabras desde archivo...");
		
		int numPalabras = 0;
		
		numPalabras = espa�ol.length+ingles.length;
		
		if(espa�ol[0].trim().length()==0) {
			numPalabras--;
			numA = 2;
		}
		
		if(ingles[0].trim().length()==0) {
			numPalabras--;
			numA = 1;
		}
		
		System.out.println(numPalabras + " palabra(s) cargada(s)...");
		
		if (numA == 1) {
			return espa�ol;
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
			lenguaje = "espa�ol";
		}else if (numA == 2) {
			lenguaje = "ingl�s";
		}
		
		palabraAleatoria = palabraAleatoria.trim();
		
		return palabraAleatoria;
	}//elegirPalabras
	
//-------------------------------------------------------------------------------------------------
	
	public void inicioAhorcado(String palabraAleatoria ) throws IOException{
		
		Scanner ent = new Scanner(System.in);
		JuegoAhorcado ja = new JuegoAhorcado();
		
		ja.palabraAleatoria = palabraAleatoria;
		
		//System.out.println(ja.palabraAleatoria);
		
		System.out.println("�Bienvenido al juego del Ahorcado!\r\n" + 
				"Estoy pensando en una palabra en "+lenguaje+" de " + palabraAleatoria.length() + " letras.");
	
		System.out.println("-----------------------------------------\n");
		
		ja.ingresarLetra();
		
		
	}//inicioAhorcado
	
//------------------------------------------------------------------------------------------------
	
	public void ingresarLetra() throws IOException{
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Tienes "+op.getIntentos()+" oportunidades");
		
		System.out.println("letras disponibles: "+obtenerLetrasDisponibles(letrasIngresadas));
		
		
		System.out.println("Por favor ingresa una letra: ");
		letra = ent.next().toLowerCase().substring(0,1);
		
		char caracter = letra.charAt(0);
		byte caracteres = (byte)caracter;
		
		if(caracteres == -15 || (caracteres > 96 && caracteres<123)) {
			
			letrasIngresadas[contLetras] = letra;
			
			for (int i=0; i<contLetras; i++) {
				
				if(letrasIngresadas[i].equals(letra)) {
					System.out.println("Oops! Ya habias ingresado esa letra");
					System.out.println("--------------------------------");
					ingresarLetra();
				}
				
			}//for
			
			System.out.println(obtenerPalabraAdivinada(this.palabraAleatoria, letrasIngresadas));
			
			System.out.println("--------------------------------");
			
			contLetras++;
			
		}else {
			System.out.println("Caracter invalido!\n" );
			System.out.println("--------------------------------");
			ingresarLetra();
		}
		
		
		
		if(seAdivinoPalabra(this.palabraAleatoria, letrasIngresadas)) {
			
			System.out.println("Felicidades, has Ganado!\n");
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
			System.out.println("Bien hecho: ");
			
		} else {
			System.out.println("Oops! Esa letra no est� en la palabra secreta: ");
			op.descontarIntento();
		
		}
		
		return palabraNueva.toUpperCase();
		
		
	 }//obtenerPalabraAdivinada
//-----------------------------------------------------------------------------------------------------
	
	
	public String obtenerLetrasDisponibles(String letrasIngresadas[]) {
		String letrasDisponibles = "abcdefghijklmn�opqrstuvwxyz";
		
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

	public Oportunidades() {}
	public Oportunidades(byte intentos) {
		this.intentos = intentos;
	}

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

