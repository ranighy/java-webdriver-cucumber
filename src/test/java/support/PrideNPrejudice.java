package support;

public class PrideNPrejudice extends Book{
    @Override
    public void displayBook() {
        System.out.println(getContent());
    }
    public PrideNPrejudice(String title,String author,int pagecount){
        super.title = title;
        super.author = author;
        super.pageCount = pageCount;



    }
}
