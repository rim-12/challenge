import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                  /*Declare a variable named age and assign it the value 25. Print the value of the variable.
Declare the following variables :
firstname : a variable containing your first name.
lastname : a variable containing your last name.
PI : a constant containing the PI value 3.14.
radius : a variable that contains a random number of your choice.
favoriteSuperhero :  a variable containing the name of your super hero.
favoriteQuote : a variable containing your favorite quote (ex: Difficult roads often leads to beautiful destinations)*/
        int age = 25;
        String firstname = "rim";
        String lastname = "gharib";
        Double PI = 3.14;
        int radius = 5;
        String superhero = "GoGo";
        String quote = "hihihihi";
        System.out.println(age);
        /*Declare two variables num1 and num2 with values 10 and 5, respectively. Perform the following operations and print the results:
Addition of num1 and num2
Subtraction of num1 from num2
Multiplication of num1 and num2
Division of num1 by num2*/
        int num1 = 10, num2 = 5;
        int addition = num1 + num2;
        System.out.println(addition);
        int subtraction = num1 - num2;
        System.out.println(subtraction);
        int multiplication = num1 * num2;
        System.out.println(multiplication);
        int division = num1 / num2;
        System.out.println(division);
        /*Ask the user to enter their age. Use an if-else statement to classify the age into categories:
If the age is less than 13, print "Child."
If the age is between 13 and 19 (inclusive), print "Teenager."
If the age is 20 or older, print "Adult."*/
        Scanner ages = new Scanner(System.in);
        System.out.println("entrer age");
        int agee = ages.nextInt();
        if (agee < 13) {
            System.out.println("child");}
        else if (agee>=13 && agee<=19) {
            System.out.println("teenager");}
        else if (agee>20) { System.out.println("adult");}
/*
Ask the user to enter their exam score (0 to 100). Use an if-else statement to determine their grade:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
Print the corresponding grade.*/

        Scanner examscore = new Scanner (System.in);
        System.out.println("examscore");
        int score = examscore.nextInt();

        if (score>=90 && score<=100) { System.out.println("A");}
        else if (score>=80 && score<=89) { System.out.println("B");}
        else if (score>=70 && score<=79) { System.out.println("C");}
        else if (score>=60 && score<=69) { System.out.println("D");}
        else if (score>=0 && score<=59) { System.out.println("F");}




    }
}


