public class Calculator{
   void add(int a,int b)
   {
    System.out.println("Addition" +(a+b));
   }
  void substract(int a,int b)
  {
    System.out.println("Substraction"+(a-b));
  }
  void multiply(int a, int b)
  {
    System.out.println("Multiplication"+(a*b));

  }

  public static void main (String[]args){

    Calculator cl= new Calculator();
    cl.add(45, 67);
    cl.substract(56, 89);
    cl.multiply(90, 87);
  }

  
}