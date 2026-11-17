public class Student{
 String name= "Ankith";
 int marks = 100;

 void checkResult()
 {
    if (marks>=40)
    {
        System.out.println("Passed ");
    }
    else
    {
        System.out.println("Fail");
    }
 }

 public static void main (String[]args){

    Student s= new Student();
    
        s.checkResult();
    
 }
 
}