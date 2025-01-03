import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntAddStrock, qntRemoveStock;

        System.out.println("\nEnter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(name, price, quantity);
        //Product p1 = new Product(name, price);

        p1.setName("Computer");
        System.out.println("Nome atualizado: " + p1.getName());

        System.out.printf("\nProduct data: " + p1);

        System.out.println("\nEnter the number of products to be added in stock: ");
        qntAddStrock = sc.nextInt();
        p1.addProducts(qntAddStrock);

        System.out.printf("\nUpdated data: " + p1);

        System.out.println("\nEnter the number of products to be removed from stock: ");
        qntRemoveStock = sc.nextInt();
        p1.removeProducts(qntRemoveStock);

        System.out.printf("\nUpdated data: " + p1);

        sc.close();
    }
}