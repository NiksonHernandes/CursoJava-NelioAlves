import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double valorFinal = 0.0;

        System.out.println("\nInforme o código e a quantidade: \n");
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                valorFinal += quantidade * 4.00;
                break;
            case 2:
                valorFinal += quantidade * 4.50;
                break;
            case 3:
                valorFinal += quantidade * 5.00;
                break;
            case 4:
                valorFinal += quantidade * 2.00;
                break;
            case 5:
                valorFinal += quantidade * 1.50;
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        System.out.printf("Total: R$ %.2f", valorFinal);
    }
}