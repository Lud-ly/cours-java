import java.util.Scanner;

public class exo6_8 {
    public static Scanner sc;
    public static void main(String[] args) {
        int size,i;
        int positiveCount = 0;
        int negativeCount =0;
        sc = new Scanner(System.in);
        System.out.print("entrer le nombre d'element que vous souhaitez dans le tableau :");
        size=sc.nextInt();

        int[] a = new int[size];
        System.out.print("entrer les "+size+" elements dans le tableau :");
        for (i=0;i <size;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<size;i++){
            if(a[i] >=0){
                System.out.print(a[i]+",");
                positiveCount++;
            }
            else{
                System.out.print(a[i]+",");
                negativeCount++;
            }
        }
        System.out.print("Il y a "+ positiveCount+" nombre positif ");
        System.out.print("et "+ negativeCount+" nombre negatif dans le tableau");
    }
}
