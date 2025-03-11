class Book{
    public String isbn;
    protected String title;
    private String author;

    Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
}
class Ebook extends Book{

    Ebook(String isbn, String title, String author){
        super(isbn,title,author);
    }
    public void display(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+super.getAuthor());
    }
}

public class BookManagement {
    public static void main(String[] args) {
    Ebook b1=new Ebook("2485-113-7598-22","Think Again", "Adam Grant" );
    b1.setAuthor("Marcus Aurelius");
    b1.display();
    }
}
