import java.util.Random;

public class exo9_8 {
    public static void main(String[] args) {

        double generatedDouble3 =  new Random().nextDouble() *  (2);
        System.out.println("(0 =< Glup =< 2)=> "+generatedDouble3);

        double generatedDouble =  new Random().nextDouble() *  (2 - 1);
        System.out.println("(–1 =< Glup =< 1)=> "+generatedDouble);

        double generatedDouble1 =  new Random().nextDouble() *  (0.30 + 1.35);
        System.out.println("(1.35 =< Glup =< 1.65)=> "+generatedDouble1);

        double generatedDouble2 =  new Random().nextDouble() *  (17 - 10.5);
        System.out.println("(–10.5 =< Glup =< 6.5)=> "+generatedDouble2);


        System.out.println("des 6faces => "+desSix());
        System.out.println("Somme du jet de 2 dès à 6faces => "+deuxDesSix());
    }
    public static int desSix()
    {
        return (int)(Math.random() * 6) + 1;

    }
    public static int deuxDesSix()
    {
        return (int)((Math.random() * 6) + 1) * 2;

    }


}
