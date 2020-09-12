import java.util.Scanner;

class AgeException extends Exception {

    public AgeException(String str) {
        System.out.println(str);
    }
}

public class exo3_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez l’âge de l’enfant :");
        int age = s.nextInt();

        try {
            if(age >= 20)
                throw new AgeException("Catégory old Man");
            if(age >=12)
                throw new AgeException("Catégory Cadet");
             else if(age >= 10)
                throw new AgeException(" Catégory Minime");
             else if(age >= 8)
                throw new AgeException("Catégory Pupille");
             else if(age >= 6)
                throw new AgeException("Catégory Poussin");
                System.out.println("it's time");
        }
        catch (AgeException a) {
            System.out.println(a);
        }
    }
}
