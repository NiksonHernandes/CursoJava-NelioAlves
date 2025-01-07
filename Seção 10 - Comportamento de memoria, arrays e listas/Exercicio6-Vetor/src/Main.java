import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep;
        System.out.println("Quantos valores vai ter cada vetor? ");
        qntRep = sc.nextInt();

        int[] vetA = new int[qntRep];
        int[] vetB = new int[qntRep];
        int[] vetC = new int[qntRep];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i<qntRep; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i<qntRep; i++) {
            vetB[i] = sc.nextInt();
        }

        System.out.println("\nVETOR RESULTANTE:");

        for (int i=0; i<qntRep; i++) {
            System.out.println(vetC[i] = vetA[i] + vetB[i]);
        }

        sc.close();
    }
}