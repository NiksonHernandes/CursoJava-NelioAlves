import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep;

        System.out.println("Quantos numeros você vai digitar?");
        qntRep = sc.nextInt();

        int[] numeros = new int[qntRep];

        for (int i=0; i<qntRep; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int maiorNum = 0, posMaiorNum = 0;

        for (int i=0; i<numeros.length; i++){
            if (numeros[i] > maiorNum) {
                maiorNum = numeros[i];
                posMaiorNum = i;
            }
        }

        System.out.println("\nMaior valor: " + maiorNum);
        System.out.println("Posição do maior valor: " + posMaiorNum);

        sc.close();
    }
}