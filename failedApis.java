import java.util.HashMap;
import java.util.Map;

public class failedApis{
public static void main (String[]args){

    HashMap<String,Integer>apistatus=new HashMap<String,Integer>();
    apistatus.put("login",200);
    apistatus.put("Deposit",500);
    apistatus.put("Withdrawal",200);
    apistatus.put("Balance",404);

     for (Map.Entry<String, Integer> entry : apistatus.entrySet()) {

            String apiName = entry.getKey();
            int statusCode = entry.getValue();

            if (statusCode != 200) {
                System.out.println(apiName + " failed with status " + statusCode);
            }
        }
    }
}













/*You are testing four APIs and storing their HTTP status codes in a HashMap.
API name (Key)	Status code (Value)
Login	200
Deposit	500
Withdrawal	200
Balance	404

Your task: Write a Java program using entrySet() to print only the APIs whose status code is not not 200.*/