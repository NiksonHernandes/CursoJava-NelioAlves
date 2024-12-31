import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //• Formatar: toLowerCase(), toUpperCase(), trim()
        //• Recortar: substring(inicio), substring(inicio, fim)
        //• Substituir: Replace(char, char), Replace(string, string)
        //• Buscar: IndexOf, LastIndexOf
        //• str.Split(" ")

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Funções pra formatar string!");

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); //primeira posição do 'bc', primeira ocorrencia
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("lowerCase: -" + s01 + "-");
        System.out.println("upperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("indexof('bc'): -" + i + "-");
        System.out.println("lastIndexof('bc'): -" + j + "-");


        //Split - recortar a string em um vetor
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String w1 = vect[0];
        String w2 = vect[1];
        String w3 = vect[2];

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}