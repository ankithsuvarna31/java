/*Question: Write a Java program using HashMap and entrySet() to print the names of all APIs that failed.
API	Status code
Login	200
Deposit	500
Withdrawal	400
Balance	200

Expected output (order may vary): */

import java.util.HashMap;
import java.util.Map;

public class entryset2{

    public static void main(String[]args)
    {
  HashMap<String,Integer>apiStatus=new HashMap<String,Integer>();

   apiStatus.put("login",200);
        apiStatus.put("Deposit",500);
        apiStatus.put("Withdrawal",400);
        apiStatus.put("Balance",200);

                for (Map.Entry<String, Integer> entry : apiStatus.entrySet()) {

                      String apiName = entry.getKey();
                      int statusCode = entry.getValue();

                   if (statusCode != 200) {
                System.out.println(apiName + " failed with status " + statusCode);
                    {
                        
                    }


    }
}
}}