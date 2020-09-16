import java.util.Scanner;

public class exo4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrez les heures");
        int  h = s.nextInt();
        System.out.println("puis les minutes");
         int  m = s.nextInt();
        m = m + 1;
        if (m == 60){
            h = h+1;
            m=0;

        if (h ==24){
            h=0;
            }
        }

        System.out.println("dans une minute il est " + h + " heure "+ m + " minutes");
        }

    }

