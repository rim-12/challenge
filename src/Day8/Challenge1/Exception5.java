package Day8.Challenge1;

public class Exception5 {
    public static void main(String[] args) {
        String myString = null;
        try {
            if (myString != null) {
                int Lenght = myString.length();
                System.out.println("la longueur de la chaine est :" + Lenght);
            } else {
                System.out.println("la reference de la chaine est null");
            }
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException detectée");
        }
    }
}
