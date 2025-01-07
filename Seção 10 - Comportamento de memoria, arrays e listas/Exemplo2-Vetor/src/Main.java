import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep;

        System.out.println("Digite a quantidade de dados: ");
        qntRep = sc.nextInt();

        Product[] productNew = new Product[qntRep];

        for (int i=0; i<qntRep; i++) {
            System.out.printf("Nome do produto (%d): ", i);
            String name = sc.next();
            System.out.printf("Preço do produto (%d): ", i);
            double preco = sc.nextDouble();
            productNew[i] = new Product(name, preco);
        }

        double sum = 0.0;
        for (int i=0; i<qntRep; i++) {
            sum += productNew[i].getPreco();
        }

        System.out.println("AVERAGE PRICE = " + sum/productNew.length);
        sc.close();
    }
}