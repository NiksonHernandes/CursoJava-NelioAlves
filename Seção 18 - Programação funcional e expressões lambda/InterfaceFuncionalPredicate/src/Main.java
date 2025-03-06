import entities.Product;
import entities.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Interface Funcional - é uma interface que possuí um único metodo ABSTRATO.
        //Existem algumas interfaces funcionais: precidate, function e consumer

        //Predicate (exemplo com removeIf) -> é uma interface generics, parametrizada com o tipo T
        //Ela só tem um metodo abstrato, chamado teste, que recebe um tipo T e retorna um boolean.

        //Remover da lista somente os produtos cujo preço mínimo seja 100.

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(p -> p.getPrice() >= 100);
        list.removeIf(new ProductPredicate());

        //Fazendo com expressão lambda e metodo anonimo

        Predicate<Product> pred = (p) -> p.getPrice() >= 100.00;
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p.toString());
        }

    }
}