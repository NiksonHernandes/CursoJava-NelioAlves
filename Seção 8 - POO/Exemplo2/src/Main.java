import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntAddStrock, qntRemoveStock;
        Product p1 = new Product();

        System.out.println("\nEnter product data:");
        System.out.print("Name: ");
        p1.name = sc.nextLine();
        System.out.print("Price: ");
        p1.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        p1.quantity = sc.nextInt();

        //System.out.println(p1.toString()); //ou somente sout(p1)

        //System.out.printf("\nProduct data: %s, $ %.2f, %d units, Total: $ %.2f\n", p1.name, p1.price, p1.quantity, p1.totalValueInStock());
        System.out.printf("\nProduct data: " + p1);

        System.out.println("\nEnter the number of products to be added in stock: ");
        qntAddStrock = sc.nextInt();
        p1.addProducts(qntAddStrock);

        //System.out.printf("\nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f\n", p1.name, p1.price, p1.quantity, p1.totalValueInStock());
        System.out.printf("\nUpdated data: " + p1);

        System.out.println("\nEnter the number of products to be removed from stock: ");
        qntRemoveStock = sc.nextInt();
        p1.removeProducts(qntRemoveStock);

        //System.out.printf("\nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f\n", p1.name, p1.price, p1.quantity, p1.totalValueInStock());
        System.out.printf("\nUpdated data: " + p1);

        sc.close();
    }
}