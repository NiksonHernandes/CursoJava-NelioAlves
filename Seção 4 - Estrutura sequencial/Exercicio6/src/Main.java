import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, aTrianguloRetangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo;

        System.out.println("Insira os valores de a, b e c: \n");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        aTrianguloRetangulo = (a * c) /2.0;
        aCirculo = 3.14159 * Math.pow(c, 2.0);
        aTrapezio = ((a + b) * c)/2.0;
        aQuadrado = Math.pow(b, 2.0);
        aRetangulo = a * b;

        System.out.printf("Triangulo: %.3f\nCirculo: %.3f\nTrapezio: %.3f\nQuadrado: %.3f\nRetangulo: %.3f",
                aTrianguloRetangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo);
    }
}