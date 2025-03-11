import java.sql.SQLOutput;

public class Book {
    String title;
    String author;
    double price;

    Book(){
        this.title="Think Again";
        this.author="Adam Grant";
        this.price=450;

    }
    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println(title + " "+ author +" "+ price);
    }

    public static void main(String[] args) {
        Book obj1=new Book();
        obj1.display();

        Book obj2=new Book("Meditations", "Marcus", 760);
        obj2.display();

    }
}
