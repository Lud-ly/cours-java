import java.util.Scanner;

public class exo5_11 {
    public static void main(String[] args) {
        int partant = 0;
        int joue = 0;
        int ordre = 1;
        int desordre = 1;
        int i = 1;
        Scanner sc = new Scanner(System.in);


        while (partant<=0 && joue<=0){
            System.out.println("Entrez le nombre de chevaux partants :");
            partant = sc.nextInt();
            System.out.println("Entrez le nombre de chevaux joués :");
            joue = sc.nextInt();
            if (partant != 0 && joue != 0)
            {
                ordre = ordre * (i + partant - joue);
                desordre = desordre * (i * joue);
            }
        }

        System.out.println("dans l'ordre : une chance sur "+ ordre +" de gagner");
        System.out.println("dans le desordre : une chance sur "+ desordre +" de gagner");
        }


    }





