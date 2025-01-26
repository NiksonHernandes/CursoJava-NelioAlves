import entities.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Funcionaria colocando Object, mas teria um erro de Tipo, pois poderiamos
        //adicionar qualquer tipo na lista.

        System.out.print("How many values? ");
        int n = sc.nextInt();

        PrintService<Integer> printService = new PrintService<>();

        for (int i=0; i<n; i++) {
            printService.addValue(sc.nextInt());
        }

        printService.print();
        System.out.println("First: " + printService.first());
        sc.close();
    }
}