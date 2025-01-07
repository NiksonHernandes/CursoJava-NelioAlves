import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep;
        System.out.println("Quantos elementos vai ter o vetor? ");
        qntRep = sc.nextInt();

        double[] numeros = new double[qntRep];

        for (int i=0; i<qntRep; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double media = 0.0, soma = 0.0;

        for (int i=0; i<qntRep; i++) {
            soma += numeros[i];
        }

        media = soma / numeros.length;
        System.out.printf("\nMedia do vetor: %.2f", media);

        System.out.println("\nElementos abaixo da média: ");
        for (int i=0; i<qntRep; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i] );
            }
        }

        sc.close();
    }
}