/*1 
You are testing four APIs. Their HTTP status codes are stored in a HashMap.
API name	Status code
Login	200
Deposit	500
Withdrawal	200
Balance	404

Write a Java program using entrySet() to count:
- How many APIs passed (status code = 200)?
- How many APIs failed (status code != 200)? */
import java.util.HashMap;
import java.util.Map;
public class entrySet1{
   
    public static void main (String[]args) {

        HashMap<String,Integer>apiStatus=new HashMap<String,Integer>();

        apiStatus.put("login",200);
        apiStatus.put("Deposit",500);
        apiStatus.put("Withdrawal",200);
        apiStatus.put("Balance",400);
      
        int statuspassed = 0;
        int statusFailed= 0;

       
        for (Map.Entry<String, Integer> entry : apiStatus.entrySet()) {

            int statusCode = entry.getValue();

            if (statusCode == 200) {
                statuspassed++;
            } else {
                statusFailed++;
            }
        }

        System.out.println("Passed APIs: " + statuspassed);
        System.out.println("Failed APIs: " + statusFailed);
    }
}


    












