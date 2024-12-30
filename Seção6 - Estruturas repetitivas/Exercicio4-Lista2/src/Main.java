import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cont, n1, n2;

        System.out.println("\nQuantidade de repetições: ");
        cont = sc.nextInt();

        for (int i=0; i<cont; i++) {
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            if (n2 == 0) {
                System.out.println("Divisão impossível!");
            } else {
                double div = (double) n1 / n2;
                System.out.printf("%.2f", div);
            }
        }

        sc.close();
    }
}