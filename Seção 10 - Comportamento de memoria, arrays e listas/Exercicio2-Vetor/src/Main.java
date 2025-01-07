import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntNumeros;

        System.out.println("Quantos numeros voce vai digitar: ");
        qntNumeros = sc.nextInt();

        int[] arrayNumeros = new int[qntNumeros];

        for (int i=0; i<qntNumeros; i++) {
            System.out.println("Digite um numero: ");
            arrayNumeros[i] = sc.nextInt();
        }

        int soma = 0;

        System.out.println("VALORES: ");
        for (int i=0; i<arrayNumeros.length; i++) {
            soma += arrayNumeros[i];

            System.out.print(arrayNumeros[i] + " ");
        }

        System.out.println("\nSOMA: " + soma);
        System.out.println("MEDIA: " + soma/arrayNumeros.length);

        sc.close();
    }
}