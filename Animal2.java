public class Animal2{
    void sound(){
        System.out.println("Animal is making sound ")
    }
}
public class Dog1 extends Animal2{
    @Override
    void sound(){
        System.out.println("Dogbrks ");
    }

}
public class Main{
    public static void main(String[]args)
    {
        Dog d=new Dog1();
        dog.sound();

    }
}