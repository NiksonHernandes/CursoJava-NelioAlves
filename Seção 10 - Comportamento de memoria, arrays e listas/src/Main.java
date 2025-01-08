import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Listas
        //List é uma interface, por isso não podemos instanciar ela.
        //Mas podemos instanciar classes que implementam essa interface, como ArrayList, LinkedList, etc.

        List<String> list;
        list = new ArrayList<>();

        //Add elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        //Add entre o Alex e o Bob, na posicao 2
        list.add(2, "Marco");

        //Tamanho da lista
        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------");

        //Remover elemento da lista pelo nome
        //      list.remove("Ana");

        //Remover pela posição
        //      list.remove(1);

        //Remover todos mundo q comeca com a letra M
        list.removeIf(x -> x.charAt(0) == 'M'); //Verifica se o X é igual a M, ele retorna True ou False

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------");

        //Encontrar a posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //Não encontra retorna -1

        System.out.println("--------------------------");

        //Agora quero deixar na lista só quem começa com a letra M
        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'M')
                .toList();

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("--------------------------");

        //Encontrar primeiro elemento q começa com A
        String name = list.stream()
                        .filter(x -> x.charAt(0) == 'A')
                        .findFirst().orElse(null);

        System.out.println(name);

        //Encontrar primeiro elemento q começa com J
        String nameJ = list.stream()
                .filter(x -> x.charAt(0) == 'J')
                .findFirst().orElse(null);

        System.out.println(nameJ);

        //--------------------------------- Matrizes ----------------------------------



        sc.close();
    }
}