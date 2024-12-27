import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFunc;
        double numHrTrab, valHrTrab, salario;

        System.out.println("Numero do funcionario: ");
        numFunc = sc.nextInt();

        System.out.println("Numero de horas trabalhadas: ");
        numHrTrab = sc.nextDouble();

        System.out.println("Valor do salário por hora trabalhada: ");
        valHrTrab = sc.nextDouble();

        salario = numHrTrab * valHrTrab;


        System.out.printf("Numero: %d\nSalario: U$ %.2f", numFunc, salario);
    }
}