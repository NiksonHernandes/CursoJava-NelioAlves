import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Pipeline -> Operações em streams retornam novas streams. Então é possível
        //criar uma cadeia de operações (Fluxo de processamento)

        //Exemplos:
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        //Reduce -> pega o elemento inicial e uma função que recebe 2 argumento e retorna um resultado
        //Executa em cada elemento do array
        int sum = list.stream().reduce(0, (x, y) ->  x + y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(Arrays.toString(newList.toArray()));
    }
}