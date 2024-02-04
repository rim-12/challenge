package Day8.Challenge1;

import java.util.Scanner;

public class Exception8 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer le numerateur : ");
        int numerateur = scanner.nextInt();
        System.out.println("enter le dénominateur:");
        int denominateur = scanner.nextInt();
        try {
            int resultat = effectuerDivision(numerateur , denominateur);
            System.out.println("resultat de la dévision : " + resultat);
        } catch (ArithmeticException exception) {
            System.out.println("devision par 0 n'est pas autoriser");
        }
        int[] nombres = {1,2,3,4};
        System.out.println("entre l'index pour acceder au tableau (0 à 4");
        int index = scanner.nextInt();
        try {
            int valeur = effectuerAcceTableau(nombres, index);
            System.out.println("valeur à l'index " + index +":" + valeur);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("erreu : veuillez enter un index valide");
        }
    }
    private static int effectuerDivision (int numerateur , int denominateur) {
        return numerateur/denominateur;
    }
    private static int effectuerAcceTableau (int[] tableau , int index) {
        return tableau[index];
    }
}
