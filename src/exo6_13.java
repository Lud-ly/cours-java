import java.util.Scanner;

public class exo6_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb = 0;
        int max = 0;
        int y = 0;
        int pos = 0;
        System.out.print("entrer 5 nombres :");
        for(int i =0;i<5;i++){
            System.out.print("entrer un nombre :");
            nb = sc.nextInt();

            if (nb >max){
                max = nb;
                pos = y;
            }
            y = y+1;
        }
        System.out.println("le nombre le plus grand est : "+max);
        System.out.println("la position du nombre est : "+pos);
    }
}
