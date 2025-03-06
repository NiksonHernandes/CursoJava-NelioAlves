import entities.Product;
import entities.ProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Interface Funcional - é uma interface que possuí um único metodo ABSTRATO.
        //Existem algumas interfaces funcionais: precidate, function e consumer

        //Function (exemplo com map) -> é uma interface generics, parametrizada com o tipo T e R
        //Ela só tem um metodo abstrato, chamado apply, que recebe um tipo T e retorna obg do tipo R

        //Exemplo: gerar uma nova lista com nomes dos produtos em caixa alta
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //a função 'map' (diferente do Map, estrutura de dados) é uma função
        //que aplica uma função a tdos elementos de uma stream e devolve uma nova lista como resultado
        List<String> names = list.stream().map(new ProductFunction()).toList();

        Function<Product, String> func = (p) -> p.getName().toUpperCase();
        List<String> names1 = list.stream().map(func).toList();

        names.forEach(System.out::println);
    }
}