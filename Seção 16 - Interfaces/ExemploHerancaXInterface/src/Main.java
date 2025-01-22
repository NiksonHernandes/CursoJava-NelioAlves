import entities.AbstractShape;
import entities.Circle;
import entities.Color;
import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AbstractShape ab1 = new Circle(Color.BLACK, 2.0);
        AbstractShape ab2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle: " + ab1.getColor() + " - " + ab1.area());
        System.out.println("Rectangular: " + ab2.getColor() + " - " + ab2.area());

        sc.close();
    }
}