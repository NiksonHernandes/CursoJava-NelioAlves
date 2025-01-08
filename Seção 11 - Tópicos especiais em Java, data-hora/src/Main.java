import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Instanciar data, hora e fuso:
        //• (agora) ➞ Data-hora
        LocalDate d01 = LocalDate.now(); //somente data
        System.out.println(d01);

        LocalDateTime d02 = LocalDateTime.now(); //data e hora completos
        System.out.println(d02);

        Instant d03 = Instant.now();//data, hora e fuso horário (Z -> Londres)
        System.out.println(d03);


        //• Texto ISO 8601 ➞ Data-hora
        LocalDate d04 = LocalDate.parse("2025-01-08");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2025-01-08T16:02:23");
        System.out.println(d05);

        Instant d06 = Instant.parse("2025-01-08T16:02:23Z"); //gera no horário de Londes
        System.out.println(d06);

        Instant d07 = Instant.parse("2025-01-08T16:02:23-03:00"); //gera no horário de SP
        System.out.println(d07);


        //• Texto formato customizado ➞ Data-hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("18/01/2025", fmt1);
        System.out.println(d08);

        LocalDateTime d09 = LocalDateTime.parse("08/01/2025 01:02", fmt2);
        System.out.println(d09);

        //dia, mês, ano, [horário] ➞ Data-hora local
        LocalDate d10 = LocalDate.of(2025, 7, 20);
        System.out.println(d10);

        LocalDateTime d11 = LocalDateTime.of(2025, 3, 12, 01, 31);
        System.out.println(d11);

        //Transformar data em texto customizado
        System.out.println(d08.format(fmt1));
        System.out.println(fmt1.format(d08));

        System.out.println(d05.format(fmt1));
        System.out.println(d05.format(fmt2));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(fmt3.format(d06));

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(d05.format(fmt4));
    }
}