import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the number of products: ");
        n = sc.nextInt();

        List<Product> productList = new ArrayList<>();

        for (int i=0; i<n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char entrance = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (entrance == 'i' || entrance == 'I') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            }
            else if (entrance == 'u' || entrance == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                productList.add(new UserProduct(name, price, data));
            }
            else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for(Product p : productList) {
            System.out.println(p.priceTag());
        }

    }
}