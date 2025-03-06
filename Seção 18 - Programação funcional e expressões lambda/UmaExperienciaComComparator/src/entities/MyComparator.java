package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    //Retorno, parecido com o Comparable:
    //Positivo - p1 maior que p2
    //Zero - iguais
    //Negativo -p2 maior que p1
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
