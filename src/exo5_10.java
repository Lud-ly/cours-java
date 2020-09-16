import java.util.Scanner;

public class exo5_10 {
    public static void main(String[] args) {
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

