import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        System.out.println("\nInforme o valor do raio do círcilo (use ponto): ");
        raio = sc.nextDouble();

        area = pi*Math.pow(raio, 2.0);

        System.out.printf("Area = %.4f", area);
        sc.close();
    }
}