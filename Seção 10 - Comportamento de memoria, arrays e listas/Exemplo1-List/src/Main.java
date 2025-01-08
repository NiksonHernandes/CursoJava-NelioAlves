import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> funcionarioList = new ArrayList<>();

        int qntRep, idFunc;
        double porcentagem;
        System.out.println("Quantos funcionarios serão registrados? ");
        qntRep = sc.nextInt();

        for (int i=0; i<qntRep; i++) {
            System.out.println("\nFuncionario #" + (i+1) + " :");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            funcionarioList.add(new Funcionario(id, name, salario));
        }

        System.out.print("\nEntre com o ID do funcionário que será incrementado o salário: ");
        idFunc = sc.nextInt();

        Funcionario func = funcionarioList.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);

        if (func == null) {
            System.out.println("\nFim da operação. Id não encontrado!\n");
        }
        else {
            System.out.print("Informe a porcentagem: ");
            porcentagem = sc.nextDouble();
            func.atualizaSalario(porcentagem);
        }

        System.out.println("Lista de funcionários: ");
        for (Funcionario x : funcionarioList) {
            System.out.println(x.getId() + ", " + x.getNome() + ", " + String.format("%.2f", x.getSalario()));
        }
    }
}