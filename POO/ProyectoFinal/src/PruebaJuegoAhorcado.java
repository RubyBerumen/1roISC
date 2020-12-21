import java.awt.Menu;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Oportunidades{
	private byte intentos;
	
	public Oportunidades() {
	}
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
		this.intentos-=1;
	}

}

class JuegoAhorcado extends Oportunidades{
	private static int numIdioma;
	private static String idioma;
	
	public int getNumIdioma() {
		return numIdioma;
	}
	public void setNumIdioma(int numIdioma) {
		this.numIdioma = numIdioma;
	}
	public static String getIdioma() {
		return idioma;
	}
	public static void setIdioma(String idioma) {
		JuegoAhorcado.idioma = idioma;
	}
	
	public String[] cargarPalabras(File palabras)throws IOException {
		System.out.println("cargando lista de palabras desde el archivo...");
		FileReader fr = new FileReader(palabras); 
	    BufferedReader br = new BufferedReader(fr);
	      
	    String linea = null;
	    StringBuilder stringBuilder = new StringBuilder();
	    String ls = System.getProperty("line.separator");
	    String cad;
	    try {
	    	while((linea = br.readLine()) != null) {
	              stringBuilder.append(linea.toUpperCase());
	              stringBuilder.append(ls);
	          }
	    	cad = stringBuilder.toString();
	    } finally { 
	          br.close();
	          fr.close();
	    }
	    
	    String[] slash = cad.split(",");
	    for(int i=0;i<slash.length;i+=1) {
	    	if(slash[i].contains("/")) {
	    		this.setNumIdioma(i);
	    	}
	    }
	    
	    String[] retorno = cad.split("/|\\,");
	    if(palabras.length()!=0) {
	    	retorno[retorno.length-1]=retorno[retorno.length-1].substring(0,retorno[retorno.length-1].length()-2);
	    }
	    System.out.println(retorno.length+" palabras cargadas");
		return retorno;
		
	}
	public String elegirPalabra(String[] palabrasSeparadas) {
	Random rnd = new Random();
	int x =rnd.nextInt(palabrasSeparadas.length);
	if(x>this.getNumIdioma()) {
		this.setIdioma("INGLES");
	}else {
		this.setIdioma("ESPAÑOL");
	}
	return palabrasSeparadas[x];
	}
	public boolean seAdivinoLaPalabra(char[] letrasIngresadas, String palabraSecreta) {
	int ccgb=0;
	for(int i=0;i<palabraSecreta.length();i++) {
		int gb=1;
		for(int j=0;j<letrasIngresadas.length;j++) {
			if(letrasIngresadas[j]==palabraSecreta.charAt(i)) {//compara por fuerza bruta
				gb*=0;break;
			}else {gb*=1;}
		}
		if(gb==1) {ccgb+=1;}
	}
	if(ccgb==0){//cuenta guiones bajos y determina si ya se gano, hace que intentos sea 0 para que acabe la ejecución
		return true;
	}else {
		return false;
		}
	}
	public String obtenerPalabraAdivinada(String palabraSecreta, char[] letrasIngresadas) {
	String retorno ="";
	
	for(int i=0;i<palabraSecreta.length();i++) {
		int gb=1;
		for(int j=0;j<letrasIngresadas.length;j++) {
			if(letrasIngresadas[j]==palabraSecreta.charAt(i)) {//compara por fuerza bruta
				gb*=0;
				retorno+=" "+palabraSecreta.charAt(i);break;
			}else {gb*=1;}
		}
		if(gb==1) {retorno+=" _";}
	}
	return retorno;
}
	public String obtenerLetrasDisponibles(char[] letrasIngresadas){
	char letrasDisponibles[]= {	'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	//System.out.print("letras disponibles: ");
	String retorno = "";
	for(int i=0;i<letrasDisponibles.length;i++) {
		for(int j=0;j<letrasIngresadas.length;j++) {
			if(letrasIngresadas[j]==letrasDisponibles[i]) {
				letrasDisponibles[i]=00;
			}
		}
		if (letrasDisponibles[i]!=00) {
			retorno+=" "+letrasDisponibles[i];
		}else {retorno+=" _";}
	}
	return retorno;
	
}
	public boolean validarCaracter (char[] letrasIngresadas,char letra) {
		byte lT = (byte) letra;
		if(lT>64&&lT<91||lT==-47) {
			return true;
		}else{
			System.out.println("caracter no válido");
			return false;
		}
	}
	public boolean validarLetra(char[] letrasIngresadas, char letra) {
		int vLN = 1;
		for(int i=0;i<letrasIngresadas.length;i++) {
			if(letra!=letrasIngresadas[i]) {
				vLN = vLN*1;
			}else {vLN = vLN*0;}
		}
		if(vLN == 1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean verificarAcierto(char[] caracteresPalabraElegida, char letra) {
		int vLN =0;
		
		for(int i=0;i<caracteresPalabraElegida.length;i++) {
			if(letra==caracteresPalabraElegida[i]) {
				vLN=vLN+1;
			}
		}
		
		if(vLN>0) {
			return true;
		}else {
			return false;
		}
	}
	public char[] inicioAhorcado(String palabraElegida, JuegoAhorcado ja1) {
		
		System.out.println("Bienvenido al juego del ahorcado!");
		
		Scanner input = new Scanner(System.in);
		System.out.println("estoy pensando en una palabra en "+this.getIdioma()+" de "+palabraElegida.length()+" letras"+"\n"+"------------"+"\n");
		
		int intentosIniciales = 8;
		ja1.setIntentos((byte) intentosIniciales);
		int errores = 0;
		char letrasIngresadas[]=new char[palabraElegida.length()+ja1.getIntentos()];
		
		char[] caracteresPalabraElegida = new char[(palabraElegida.length())];
		for(int i=0;i<palabraElegida.length();i++) {
			caracteresPalabraElegida[i]=palabraElegida.charAt(i);
		}
		int ili = 0;//indice letra ingresada
		
		while(ja1.getIntentos()>0) {
			System.out.println("te quedan "+ja1.getIntentos()+" oportunidades para adivinar");
			
			System.out.print("letras disponibles: "+ja1.obtenerLetrasDisponibles(letrasIngresadas));
		
			System.out.println("\n ingresa una letra por favor: ");//comprueba que sea una letra
			char letra = input.next().toUpperCase().charAt(0);
			if(!ja1.validarCaracter(letrasIngresadas,letra)) {
				continue;
			}
			
			if (ja1.validarLetra(letrasIngresadas, letra)) {
				letrasIngresadas[ili]=letra;// asigna letra a indice de letra ingresada
				ili+=1;// aumenta indice de letra ingresada
				
				if(ja1.verificarAcierto(caracteresPalabraElegida, letra)) {//felicita al usuario si la letra esta entre los caracteres
					System.out.print("bien hecho: ");
				}else {//niega que este en la palabra y resta una vida
					System.out.print("oops, esa letra no esta en la palabra"+ "\n");
					ja1.descontarIntento();
					errores+=1;
				}
				
				System.out.println(ja1.obtenerPalabraAdivinada(palabraElegida, letrasIngresadas));
				
				if(ja1.seAdivinoLaPalabra(letrasIngresadas, palabraElegida)) {
					ja1.setIntentos((byte)0);
				}
				
			}else{System.out.println("esa letra ya la ingresaste");};
		}
		
		if(errores == intentosIniciales) {//FINAL del juego
			System.out.println("lo lamento, te quedaste sin oportunidades para adivinar,");
		}
		return letrasIngresadas;
		
	}
}

public class PruebaJuegoAhorcado extends JuegoAhorcado{
	
	Scanner input = new Scanner(System.in);
	
	public void menuOpciones(File file, PruebaJuegoAhorcado pja) throws IOException{
		int opc = 0;
		while(opc!=5){
		System.out.println("\n 1) Verificar archivo \n 2) Llenar archivo con palabras \n 3) Borrar archivo \n 4) Jugar \n 5) Salir");
		
		String entrada = input.nextLine();
		try {
			opc = Integer.parseInt(entrada);
		}catch (NumberFormatException e){
			System.out.println("entrada no válida, ingrese un número de los que se le dan a elegir");
		}
		
		if(opc<1&&opc>5) {
			System.out.println("opcion no válida");
		}else {
			switch(opc) {
			case 1:pja.verificarArchivo(pja);break;
			case 2:pja.llenarArchivo(file);break;
			case 3:pja.borrarArchivo(file);break;
			case 4:pja.inicioAhorcado(file, pja);break;
			}
		}
		
		};
		System.out.println("gracias por jugar n_n");
	
	}
	
	public void verificarArchivo(PruebaJuegoAhorcado pja) throws IOException {
		File palabras = new File("palabras.txt");
		pja.cargarPalabras(palabras);
	}
	public void llenarArchivo(File file) throws IOException {
		String entrada = "";
		while(entrada.length()==0) {
		System.out.println("palabras a agregar (,introducir,las,palabras,asi):");
		entrada = input.nextLine();
		
		FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(entrada);
        bw.close();
        
        if(file.length()==0) {
        	System.out.println("no agregaste nada");
        }else {System.out.println("Palabras agregadas correctamente");}
			}
	    }
	public void borrarArchivo (File file) throws IOException {
		file.delete();
		file = new File("palabras.txt");
		if (!file.exists()) {
            file.createNewFile();
        }
	}
	public void inicioAhorcado(File palabras, PruebaJuegoAhorcado pja) throws IOException {
		
		if(palabras.length() == 0) {
			System.out.println("el archivo esta vacío");
			pja.llenarArchivo(palabras);
		}
		String[] palabrasSeparadas = pja.cargarPalabras(palabras);
		String palabraElegida = pja.elegirPalabra(palabrasSeparadas);
		
		char[] letrasIngresadas = pja.inicioAhorcado(palabraElegida, pja);
		
		if(pja.seAdivinoLaPalabra(letrasIngresadas, palabraElegida)) {
			System.out.println("se adivino la palabra");
		}else {
			System.out.println("no se adivino la palabra");
		}
	}

	public static void main(String[] args) throws IOException {
		
		PruebaJuegoAhorcado pja0 = new PruebaJuegoAhorcado();
		
		File palabras = new File("palabras.txt");
		pja0.menuOpciones(palabras,pja0);
		
		
		
	}

}