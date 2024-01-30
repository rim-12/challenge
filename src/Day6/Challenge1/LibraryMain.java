package Day6.Challenge1;

public class LibraryMain {
    public static void main(String[] args){
Book fictionBook = new FictionBook("title1", "rim", "rime");
Book notFictionBook = new NoFictiobnBook("title2", "rim2", "rime2");
        Library library = new Library();
        library.addBook(fictionBook);
        library.addBook(notFictionBook);
        library.displayinfo();
    }

}

