import java.util.Scanner;

public class exo9_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la phrase à coder :");
        String s = sc.next();
        int decalage = 1;
        Chaine chaine = new Chaine(s, decalage);

        System.out.println("Chaine en clair : " + chaine.decrypte());
        System.out.println("Chaine cryptee decale de 1lettre: " + chaine.crypte());

    }
    public static class Chaine{

        String enclair;
        int decalage;

        public Chaine(String enclair, int decalage) {
            this.enclair = enclair;
            this.decalage = decalage;
        }

        public String decrypte() {
            return enclair;
        }

        public  char decalecaractere(char c, int decalage) {
            return (c < 'a' || c > 'z') ? c : (char) (((c - 'a' + decalage) % 26) + 'a');
        }

        public String crypte() {
            char c = 0;
            String mot = "";
            char d;
            // ajout du i++ afin de parcourir tous les caractere du String
            for (int i = 0; i < enclair.length(); i++) {
                c = enclair.charAt(i);
                d = (decalecaractere(c, this.decalage));
                mot += Character.toString(d);
                // suppression du return, sinon au premier caractere on sors de la boucle
            }
            return mot;
        }
    }
}

