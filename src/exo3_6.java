import java.util.Scanner;

public class exo3_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez l’âge de l’enfant :");
        int age = s.nextInt();


        if(age >= 20)
        {
            System.out.print("Catégory old Man");
        }
        else if(age >=12)
        {
            System.out.print("Catégory Cadet");
        }
         else if(age >= 10)
         {
            System.out.print(" Catégory Minime");
        }
         else if(age >= 8)
         {
            System.out.print("Catégory Pupille");
        }
         else if(age >= 6)
         {
            System.out.print("Catégory Poussin");
        }

    }

}
