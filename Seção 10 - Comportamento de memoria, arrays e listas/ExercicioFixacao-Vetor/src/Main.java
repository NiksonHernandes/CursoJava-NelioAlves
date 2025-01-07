import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntQuartosAlugados;

        Estudante[] est = new Estudante[10];

        System.out.println("Quantos quartos serão alugados (Max. 10 quartos)? ");
        qntQuartosAlugados = sc.nextInt();

        for (int i=1; i<=qntQuartosAlugados; i++) {
            System.out.println("QUARTO #" + i + ":" );
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            est[quarto] = new Estudante(nome, email);
        }

        System.out.println("Quartos ocupados: ");
        for (int i=0; i<10; i++){
            if (est[i] != null) {
                System.out.println(i + ": " + est[i]);
            }
        }

        sc.close();
    }
}