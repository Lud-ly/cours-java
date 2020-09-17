import java.util.Scanner;

public class exo5_10 {
    public static void main(String[] args) {

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



        System.out.println("Retour de la monnaie :");
        System.out.println(bil10E +"billet de 10");
        System.out.println(bil5E + "billet de 5");
        System.out.println(reste + "piece de 1€");

        }

    }

