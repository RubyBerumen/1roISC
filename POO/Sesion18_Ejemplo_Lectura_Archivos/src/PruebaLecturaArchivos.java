import java.io.*;

public class PruebaLecturaArchivos {
    public static void main(String[] args) {
        File archivo = new File("archivos/nombres.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String fila;
            while ((fila=br.readLine()) != null){
                System.out.println(fila);
            }
        } catch (FileNotFoundException e) {
            System.out.println("NO se encontro el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR en la lectura");
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
