public class CarRental {
    String customerName;
    int carModel;
    int rentalDays;

    // Parametrised constructor
    CarRental(String customerName, int carModel, int rentalDays){
        this.carModel=carModel;
        this.customerName=customerName;
        this.rentalDays=rentalDays;
    }
    public int cost(int rentalDays){
        return rentalDays * 750;
    }
    public void display(){
        System.out.println("Name: "+customerName);
        System.out.println("Car Model: "+ carModel);
        System.out.println("Rental Days: "+ rentalDays);
        System.out.println("Total Cost: Rs."+ cost(rentalDays));
    }

    // Main method
    public static void main(String[] args) {
        CarRental c1=new CarRental("Madhav", 2021, 15); // Object creation
        c1.display();
    }
}
