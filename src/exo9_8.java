import java.util.Random;

public class exo9_8 {
    public static void main(String[] args) {
        double leftLimit = -1;
        double rightLimit = 1;
        double generatedDouble = leftLimit + new Random().nextDouble() *  (rightLimit - leftLimit);
        System.out.println("(–1 =< Glup =< 1)=> "+generatedDouble);

        double leftLimit1 = 1.35;
        double rightLimit1 = 1.65;
        double generatedDouble1 = leftLimit1 + new Random().nextDouble() *  (rightLimit1 - leftLimit1);
        System.out.println("(1.35 =< Glup =< 1.65)=> "+generatedDouble1);

        double leftLimit2 = -10.5;
        double rightLimit2 = 6.5;
        double generatedDouble2 = leftLimit2 + new Random().nextDouble() *  (rightLimit2 - leftLimit2);
        System.out.println("(–10.5 =< Glup =< 6.5)=> "+generatedDouble2);


        double leftLimit3 = 0;
        double rightLimit3 = 2;
        double generatedDouble3 = leftLimit3 + new Random().nextDouble() *  (rightLimit3 - leftLimit3);
        System.out.println("(0 =< Glup =< 2)=> "+generatedDouble3);
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
