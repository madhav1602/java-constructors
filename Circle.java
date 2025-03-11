public class Circle {
    double radius;
    Circle(){
        this.radius=6.8;
    }
    Circle(double radius){
        this.radius=radius;
    }
    public void display(){
        System.out.println("The Radius is "+ radius);
    }

    public static void main(String[] args) {
        Circle obj1=new Circle();
        obj1.display();

        Circle obj2=new Circle(7.6);
        obj2.display();

    }
}
