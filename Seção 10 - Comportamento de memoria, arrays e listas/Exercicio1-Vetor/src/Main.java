import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] arrayNumeros = new int[10];
        int qntNumDigitados;

        System.out.println("Quantos números vocÊ vai digitar? (Max. 10)");
        qntNumDigitados = sc.nextInt();

        if (qntNumDigitados > 10) {
            System.out.println("Quantidade inválida. Máximo 10");
        }
        else {
            for (int i=0; i<qntNumDigitados; i++) {
                System.out.println("Digite um numero: ");
                arrayNumeros[i] = sc.nextInt();
            }

            System.out.println("Numeros negativos: ");

            for (int i=0; i<qntNumDigitados; i++) {
                if (arrayNumeros[i] <0) {
                    System.out.println(arrayNumeros[i]);
                }
            }
        }

        sc.close();
    }
}