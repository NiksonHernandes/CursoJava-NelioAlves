import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep;

        System.out.println("Quantos numeros voce vai digitar? ");
        qntRep = sc.nextInt();

        int[] numeros = new int[qntRep];

        for (int i=0; i<qntRep; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int qntPares = 0;

        for (int i=0; i<qntRep; i++) {
            if (numeros[i] % 2 == 0) {
                qntPares ++;
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println("\nQuantidade de pares = " + qntPares);
    }
}