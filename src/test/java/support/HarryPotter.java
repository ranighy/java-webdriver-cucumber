package support;

import java.io.IOException;

public class HarryPotter extends Book{
  public HarryPotter(String title,String author) throws IOException {
      super.title = title;
      super.author = author;
      readBook("src/test/resources/data/HarryPotterAndTheSorcerersStone.txt");
  }

  @Override
    public void displayBook(){
    System.out.println(getContent());
}


}
