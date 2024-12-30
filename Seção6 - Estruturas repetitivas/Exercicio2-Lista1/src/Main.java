import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("\nInforme as coordenadas: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        while (num1 != 0 && num2 != 0) {

            if(num1 > 0 && num2 > 0) {
                System.out.println("Primeiro");
            }
            else if (num1 < 0 && num2 > 0) {
                System.out.println("Segundo");
            }
            else if (num1 < 0 && num2 < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        sc.close();
        System.out.println("Finalizado");

    }
}