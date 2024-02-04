package Day9.Challenge1;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.binarySearch;

public class Challenge6 {
    public static void main(String args[]) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(8);
        sortedList.add(4);
        sortedList.add(2);
        Collections.sort(sortedList);
        int targetValue = 3;
        int result = binarySearch(sortedList , targetValue);
        if (result != -1) {
            System.out.println("la valeur " + targetValue + "a ete trouvée a l'index" + result);
        } else {
            System.out.println("la valeur " + targetValue + "n'a pas ete trouvée dans la liste");
        }
    }
}
