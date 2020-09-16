import java.util.Scanner;

public class exo5_10 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner input = new Scanner(System.in);
        int price =100;
        int reste = 0;
        int bil10E = 0;
        int bil5E = 0;
        System.out.println("vous nous devez" + price +"€");


       while (price >=0) {
           System.out.println(" montant_versé");
           int montant_versé = input.nextInt();
           price = price - montant_versé;
           reste = montant_versé - price;
       }

       while (reste >= 10){
           bil10E ++;
           reste -= 10;
       }

=======
        int price =100;
        int reste = 0;
        System.out.println("vous nous devez" + price +"€");
        Scanner s = new Scanner(System.in);


       while (price ==0) {
           System.out.println(" montant_versé");
           int montant_versé = s.nextInt();
           price = price - montant_versé;
           reste = montant_versé - price;
       }
         int bil10E = 0;
       while (reste >= 10){
           bil10E = bil10E +1;
           reste = reste -10;
       }
       int bil5E = 0;
>>>>>>> b3c1b26a773891fa3667c819ef3e0b57845acacd
       if (reste >= 5){
           bil5E = 1;
           reste = reste - 5;
       }
        System.out.println("Retour de la monnaie :");
        System.out.println(bil10E +"billet de 10");
        System.out.println(bil5E + "billet de 5");
        System.out.println(reste + "piece de 1€");

        }

    }

