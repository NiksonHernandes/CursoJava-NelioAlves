import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //A interface Comparable serve pra definir na classe como o obj é comparado com outro

        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null) {
                String[] fields = funcionarioCsv.split(",");
                list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionarioCsv = br.readLine();
            }
            Collections.sort(list); //Orderar a lista -> Só vai funcionar se eu implementar a interface Comparable
            for (Funcionario s : list) {
                System.out.println(s.getName() + ", " + s.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}