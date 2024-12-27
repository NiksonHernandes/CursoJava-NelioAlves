import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2, soma;

        System.out.println("\nSOMA DE 2 VALORES: \n");
        System.out.println("Digite o valor 1: ");
        valor1 = sc.nextInt();

        System.out.println("Digite o valor 2: ");
        valor2 = sc.nextInt();

        soma = valor1 + valor2;
        System.out.println("SOMA: " + soma);

        sc.close();

    }
}