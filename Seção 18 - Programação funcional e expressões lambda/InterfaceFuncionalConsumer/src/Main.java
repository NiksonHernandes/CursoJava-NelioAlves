import entities.Product;
import entities.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Interface Funcional - é uma interface que possuí um único metodo ABSTRATO.
        //Existem algumas interfaces funcionais: precidate, function e consumer

        //Consumer (exemplo com foreach) -> é uma interface generics, parametrizada com o tipo T
        //Ela só tem um metodo abstrato, chamado accept, que recebe um tipo T e retorna void

        //Quero aumente o preço dos produtos em 10%
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new ProductConsumer());

        Consumer<Product> cons = (p) -> p.setPrice(p.getPrice() * 1.1);

        list.forEach(cons);

        list.forEach(System.out::println);
    }
}