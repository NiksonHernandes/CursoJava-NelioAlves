import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //é uma coleção de pares chave / valor
        //Não permite repetições de objto chave
        //Os elementos são indexados pelo objeto chave (n tem posição)
        //Acesso, inserção e remoção de elementos são rápido

        //Uso comum: Cookies, local storage, qq modelo chave-valor
        //Principais implementações:
        //• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
        //• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
        //compareTo do objeto (ou Comparator)
        //• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados

        //put(key, value), remove(key), containsKey(key), get(key)
            //• Baseado em equals e hashCode
            //• Se equals e hashCode não existir, é usada comparação de ponteiros
        //• clear()
        //• size()
        //• keySet() - retorna um Set<K>
        //• values() - retornaa um Collection<V>

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("userName", "Maria");
        cookies.put("email", "Maria@gmail.com");
        //cookies.put("phone", "8881293661");

        cookies.remove("email");
        //cookies.put("phone", "1233");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Emial: " + cookies.get("email")); //qnd n existe ele retorna null
        System.out.println("Size: " + cookies.size());

        System.out.println("\nALL COOKIES: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        //Teste com classe. Tipo, quanto que tem de estoque de cada produto
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps) );

        System.out.println("\nALL STOCK: ");
        for (Product key : stock.keySet()) {
            System.out.println(key.getName() + ", " + key.getPrice() + "| Qnt no Stock: " + stock.get(key));
        }
    }
}