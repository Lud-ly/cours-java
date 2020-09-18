public class exo6_17 {
    public static void tri_insertion(int tab[]) {
        /*ALGO
        taille en numerique de la longeur du tableau
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
        int taille = tab.length;

        for (int i = 1; i < taille; i++) {
            int index = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > index) {
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = index;
        }
    }

    static void displayTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void main(String str[]) {
        int[] tab = {1, 12, 4, 5, 93, 21, 8, 11};

        System.out.println("Avant le tri par insertion");
        displayTab(tab);

        // le tri par insertion
        tri_insertion(tab);

        System.out.println("Apres le tri par insertion");
        displayTab(tab);
    }
}
