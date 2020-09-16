import java.util.Scanner;

public class exo_test {
    public static void main(String[] args) {
        int age = 0;
        String prenom;
        Scanner sc = new Scanner(System.in);
        System.out.println("quel est votre age");
        age = sc.nextInt();

        System.out.println("quel est votre prénom?");
        prenom = sc.next();
        if (age != 0 && prenom != null)
        {

            if (age >= 18)
            {
                System.out.println("bonjour " + prenom + " vous etes en age de conduire!");
            }
            else
            {
                System.out.println(prenom + "il semblerait que vous n'avez pas l'age requis");
            }
        }
        else
        {
          System.out.println("il nous manque des infos");
        }
    }
}
