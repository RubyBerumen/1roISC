import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

class Alumno{
	private String numControl;
	private String nombre;
	private String primerAp;
	private String segundoAp;
	private byte edad;
	private byte semestre;
	private String carrera;
	
	
	public Alumno(String numControl, String nombre, String primerAp, String segundoAp, byte edad, byte semestre,
			String carrera) {
		this.numControl = numControl;
		this.nombre = nombre;
		this.primerAp = primerAp;
		this.segundoAp = segundoAp;
		this.edad = edad;
		this.semestre = semestre;
		this.carrera = carrera;
	}


	
	public String getNumControl() {
		return numControl;}


	public void setNumControl(String numControl) {
		this.numControl = numControl;}


	public String getNombre() {
		return nombre;}


	public void setNombre(String nombre) {
		this.nombre = nombre;}


	public String getPrimerAp() {
		return primerAp;}


	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;}


	public String getSegundoAp() {
		return segundoAp;}


	public void setSegundoAp(String segundoAp) {
		this.segundoAp = segundoAp;
	}


	public byte getEdad() {
		return edad;
	}


	public void setEdad(byte edad) {
		this.edad = edad;
	}


	public byte getSemestre() {
		return semestre;
	}


	public void setSemestre(byte semestre) {
		this.semestre = semestre;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [numControl=" + numControl + ", nombre=" + nombre + ", primerAp=" + primerAp + ", segundoAp="
				+ segundoAp + ", edad=" + edad + ", semestre=" + semestre + ", carrera=" + carrera + "]";
	}
	
	
}//class Alimno

public class PruebaArchivosObjetos {

	public static void main(String[] args) {
		
		//Prueba objetos archivos
		
		Alumno a1 = new Alumno("1","1","1","1",(byte)1,(byte)1,"1");
		Alumno a2 = new Alumno("2","2","2","2",(byte)2,(byte)1,"2");
		Alumno a3 = new Alumno("1","1","1","1",(byte)1,(byte)1,"1");
		Alumno a4 = new Alumno("1","1","1","1",(byte)1,(byte)1,"1");
		Alumno a5 = new Alumno("1","1","1","1",(byte)1,(byte)1,"1");
		
		
		
		FileWriter archivo = null;
		PrintWriter pr = null;
		
		try {
			archivo = new FileWriter("./datos/alumnos.txt",true);
			pr = new PrintWriter(archivo);
			
			pr.println(1);
			pr.println(1.5);
			pr.println(true);
			pr.println('&');
			pr.println("Magia magia");
			
			pr.println(a1);
			
			pr.println(a1.getNumControl()+"-"+a1.getNombre());
			
			System.out.println("Datos registrados correctamente");
			
			/*
			 * Puede surgir la necesidad de almacenar los objetos como objetos y no como cadenas
			 *  
			 * Para esto, en Java se utiliza la SERIALIZACION de objetos
			 * 
			 */
			
	
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			pr.close();
			try {
				archivo.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
		//------------------PRURBA OBJETOS-ARCHIVOS BINARIOS--------------------------
		

	}//main

}//classPrueba


//--------------------------------SERIALIZACION-----------------------------------

class RegistroAlumnos{
	private String ruta = "./datos/alumnos.bin";
	
	public boolean escribir(Alumno a) {
		
		ObjectOutputStream oos = null;
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(ruta));
			
			oos.writeObject(a);
			return true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				oos.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
		return false;
		
	}//metodo escribir
	
	
	
	public void leer(){
		
	}
	
	
	
	
}//class RegistroAlumno



class Alumno2 implements Serializable{
	private String numControl;
	private String nombre;
	private String primerAp;
	private String segundoAp;
	private byte edad;
	private byte semestre;
	private String carrera;
	
	
	public Alumno2(String numControl, String nombre, String primerAp, String segundoAp, byte edad, byte semestre,
			String carrera) {
		this.numControl = numControl;
		this.nombre = nombre;
		this.primerAp = primerAp;
		this.segundoAp = segundoAp;
		this.edad = edad;
		this.semestre = semestre;
		this.carrera = carrera;
	}

	
	public String getNumControl() {
		return numControl;}
	public void setNumControl(String numControl) {
		this.numControl = numControl;}
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}
	public String getPrimerAp() {
		return primerAp;}
	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;}
	public String getSegundoAp() {
		return segundoAp;}
	public void setSegundoAp(String segundoAp) {
		this.segundoAp = segundoAp;}
	public byte getEdad() {
		return edad;}
	public void setEdad(byte edad) {
		this.edad = edad;}
	public byte getSemestre() {
		return semestre;}
	public void setSemestre(byte semestre) {
		this.semestre = semestre;}
	public String getCarrera() {
		return carrera;}
	public void setCarrera(String carrera) {
		this.carrera = carrera;}

	@Override
	public String toString() {
		return "Alumno [numControl=" + numControl + ", nombre=" + nombre + ", primerAp=" + primerAp + ", segundoAp="
				+ segundoAp + ", edad=" + edad + ", semestre=" + semestre + ", carrera=" + carrera + "]";
	}
	
	
}//class Alumno2





