public class Employee{

    String name = "ANkith";
    long salary = 5000000000000L;
    String id ="jkd";

    void displayEmpoyeDetails()
    {
        System.out.println("The name of the employee"+name );
        System.out.println("The salary of the employee " +salary);
        System.out.println("The id of the employee"+ id);
    }

    public static void main(String[]args){
        Employee em= new Employee();
        
        em.displayEmpoyeDetails();
    }


}
