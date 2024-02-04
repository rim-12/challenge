package Day8.Challenge1;

public class Exception {
    public static void main (String[] args) {
        int[] array = {1,2,3,4};
                try {
                    int element = array [6];
                    System.out.println("element a l'index 6 est :" + element);
                } catch (ArrayIndexOutOfBoundsException exception ) {
                    System.out.println("index hors limite");
                }
    }
}
