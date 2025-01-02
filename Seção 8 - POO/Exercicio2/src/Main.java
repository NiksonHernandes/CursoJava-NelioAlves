import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double percentage;

        Employee emp = new Employee();

        System.out.println("Enter data:");
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp);

        System.out.print("\nWhich percentage to increase salary? ");
        percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Updated data: " + emp);
        sc.close();
    }
}