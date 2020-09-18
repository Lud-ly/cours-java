import java.util.Scanner;

public class exo4_7 {
    public static void main(String[] args) {
        int age;
        int perm;
        int acc;
        int assur;
        boolean c1,c2,c3;
        String situ;
        Scanner input = new Scanner(System.in);
        System.out.println(" Entrez votre age :");
        age = input.nextInt();
        System.out.println(" Entrez Entrez le nombre d'année de permis :");
        perm = input.nextInt();
        System.out.println(" Entrez nombre d'accident :");
        acc = input.nextInt();
        System.out.println(" Entrez nombres d'année d'assurance :");
        assur = input.nextInt();
        c1 = age >=25;
        c2 = perm >=2;
        c3 = assur > 5;
        if (!c1 && !c2) {
            if (acc == 0) {
                situ = "Contrat rouge";
            } else {
                situ = "Contrat Refusé";
            }
        }
            if (!c1 && c2 || c1 && !c2) {
                if (acc == 0) {
                    situ = "orange";
                }
                } else if (acc == 1) {
                    situ = "rouge";
                } else {
                    situ = "refusé";
                }
                if (acc == 0) {
                    situ = "vert";
                } else if (acc == 1) {
                    situ = "orange";
                } else if (acc == 2) {
                    situ = "rouge";
                } else {
                    situ = "refusé";
                }

            System.out.println("situation "+situ);
           if(c3) {
               if (situ == "rouge") {
                   situ = "orange";
               } else if (situ == "orange") {
                   situ = "vert";
               } else if (situ == "vert") {
                   situ = "bleu";
               }
           }
            System.out.println("nouvelle situation "+situ);

        }
}

