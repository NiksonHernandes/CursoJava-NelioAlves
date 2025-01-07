import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntPessoas;

        System.out.println("Quantidade de pessoas: ");
        qntPessoas = sc.nextInt();

        double[] vectAlturas = new double[qntPessoas];

        for (int i=0; i<qntPessoas; i++) {
            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            vectAlturas[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i=0; i<vectAlturas.length;i++){
            sum += vectAlturas[i];
        }

        System.out.printf("AVERAGE HEIGHT = %.2f", sum/vectAlturas.length);

        sc.close();
    }
}