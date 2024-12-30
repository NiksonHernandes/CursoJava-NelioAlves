import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cont;
        double num1 = 0.0, num2 = 0.0,num3 = 0.0, mediaPond;

        System.out.println("\nQuantidade de repetições: ");
        cont = sc.nextInt();

        for (int i=0; i<cont; i++) {
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();

            mediaPond = (num1*2.0 + num2*3.0 + num3*5.0) / 10.0;
            System.out.printf("%.2f", mediaPond);
        }

        sc.close();
    }
}