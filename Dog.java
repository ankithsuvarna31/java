public class Dog
{
    String name = "Tommy";
    void bark()
    {
        System.out.println(name + "is barking");
       
    }
    void eat()
    {
        System.out.println(name +"is eating");
    }
    public static void main (String []args)
    {
        Dog d= new Dog();
        d.bark();
        d.eat();
    }
}
