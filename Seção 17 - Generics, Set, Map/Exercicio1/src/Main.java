import entities.Registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Set<Registro> list = new HashSet<>();

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                list.add(new Registro(fields[0], Date.from(Instant.parse(fields[1]))));

                line = br.readLine();
            }
            System.out.println("Total users: " + list.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}