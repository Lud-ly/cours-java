import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_heure {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
        String formatted = current.format(formatter);

        System.out.println("la date et lheure "+ formatted);
    }
}
