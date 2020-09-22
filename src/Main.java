public class Main {
    public static void main(String[] args)
    {
        Personnage p = new Personnage();
        System.out.println(p.getAttack());
        System.out.println(p.getHealth());
        p.setPseudo("ludo");
        System.out.println(p.getPseudo());

        Personnage l = new Personnage();
        System.out.println(l.getAttack());
        System.out.println(l.getHealth());
        l.setPseudo("michel");
        System.out.println(l.getPseudo());

    }
}
