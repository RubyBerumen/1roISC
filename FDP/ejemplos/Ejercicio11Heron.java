import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Ejercicio11Heron {
	public static void main(String[] args) throws IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ejercicio 11: area de un triángulo a traves de la formula de Herón");
		
		double la = 0.0, lb = 0.0, lc = 0.0, p = 0.0, area = 0.0;
		
		System.out.println("Ingrese lado a: ");
		la = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese lado b: ");
		lb = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese lado c: ");
		lc = Double.parseDouble(entrada.readLine());
		
		p = (la + lb + lc) / 2;
		area = (Math.sqrt(p * (p-la) * (p-lb) * (p-lc)));
		
		System.out.println("El area por metodo de la formula de heron es: " + area);
		
	}

}
