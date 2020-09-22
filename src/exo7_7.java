import java.util.Arrays;

public class exo7_7 {
    public static void main(String[] args) {
        /*ALGO
        i,j en numerique
        m,n = longeur des tab 1&2
crée list1 =[15,25,35,4]
crée list2 = [55, 65, 75, 8]
ecrire  list1 list2
redim t3
trier les list
list 3=itertools.chain de list1 et2
trier list 3
ecrire list3

*/
            int[] t1 = {2, 4, 13, 24, 25};
            int[] t2 = {26, 20, 19, 11, 1};
            System.out.println("tableau 1"+ Arrays.toString(t1));
            System.out.println("tableau 2"+ Arrays.toString(t2));

            //Arrays.sort(t2);
            int m = t1.length, n = t2.length;
            int[] t3 = new int[m + n];
            int i = 0, j = 0, k = 0;
            while (i < m && j < n) {
                if (t1[i] < t2[j]) {
                    t3[k++] = t1[i++];
                } else {
                    t3[k++] = t2[j++];
                }
            }

            if (i < m) System.arraycopy(t1, i, t3, k, m - i);
            if (j < n) System.arraycopy(t2, j, t3, k, n - j);
            Arrays.sort(t3);
                System.out.println("tableau 3"+ Arrays.toString(t3));
            }
        }


