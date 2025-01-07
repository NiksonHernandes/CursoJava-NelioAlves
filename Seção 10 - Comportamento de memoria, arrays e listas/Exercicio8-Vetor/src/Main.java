import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep, pares = 0;
        double somaPares = 0.0;
        System.out.println("Quantos elementos vai ter o vetor? ");
        qntRep = sc.nextInt();

        int[] numeros = new int[qntRep];

        for (int i=0; i<qntRep; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i=0; i<qntRep; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares = somaPares + numeros[i];
                pares ++;
            }
        }

        if (somaPares == 0.0 || pares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            System.out.printf("\nMEDIA DOS PARES = %.2f", somaPares / pares);
        }
        sc.close();
    }
}