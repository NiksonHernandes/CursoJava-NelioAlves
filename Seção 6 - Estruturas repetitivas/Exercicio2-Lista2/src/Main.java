import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int rep, num, in = 0, out = 0;

        System.out.println("\nQuantidade de repetição: ");
        rep = sc.nextInt();

        for (int i=0; i<rep; i++) {
            num = sc.nextInt();
            if (num >=10 && num <=20) {
                in ++;
            } else {
                out ++;
            }
        }

        System.out.printf("%d in\n%d out", in, out);
    }
}