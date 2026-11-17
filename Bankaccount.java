public class Bankaccount{
int b =1000;
void balance ()
{
    System.out.println("Current balance "+ b);
}
int d= 500;

void deposit(int b,int d)
{
    System.out.println("Deposited"+d);
    System.out.println("Current balance "+(b+d));
}
void withdraw(int c,int e)
{
    System.out.println("withdrwa "+(c-e));
}

public static void main (String[]args){

Bankaccount b=new Bankaccount();
b.deposit(500, 1000);
b.withdraw(1500, 200);
}
}