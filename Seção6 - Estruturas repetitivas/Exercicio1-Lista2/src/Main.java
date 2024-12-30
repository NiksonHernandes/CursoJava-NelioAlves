import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, i;

        System.out.println("\nDigite um número inteiro: ");
        num = sc.nextInt();

        if (num > 0) {
            for (i=0; i<num; i++) {
                if (i%2 != 0) {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("Somente números inteiros.");
        }

        sc.close();
    }
}