import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n, negativos = 0;
        n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Dados inseridos: ");
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");

                if (mat[i][j] < 0) {
                    negativos ++;
                }
            }
            System.out.println();
        }

        System.out.println("\nMain diagonal: ");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\nNegativos: " + negativos);

        sc.close();
    }
}