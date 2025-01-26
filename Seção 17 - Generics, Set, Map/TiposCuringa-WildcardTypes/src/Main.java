import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Erro de compilação, não da pra fazer essa conversão
        //Pois o tipo List<Object> é diferente de List<Integer>
        //List<Object> myObjs = new ArrayList<Object>();
        //List<Integer> myNumbers = new ArrayList<Integer>();
        //myObjs = myNumbers;

        //Isso funciona, pois o List<?> é o tipo de qualquer List
        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        //Com ele, podemos fazer métodos que recebem um genérico de 'qualquer tipo'

         List<Integer> listNumber = Arrays.asList(5, 2, 10);
         printList(listNumber);

         List<String> listString = Arrays.asList("teste", "String, oi");
         printList(listString);

         //Obs.: NÃO É POSSÍVEL ADICIONAR DADOS A UMA COLEÇÃO DO TIPO CURINGA
        List<?> list = new ArrayList<Integer>();
        list.add(3); // erro de compilação
    }

    public static void printList(List<?> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
