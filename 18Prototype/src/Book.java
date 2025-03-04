public class Book implements Cloneable {
    private String title;
    private String author;
    private String genre;
    private int publishYear;

    public Book(String title,String author,String genre, int publishYear)
    {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishYear = publishYear;




    }


    @Override
    public Book clone() {
        try{
            Book clonedBook = (Book) super.clone();
            return clonedBook;
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

       return null;
    }
    @Override
    public String toString(){
        return "Book: " + title +" by" + author+ " published by: " + publishYear + " genre: " + genre;
    }

}
