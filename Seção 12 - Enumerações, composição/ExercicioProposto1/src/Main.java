import entities.Department;
import entities.HourContract;
import entities.Worder;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departName = sc.next();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String nameWorker = sc.next();
        System.out.print("Level: ");
        String levelWorker = sc.next();
        System.out.print("Base salary: ");
        Double base = sc.nextDouble();

        Worder w1 = new Worder(nameWorker, WorkerLevel.valueOf(levelWorker), base, new Department(departName));

        System.out.print("How many contacts to this worker? ");
        int qntContract = sc.nextInt();

        for (int i=0; i<qntContract; i++){
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hours: ");
            Double valuePerHours = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract hourContract = new HourContract(date, valuePerHours, hours);
            w1.addContract(hourContract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + w1.getName());
        System.out.println("Departmant: " + w1.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", w1.income(year, month)));

        sc.close();
    }
}