import entities.Employee;
import entities.OutsourcedEmployes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter the number of employees: ");
        n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for(int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.print("Outsourced (y/n): ");
            char isOutsourced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (isOutsourced == 'y' || isOutsourced == 'Y') {
                System.out.print("Additional change: ");
                double additionChange = sc.nextDouble();

                employeeList.add(new OutsourcedEmployes(name, hours, valuePerHour, additionChange));
            }
            else  {
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }

        for (Employee e : employeeList) {
            System.out.println(e);
        }

    }
}