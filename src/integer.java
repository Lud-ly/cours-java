import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Entrez un nombre:");
        int number = reader.nextInt();
        System.out.println("vous avez rentrer le " + number);
    }
}
