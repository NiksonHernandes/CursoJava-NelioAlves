import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Triangle x = new Triangle();
//        Triangle y = new Triangle();
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("\nEnter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("\nEnter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculaArea();
        double areaY = y.calculaArea();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        System.out.printf("Large area: %s", (areaX > areaY) ? "X" : "Y");
    }
}