public class ProductInventory {
    String productName;
    double price;
    static int totalProducts;

    ProductInventory(String productName, double price){
        this.productName=productName;
        this.price=price;
    }


//    public static void displayTotalProducts(){
//        System.out.println("Total Products: "+totalProducts);
//    }
    public void displayProductDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: Rs."+ price);
        System.out.println("Total Products: "+totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1=new ProductInventory("Chocolate", 20);
        p1.totalProducts=1;
        p1.displayProductDetails();

        ProductInventory p2= new ProductInventory("Cheetos",25);
        p2.totalProducts=2;
        p2.displayProductDetails();

        p1.displayProductDetails();

    }
}
