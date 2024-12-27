import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        String res = (a < 0) ? "Negativo" : "Não negativo";
        System.out.println(res);

        sc.close();
//        if (a < 0) {
//            System.out.println("Negativo");
//        }
//        else {
//            System.out.println("Não negativo");
//        }

    }
}