import java.util.Scanner;
import java.util.Random;

class exo5_2 {
    public static void main (String args[]){
        System.out.println("Saurez-vous deviner ce nombre entre 1 et 10 en moins de 10 coups?");
        int coups;
        coups=5;
        int min;
        min = 1;
        int max;
        max = 10;
        int target;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min) + min;
        target = randomNumber;
        Scanner scanner = new Scanner(System.in);
        while (coups!=0){
            System.out.println("Il vous reste "+coups+" coups pour trouver un nombre entre "+ min +" et "+ max+".");
            coups--;
            System.out.println("Choisissez un nombre:");
            int choix = scanner.nextInt();
            {if (coups == 0);
                System.out.println("c'est perdu!");
            }  {if (choix == target){
                System.out.println("c'est gagné!");
            }else {	if (choix < min){
                System.out.println("Nombre invalide. Recommencez.");
            }else {if (choix > max){
                System.out.println("Nombre invalide. Recommencez.");
            }else {if (choix > target){
                System.out.println("c'est moins!");
                choix=max;
            }else {if (choix < target){
                System.out.println("c'est plus!");
                choix = min;
            }
            }
            }
            }
            }
            }
        }
    }
}