import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int hI, hF, duracao;

        hI = sc.nextInt();
        hF = sc.nextInt();

        if (hI < hF) {
           duracao = hF - hI;
        }
        else {
            duracao = 24 - hI + hF;
        }

        System.out.println("Duração do jogo: " + duracao);
        sc.close();
    }
}