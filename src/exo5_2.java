import java.util.Scanner;
import java.util.Random;

class exo5_2 {
    public static void main (String args[]){
        System.out.println("Saurez-vous deviner ce nombre entre 1 et 100 en maximum de 10 coups?");
        int coups=10;
        int min =1;
        int max=100;
        int target;
        Random random = new Random();
        target = random.nextInt(max - min) + min;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Triche pour verifier-> "+target);
        while (coups!=0){
            System.out.println("Il vous reste "+coups+" coups pour trouver un nombre entre "+ min +" et "+ max+".");
            coups--;
            System.out.println("Choisissez un nombre:");
            int choix = scanner.nextInt();

            if (target == choix)
            {
                System.out.println("c'est gagné!");
            }

            else if (coups == 0 ) {
                System.out.println("c'est perdu!");
            }
            if (choix < min) {
                    System.out.println("Nombre invalide. Recommencez.");
                }
                else
                    {
                    if (choix > max)
                    {
                        System.out.println("Nombre invalide. Recommencez.");
                    }

                if (choix > target)
                {
                    System.out.println("c'est moins!");
                    choix = max;
                }

                if (choix < target)
                {
                    System.out.println("c'est plus!");
                    choix = min;
                }
            }
        }
    }

}


