package Day9.Challenge1; //Challenge2

import java.util.ArrayList;

public class ListManipulation {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("apple");
        liste.add("banana");
        liste.add("orange");
        System.out.println(liste);
        liste.add(3, "strawberry");
        System.out.println(liste);
        liste.remove("orange");
        System.out.println(liste);
        String elementRecherche = "strawberry";
        boolean existe = liste.contains(elementRecherche);
        System.out.println("l'element  " + elementRecherche + " existe dans Arrayliste " + existe);
        System.out.println("les element de arrayliste sont: ");
        for (String element : liste ) {
            System.out.println(element);
        }
    }
}
