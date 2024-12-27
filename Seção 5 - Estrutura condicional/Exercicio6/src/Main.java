import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor;
        String intervalo;

        valor = sc.nextDouble();

        if (valor >=0 && valor <=25) {
            intervalo = "[0, 25]";
        }
        else if (valor >25 && valor <=50) {
            intervalo = "(25, 50]";
        }
        else if (valor >50 && valor <=75) {
            intervalo = "(50, 75]";
        }
        else if (valor >75 && valor >=100) {
            intervalo = "(75, 100]";
        }
        else {
            intervalo = "Valor fora da escala";
        }

        System.out.println("Intervalo: " + intervalo);
    }
}