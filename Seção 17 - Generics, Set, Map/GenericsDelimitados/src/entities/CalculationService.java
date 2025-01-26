package entities;

import java.util.List;

public class CalculationService {

    //Preciso especificar que o Tipo T é um comparable tmb
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) { //se for 0, o primeiro é maior q o segundo, ou seja, é true
                max = item;
            }
        }

        return max;
    }
}
