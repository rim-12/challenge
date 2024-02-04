package Day8.Challenge1;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[]args){
        System.out.println("entrez un nombre");
        Scanner scanner = new Scanner (System.in);
        try {
            int number = Integer.parseInt(scanner.nextLine());
           System.out.println("le nombre que vou avez saisi est :" + number);
        }
        catch (NumberFormatException e) {
            System.out.println("veullez entrer un nomber entier");
        } finally {
            scanner.close();
        }
    }
}
