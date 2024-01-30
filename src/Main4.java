import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main4 {
    public static void main(String[] args) {
        /*Declare a variable userNumber and assign it a value. Use an if-else statement to check if the number is even or odd. Print the result.*/
        int number = 10;
        if (number %2==0) { System.out.println(number + "is an even number" );}
        else {System.out.println(number + "is an odd number");}

        /*Declare two variables, firstName and lastName, and assign them your first and last name, respectively. Concatenate them and print the full name.*/
        String firstname = "rim";
        String lastname = "gharib";
        System.out.println(firstname +"  "+ lastname);

        /*Declare a variable celsiusTemperature and assign it a value. Convert this temperature to Fahrenheit using the formula: F = (C × 9/5) + 32. Print the result.*/
        int C = 30;
        int F = (C * 9/5) + 32;
        System.out.println(F);

        /*Write a program that asks the user to enter an integer. Use an if statement to determine if the number is positive or negative. Print the result.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("numbers");
        int num = scanner.nextInt();
        if (num > 0) {System.out.println("positive");}
        else {System.out.println("negative");}

        /*Ask the user to enter a number (1-7) representing a day of the week. Use a switch statement to print the name of the corresponding day.*/
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter a number (1-7) representing a day of the week");
        int daynumber = scanner2.nextInt();
        String dayname;
        switch (daynumber) {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day number");

        }
/*Write a program that asks the user for a number and prints the multiplication table for that number using a while loop.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int nb = scan.nextInt();
        for (int i = 0 ; i<=10 ; i++){
            System.out.println(nb + "*" + i + "=" + nb*i);
        }





    }



        





}


