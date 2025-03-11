public class BorrowBook {
    String title;
    String author;
    double price;
    boolean availability;

    // parametrised constructor for initializing variables
    BorrowBook(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=true;
    }
    // method for borrowing
    public void borrow(){
        if(availability==true){
            availability=false;
            System.out.println("book borrowed successfully");
        }
        else{
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        BorrowBook b1=new BorrowBook("Think Again", "Adam Grant", 500); // creating object
        b1.borrow();
        b1.borrow();

    }
}
