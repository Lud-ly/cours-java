import java.util.Scanner;

public class exo9_5 {
    public static void main(String[] args) {

        String phrase="";
        int delete=0;
        String newPhrase="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une phrase : ");
        phrase = sc.next();
        System.out.println("Entrez le rang du caractère à supprimer : ");
        delete = sc.nextInt();

        phrase = phrase.substring(0,delete) + phrase.substring(delete+1);
        System.out.println(phrase);
       /* System.out.println("Entrez la nouvelle phrase : ");
        newPhrase = sc.next();
        phrase = phrase.replace(phrase,newPhrase);
        System.out.println("voici la nouvelle phrase"+ phrase);*/

    }
}