import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Rectangle(3.0, 2.0));
        myShape.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Toral area: " + totalArea(myCircle));

        //----------------------------------------------------------
        //COVARIÂNCIA - Quando a operação de GET é permitida, mas a operação de PUT não é
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        //VER NA TABELA DO PDF - PAGINA 18
        //Pode ser um Number ou qq tipo que seja subtipo dele, ou seja, INTEGER, BYTE, LONG, SHORT, FLOAT OU DOUBLE
        List<? extends Number> list = intList;
        Number x = list.get(0); //GET

        list.add(20); // erro de compilacao //PUT

        //----------------------------------------------------------
        //CONTRAVARIÂNCIA - Ao contrário. PUT é permitido, mas GET não
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        //VER NA TABELA DO PDF - PAGINA 18
        //Pode ser um Number ou qq tipo SUPER tipo de number, ou seja, OBJECT
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        Number x = myNums.get(0); // erro de compilacao

        //----------------------------------------------------------
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs1 = new ArrayList<Object>();

        copy(myInts, myObjs1);
        print(myObjs1);
        copy(myDoubles, myObjs1);
        print(myObjs1);
    }

    //Digo que a List que recebera como parametro poderá ser:
    //- Ou se Shape
    //- Ou de qualquer tipo que seja subtipo de Shape.
    // Asssim eu posso usar como parametros subtipos de Shape
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape x : list) {
            sum += x.area();
        }
        return  sum;
    }

    //Digo: Pode ser uma lista de qq tipo ou de um super/sub tipo de Number
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void print(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj);
        }
        System.out.println();
    }
}