import java.util.Scanner;

public class exo6_8 {
    public static void main(String[] args) {
        int tailTab;
        int Nbposi = 0;
        int Nbnega = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de valeurs voulu :");
        tailTab = sc.nextInt();
        int[]t = new int [tailTab];
        for (int i = 0; i<tailTab; i++ ) {
           t[i] = tailTab++;
        }
        System.out.println(t[tailTab-1]);
    }
}
