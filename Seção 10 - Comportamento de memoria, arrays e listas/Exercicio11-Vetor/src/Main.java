import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntRep;
        System.out.println("Quantas pessoas serão digitadas? ");
        qntRep = sc.nextInt();

        Pessoa[] p = new Pessoa[qntRep];

        for (int i=0; i<qntRep; i++){
            System.out.print("Altura da pessoa #" + (i + 1) + ": ");
            double altura = sc.nextDouble();
            System.out.print("Genero da pessoa (F/M) #" + (i + 1) + ": ");
            char genero = sc.next().charAt(0);

            p[i] = new Pessoa(altura, genero);
        }

        double menorAltura = 200.0, maiorAltura = 0.0;
        double somaAlturaMulheres = 0.0, alturaMulheres = 0.0;
        int numHomens = 0;

        for (int i=0; i<qntRep; i++){
            if (p[i].getAltura() > maiorAltura) {
                maiorAltura = p[i].getAltura();
            }
            else if (p[i].getAltura() < menorAltura) {
                menorAltura = p[i].getAltura();
            }

            if (p[i].getGenero() == 'f' || p[i].getGenero() == 'F') {
                somaAlturaMulheres += p[i].getAltura();
                alturaMulheres ++;
            } else {
              numHomens ++;
            }
        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);

        System.out.println("Media das alturas das mulheres: " + somaAlturaMulheres / alturaMulheres);
        System.out.println("Numero de homens: " + numHomens);

        sc.close();
    }
}