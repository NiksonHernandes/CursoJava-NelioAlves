import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep, maisVelho = 0;
        String maisVelhoNome = "";
        System.out.println("Qunatas pessoas você vai digitar? ");
        qntRep = sc.nextInt();

        Pessoa[] p = new Pessoa[qntRep];

        for (int i=0; i<qntRep; i++) {
            System.out.println("Dados da pessoa #" + (i+1) + " :");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            p[i] = new Pessoa(nome, idade);
        }

        for (int i=0; i<qntRep; i++) {
            if (p[i].getIdade() > maisVelho) {
                maisVelho = p[i].getIdade();
                maisVelhoNome = p[i].getNome();
            }
        }

        System.out.println("\nPessoa mais velha: " + maisVelhoNome);
        sc.close();
    }
}