import java.util.Scanner;

public class exo8_7 {
    static int [][] twoDim;

    public static void main(String[] args) {
        int i = 0;
        int j= 0;
        int pion_x,pion_y;


        twoDim = new int [10][10];
        Scanner sc = new Scanner(System.in);

        for (int x = 0; x<10;x++) {
            twoDim[x] = new int [10];
            for (int y =0; y<10;y++ ) {
                twoDim[x][y] = 0;
            }
        }
        System.out.println();
        pion_x = checkLine(sc)-1;
        pion_y = checkCol(sc)-1;
        twoDim[pion_x][pion_y] = 1;
        displayBoard();
        testMove(checkMove(sc),pion_x,pion_y);
        sc.close();
        //end of for i


    }

    public static void testMove(int move,int pion_x,int pion_y){
        int new_x,new_y;
        boolean correct = true;
        if(move==0){
            new_x=pion_x-1;
            new_y=pion_y-1;
        }
        else if(move==1){
            new_x=pion_x-1;
            new_y=pion_y+1;
        }
        else if(move==2){
            new_x=pion_x+1;
            new_y=pion_y-1;
        }
        else {
            new_x=pion_x+1;
            new_y=pion_y+1;
        }
        if (new_x <0 || new_x>9){
            correct = false;
        } else if(new_y <0 || new_y>9) {
            correct = false;
        }
        if(correct) {
            twoDim[pion_x][pion_y]=0;
            twoDim[new_x][new_y]=1;
            displayBoard();
        }
        else{
            System.out.println("mouvement impossible");
        }

    }
    public static int checkLine( Scanner sc ){
        boolean correct = false;
        int res = 0;
        while(!correct) {
            System.out.println("Sur quelle ligne se trouve votre pion?");
            res = sc.nextInt();
            if(res > 0 && res <=10) {
                correct = true;
            }
        }
        return res;
    }
    public static int checkCol( Scanner sc ){
        boolean correct = false;
        int res = 0;
        while(!correct) {
            System.out.println("Sur quelle colonne se trouve votre pion?");
            res = sc.nextInt();
            if(res > 0 && res <=10) {
                correct = true;
            }
        }
        return res;
    }
    public static int checkMove( Scanner sc) {
        boolean correct = false;
        int res = 0;
        while (!correct) {
            System.out.println("quel mouvement voulez-vous faire?0.1.2ou3");
            res = sc.nextInt();
            if(res >=0 && res<=3){
                correct=true;
            }
        }
        //retourne le mouvement 0,1,2,3
        return res;
    }

    public static void displayBoard() {
        System.out.println("[");
        for (int x = 0; x<10;x++) {
            System.out.print("[");
            for (int y =0; y<10;y++ ) {
                System.out.print(twoDim[x][y] ) ;
                if(y !=9) {
                    System.out.print(", ");
                }
            }
            System.out.print("] \n");
        }
        System.out.print("] \n");
    }

   //
    //pion = sc.nextInt();
}