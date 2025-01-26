package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    //Esse é T pode ser qualquer letra ou palavra
    //é só um indicativo que ele vai receber um tipo, pode ser String, Integer, Double

    private List<T> list = new ArrayList<>();

    public PrintService() {}

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i=1; i<list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }

}
