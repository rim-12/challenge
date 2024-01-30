package Day6.Challenge1;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> livres = new ArrayList<>();
    public void displayinfo(){
        for (Book book : livres){
            System.out.println(book);
        }
    }
    public void addBook(Book book){
        livres.add(book);
    }
}
