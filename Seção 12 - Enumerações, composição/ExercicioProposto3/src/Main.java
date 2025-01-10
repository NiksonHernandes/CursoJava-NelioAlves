import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date dateBirth = sdf.parse(sc.next());

        Client client = new Client(nameClient, email, dateBirth);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        Date momentDate = new Date();

        int n;
        System.out.print("\nHow many items to this order? ");
        n = sc.nextInt();

        Order order = new Order(momentDate, orderStatus, client);

        for (int i=0; i<n; i++) {
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            String nameProduct = sc.next();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();

            Product product = new Product(nameProduct, priceProduct);

            System.out.print("Product quantity: ");
            int quantityProduct = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);

            order.addItem(orderItem);
        }


        System.out.println("ORDER SUMMARY:");
        System.out.println(order.toString());

        sc.close();
    }
}