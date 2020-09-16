import java.util.Scanner;

public class exo2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez le prix du produit ht");
        int prixht = input.nextInt();
        System.out.println("Entrez le nombre d'articles");
        int nbr = input.nextInt();
        System.out.println("Entrez le taux");
        double taux = input.nextInt();
        double result = (prixht * nbr) * (1 +taux/100);
                System.out.println("le prix TTC est de:"+ result + "€");
    }
}

