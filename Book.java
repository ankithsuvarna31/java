public class Book{
    String Author= ("Ankith");
    String title = ("My life");
    int page = 500;

    void showbookdetails()
    {
        System.out.println("Name of the author is "+ Author);
        System.out.println("The Title of the book is " + title);
        System.out.println("page of the book is "+page);
    }

    public static void main(String[]args){

        Book bk=new Book();
        bk.showbookdetails();
        
    }
}