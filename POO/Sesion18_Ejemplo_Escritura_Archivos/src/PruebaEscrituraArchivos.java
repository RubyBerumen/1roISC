import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PruebaEscrituraArchivos {
    public static void main(String[] args) {

        FileWriter fw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter("archivos/nombes.dat", true);

            pw = new PrintWriter(fw);

            pw.print(1); pw.println("Luke Skywalker");
            pw.print(2); pw.println("Leia");
            pw.print(3); pw.println("Chewbacca");

            System.out.println("La BD de nombres ha sido actualizada");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            pw.close();
            try {
                pw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

