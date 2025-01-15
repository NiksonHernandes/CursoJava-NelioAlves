import model.entities.Account;
import model.exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initial = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initial, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawAmount = sc.nextDouble();

            account.withdraw(withdrawAmount);

            System.out.println("New Balance: " + String.format("%.2f", account.getBalance()));
        }
        catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected error");
        }

    }
}