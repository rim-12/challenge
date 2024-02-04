package Day8.Challenge1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[]args){
        String filepath = "p.text";
        try {
            File file = new File(filepath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

        }catch (FileNotFoundException e) {
            System.out.println("fichier non trouvé");
    }
    }
}
