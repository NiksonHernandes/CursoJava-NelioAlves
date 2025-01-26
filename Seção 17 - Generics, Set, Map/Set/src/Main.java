import java.util.*;

public class Main {
    public static void main(String[] args) {
        //SET - É um tipo generico e representa um conj de elementos
        //Não admite repetições
        //Elementos n possuem posições
        //Acesso, remoção e inserção são rápidos
        //Oferece operações eficientes de conjunto: interseção, união, diferença.
        //addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
        //retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
        //removeAll(other) - diferença: remove do conjunto os elementos contidos em other

        //Principais implementações:
        //• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
        //• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator),
        //Se for usar uma lista do tipo de uma classe, essa classe deve impleementar o Comparable
        //• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        //System.out.println(set.contains("Notebook"));
        //set.remove("Tablet");
        //set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}