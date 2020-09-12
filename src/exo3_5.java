import java.util.Scanner;

public class exo3_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez un nombre:");
        double number = s.nextInt();

        if (number < 0)
            System.out.println(number + "is a negative number");
        else if (number > 0)
            System.out.println(number + "is a positive number");
        else
            System.out.println(number + "is T0T0");
    }
}
