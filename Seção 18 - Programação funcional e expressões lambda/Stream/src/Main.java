import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Stream -> é uma sequencia de elementos que vem de uma fonte de dados
        //que oferece suporte a 'operações agragadas'
        //fonte de dados: Coleção, array, função de iteralção, recurso de E/S

        //Pipeline -> Operações em streams retornam novas streams. Então é possível
        //criar uma cadeia de operações (Fluxo de processamento)

        //Operações intermediárias e terminais:
        //O pipeline é composto por zero ou mais operações intermediárias e uma terminal

        //Op. intermediária:
        // - Produz uma nova stream (encadeamento)
        // - Só executa quando uma op. terminal é invocada (lazy evaluation)

        //filter, map, flatmap, peek, distinct, sorted, skip, limit(short-circuit)

        //Op. terminal:
        // - Produz um obj não-stream (coleção ou outro)
        // - Determina o fim do processamento da stream

        //forEach, forEachOrdered, toArray, reduce, collect, min, max, count, anyMatch(*),
        //allMatch(*), noneMatch(*), findFirst(*), findAny(*).
        //* - short-circuit

        //Exemplos:
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Passa o primeiro elemento, de inicio, e depois a função de iteração para gerar outros elementos
        Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}