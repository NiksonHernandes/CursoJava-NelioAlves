import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codp1, nump1, codp2, nump2;
        double valUnitp1, valUnitp2, valorFinal;

        System.out.println("Sequencia: Codigo da peça, numero da peça, valor uniátio:\n");
        codp1 = sc.nextInt();
        nump1 = sc.nextInt();
        valUnitp1 = sc.nextDouble();
        sc.nextLine();
        codp2 = sc.nextInt();
        nump2 = sc.nextInt();
        valUnitp2 = sc.nextDouble();

        valorFinal = (nump1 * valUnitp1) + (nump2 * valUnitp2);

        System.out.printf("Valor final: %.2f", valorFinal);
    }
}