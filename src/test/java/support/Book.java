package support;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class Book {
    public String title;
    public String author;
    public int pageCount;
    private String content;
    public int recipe;
    public String pageCover;

    public void readBook(String filePath) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
        content = new String(fileBytes);
    }

    public abstract void displayBook();


    public String getContent() {
        return content;
    }
    public void  rateBook(){
        System.out.println("you left no rating");
    }

    public  void  rateBook(int rating){
        System.out.println("you left a rating" + rating);

    }
    public  void rateBook(int rating,String review){
        System.out.println("you left a rating" + review);
        System.out.println("Your review " + review);
    }
}