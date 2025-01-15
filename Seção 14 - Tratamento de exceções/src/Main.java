import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        method1();

        System.out.println("end!");

        sc.close();
    }

    public static void method1() {
        System.out.println("****METHOD1 START****");
        method2();
        System.out.println("****METHOD2 END****");
    }

    public static void method2() {
        System.out.println("****METHOD2 START****");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace(); //Mostra toda a chama de método que acarretou essa excecao

            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        sc.close();
        System.out.println("****METHOD2 END****");
    }
}