import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //New FileWriter(path) -> Criar/Recriar o arquivo
        //New FileWriter(path, true) -> Acrescenta ao arquivo existente

        //Quero salvar esses dados no meu arquivo
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line); //N tem quebra de linha
                bw.newLine(); //Quebra de linha
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}