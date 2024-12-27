import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        String res = (a%2 >= 0) ? "Par" : "Ímpar";
        System.out.println(res);

        sc.close();
    }
}