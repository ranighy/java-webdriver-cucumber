package support;

import java.io.IOException;



public class BookTest {

    public static void main(String[] args) throws IOException {
//        Book harry = new HarryPotter("Harry Potter","J.K.Rowling");
//        System.out.println(harry.getContent());
//        harry.displayBook();
//        harry.rateBook();
//        harry.rateBook(5);
//        harry.rateBook(5,"good");

//        PrideNPrejudice pride = new PrideNPrejudice("PrideNPrejudice","abc",397);
//        pride.displayBook();
//        pride.readBook("src/test/resources/data/PrideAndPejudice.txt");

        CookBook piesNBakes = new CookBook("Hard Cover",50,"My Recipes");
        piesNBakes.displayBook();
        piesNBakes.summarizeBook();
        piesNBakes.readBook("src/test/resources/data/MyRecipeCookBook.txt");






    }
}
