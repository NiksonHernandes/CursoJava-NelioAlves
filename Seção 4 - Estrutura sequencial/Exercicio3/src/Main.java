import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        c = sc.nextInt();
        sc.nextLine();
        d = sc.nextInt();

        diferenca = (a*b) - (c*d);
        System.out.println("Diferença = " + diferenca);
    }
}