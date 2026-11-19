/*Question
Create a Hashtable to store three API names and their response times.
API	Response time
Login	250
Deposit	720
Withdrawal	500

Print the response time of the Deposit API.*/

import java.util.Hashtable;

public class hashtable {

    public static void main(String[] args){
        Hashtable<String,Integer>responseTime =new Hashtable<String,Integer>();
        {
            responseTime.put("Login",250);
            responseTime.put("Deposit",720);
            responseTime.put("withdrawal",500);
             System.out.println(responseTime.get("Deposit"));

        }
    }
}