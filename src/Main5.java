import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main5 {
    public static void main(String[] args) {
        /*Ask the user to enter a positive integer. Use a for loop to calculate and print the factorial of that number.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("positive integer");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i =1; i<= number ; i++) {
            factorial = factorial * i;

        }
        System.out.println(factorial);






        




    }



        





}


