public class airthmetic {
public static void main (String[]args){
int  a=20;
int b =10;
int sum =(a+b);
int sum1= a-b;
int sum2 = a*b;
int sum3= a/b;

System.out.println("addition:"+ sum+"\n"+"substraction"+sum1+"\n"+"Multiplication:"+sum2+"\n"+"Division:"+sum3);

boolean f=(a>b);
System.out.println("Is Greater than b ?"+f);

boolean g=(a>b && b>0 ); 
System.out.println("Is a>b and b>0?"+g);
}
}
