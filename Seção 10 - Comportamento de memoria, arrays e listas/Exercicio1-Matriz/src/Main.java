import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int l, c, valorMatriz;
        System.out.print("Linhas: ");
        l = sc.nextInt();
        System.out.print("Colunas: ");
        c = sc.nextInt();

        int[][] mat = new int[l][c];

        System.out.println("Informe os dados da matriz (" + l + "x" + c + "):");
        for (int i=0; i<l; i++) {
            for (int j=0; j<c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Dados da matriz: ");
        for (int i=0; i<l; i++) {
            for (int j=0; j<c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Informe um valor que consta na matriz: ");
        valorMatriz = sc.nextInt();

        for (int i=0; i<l; i++) {
            for (int j=0; j<c; j++) {
                if (mat[i][j] == valorMatriz) {
                    System.out.println("Position " + i + ", " + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}