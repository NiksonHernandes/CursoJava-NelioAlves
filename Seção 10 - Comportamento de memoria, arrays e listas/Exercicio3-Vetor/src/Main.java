import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntPessoasCadastrar;
        System.out.println("Quantas pessaos serão cadastradas? ");
        qntPessoasCadastrar = sc.nextInt();

        Pessoa[] p = new Pessoa[qntPessoasCadastrar];

        for (int i=0; i<qntPessoasCadastrar; i++) {
            System.out.println("Dados da pessoa# " + (i + 1)  + ": ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            Double altura = sc.nextDouble();

            p[i] = new Pessoa(nome, idade, altura);
        }

        double somaAltura = 0.0;
        double pessoasMenores16 = 0.0;

        for (int i=0; i<p.length; i++) {
            somaAltura += p[i].getAltura();

            if (p[i].getIdade() < 16) {
                pessoasMenores16 ++;
            }
        }

        System.out.printf("\n\nAltura média: %.2f ", somaAltura/p.length);
        System.out.printf("\nPessoas com menos de 16 anos: %.2f\n", (pessoasMenores16/p.length) * 100);

        for (int i=0; i<p.length; i++) {

            if (p[i].getIdade() < 16) {
                System.out.println(p[i].getNome());
            }
        }

    }
}