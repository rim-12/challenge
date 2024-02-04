package Day8.Challenge1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exception7 {
    public static void main(String[]args){
        String nomFichier = "C:\\Users\\Hamza\\IdeaProjects\\challenge\\src\\Day8\\Challenge1\\exemple.txt";
        try (BufferedReader lecture = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = lecture.readLine())!= null) {
                System.out.println(ligne);
            }

        } catch (IOException e) {
            System.err.println("une erreur :" + e.getMessage());
        }
    }
}
