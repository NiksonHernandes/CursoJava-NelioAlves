import entities.MyComparator;
import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //Forma 1 - Criando uma classe para colocar o comparator lá:

        //Interface Comparator é uma interface funcional. Usamos ela quando não queremos
        //colocar a implementação do Comparable<> na classe.
        //Interface funcional - é uma interface que tem apenas um metodo ABSTRATO
        list.sort(new MyComparator());

        //Forma 2 - Usando sintaxe de classe anonima:

//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };

        //Trocando toda essa verbosidade por uma expressão lambda
        //Lê-se: Tenho um comparator do tipo Product chamado 'comp' que recebe uma função com 2 args e retorna p1....
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);

        //Forma 3 - Colocar tudo em uma linha só:

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }

    }
}