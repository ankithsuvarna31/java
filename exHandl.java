public class exHandl {

    public static void main(String[] args) {
        try{

         {
            int result = 10 / 0;
            System.out.println(result);
        }
       
            
        } catch (Exception e) {
            System.out.println("can not divide by 0" + e);
        }
         System.out.println("Program continues...");
    }
       
      

        
    }
