import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private List<Book> books;
    private String targetAudience;


    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }


    @Override
    public Recommendation clone() {
        try{

            Recommendation clonedRecomendation = (Recommendation) super.clone();
            clonedRecomendation.books = new ArrayList<>();
            for(Book book : this.books){
                clonedRecomendation.addBooks(book.clone());
            }
            return clonedRecomendation;

        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void editTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public void addBooks(Book book) {
       this.books.add(book);
    }


    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString(){
        return "Recommendation for " + targetAudience + " with books: " + books;
    }
}
