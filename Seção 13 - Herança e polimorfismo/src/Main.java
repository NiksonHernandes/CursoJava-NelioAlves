import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import entitiesMetodosAbstract.Circle;
import entitiesMetodosAbstract.Rectangle;
import entitiesMetodosAbstract.Shape;
import entitiesMetodosAbstract.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting - casting da subclasse pra superclasse

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Jonas", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //Dowmcasting - casting da superclasse pra subclasse

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) { //Se o acc3 é instancia de BusinessAccount
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Load");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc6 = (SavingsAccount) acc3;
            acc6.updateBalance();
            System.out.println("Update");
        }

        //Sobreposição:
        Account acc7 = new Account(120, "Nikson", 1000.0);
        acc7.withDraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new SavingsAccount(230, "Carlos", 1000.0, 0.01);
        acc8.withDraw(200.0);
        System.out.println(acc8.getBalance());

        //Polimorfismo
        Account x = new Account(1003, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Nikson", 1000.0, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

        //Classe abstrata -> A classe não pode ser instanciada, se ela for superclasse, as subclasses podem ser
        //herdadas. Com isso usamos o polimorfismo com upcasting
        Account acc9 = new Account(1001, "Alex", 1000.0); //vai dar erro
        Account acc10 = new SavingsAccount(1001, "Alex", 1000.0, 0.01);
        Account acc11 = new BusinessAccount(1001, "Alex", 1000.0, 500.0);


        //Metodos abstratos -> são métodos q não possuem implementação. Na superclasse o método
        //é tão genérico que não possui implementação. Para o método ser abstrato a classe tem q ser tmb
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapeList = new ArrayList<>();

        for (int i=0; i<n; i++) {
            System.out.println("Shape #" + (i+1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char option = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (option == 'c' || option == 'C') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(color, radius));
            }
            else {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapeList.add(new Rectangle(color, width, height));
            }
        }

        for (Shape p : shapeList) {
            System.out.println(p.area());
        }

        sc.close();
    }
}