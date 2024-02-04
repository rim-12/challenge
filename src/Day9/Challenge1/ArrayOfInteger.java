package Day9.Challenge1; //challenge1

public class ArrayOfInteger {
    public static void main(String[] args) {
        int[] tableau = {4, 6, 2, 1, 3, 5};
        int sum = 0;
        for (int i : tableau) {
            sum += i;
        }
        System.out.println("la some des element de tableau est " + sum);

        int max = tableau[0];
        int min = tableau[0];
        for (int i : tableau) {
            if (i>max) {
                max = i;
            }
            if (i<min) {
                min = i;
            }
        }
        System.out.println("la valeur maximal du tableau : " + max);
        System.out.println(" la valeur minimal du tableau : " + min);


        for (int i= tableau.length -1 ;  i>= 0 ; i--) {
            System.out.println(tableau[i] + " ");
        }

    }
}
