public class if_else_if
{
public static void main(String[]args)
{
    int x=200;
    int y=210;
    int z=200;

    if(x>y && x>z)
    {
        System.out.println("X is greater than all 2");
    }
    else if (y> x && y>z)
    {
        System.out.println("Y is greater than all 2");
    }
    else 
    {
    System.out.println("z is greater than all 3");
    }
}
}
