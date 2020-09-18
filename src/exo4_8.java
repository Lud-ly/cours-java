import java.util.Scanner;

public class exo4_8 {
    public static void main(String[] args) {
/*
        """ALGO
        Si M < 1 ou M > 12 Alors
          Ecrire "Date Invalide"
        SinonSi M = 2 Alors
          Si A divisible par 400 Alors
        Si M < 1 ou M > 12 Alors
          Ecrire "Date Invalide"
        SinonSi M = 2 Alors
          Si A dp 400 Alors
            Si J < 1 ou J > 29 Alors
              Ecrire "Date Invalide"
            Sinon
              Ecrire "Date Valide"
            FinSi

          SinonSi A divisible par 100 Alors
          SinonSi A dp 100 Alors
            Si J < 1 ou J > 28 Alors
              Ecrire "Date Invalide"
            Sinon
              Ecrire "Date Valide"
            FinSi
          SinonSi A divisible par 4 Alors
            Si J < 1 ou J > 29 Alors
          SinonSi A dp 4 Alors
            Si J < 1 ou J > 29Alors
              Ecrire "Date Invalide"
            Sinon
              Ecrire "Date Valide"
            FinSi
          Sinon
            Si J < 1 ou J > 28 Alors
              Ecrire "Date Invalide"
            Sinon
              Ecrire "Date Valide"
            FinSi
          FinSi
        SinonSi M = 4 ou M = 6 ou M = 9 ou M = 11 Alors
          Si J < 1 ou J > 30 Alors
            Ecrire "Date Invalide"
          Sinon
            Ecrire "Date Valide"
          FinSi
        Sinon
          Si J < 1 ou J > 31 Alors
            Ecrire "Date Invalide"
          Sinon
            Ecrire "Date Valide"
          FinSi
        FinSi
*/
        int J, M, A;

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le numéro du jour :");
        J = input.nextInt();
        System.out.println("Entrez le numéro du mois :");
        M = input.nextInt();
        System.out.println(" Entrez l'année :");
        A = input.nextInt();

        if (M < 1 || M > 12) {
            System.out.println("date invalide");
        }
        else if (M == 2) {
            if (A == 400) {
                System.out.println("date invalide");
                if (J < 1 || J > 29) {
                    System.out.println("date invalide");
                } else {
                    System.out.println("date valide");
                }
            }
        }
        else if (A == 100) {
                    if (J < 1 || J > 28) {
                        System.out.println("date invalide");
                    }
                    else {
                        System.out.println("date valide");
                    }
                }
        else if (A == 4) {
                    if (J < 1 || J > 29) {
                        System.out.println("date invalide");
                    }
                    else {
                        System.out.println("date valide");
                    }
                }
        else {
                    if (J < 1 || J > 28) {
                        System.out.println("date invalide");
                    }
                    else {
                        System.out.println("date valide");
                    }
                }
        if(M==4 || M==6 || M==9 ||M==11){
            if(J<1 || J>31){
                System.out.println("date invalide");
            }
            else{
                System.out.println("date valide");
            }
        }
            }
        }










