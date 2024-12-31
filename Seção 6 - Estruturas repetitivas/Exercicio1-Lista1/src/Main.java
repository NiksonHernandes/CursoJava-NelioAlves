import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.println("\nDigite a senha (4 digitos): ");
        senha = sc.nextInt();

        while (senha != 1234){
            System.out.println("Senha inválida. Tente novamente");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido.");
        sc.close();

    }
}