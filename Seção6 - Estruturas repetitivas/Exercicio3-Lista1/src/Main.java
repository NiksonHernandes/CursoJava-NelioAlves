import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, entrada;

        System.out.println("\nInforme o código: ");
        entrada = sc.nextInt();

        while (entrada != 4) {
            if (entrada == 1) {
                alcool ++;
            } else if (entrada == 2) {
                gasolina ++;
            } else if (entrada == 3){
                diesel ++;
            }

            entrada = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}