import java.util.Hashtable;

public class hashtablenullp {

    public static void main(String args[])
    {
        Hashtable<String,Integer>responseTimes=new Hashtable<String,Integer>();
        {
          responseTimes.put("Login", 250);
          responseTimes.put(null, 500);

System.out.println(responseTimes.size());
        }
           
{

        }
    }
}