import java.util.Scanner;

public class exo5_11 {
    public static void main(String[] args) {
        int n = 0;
        int p = 0;
        int x = 1;
        int y = 1;
        int i = 1;
        Scanner sc = new Scanner(System.in);


        while (n<=1 && p<=1){
            System.out.println("Entrez le nombre de chevaux partants :");
            n = sc.nextInt();
            System.out.println("Entrez le nombre de chevaux joués :");
            p = sc.nextInt();
            if (n != 0 && p != 0)
            {
                x = x * (i + n - p);
                y = y * (i * p);
            }
        }

        System.out.println("dans l'ordre : une chance sur"+ x +"de gagner");
        System.out.println("dans le desordre : une chance sur"+ y +"de gagner");
        }


    }





