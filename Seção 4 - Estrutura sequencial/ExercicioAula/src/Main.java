import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício de fixação\n\n");

        String produto1 = "Computer";
        String produto2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.60;
        double measure = 53.234567;

        System.out.printf("Products: \n" +
                "%s, which price is $ %.2f\n" +
                "%s, which price is $ %.2f\n\n", produto1, price1, produto2, price2);

        System.out.printf("Record: %d years old, code %d and gender %c\n\n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    }
}