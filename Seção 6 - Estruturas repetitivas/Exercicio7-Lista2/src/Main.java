import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cont;

        cont = sc.nextInt();

        for (int i=1; i<=cont; i++){
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);
            System.out.printf("%d\t%.2f\t%.2f\n", i, quadrado, cubo);
        }

        sc.close();
    }
}