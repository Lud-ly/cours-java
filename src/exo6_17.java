import java.util.Scanner;

public class exo6_17 {
    public static void main(String[] args) {

        int []tab;
        int tab_length  =  5;

        Scanner sc = new Scanner(System.in);
        tab = new int[tab_length];

        for (int  i = 0; i< tab_length; i++) {
            System.out.println("veuillez saisir des valeurs: ");
            tab[i] = sc.nextInt();
            //mettre nombre donnee dans le tableau

        }
        tri_insertion(tab);
        sc.close();


        for ( int j =0;j < tab_length;j++) {
            System.out.print(tab[j]+", ");
        }


        //pour chaque eleement dfu tableau
            //afficher tableau de I

    }
    public static void tri_insertion( int[] tab)
    {
        int valeur,j;
       for (int i=0;i<tab.length;i++){
           //on prends la valeur à l'index i
          valeur = tab[i];
          // index de départ
          j = i;
          while (j>0 && tab[j-1] >valeur){
                tab[j] = tab[j-1];
                j =j-1;
              //System.out.println(valeur + " > "+tab[j-1]);
           }
          //System.out.println(valeur);
          tab[j] = valeur;
       }
    }

}
 /*ALGO
        var taille en numerique de la longeur du tableau
        pour i =1 à <taille
        j=i-1
        tant que j>=0 et tab[j]>index
        tab[j+1] = tab[j]
        j--
        tab[j+1]=index
         int[] tab = {1, 12, 4, 5, 93, 21, 8, 11}
         ecrire tab avant insertion
         ecrire tab apres insertion
        */