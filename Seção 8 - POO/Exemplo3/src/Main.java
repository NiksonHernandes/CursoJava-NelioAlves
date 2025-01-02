import entities.Circle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Métodos estáticos - Uma classe que possui somente membros estáticos, pode ser uma classe
        //estática também. Esta classe não poderá ser instanciada.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radium;

        System.out.println("Enter radius: ");
        radium = sc.nextDouble();

        System.out.printf("Circumference: %.2f\n", Circle.circumference(radium));
        System.out.printf("Volume: %.2f\n", Circle.volume(radium));
        System.out.printf("PI Value: %.2f\n", Circle.PI);

        sc.close();
    }
}