import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //FileReader - Stream(sequencia) de leitura de caracteres
        //BufferReader - Instanciado a partir do FileReader, pq ele é mais rápido
        String path = "c:\\temp\\in.txt";

        //Forma mais difícil
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Forma mais otimizada
        //Try-with-resourcer -> fecha o stream sozinho, sem a necessidade de fechar manualmente, como antes
        try (BufferedReader br1 = new BufferedReader(new FileReader(path))) {
            String line = br1.readLine();

            while (line != null) {
                System.out.println(line);
                line = br1.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}