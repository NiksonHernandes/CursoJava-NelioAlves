import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //While
//        int num, soma = 0;
//
//        System.out.println("\nInsira um número: ");
//        num = sc.nextInt();
//
//        while (num != 0) {
//            soma += num;
//            num = sc.nextInt();
//        }
//
//        System.out.println("Soma total: " + soma);

        //For
        int i, n, soma = 0;

        System.out.println("\nDigite um número: ");
        n = sc.nextInt();

        for (i=0; i<n; i++) {
            soma += n;
            n = sc.nextInt();
        }

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}