package support;

import java.io.IOException;

public class CookBook extends Book {

    public CookBook(String pageCover,int recipe, String title) throws IOException {
        super.pageCover = pageCover;
        super.recipe = recipe;
        super.title = title;
        readBook("src/test/resources/data/MyRecipeCookBook.txt");
    }
    public void summarizeBook() {
        System.out.println("This is a brief summary of the book.");
    }

    @Override
    public void displayBook() {
        System.out.println("Displaying content of MyCookBook:");
        System.out.println(getContent());
    }
}
