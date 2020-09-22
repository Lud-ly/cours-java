import java.util.Arrays;
import java.util.Scanner;

public class exo7_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numArray = {6, 8, 10, 34, 12, 2};
        System.out.println("tableau initial "+ Arrays.toString(numArray));
        System.out.print("Enter Element to be deleted: ");
        int element = in.nextInt();

        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] == element){
                // shift elements to the left
                for(int j = i; j < numArray.length - 1; j++){
                    numArray[j] = numArray[j+1];
                }
                break;
            }
        }

        System.out.println("Array elements after deletion-- " );
        for(int i = 0; i < numArray.length; i++){
            System.out.print(" " + numArray[i]);
        }
    }
}