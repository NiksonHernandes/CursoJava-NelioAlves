public class Main {
    public static void main(String[] args) {
        //Usadas pra comparar se um OBJ é igual a outro
        //Equals - > lenta, resposta 100%
        //hasCode - > rapida, resposta não é 100%

        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));

        //HashCode retorna uma num inteiro representando um código gerado a partir das info do obj
        String a1 = "Maria";
        String b1 = "Alex";
        //Se os 2 nomes forem igual o HashCode tmb é igual
        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);//Não vai funcionar, pq o == compara a referência de memória
    }
}