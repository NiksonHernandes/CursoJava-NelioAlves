import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double currentDolar, boughtDollar;

        System.out.println("What is the dollar price? ");
        currentDolar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        boughtDollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(currentDolar, boughtDollar));

        sc.close();
    }
}