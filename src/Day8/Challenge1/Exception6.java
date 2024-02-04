package Day8.Challenge1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumber = 0;
        while (true) {
            try {
                System.out.println("veuillez entrer un entier positif");
                positiveNumber = scanner.nextInt();
            if (positiveNumber>0) {
                break;
            } else {
                System.out.println("entrez un entier positif");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Exception");
            scanner.next();
        }
    }
    System.out.println("vous avez saisi un entier positif:" + positiveNumber);
    scanner.close();
}
}
