import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main3 {
    public static void main(String[] args) {
        /*Ask the user to enter a number. Use an if-else statement to check if the number is positive, negative, or zero. Print the result.*/
        Scanner enteranumber = new Scanner(System.in);
        System.out.println("enteranumber");
        int number = enteranumber.nextInt();
        if (number>0) {System.out.println("positive");}
        else if (number<0) {System.out.println("negative");}
        else {System.out.println("zero");}

        /*Use a switch statement to determine if the declared character is a vowel or a consonant. Print the result.*/
        Scanner character = new Scanner(System.in);
        System.out.println("character");
        char vowel = character.next().charAt(0);

        switch (vowel) {
            case 'a':
            System.out.println("vowel");
            break;
            case 'e':
            System.out.println("vowel");
            break;
            case 'i':
            System.out.println("vowel");
            break;
            case 'o':
            System.out.println("vowel");
            break;
            case 'y':
            System.out.println("vowel");
            break;
            default:
            System.out.println("consonant");
    }



        




    }
}


