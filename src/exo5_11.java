import java.util.Scanner;

public class exo5_11 {
    public static void main(String[] args) {
        int partant = 0;
        int joue = 0;
        int ordre = 0;
        int desordre = 0;
        int i = 10;
        Scanner sc = new Scanner(System.in);


        while (partant<=0 && joue<=0){
            System.out.println("Entrez le nombre de chevaux partants :");
            partant = sc.nextInt();
            System.out.println("Entrez le nombre de chevaux joués :");
            joue = sc.nextInt();
            if (partant != 0 && joue != 0)
            {
                ordre = ordre * (i + partant - joue);
                desordre = desordre * (i * joue);
            }
        }

        System.out.println("dans l'ordre : une chance sur "+ ordre +" de gagner");
        System.out.println("dans le desordre : une chance sur "+ desordre +" de gagner");
        }


    }
/*
n = int(input("Entrez le nombre de chevaux partants :"))
p = int(input("Entrez le nombre de chevaux joués :"))
A = 1
B = 1
for i in range(1,p):
   A = A * (i + n -p)
   B = B * i
print("Dans l’ordre, une chance sur ", A)
print("Dans le desordre, une chance sur ", B)

"""ALGO EXEMPLE 2
Variables N, P, i, A, B en Numérique
Debut
Ecrire "Entrez le nombre de chevaux partants : "
Lire N
Ecrire "Entrez le nombre de chevaux joués : "
Lire P
A ← 1
B ← 1
Pour i ← 1 à P
  A ← A * (i + N - P)
  B ← B * i
i Suivant
Ecrire "Dans l’ordre, une chance sur ", A
Ecrire "Dans le désordre, une chance sur ", A / B
Fin"""
*/




