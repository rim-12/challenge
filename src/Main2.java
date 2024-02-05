import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {



        /*Ask the user to enter the current hour (in 24-hour format). Use an if-else statement to greet the user based on the time of day:
        If the time is between 5 and 11, print "Good morning."
        If the time is between 12 and 17, print "Good afternoon."
        If the time is between 18 and 23, print "Good evening."
        For any other time, print "Good night."*/

        Scanner currenthour = new Scanner(System.in);
        System.out.println("currenthour");
        int hour = currenthour.nextInt();
        if (hour>=5 && hour<=11 ) { System.out.println("Goodmorning");}
        else if (hour>=12 && hour<=17) {System.out.println("Goodafternoon");}
        else if (hour>=18 && hour<=23) {System.out.println("Goodevening");}
        else {System.out.println("Goodnight");}




    }
}


