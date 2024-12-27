import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x = 43.123871;
        System.out.println("Com vírgula: \n");
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);

        //Usamos isso para que na saída do double fique com '.' não com ','.
        Locale.setDefault(Locale.US);
        System.out.println("Com ponto: \n");
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);

        String nome = "Maria";
        int idade = 18;
        double altura = 1.65;

        System.out.printf("Texto completo em um print só: \n" +
                "Meu nome é %s, tenho %d anos de idade e minha altura é %.2f.\n", nome, idade, altura);


        //Entrada de dados
        System.out.println("\nEntrada de dados:\n");

        Scanner sc = new Scanner(System.in);

        String text;
        int inteiro;
        double doble;
        char sexo;

        inteiro = sc.nextInt();
        sc.nextLine(); //Pra ele não bugar o nextLine
        text = sc.nextLine();
        doble = sc.nextDouble();
        sexo = sc.next().charAt(0);

        System.out.printf("Você digitou: \n" +
                "Int: %d\nText: %s\nDouble: %.2f\nChar: %c", inteiro, text, doble, sexo);
        sc.close();
    }
}