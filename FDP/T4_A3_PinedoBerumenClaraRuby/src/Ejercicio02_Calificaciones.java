import java.lang.Math;

public class Ejercicio02_Calificaciones {

	public static void main(String[] args) {
		
		int calificaciones[][] = new int[5][5];
		
		for (int i=0; i<calificaciones.length; i++) {
			for (int j=0; j<calificaciones[i].length; j++) {
				calificaciones[i][j]  = (byte)(Math.random()*100);
				
				System.out.print(calificaciones[i][j] + "	");
			}//for 2
			
			System.out.println();
			
		}//for 1
		System.out.println("---------------------------------------");
		
		double sumAlumno = 0.0;
		double promedioAlumno = 0.0;
		double sumGrupo = 0.0;
		double promedioGrupo = 0.0;
		int cantAlumnos = 0;
		
		for (int j=0; j<calificaciones.length; j++) {
			for (int i=0; i<calificaciones[j].length; i++) {
				
				sumAlumno = sumAlumno + calificaciones[i][j];
				
				
			}//for 2
			
			promedioAlumno = sumAlumno/calificaciones[j].length;
			System.out.println("Promedio del alumno " + (j+1)+ ": " + promedioAlumno);
			
			
			sumGrupo = sumGrupo + promedioAlumno;
			
			cantAlumnos++;
			
			sumAlumno = 0.0;
		}//for 1
		
		promedioGrupo = sumGrupo/cantAlumnos;
		
		System.out.println();
		System.out.println("Promedio del grupo: " + Math.round(promedioGrupo));
		System.out.println();
		
		int acreditadas = 0;
		int noAcreditadas = 0;
		
		
		for (int j=0; j<calificaciones.length; j++) {
			
			System.out.println("Alumno " + (j+1));
			
			for (int i=0; i<calificaciones[j].length; i++) {
				
				System.out.print( "Calificaciòn " + (i+1) + ": " + calificaciones[i][j]);
				
				if(calificaciones[i][j]>=70) {
					System.out.println(" Aprobatoria");
					acreditadas++;
				}else {
					System.out.println(" No aprobatoria");
					noAcreditadas++;
				}
					
				
			}//for2
			
			System.out.println("Materias acreditadas: " + acreditadas);
			System.out.println("Materias no acreditadas: " + noAcreditadas);
			System.out.println();
			
			acreditadas = 0;
			noAcreditadas = 0;
			
		}//for1
		
		

	}

}
