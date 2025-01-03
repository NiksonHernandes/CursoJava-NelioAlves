import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account username: ");
        String accountName = sc.next();
        sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)?");
        char initialDepositOption = sc.next().charAt(0);

        if (initialDepositOption == 'y' || initialDepositOption == 'Y') {
            System.out.println("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();

            account = new Account(accountNumber, accountName, initialDepositValue);
        }
        else if (initialDepositOption == 'n' || initialDepositOption == 'N') {
            account = new Account(accountNumber, accountName);
        }
        else {
            System.out.println("\nOpção inválida, tente novamente!");
        }

        System.out.println("\nAccount data: ");
        System.out.print(account);

        System.out.println("\n\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.depositMoney(depositValue);

        System.out.println("Update account data: ");
        System.out.print(account);

        System.out.println("\n\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdrawMoney(withdrawValue);

        System.out.println("Update account data: ");
        System.out.print(account);

        sc.close();
    }
}