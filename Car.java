public class Car{
    String Brand= "Toyota";
    String name= "Camry";

    void displayInfo()
    {
        System.out.println("The brand of the car is " +Brand);
        System.out.println("The name of the car is "+name);
    }
public static void main (String[]args){
 Car c= new Car();
 c.displayInfo();
}
}