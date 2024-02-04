package Day8.Challenge1;



public class Exception9 {
public static void main(String[]args){
    try {
        String chaine = null;
        int lenght = chaine.length();
    } catch (NullPointerException exception) {
        System.out.println("une NullPointException a ete attrapé");
        System.out.println("message d'eexception" + exception.getMessage());
    }
}
}
